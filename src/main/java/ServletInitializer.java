/**
 * @Auther: yk
 * @Date: 2018-8-13 15:50
 * @Description:
 */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *@className ServletInitializer
 *@Description TODO
 *@Author yk
 *@Date 2018-8-13 15:50
 *@Version 1.0
 **/
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


}
