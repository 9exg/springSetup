package a.b.c.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao implements ItestDao {
	@Autowired
	SqlSession sqlSession;
	

}
