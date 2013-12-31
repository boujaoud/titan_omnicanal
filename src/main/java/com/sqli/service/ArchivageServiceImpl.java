
package com.sqli.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.dao.ArchivageDaoIn;


@Service
@Transactional
public class ArchivageServiceImpl implements ArchivageServiceIn{
 private  ArchivageDaoIn archivageDao;
	 
	
 @Autowired
	public void setArchivageDao(ArchivageDaoIn archivageDao) {
		this.archivageDao = archivageDao;
	}

    public ArchivageDaoIn getarchivageDao() {
		return archivageDao;
	}
 
 
    public void save(Object inst) {
     archivageDao.save(inst);
    }

    public void modify(Object inst) {
    archivageDao.modify(inst);
    }

    public void delete(Object inst) {
    archivageDao.delete(inst);
    }

    public List<Object> findAll() {
      return archivageDao.findAll();
    }
    
}
