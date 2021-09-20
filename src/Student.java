class subject{
    double maths;
    double english;
    double hindi;
    double evs;
    double marathi;
}
public class Student {
    public static void main(String args[]) {
        subject a = new subject();
        double avg;

        a.maths = 20;
        a.english = 30;
        a.hindi = 20;
        a.evs = 20;
        a.marathi= 30;


        avg = (a.maths + a.english + a.evs + a.hindi + a.marathi) / 5;
        System.out.println("Avg is " + avg);
    }
}