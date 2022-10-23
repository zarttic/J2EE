/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 14:15
 */

package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo {
    private String code;
    private String msg;
    private Object data;

}
