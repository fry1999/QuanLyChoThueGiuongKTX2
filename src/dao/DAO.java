package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection con;
	
	public DAO() {
		if(con == null) {
			String dbUrl = "jdbc:mysql://us-cdbr-east-06.cleardb.net:3306/heroku_2b4b7a67e105418?sslmode=require";
			String dbClass = "com.mysql.jdbc.Driver";
			
			try {
				Class.forName(dbClass);
				try {
					con = DriverManager.getConnection(dbUrl, "b4bfae45df5bd3","67b62b4f");	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
