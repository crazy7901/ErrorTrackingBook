package check.errortrackingbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(scanBasePackages = {"check.errortrackingbook"})
@MapperScan("check.errortrackingbook.mapper")
public class ErrorTrackingBookApplication {

  public static void main(String[] args) {
    SpringApplication.run(ErrorTrackingBookApplication.class, args);
  }

}
