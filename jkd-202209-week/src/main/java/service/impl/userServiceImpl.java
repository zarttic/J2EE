/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 14:21
 */

package service.impl;

import entity.user;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import service.userService;
import util.MybatisUtil;

public class userServiceImpl implements userService {
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    @Override
    public user findById(Integer id) {
        return  mapper.findById(1);
    }

    @Override
    public user findUser(String username, String password) {
        return mapper.findUser(username,password);
    }

    @Override
    public int insertUser(user user) {
        mapper.insertUser(user);
        sqlSession.commit();
        return 1;
    }
}
