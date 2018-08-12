package com.springdemo.testdb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.mbeans.ClassNameMBean;

import java.sql.*;
/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 
				
		String userName = "springdemo";
		
		String passWord= "springdemo";
		
		String driver = "com.mysql.jdbc.Driver";
		
		
		
		String jdbcurl = "jdbc:mysql://192.168.1.212:3306/springdemo?useSSL=false&&serverTimezone=UTC";
		
		//jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
		
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(jdbcurl, "springdemo", "springdemo");
			System.out.println("Connecting to DB..");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("Connection Sucess");
	}

}
