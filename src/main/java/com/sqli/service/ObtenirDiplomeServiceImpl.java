
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.ObtenirDiplomeDaoIn;


@Service
@Transactional
public class ObtenirDiplomeServiceImpl implements ObtenirDiplomeServiceIn{
 private  ObtenirDiplomeDaoIn ObtenirDiplomeDao;
	 
	
 @Autowired
	public void setObtenirDiplomeDao(ObtenirDiplomeDaoIn ObtenirDiplomeDao) {
		this.ObtenirDiplomeDao = ObtenirDiplomeDao;
	}

    public ObtenirDiplomeDaoIn getObtenirDiplomeDao() {
		return ObtenirDiplomeDao;
	}
 
 
    public void save(Object inst) {
     ObtenirDiplomeDao.save(inst);
    }

    public void modify(Object inst) {
    ObtenirDiplomeDao.modify(inst);
    }

    public void delete(Object inst) {
    ObtenirDiplomeDao.delete(inst);
    }

    public List<Object> findAll() {
      return ObtenirDiplomeDao.findAll();
    }
    
}
