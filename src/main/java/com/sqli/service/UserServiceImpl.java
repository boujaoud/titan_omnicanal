
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.UserDaoIn;


@Service
@Transactional
public class UserServiceImpl implements UserServiceIn{
 private  UserDaoIn UserDao;
	 
	
 @Autowired
	public void setUserDao(UserDaoIn UserDao) {
		this.UserDao = UserDao;
	}

    public UserDaoIn getUserDao() {
		return UserDao;
	}
 
 
    public void save(Object inst) {
     UserDao.save(inst);
    }

    public void modify(Object inst) {
    UserDao.modify(inst);
    }

    public void delete(Object inst) {
    UserDao.delete(inst);
    }

    public List<Object> findAll() {
      return UserDao.findAll();
    }
    
}
