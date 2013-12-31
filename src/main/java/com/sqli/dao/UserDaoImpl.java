package com.sqli.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.beans.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDaoIn  {
	private static Session  session;
	 
	 @Autowired
	    public void setFactory(SessionFactory factory) {
	        session = factory.openSession();
	    } 
	 
	 // methode pour enrigistrer 
	 public void save(Object inst) {
	      
        try{
         session.persist((User) inst);
           }
    catch(Exception e){
        System.out.println("User not saved ");
          }
}
	// methode pour modifier
    public void modify(Object inst) {
try{
	Transaction trx = session.beginTransaction();
    session.update((User) inst);
    trx.commit();
    }

catch(Exception e)
{
	
	System.out.println("User not modified"+e.getMessage());
}
}
// methode pour supprimer
public void delete(Object inst) {

try{ 
	Transaction trx = session.beginTransaction();
	
	 session.delete((User) inst);
	 trx.commit();
}
catch(Exception e)
{
	
	System.out.println("User not deleted "+e.getMessage());
}

}

public List<Object> findAll() {
      try{
	return session.createCriteria(User.class).list();
}

catch(Exception e)
{
	
	System.out.println(e.getMessage());
	return null;
}}
}

