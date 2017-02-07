package com.dvd.dao.implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class BaseDao {
		private static final String DRIVER = "org.sqlite.JDBC";
		private static final String URL = "jdbc:sqlite:/users/qianjiaxiang/Desktop/dvd.db";
		public Connection getConn() {
			Connection conn = null;
			try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			try {
				conn  = DriverManager.getConnection(URL);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
			
		}
}
