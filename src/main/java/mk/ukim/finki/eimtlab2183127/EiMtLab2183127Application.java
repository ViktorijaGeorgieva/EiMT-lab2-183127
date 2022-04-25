package mk.ukim.finki.eimtlab2183127;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
public class EiMtLab2183127Application {

    public static void main(String[] args) {
        SpringApplication.run(EiMtLab2183127Application.class, args);
    }

}
