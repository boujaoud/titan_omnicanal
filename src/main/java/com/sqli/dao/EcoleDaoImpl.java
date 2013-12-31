package com.sqli.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.beans.Ecole;


@Repository
@Transactional
public class EcoleDaoImpl  implements EcoleDaoIn {
	private static Session  session;
	 
	 @Autowired
	    public void setFactory(SessionFactory factory) {
	        session = factory.openSession();
	    } 
	 
	 // methode pour enrigistrer 
	 public void save(Object inst) {
	      
         try{
          session.persist((Ecole) inst);
            }
     catch(Exception e){
         System.out.println("ecole not saved ");
           }
 }
	// methode pour modifier
     public void modify(Object inst) {
try{
	Transaction trx = session.beginTransaction();
     session.update((Ecole) inst);
     trx.commit();
     }

catch(Exception e)
{
	
	System.out.println("ecole not modified"+e.getMessage());
}
}
 // methode pour supprimer
public void delete(Object inst) {

try{ 
	Transaction trx = session.beginTransaction();
	
	 session.delete((Ecole) inst);
	 trx.commit();
}
catch(Exception e)
{
	
	System.out.println("ecole not deleted "+e.getMessage());
}

}

public List<Object> findAll() {
       try{
	return session.createCriteria(Ecole.class).list();
}

catch(Exception e)
{
	
	System.out.println(e.getMessage());
	return null;
}}
  
	
	
}
