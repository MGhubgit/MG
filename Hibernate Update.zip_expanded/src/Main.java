  /*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
     
	 
public class Main {
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException, ParseException
	{
			Logger log = Logger.getLogger("org.hibernate");
			log.setLevel(Level.OFF);
			System.setProperty("org.apache.commons.logging.Log",
					"org.apache.commons.logging.impl.NoOpLog");
			
			UserDAO dao=new UserDAO();
			List<User> list=dao.listDetails();
			for(int i=0;i<list.size();i++) {
				System.out.println(list.toString());
			}
			for(User u:list) {
				System.out.println("Name: "+u.getname());
				System.out.println("UserId: "+u.getuserid());
				System.out.println("UserName: "+u.getUsername());
				System.out.println("Password: "+u.getpassword());
				System.out.println("Email-ID: "+u.getemail());
				System.out.println("Authenticate: "+u.getAuthenticate());
			}
			System.out.println("Enter the id and password to be updated");
			int id=Integer.parseInt(bf.readLine());
			String pwd=bf.readLine();
			dao.updateUser(id, pwd);
			List<User> list1=dao.listDetails();
			if(list1==null) {
				System.out.println("No such id exists");
			}else
			for(int i=0;i<list1.size();i++) {
				System.out.println(list1.toString());
			}
			System.exit(0);
	}
}
	*/
	
	  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
     
     
public class Main {
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException, ParseException
	{
			Logger log = Logger.getLogger("org.hibernate");
			log.setLevel(Level.OFF);
			System.setProperty("org.apache.commons.logging.Log",
					"org.apache.commons.logging.impl.NoOpLog");
			
			UserDAO dao=new UserDAO();
			List<User> list=dao.listDetails();
		/*	for(int i=0;i<list.size();i++) {
				System.out.println(list.toString());
			}*/
            for(User u:list) {
    			System.out.println("Name: "+u.getname());
				System.out.println("UserId: "+u.getuserid());
				System.out.println("UserName: "+u.getUsername());
				System.out.println("Password: "+u.getpassword());
				System.out.println("Email-ID: "+u.getemail());
				System.out.println("Authenticate: "+u.getAuthenticate());
			}
			System.out.println("Enter the id and password to be updated");
			int id=Integer.parseInt(bf.readLine());
			String pwd=bf.readLine();
			dao.updateUser(id, pwd);
			
			List<User> list1=dao.listDetails();
			
		if(list1.isEmpty()) {
				System.out.println("No such id exists");
				System.out.println("1111----------------");
				System.exit(0);	
			}else {
		
				System.out.println("333----------------");
			for(User u:list) {
        		System.out.println("Name: "+u.getname());
				System.out.println("UserId: "+u.getuserid());
				System.out.println("UserName: "+u.getUsername());
				System.out.println("Password: "+u.getpassword());
				System.out.println("Email-ID: "+u.getemail());
				System.out.println("Authenticate: "+u.getAuthenticate());
				System.out.println("44444---------------");
			}
			}
			
	}
}
	
	
	
	 

	
	
	 

	 
