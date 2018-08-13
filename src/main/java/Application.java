/**
 * @Auther: yk
 * @Date: 2018-8-10 17:01
 * @Description:
 */

import com.zzj.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 *@className SampleController
 *@Description TODO
 *@Author yk
 *@Date 2018-8-10 17:01
 *@Version 1.0
 **/
@EnableAutoConfiguration
@SpringBootApplication
public class Application {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
