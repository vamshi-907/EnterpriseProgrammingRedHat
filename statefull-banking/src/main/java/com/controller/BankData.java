package com.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.model.BankingRemote;

@ManagedBean(name = "bank", eager = true)
public class BankData {
	int wamt;
	int damt;
	int bal;
	@EJB(lookup = "java:global/statefull_ejb/Banking!com.model.BankingRemote")
	BankingRemote BR;

	public int getWamt() {
		return wamt;
	}

	public void setWamt(int wamt) {
		this.wamt = wamt;
	}

	public int getDamt() {
		return damt;
	}

	public void setDamt(int damt) {
		this.damt = damt;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public void callEjbWithdraw() {
		BR.withDraw(wamt);
		bal = BR.getBalance();
	}

	public void callEjbDeposite() {
		BR.depoiste(damt);
		bal = BR.getBalance();
	}
}