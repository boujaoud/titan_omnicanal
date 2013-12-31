
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.CollaborateurDaoIn;


@Service
@Transactional
public class CollaborateurService implements CollaborateurServiceIn{
 private  CollaborateurDaoIn CollaborateurDao;
	 
	
 @Autowired
	public void setCollaborateurDao(CollaborateurDaoIn CollaborateurDao) {
		this.CollaborateurDao = CollaborateurDao;
	}

    public CollaborateurDaoIn getCollaborateurDao() {
		return CollaborateurDao;
	}
 
 
    public void save(Object inst) {
     CollaborateurDao.save(inst);
    }

    public void modify(Object inst) {
    CollaborateurDao.modify(inst);
    }

    public void delete(Object inst) {
    CollaborateurDao.delete(inst);
    }

    public List<Object> findAll() {
      return CollaborateurDao.findAll();
    }
    
}
