package com.dvd.dao;

import com.dvd.entity.Record;
import com.dvd.entity.Record2;

public interface RecordDao {
	public Record queryRecoreById(int rid);//通过制定id查看制定id的DVD借还记录
	public boolean saveRecord(Record record);//保存record记录
	public boolean updateRecord(Record2 record2);//更新record
	
}
