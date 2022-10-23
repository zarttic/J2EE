/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 9:32
 */


package mapper;

import entity.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user")
    List<user> findAll();
    @Select("select * from t_user where id = #{id}")
    user findById(Integer id);
    @Select("select * from t_user where username = #{username} and password = #{password}")
    user findUser(@Param("username")String username,@Param("password")String password);

    @Insert("insert into t_user(username,password,power) values(#{username},#{password},#{power})")
    int insertUser(user user);

    @Delete("delete from t_user where id = #{id}")
    int deleteById(int id);


    @Update("update t_user username = #{username} password=#{password} power = #{power} where id = #{id}")
    int updateByUser(user user);
}
