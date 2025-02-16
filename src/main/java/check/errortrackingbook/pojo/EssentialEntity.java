package check.errortrackingbook.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@TableName("knowledge")
public class EssentialEntity {

    @TableId(type = IdType.AUTO)
    private int id;

    private String point;

    private String type;

}

