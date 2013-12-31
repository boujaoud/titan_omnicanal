package com.sqli.dao;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.sqli.beans.Ecole;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"})
@Transactional
@Repository

public class EcoleDaoImplTest {
	
	private static EcoleDaoIn ecoleDao;
	
	@Autowired
    public void setEcoleDao(EcoleDaoIn ecoleDao) {
        this.ecoleDao = ecoleDao;
    } ;
    
 
	@Test
	//test de la methode save et la methde findAll
	public void testSave()
	{
		for (int i=10;i<20;i++)
		{
			
		Ecole ins = new Ecole(i);
		ecoleDao.save(ins);
		
		}
		Assert.assertEquals(20, ecoleDao.findAll().size());
	}
	
	//@Test
	//test de la methode modify
	/*public void testUpdate()
	{
		Ecole ins=new Ecole(0);
		ins.setTypeEcole("public");
		ecoleDao.modify(ins);
		Assert.assertEquals(99999, ((Ecole)ecoleDao.findAll().get(0)).getIdEcole());
		
	}*/
//	@Test
	//test de la methode delete
	/*public void testDelete()
	{
		Ecole ins=new Ecole(9);
		ecoleDao.delete(ins);
		Assert.assertEquals(9, ecoleDao.findAll().size());
		
	}
	
*/	
	
	
	
}
