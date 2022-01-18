package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Berk";
        int age = 21;
        String citizen = "Turkey";



        boolean isEligible = age>=21 && citizen == "USA";

        if(isEligible){
            System.out.println("Person eligable to vote.");
        }

        if(!isEligible){
            System.out.println("Not eligible to vote.");
        }
    }
}
