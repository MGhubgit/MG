/*import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
	 
	public class UserDAO {
	     
	   SessionFactory f=HibernateUtil.getSessionFactory();
	    public List<User> listDetails(){
	    	Session ses=f.openSession();
	    	ses.beginTransaction();
	    	Criteria c=ses.createCriteria(User.class);
			List<User> userList = new ArrayList<>();
	    	//List<User> userList =c.list();
	    	//Query q=ses.createQuery("from User u order by u.name,u.userid,u.username,u.password,u.email,u.authenticate asc");
	    	Query q=ses.createQuery("from User u order by u.userid asc");
	    	
	    	userList =q.list();
	    	ses.close();
	        return userList;
	    }
	 
	    public void updateUser(Integer userid,String password ){
	       Session ses=f.openSession();
	       User u=new User();
	       u.getAuthenticate();
	       u.getUsername();
	       u.getname();
	       u.getemail();
	       u.setuserid(userid);
	       u.setpassword(password);
	       
	       ses.update(u);
	       ses.beginTransaction();
	       ses.getTransaction().commit();
	       ses.close();
		}
	    }*/
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
     
	public class UserDAO {
	     
	   SessionFactory f=HibernateUtil.getSessionFactory();
	    public List<User> listDetails(){
	    	/*Session ses=f.openSession();
	    	ses.beginTransaction();
	    	Criteria c=ses.createCriteria(User.class);
			//List<User> userList = new ArrayList<>();
	    	List<User> userList =c.list();
            
            
	    	ses.close();
	        return userList;*/
            Session ses=f.openSession();
        	ses.beginTransaction();
	    	List<User> userList = new ArrayList<>();
	    	Query q=ses.createQuery("from User u order by u.userid asc");
	    	userList =q.list();
	    	ses.close();
	        return userList;
	    }
	 
	    public void updateUser(Integer userid,String password ){
	       Session ses=f.openSession();
	      // User u=new User();
	       
           User u=(User)ses.get(User.class,userid);
           if(u!=null){ u.setpassword(password);
           ses.update(u);
	       ses.beginTransaction();
	       ses.getTransaction().commit();  
           System.out.println("Password for Id "+userid+" is updated");
           
           }
          /* else{
               System.out.println("No such id exists");
           }*/
	       ses.close();
           
		}
	}
	



