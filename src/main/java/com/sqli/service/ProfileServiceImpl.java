
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.ProfileDaoIn;


@Service
@Transactional
public class ProfileServiceImpl implements ProfileServiceIn{
 private  ProfileDaoIn ProfileDao;
	 
	
 @Autowired
	public void setProfileDao(ProfileDaoIn ProfileDao) {
		this.ProfileDao = ProfileDao;
	}

    public ProfileDaoIn getProfileDao() {
		return ProfileDao;
	}
 
 
    public void save(Object inst) {
     ProfileDao.save(inst);
    }

    public void modify(Object inst) {
    ProfileDao.modify(inst);
    }

    public void delete(Object inst) {
    ProfileDao.delete(inst);
    }

    public List<Object> findAll() {
      return ProfileDao.findAll();
    }
    
}
