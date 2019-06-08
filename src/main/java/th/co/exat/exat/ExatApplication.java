package th.co.exat.exat;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExatApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new ExatApplication()
                .configure(new SpringApplicationBuilder(ExatApplication.class))
                .run(args);
    }

}
