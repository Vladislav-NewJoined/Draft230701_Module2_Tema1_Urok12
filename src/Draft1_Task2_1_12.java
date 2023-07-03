import java.util.List;
import java.util.stream.IntStream;

//        Пример _ ППППППППППППППППППППППППППППППППППП

public class Draft1_Task2_1_12 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");

        Students student1 = new Students();
        student1.name1 = "Иван";
        student1.theClass1 = "Java";
        student1.mark1 = 10;
        student1.theClass2 = "Python";
        student1.mark2 = 5;
        student1.theClass3 = "C++";
        student1.mark3 = 3;
        student1.theClass4 = "Pascal";
        student1.mark4 = 4;

        /*Students student2 = new Students2();*/
        student1.name2 = "Петр";
        student1.theClass5 = "Java";
        student1.mark5 = 3;
        student1.theClass6 = "Python";
        student1.mark6 = 5;
        student1.theClass7 = "C++";
        student1.mark7 = 3;
        student1.theClass8 = "Pascal";
        student1.mark8 = 4;

        IntStream intStream = IntStream.of(student1.mark1, 30, 50, 70, 90, 100);
        /*int sum = intStream.sum();*/
        System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());


        /*DoubleStream doubleStream = DoubleStream.of(student1.mark1, 30, 50, 70, 90, 100);
        OptionalDouble average = doubleStream.average();
        System.out.println("AVERAGE: " + DoubleStream.of(student1.mark1, 30, 50, 70, 90, 100).average());*/

        // От индийца https://youtu.be/eyIyO3Fqmak
        double avg = intStream.average().getAsDouble();
        System.out.printf("AVERAGE FROM AN INDIAN: " + "%.2f",avg);

        /*IntStream stream1 = IntStream.of(mark1, 10);*/
        /*System.out.println(IntStream.of(1, 2, 3));
        *//*IntStream stream1 = IntStream.range(0, 10);*//*
        *//*System.out.println(stream1.count());*/



//        public class UniversityStructure {
//            String faculty;
//            int studyPeriod;
//
//            public class Tutors {
//                String familyName;
//                int academicSubjects;
//            }
//
//        }
            System.out.println(); // Это перенос строки
            List<StudentsTest> studentsTests = Data.getStudentsTests();
            for (int i = 0; i < studentsTests.size(); i++) {
                System.out.println(studentsTests.get(i));
            }

    }
}

//        Конец Примера _ КККККККККККККККК









////        Пример 4 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name1 = "Иван";
//        student1.theClass1 = "Java";
//        student1.mark1 = 10;
//        student1.theClass2 = "Python";
//        student1.mark2 = 5;
//        student1.theClass3 = "C++";
//        student1.mark3 = 3;
//        student1.theClass4 = "Pascal";
//        student1.mark4 = 4;
//
//        Students2 student2 = new Students2();
//        student2.name2 = "Петр";
//        student2.theClass5 = "Java";
//        student2.mark5 = 3;
//        student2.theClass6 = "Python";
//        student2.mark6 = 5;
//        student2.theClass7 = "C++";
//        student2.mark7 = 3;
//        student2.theClass8 = "Pascal";
//        student2.mark8 = 4;
//
//        IntStream intStream = IntStream.of(student1.mark1, 30, 50, 70, 90, 100);
//        /*int sum = intStream.sum();*/
//        System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());
//
//
//        /*DoubleStream doubleStream = DoubleStream.of(student1.mark1, 30, 50, 70, 90, 100);
//        OptionalDouble average = doubleStream.average();
//        System.out.println("AVERAGE: " + DoubleStream.of(student1.mark1, 30, 50, 70, 90, 100).average());*/
//
//        // От индийца https://youtu.be/eyIyO3Fqmak
//        double avg = intStream.average().getAsDouble();
//        System.out.printf("AVERAGE FROM AN INDIAN: " + "%.2f",avg);
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
//
//    }
//}
//
////        Конец Примера 4 КККККККККККККККК









////        Пример 3 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name1 = "Иван";
//        student1.theClass1 = "Java";
//        student1.mark1 = 10;
//        student1.theClass2 = "Python";
//        student1.mark2 = 5;
//        student1.theClass3 = "C++";
//        student1.mark3 = 3;
//        student1.theClass4 = "Pascal";
//        student1.mark4 = 4;
//
//        Students2 student2 = new Students2();
//        student2.name2 = "Петр";
//        student2.theClass5 = "Java";
//        student2.mark5 = 3;
//        student2.theClass6 = "Python";
//        student2.mark6 = 5;
//        student2.theClass7 = "C++";
//        student2.mark7 = 3;
//        student2.theClass8 = "Pascal";
//        student2.mark8 = 4;
//
//        /*IntStream intStream = IntStream.of(10, 30, 50, 70, 90, 100);
//        int sum = intStream.sum();*/
//        System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());
//
//
//        DoubleStream doubleStream = DoubleStream.of(10, 30, 50, 70, 90, 100);
//        OptionalDouble average = doubleStream.average();
//        System.out.println("AVERAGE: " + DoubleStream.of(10, 30, 50, 70, 90, 100).average());
//
//
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
//
//    }
//}
//
////        Конец Примера 3 КККККККККККККККК









////        Пример 2 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name = "Иван";
//        student1.theClass = "Java";
//        student1.mark1 = 10;
//        student1.mark2 = 5;
//        student1.mark3 = 3;
//        student1.mark4 = 4;
//
//        Students2 student2 = new Students2();
//        student2.name = "Петр";
//        student2.theClass = "С++";
//        student2.mark5 = 3;
//        student2.mark6 = 5;
//        student2.mark7 = 4;
//        student2.mark8 = 3;
//
//        /*IntStream intStream = IntStream.of(10, 30, 50, 70, 90, 100);
//        int sum = intStream.sum();*/
//        System.out.println("SUM: " + IntStream.of(student1.mark1, 30, 50, 70, 90, 100).sum());
//
//
//        DoubleStream doubleStream = DoubleStream.of(10, 30, 50, 70, 90, 100);
//        OptionalDouble average = doubleStream.average();
//        System.out.println("AVERAGE: " + DoubleStream.of(10, 30, 50, 70, 90, 100).average());
//
//
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
//
//    }
//}
//
////        Конец Примера 2 КККККККККККККККК





////        Пример 1 ППППППППППППППППППППППППППППППППППП
//
//public class Draft1_Task2_1_12 {
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
//                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
//                "\nметодов (reduce, min/max и т.д.)\n\nРешение: ");
//
//        Students student1 = new Students();
//        student1.name = "Иван";
//        student1.theClass = "Java";
//        student1.mark1 = 4;
//        student1.mark2 = 5;
//        student1.mark3 = 3;
//        student1.mark4 = 4;
//
//        Students2 student2 = new Students2();
//        student2.name = "Петр";
//        student2.theClass = "С++";
//        student2.mark5 = 3;
//        student2.mark6 = 5;
//        student2.mark7 = 4;
//        student2.mark8 = 3;
//
//        /*IntStream stream1 = IntStream.of(mark1, 10);*/
//        /*System.out.println(IntStream.of(1, 2, 3));
//        *//*IntStream stream1 = IntStream.range(0, 10);*//*
//        *//*System.out.println(stream1.count());*/
//
//
//
////        public class UniversityStructure {
////            String faculty;
////            int studyPeriod;
////
////            public class Tutors {
////                String familyName;
////                int academicSubjects;
////            }
////
////        }
//
//    }
//}
//
////        Конец Примера 1 КККККККККККККККК





