package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Forth {

    String name;
    String stuid;

    String actName= "";
    String cmp= "";
    String desc= "";

    int flag = 0;//0未审核 1通过 2驳回

    int finish = 0;//补全1
}
