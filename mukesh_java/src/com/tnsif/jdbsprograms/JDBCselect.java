package com.tnsif.jdbsprograms;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCselect {

		public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
			
				Class.forName("org.postgresql.Driver");
				System.out.println("load is over");
				
				Connection con=DriverManager.getConnection("jdbs:postgresql://loaclhost:5432/teegala","postgres","root");
				
			Statement st=con.createStatement();
			
			String strselect="select sname,sbrach from student";
			
			System.out.println("The sql statement is "+strselect);
			
			ResultSet rs=st.exceutQuary(strselect);
			System.out.println("The records are");
			int rowcount=0;
			while(rs.next()) {
				String sname=rs.getString("sname");
				String sbrach=rs.getString("sbrach");
				
				System.out.println(sname+" "+sbrach);
			}
		
			s
		}
}
