import java.util.*;

class Result {
    public static void main(String s[]) {
        int total, m1, m2;
        String result, grade;
        double per;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();

        total = m1 + m2;
        per = (total / 200.0) * 100;

        if (m1 < 40 || m2 < 40) {
            result = "Fail";
            grade = "E";
        } else {
            result = "Pass";
            if (per >= 70) {
                grade = "A";
            } else if (per >= 60) {
                grade = "B";
            } else if (per >= 50) {
                grade = "C";
            } else {
                grade = "D";
            }
        }

       
        System.out.println("Total = " + total);
        System.out.printf("Percentage="+per); 
        System.out.println("result = " + result);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
