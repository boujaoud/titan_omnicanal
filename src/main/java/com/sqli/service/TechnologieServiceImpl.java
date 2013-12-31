
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.TechnologieDaoIn;


@Service
@Transactional
public class TechnologieServiceImpl implements TechnologieServiceIn{
 private  TechnologieDaoIn TechnologieDao;
	 
	
 @Autowired
	public void setTechnologieDao(TechnologieDaoIn TechnologieDao) {
		this.TechnologieDao = TechnologieDao;
	}

    public TechnologieDaoIn getTechnologieDao() {
		return TechnologieDao;
	}
 
 
    public void save(Object inst) {
     TechnologieDao.save(inst);
    }

    public void modify(Object inst) {
    TechnologieDao.modify(inst);
    }

    public void delete(Object inst) {
    TechnologieDao.delete(inst);
    }

    public List<Object> findAll() {
      return TechnologieDao.findAll();
    }
    
}
