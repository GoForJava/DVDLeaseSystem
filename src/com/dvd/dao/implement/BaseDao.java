package com.dvd.dao.implement;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class BaseDao {
	Connection con;
	private static final String DRIVER= "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://127.0.0.1:3306/dvd";
	String usr = "root";
	Connection conn = null;
	String sql = null;
	String password = "admin";
	
}
