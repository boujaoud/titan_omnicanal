
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.CompetenceDaoIn;


@Service
@Transactional
public class CompetenceServiceImpl implements CompetenceServiceIn{
 private  CompetenceDaoIn CompetenceDao;
	 
	
 @Autowired
	public void setCompetenceDao(CompetenceDaoIn CompetenceDao) {
		this.CompetenceDao = CompetenceDao;
	}

    public CompetenceDaoIn getCompetenceDao() {
		return CompetenceDao;
	}
 
 
    public void save(Object inst) {
     CompetenceDao.save(inst);
    }

    public void modify(Object inst) {
    CompetenceDao.modify(inst);
    }

    public void delete(Object inst) {
    CompetenceDao.delete(inst);
    }

    public List<Object> findAll() {
      return CompetenceDao.findAll();
    }
    
}
