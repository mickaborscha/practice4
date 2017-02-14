import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Oleg on 2/14/2017.
 */
public class Main {

    public static void main(String... args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Student student = context.getBean(Student.class);
        System.out.println("University name: "+ student.getUniversity().getName());
        System.out.println("University location: "+ student.getUniversity().getAddress());

    }

}
