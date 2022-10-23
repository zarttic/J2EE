/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 9:01
 */

package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 空参,getter/setter,toString
@AllArgsConstructor // 全参构造
@NoArgsConstructor // 空参构造
public class user {
    private Integer id;
    private String username;
    private String password;
    private Integer power;
}
