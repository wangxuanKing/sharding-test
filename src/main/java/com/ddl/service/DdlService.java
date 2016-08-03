package com.ddl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddl.dao.TOrderMapper;
import com.ddl.model.TOrder;

@Service
public class DdlService {

	@Autowired
    private	TOrderMapper tomapper;
	
//	@Transactional
	public void testInsert(){
		TOrder record = new TOrder();
		record.setOrderId(11);
		record.setUserId(324235);
		int num = tomapper.insert(record);
		
		//System.out.println(tomapper.selectByPrimaryKey(record.getOrderId()).toString());
	}
}
