package com.sqli.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.beans.Niveau;

@Repository
@Transactional
public class NiveauDaoImpl implements NiveauDaoIn  {
	private static Session  session;
	 
	 @Autowired
	    public void setFactory(SessionFactory factory) {
	        session = factory.openSession();
	    } 
	 
	 // methode pour enrigistrer 
	 public void save(Object inst) {
	      
        try{
         session.persist((Niveau) inst);
           }
    catch(Exception e){
        System.out.println("Niveau not saved ");
          }
}
	// methode pour modifier
    public void modify(Object inst) {
try{
	Transaction trx = session.beginTransaction();
    session.update((Niveau) inst);
    trx.commit();
    }

catch(Exception e)
{
	
	System.out.println("Niveau not modified"+e.getMessage());
}
}
// methode pour supprimer
public void delete(Object inst) {

try{ 
	Transaction trx = session.beginTransaction();
	
	 session.delete((Niveau) inst);
	 trx.commit();
}
catch(Exception e)
{
	
	System.out.println("Niveau not deleted "+e.getMessage());
}

}

public List<Object> findAll() {
      try{
	return session.createCriteria(Niveau.class).list();
}

catch(Exception e)
{
	
	System.out.println(e.getMessage());
	return null;
}}
}
