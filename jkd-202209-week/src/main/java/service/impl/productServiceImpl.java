/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 18:17
 */

package service.impl;

import entity.product;
import mapper.ProductMapper;
import org.apache.ibatis.session.SqlSession;
import service.productService;
import util.MybatisUtil;

import java.util.List;

public class productServiceImpl implements productService {
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

    @Override
    public List<product> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<product> findByLikeName(String name) {
        return mapper.findByLikeName(name);
    }

    @Override
    public List<product> findByTypeId(Integer id) {
        return mapper.findByTypeId(id);
    }

    @Override
    public int deleteById(Integer id) {
        return mapper.deleteById(id);
    }

    @Override
    public int insertInto(product product) {
        return mapper.insertInto(product);
    }

    @Override
    public int updateById(product product) {
        return mapper.updateById(product);
    }
}
