import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<StudentsTest> studentsTests = new ArrayList<>();

    static {
        StudentsTest studentsTest1 = new StudentsTest("Иван", "Java", 10,
                "Python", 5, "C++", 3, "Pascal", 4);

        StudentsTest studentsTest2 = new StudentsTest("Петр", "Java", 3,
                "Python", 5, "C++", 3, "Pascal", 4);

        studentsTests.add(studentsTest1);
        studentsTests.add(studentsTest2);
    }

    public static List<StudentsTest> getStudentsTests() {
        return studentsTests;
    }

}
