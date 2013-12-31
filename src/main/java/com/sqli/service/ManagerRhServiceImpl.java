
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.ManagerRhDaoIn;


@Service
@Transactional
public class ManagerRhServiceImpl implements ManagerRhServiceIn{
 private  ManagerRhDaoIn ManagerRhDao;
	 
	
 @Autowired
	public void setManagerRhDao(ManagerRhDaoIn ManagerRhDao) {
		this.ManagerRhDao = ManagerRhDao;
	}

    public ManagerRhDaoIn getManagerRhDao() {
		return ManagerRhDao;
	}
 
 
    public void save(Object inst) {
     ManagerRhDao.save(inst);
    }

    public void modify(Object inst) {
    ManagerRhDao.modify(inst);
    }

    public void delete(Object inst) {
    ManagerRhDao.delete(inst);
    }

    public List<Object> findAll() {
      return ManagerRhDao.findAll();
    }
    
}
