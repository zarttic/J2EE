/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 17:47
 */

package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class product {
    Integer id;
    String name;
    String img_url;
    Double price;
    String remark;
    Integer type_id;
}
