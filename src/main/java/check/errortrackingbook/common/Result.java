package check.errortrackingbook.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
  private Integer code;//状态码 0成功，1失败
  private String message;//错误信息
  private T data;//响应数据，泛型可以放入任何类型

  //3个静态方法方便使用
  //快速返回操作成功响应结果（带数据
  public static <E> Result<E> success(E data){
    return new Result<>(0, "成功", data);
  }
  //返回成功
  public static Result<String> success(){
    return new Result<String>(0, "成功", null);
  }
  //失败
  public static Result<String> error(String message){
    return new Result<String>(1, message, null);
  }
}