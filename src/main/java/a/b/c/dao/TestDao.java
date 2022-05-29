package a.b.c.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao implements ItestDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<HashMap<String, String>> testGetList() throws Throwable {
		return sqlSession.selectList("test.testGetList");
	}
	

}
