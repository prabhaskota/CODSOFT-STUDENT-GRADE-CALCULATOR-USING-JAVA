import java.util.*;

public class StudentDetails {

    public static void Student_dtails() {

        Scanner sc = new Scanner(System.in);
        while (true) {

            int sum = 0;
            String subjects[] = { "ENGLISH", "MATHS", "SCIENCE" };
            int marks[] = new int[subjects.length];

            for (int j = 0; j < subjects.length; j++) {
                System.out.println("Enter the marks of " + subjects[j]);
                marks[j] = sc.nextInt();

            }
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i];

            }
            System.out.println(sum);

            // calcucating the average of marks
            int avg = (sum / 3);
            System.out.println(avg);
            if (avg > 80 || avg == 80) {
                System.out.println("\t\t\t** A GRADE **");

            } else if (avg >= 60 && avg <= 89) {
                System.out.println("\t\t\t** B GRADE **");

            } else if (avg >= 40 && avg <= 59) {
                System.out.println("\t\t\t** C GRADE **");
            } else {
                System.out.println("\t\t\t** D GRADE **");
                sc.close();
            }
           
        }
      
       

    

        

        

       
    }

   
   

    public static void main(String[] args) {
        Student_dtails();

    }
}
