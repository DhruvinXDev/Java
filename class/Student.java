
import java.util.Scanner;

@FunctionalInterface
interface Exam {

    boolean Pass(int mark);
}
@FunctionalInterface
interface Classify {

    String Division(int avg);
}

class Result implements Classify, Exam {

    public boolean Pass(int mark) {
        if (mark >= 50) {
            return true;
        }
        return false;
    }

    public String Division(int avg) {
        if (avg >= 60) {
            return "First";
         
        }else if (avg >= 50) {
            return "Second"; 
        }else {
            return "No Division";
        }
    }
}

class Student {

    public static void main(String[] args) {
        Result r = new Result();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        System.out.print("Enter your class Avg : ");
        int avg = sc.nextInt();
        System.out.println("You are Pass : "+ r.Pass(marks));
        System.out.println("You are in Division : "+ r.Division(avg));
    }

}
