package com.sqli.service;

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

public class EcoleServiceImplTest {
	
	private static EcoleServiceIn ecoleService;
	
	@Autowired
    public void setEcoleService(EcoleServiceIn ecoleService) {
        this.ecoleService = ecoleService;
    } ;
    
 
	@Test
	//test de la methode save et la methde findAll
	public void testSave()
	{
		for (int i=0;i<10;i++)
		{
			
		Ecole ins = new Ecole(i);
		ecoleService.save(ins);
		
		}
		Assert.assertEquals(10, ecoleService.findAll().size());
	}
	//@Test
	//test de la methode modify
	/*public void testUpdate()
	{
		Ecole ins=new Ecole(0);
		ins.setTypeEcole("public");
		ecoleService.modify(ins);
		Assert.assertEquals(99999, ((Ecole)ecoleService.findAll().get(0)).getIdEcole());
		
	}*/
//	@Test
	//test de la methode delete
	/*public void testDelete()
	{
		Ecole ins=new Ecole(9);
		ecoleService.delete(ins);
		Assert.assertEquals(9, ecoleService.findAll().size());
		
	}
	
*/	
	
	
	
}
