
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.PosteDaoIn;


@Service
@Transactional
public class PosteServiceImpl implements PosteServiceIn{
 private  PosteDaoIn PosteDao;
	 
	
 @Autowired
	public void setPosteDao(PosteDaoIn PosteDao) {
		this.PosteDao = PosteDao;
	}

    public PosteDaoIn getPosteDao() {
		return PosteDao;
	}
 
 
    public void save(Object inst) {
     PosteDao.save(inst);
    }

    public void modify(Object inst) {
    PosteDao.modify(inst);
    }

    public void delete(Object inst) {
    PosteDao.delete(inst);
    }

    public List<Object> findAll() {
      return PosteDao.findAll();
    }
    
}
