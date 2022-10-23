/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 17:51
 */


package mapper;

import entity.product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ProductMapper {
//1. 查询所有的产品信息
    @Select("select * from t_product")
    List<product> findAll();
//2. 根据产品的名称进行模糊查询
    @Select("select * from t_product where name like concat('%',#{name},'%')")
    List<product> findByLikeName(@Param("name")String name);
//3. 根据产品的类型的id进行精确查询
    @Select("select * from t_product where type_id = #{type_id}")
    List<product> findByTypeId(@Param("type_id")Integer type_id);
//4. 根据产品的id进行删除
    @Delete("delete from t_product where id = #{id}")
    int deleteById(@Param("id")Integer id);
//5. 保存一个产品
    @Insert("insert into t_product(name,img_url,price,remark,type_id) values(#{name},#{img_url},#{price},#{remark},#{type_id})")
    int insertInto(product product);
//6. 根据产品的id进行更新
    @Update({"update t_product set name=#{name},price=#{price},remark=#{remark},type_id=#{type_id} where id=#{id}"})
    int updateById(product product);
}
