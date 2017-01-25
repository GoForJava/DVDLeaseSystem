package com.dvd.dao;

import java.util.List;

import com.dvd.entity.Record;
import com.dvd.entity.Record2;

public interface RecordDao {
	public Record queryRecoreById(int rid);//通过制定id查看制定id的DVD借还记录
	public boolean saveRecord(Record record);//保存record记录
	public boolean updateRecord(Record record);//更新record
	public List<Record2> queryAllRecords(Record2 record2); //查询所有的DVD借还记录
	public List<Record2> queryRecordByUname(String uname);//查看指定用户名的租赁记录
	public List<Record2> queryRecordByDname(String dname);//查看指定DVD的租赁记录
	public List<Record2> queryUserRecordByReturnTime(boolean flag,String uname);
	//查看用户的归还记录，包含已归还，未归还
	
}
