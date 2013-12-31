
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.DiplomeDaoIn;


@Service
@Transactional
public class DiplomeServiceImpl implements DiplomeServiceIn{
 private  DiplomeDaoIn DiplomeDao;
	 
	
 @Autowired
	public void setDiplomeDao(DiplomeDaoIn DiplomeDao) {
		this.DiplomeDao = DiplomeDao;
	}

    public DiplomeDaoIn getDiplomeDao() {
		return DiplomeDao;
	}
 
 
    public void save(Object inst) {
     DiplomeDao.save(inst);
    }

    public void modify(Object inst) {
    DiplomeDao.modify(inst);
    }

    public void delete(Object inst) {
    DiplomeDao.delete(inst);
    }

    public List<Object> findAll() {
      return DiplomeDao.findAll();
    }
    
}
