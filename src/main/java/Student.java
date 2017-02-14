import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Oleg on 2/14/2017.
 */
public class Student {

    private University university;

    public University getUniversity() {
        return university;
    }

    @Autowired
    public void setUniversity(University university) {
        System.out.println("Setting Universit to Student");
        this.university = university;
    }
}
