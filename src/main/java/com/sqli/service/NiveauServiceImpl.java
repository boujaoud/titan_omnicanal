
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.NiveauDaoIn;


@Service
@Transactional
public class NiveauServiceImpl implements NiveauServiceIn{
 private  NiveauDaoIn NiveauDao;
	 
	
 @Autowired
	public void setNiveauDao(NiveauDaoIn NiveauDao) {
		this.NiveauDao = NiveauDao;
	}

    public NiveauDaoIn getNiveauDao() {
		return NiveauDao;
	}
 
 
    public void save(Object inst) {
     NiveauDao.save(inst);
    }

    public void modify(Object inst) {
    NiveauDao.modify(inst);
    }

    public void delete(Object inst) {
    NiveauDao.delete(inst);
    }

    public List<Object> findAll() {
      return NiveauDao.findAll();
    }
    
}
