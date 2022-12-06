import java.awt.datatransfer.FlavorListener;
import java.util.*;

public class Main {
    public static void main(String[] args) {
List<Integer>integerList=new ArrayList<>();
int b=0;
int c=0;
int counter=0;
int counter2=0;
        for (int i = 0; i < 400; i++) {
            Random random=new Random();
            b= random.nextInt(0,21);
            c=c+b;
            counter++;
            integerList.add(b );


        }
        System.out.println("Amount of the numbers : "+counter);

        System.out.println(integerList);
        System.out.println("sum : "+c);
        Set<Integer>integerSet=new HashSet<>(integerList);
        int d=0;
        for (Integer a:integerSet) {
            d=d+a;
            counter2++;


        }
        System.out.println("Amount of the numbers(Hashset) : "+counter2);
        System.out.println(integerSet);
        System.out.println("sum(Hashset) : "+d);


    }
}