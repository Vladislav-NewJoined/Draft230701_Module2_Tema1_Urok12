import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Draft0_Whole_Video_2_1_12 {
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tВам нужно создать класс “Students” с полями “класс” и " +
                "\n“оценка”, и попробовать вычислить средний балл у студентов при помощи различных " +
                "\nметода (reduce, min/max и т.д.)\n\nРешение: ");

//  06 01 - getAsInt

        System.out.println(IntStream.range(0, 10).min());
        System.out.println(IntStream.range(0, 10).max());
        System.out.println(IntStream.range(0, 10).average());
        System.out.println(); // Это перенос строки
        System.out.println(IntStream.range(0, 10).min().getAsInt());
        System.out.println(IntStream.range(0, 10).max().getAsInt());
        System.out.println(IntStream.range(0, 10).average().getAsDouble());

        System.out.println(); // Это перенос строки
//        double avg2 = (((IntStream.range(0, 10).max().getAsInt() + IntStream.range(0, 10).min().getAsInt())/2));
//        System.out.println(avg2);
//        System.out.println(); // Это перенос строки

        System.out.println(IntStream.of((IntStream.range(0, 10).min()).getAsInt(), (IntStream.range(0, 10).max().getAsInt())).average().getAsDouble());

        /*Stream<Integer> numbersStream = Stream.of(0,1,2,3,4,5,6,7,8,9);*/
        /*Optional<Integer> result = (Stream.of(0.0,1.0,2.0).reduce((x,y)->x+y));*/





        System.out.println(Stream.of(0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0).reduce((x, y)->(x+y)/10).get()); // 0.99
        int ireduce1 = (Stream.of(5,5,3,4).reduce((x, y)->(x+y)).get())/4;
        double dreduce1 = (Stream.of(5.0,5.0,3.0,4.0).reduce((x, y)->(x+y)).get())/4;
        System.out.println(dreduce1); //

        /*int inum = 101;
        //int to double conversion without typecasting
        double dnum = inum;
        //displaying double value
        System.out.println(dnum);*/
    }
}