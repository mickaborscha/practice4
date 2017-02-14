import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Oleg on 2/14/2017.
 */
@Configuration
public class Config {

    @Bean
    public University getUniversity(){
        University university = new University();
        university.setName("Kiev-Mohyla Academy");
        university.setAddress("Kontraktova square 1");
        return university;
    }

    @Bean
    public Student getStudent(){
        return new Student();
    }
}
