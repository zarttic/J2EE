/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 9:55
 */

package userMapperTest;

import entity.user;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;

public class UserMapperTest {
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    @Test
    public void testFindAll(){


        mapper.findAll().forEach(System.out::println);
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testFindUserById(){
        System.out.println( mapper.findById(1));
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testInsertUser(){
        user user = new user();
        user.setUsername("test2");
        user.setPassword("test2");
        user.setPower(1);
        mapper.insertUser(user);
        sqlSession.commit();
        MybatisUtil.close(sqlSession);
    }
    @Test
    public void testDeleteUser(){
        mapper.deleteById(3);
        sqlSession.commit();
        MybatisUtil.close(sqlSession);
    }
}
