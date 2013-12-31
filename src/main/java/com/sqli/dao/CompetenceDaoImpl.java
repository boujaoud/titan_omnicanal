package com.sqli.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.beans.Competence;

@Repository
@Transactional
public class CompetenceDaoImpl implements CompetenceDaoIn  {
	private static Session  session;
	 
	 @Autowired
	    public void setFactory(SessionFactory factory) {
	        session = factory.openSession();
	    } 
	 
	 // methode pour enrigistrer 
	 public void save(Object inst) {
	      
        try{
         session.persist((Competence) inst);
           }
    catch(Exception e){
        System.out.println("Competence not saved ");
          }
}
	// methode pour modifier
    public void modify(Object inst) {
try{
	Transaction trx = session.beginTransaction();
    session.update((Competence) inst);
    trx.commit();
    }

catch(Exception e)
{
	
	System.out.println("Competence not modified"+e.getMessage());
}
}
// methode pour supprimer
public void delete(Object inst) {

try{ 
	Transaction trx = session.beginTransaction();
	
	 session.delete((Competence) inst);
	 trx.commit();
}
catch(Exception e)
{
	
	System.out.println("Competence not deleted "+e.getMessage());
}

}

public List<Object> findAll() {
      try{
	return session.createCriteria(Competence.class).list();
}

catch(Exception e)
{
	
	System.out.println(e.getMessage());
	return null;
}}
}
