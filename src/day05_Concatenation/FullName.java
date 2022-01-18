package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firsName = "Berk";
        String lastName = " Cankaya";
        String fullName = firsName + lastName;
        int age = 21;
        double salary = 100000.58;

        String jobTitle = "SDET";
        String company = "BMW MotorWorks";


        System.out.println("My full name is " + fullName);

        System.out.println(fullName + " is " + age + " years old ");

        System.out.println(fullName + " is " + jobTitle + " , works at  " + company
                + " , and " +fullName + " 's salary is $" + salary );

    }
}
