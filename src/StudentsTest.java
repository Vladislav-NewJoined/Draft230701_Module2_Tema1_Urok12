import java.util.ArrayList;
import java.util.List;

// От Stream API: https://youtu.be/4PWfSmgiHKs

public class StudentsTest {
    String name1;
    String theClass1;
    int mark1;
    String theClass2;
    int mark2;
    String theClass3;
    int mark3;
    String theClass4;
    int mark4;

    // Создаем конструктор
    public StudentsTest(String name1, String theClass1, int mark1, String theClass2, int mark2,
                        String theClass3, int mark3, String theClass4, int mark4) {
        this.name1 = name1;
        this.theClass1 = theClass1;
        this.mark1 = mark1;
        this.theClass2 = theClass2;
        this.mark2 = mark2;
        this.theClass3 = theClass3;
        this.mark3 = mark3;
        this.theClass4 = theClass4;
        this.mark4 = mark4;
    }

    // Создаем геттеры и сеттеры
        public String getName1() { return name1; }
        public void setName1(String name1) { this.name1 = name1; }
        public String getTheClass1() { return theClass1; }
        public void setTheClass1(String theClass1) { this.theClass1 = theClass1; }
        public int getMark1() { return mark1; }
        public void setMark1(int mark1) { this.mark1 = mark1; }
        public String getTheClass2() { return theClass2; }
        public void setTheClass2(String theClass2) { this.theClass2 = theClass2; }
        public int getMark2() { return mark2; }
        public void setMark2(int mark2) { this.mark2 = mark2; }
        public String getTheClass3() { return theClass3; }
        public void setTheClass3(String theClass3) { this.theClass3 = theClass3; }
        public int getMark3() { return mark3; }
        public void setMark3(int mark3) { this.mark3 = mark3; }
        public String getTheClass4() { return theClass4; }
        public void setTheClass4(String theClass4) { this.theClass4 = theClass4; }
        public int getMark4() { return mark4; }
        public void setMark4(int mark4) { this.mark4 = mark4; }

    @Override
    public String toString() {
        return "StudentsTest{" +
                "name1='" + name1 + '\'' +
                ", theClass1='" + theClass1 + '\'' +
                ", mark1=" + mark1 +
                '}';


    }
}
