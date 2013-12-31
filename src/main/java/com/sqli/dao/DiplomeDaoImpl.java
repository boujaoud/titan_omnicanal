package com.sqli.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.beans.Diplome;

@Repository
@Transactional
public class DiplomeDaoImpl implements DiplomeDaoIn  {
	private static Session  session;
	 
	 @Autowired
	    public void setFactory(SessionFactory factory) {
	        session = factory.openSession();
	    } 
	 
	 // methode pour enrigistrer 
	 public void save(Object inst) {
	      
        try{
         session.persist((Diplome) inst);
           }
    catch(Exception e){
        System.out.println("Diplome not saved ");
          }
}
	// methode pour modifier
    public void modify(Object inst) {
try{
	Transaction trx = session.beginTransaction();
    session.update((Diplome) inst);
    trx.commit();
    }

catch(Exception e)
{
	
	System.out.println("Diplome not modified"+e.getMessage());
}
}
// methode pour supprimer
public void delete(Object inst) {

try{ 
	Transaction trx = session.beginTransaction();
	
	 session.delete((Diplome) inst);
	 trx.commit();
}
catch(Exception e)
{
	
	System.out.println("Diplome not deleted "+e.getMessage());
}

}

public List<Object> findAll() {
      try{
	return session.createCriteria(Diplome.class).list();
}

catch(Exception e)
{
	
	System.out.println(e.getMessage());
	return null;
}}
}

