package com.sqli.interfaces;

import java.util.List;

public interface InterfaceDao {
	 public void save(Object inst);
	  public void modify(Object inst);
	  public void delete(Object inst);
	  public List<Object> findAll();
}
