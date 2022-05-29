package a.b.c.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import a.b.c.dao.ItestDao;

@Service
public class testService implements ItestService{
	
	@Autowired
	ItestDao itestDao;

	@Override
	public HashMap<String, String> testGetData() {
		return itestDao.testGetData();
	}

}
