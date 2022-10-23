/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 18:17
 */


package service;

import entity.product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface productService {

    //1. 查询所有的产品信息
    List<product> findAll();
    //2. 根据产品的名称进行模糊查询
    List<product> findByLikeName(@Param("name")String name);
    //3. 根据产品的类型的id进行精确查询
    List<product> findByTypeId(@Param("type_id")Integer id);
    //4. 根据产品的id进行删除
    int deleteById(@Param("id")Integer id);
    //5. 保存一个产品
    int insertInto(product product);
    //6. 根据产品的id进行更新
    int updateById(product product);
}
