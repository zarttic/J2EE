package productMapperTest;

import entity.product;
import mapper.ProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.MybatisUtil;

import java.util.List;

/**
 * @author liyajun
 * @Description
 * @create 2022-10-22 18:26
 */

public class productMapperTest {
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
    @Test
    public void testFindAll(){
//        ok
//        List<product> all = mapper.findAll();
//        System.out.println(all);
        // ok
//        List<product> byTypeId = mapper.findByTypeId(1);
//        byTypeId.forEach(System.out::println);
        //ok
//        List<product> i = mapper.findByLikeName("X");
//        System.out.println(i);
//ok
//        mapper.deleteById(1);
//        sqlSession.commit();

//
        //ok
        product product = new product(3,"XI","xiaomi01.png",1999.0,"114514",2);
//        mapper.insertInto(product);
//        sqlSession.commit();

        // ok
        product.setName("666");
        mapper.updateById(product);
        sqlSession.commit();

    }
}
