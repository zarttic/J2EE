/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 9:35
 */

package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    static{
        //mybatis-config.xml文件必须要放入到src/main/resources目录下
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

    public static void close(SqlSession sqlSession){
        if (sqlSession != null)sqlSession.close();
    }
}
