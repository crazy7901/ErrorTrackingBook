package check.errortrackingbook.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import jakarta.persistence.Column;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@TableName("topic")
public class TopicEntity {
  @TableId(type = IdType.AUTO)
  private int id;

  private String question;

  private String answer;

  private String type;

//  @Column(name = "create_time")
  private Date createTime;

}

