package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {


        int number = 15;
        String result = "";


        if(number >= 1 && number <=12){

            if(number == 1){
                System.out.println("January");
            }else if(number == 2){
                System.out.println("February");
            }else if(number == 3){
                System.out.println("March");
            }else if(number == 4){
                System.out.println("April");
            }else if(number == 5){
                System.out.println("May");
            }else if(number == 6){
                System.out.println("June");
            }else if(number == 7){
                System.out.println("July");
            }else if(number == 8){
                System.out.println("August");
            }else if(number == 9){
                System.out.println("September");
            }else if(number == 10){
                System.out.println("October");
            }else if(number == 11){
                System.out.println("November");
            }else{
                result = "December";
            }


        }else{
            result = "Invalid";
        }

        System.out.println(result);

    }

}
