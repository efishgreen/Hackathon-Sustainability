//import dblibrary.project.csci230.*;
import java.util.*;
import java.sql.*;


public class DBController {
	// ================================= INSTANCE VARIABLES =================================
	private Connection connect;
	private Statement st;
	private ResultSet rs;
	
	// ================================= CONSTRUCTORS =================================
	public DBController() {
	    //this.ud = new UniversityDBLibrary("cloud9", "csci230");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://fdb25.awardspace.net/3018019_efishdb"+"user=3018019_eFishDB&password=eFish@CSBSJU19");
			System.out.println("Here");
			st = connect.createStatement();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void getData() {
		try {
			String query = "select * from 'Control Table'";
			rs = st.executeQuery(query);
			while(rs.next()) {
				String  name = "";
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	// ================================= METHODS =================================
	public ArrayList<ControlVariable> getAllControlVariables() {
		ArrayList<ControlVariable> contVarList = new ArrayList<ControlVariable>();
		
		// for loop to access database
		
		return null;
	}
}