package com.model;

import javax.ejb.Remote;

@Remote
public interface BankingRemote {
	public void withDraw(int amt);

	public void depoiste(int amt);

	public int getBalance();
	
}