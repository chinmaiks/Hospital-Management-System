import java.sql.*;  
    
class establishConnection{  
    public Connection getConnection(){  
    	try{  
	    	Class.forName("com.mysql.cj.jdbc.Driver");  
	    	//Connection con=DriverManager.getConnection("jdbc:mysql://192.168.0.113:3306/hospital?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","admin");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","admin");
	    	Statement stmt=con.createStatement();
	    	return con;  
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
		return null;  
    }  
}  