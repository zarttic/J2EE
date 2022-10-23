/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 14:21
 */


package service;

import entity.user;

import java.util.List;

public interface userService {
    user findById(Integer id);
    user findUser(String username,String password);


    int insertUser(user user);
}
