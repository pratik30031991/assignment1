package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	String Fname;
    String Mname;
    String Lname;

	
//	@RequestMapping(value="/data")
    @RequestMapping("/")
    public String myMethod() throws SQLException, ClassNotFoundException{
		
		
//		String username = "tiger";
//		String pswd = "tiger";
//		String url = "jdbc:postgresql://localhost:5433//pratikTest1";
		
	try {	
		
//		Class.forName("org.postgresql.Driver");
//		Connection con = DriverManager.getConnection(url,username,pswd);
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\pratik\\demo.csv"));
		String line;
		
		while((line = br.readLine()) != null) {
					
						String tmp[] = line.split(",");
			            Fname = tmp[0];
			            Mname = tmp[1];
			            Lname = tmp[2];
			        
		
					}
//		ArrayList<String>fileData = new ArrayList<String>();
//        
//        fileData.add(Fname);
//        fileData.add(Mname);
//        fileData.add(Lname);
        
        
//        String sql = "INSERT INTO Data_Fetched (First_name,Middle_name,Last_name)VALUES('"+Fname+"','"+Mname+"','"+Lname+"')";
//        Statement st = con.createStatement();
//        st.executeUpdate(sql);
        
        System.out.println("Data Added successfully...");
        System.out.println("My Fisrt name : "+Fname+"\nmy Middle Name: "+Mname+"\nmy last Name: "+Lname+" ");
           

			
		br.close();

	}
	catch(IOException e) 
		{
			e.printStackTrace();
		}
	
	return "My Fisrt name : "+Fname+"\nmy Middle Name: "+Mname+"\nmy last Name: "+Lname+" ";
	
	 
	}

}
