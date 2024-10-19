package com.model;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SloginAdmin {
	
	String url = "jdbc:mysql://localhost:3306/students_db";
	String uname = "root";
	String pw = "Vamshi@130";
	Connection con =null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public boolean StudentValidate(Slogin s) throws Exception
	{
		con = DriverManager.getConnection(url, uname, pw);
		ps = con.prepareStatement("select count(*) from slogin where username = ? and password = ?");
		ps.setString(1, s.getUsername());
		ps.setString(2, s.getPassword());
		rs = ps.executeQuery();
		if(rs.next())
		{
			if(rs.getInt(1) == 1)
			{
				return true;
			}
			else
			{	
				return false;
			}
		}
		return false;
	}
	
	
	public List<Slogin> SlogingetALL () throws Exception
	{
		con = DriverManager.getConnection(url, uname, pw);
		ps = con.prepareStatement("select * from slogin");
		rs = ps.executeQuery();
		List<Slogin> L = new ArrayList<Slogin>();
		while(rs.next())
		{
			Slogin sl = new Slogin();
			sl.setUsername(rs.getString(1));
			sl.setPassword(rs.getString(2));
			L.add(sl);
		}
		con.close();
		return L;
	}
	
	
	public boolean insertSlogin (Slogin s) throws Exception
	{
		try {
		con = DriverManager.getConnection(url, uname, pw);
		Statement st = con.createStatement();
		st.executeUpdate("insert into slogin values ('"+s.getUsername()+"','"+s.getPassword()+"')");
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean updateSlogin (Slogin s) throws Exception
	{
		try {
		con = DriverManager.getConnection(url, uname, pw);
		ps = con.prepareStatement("update slogin set password=? where username=?");
		ps.setString(1, s.getPassword());
		ps.setString(2,s.getUsername());
		 ps.execute();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean deleteSlogin (Slogin s) throws Exception
	{
		try {
		con = DriverManager.getConnection(url, uname, pw);
		ps = con.prepareStatement("delete from slogin where username=?");
		ps.setString(1, s.getUsername());
		 ps.execute();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public List<Slogin> searchSlogin (String S) throws Exception
	{
		con = DriverManager.getConnection(url, uname, pw);
		ps = con.prepareStatement("select * from slogin where username=?");
		ps.setString(1, S);
		rs = ps.executeQuery();
		List<Slogin> L = new ArrayList<Slogin>();
		while(rs.next())
		{
			Slogin s = new Slogin();
			s.setUsername(rs.getString(1));
			s.setPassword(rs.getString(2));
			L.add(s);
		}
		con.close();
		return L;
		
		
	}
	
	
	
	

}
