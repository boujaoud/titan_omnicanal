
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.EcoleDaoIn;


@Service
@Transactional
public class EcoleServiceImpl implements EcoleServiceIn{
 private  EcoleDaoIn EcoleDao;
	 
	
 @Autowired
	public void setEcoleDao(EcoleDaoIn EcoleDao) {
		this.EcoleDao = EcoleDao;
	}

    public EcoleDaoIn getEcoleDao() {
		return EcoleDao;
	}
 
 
    public void save(Object inst) {
     EcoleDao.save(inst);
    }

    public void modify(Object inst) {
    EcoleDao.modify(inst);
    }

    public void delete(Object inst) {
    EcoleDao.delete(inst);
    }

    public List<Object> findAll() {
      return EcoleDao.findAll();
    }
    
}
