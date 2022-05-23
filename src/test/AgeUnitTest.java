package test;
import com.company.model.Student;
import org.junit.Assert;
import org.junit.Test;
public class AgeUnitTest {

    Student student;

    @Test()
    public void ageTest() {
        Assert.assertTrue(10 >= student.getAge());
    }
}
