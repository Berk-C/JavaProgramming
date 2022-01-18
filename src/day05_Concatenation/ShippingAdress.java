package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {

        String name = "Berk Cankaya ",
                streetName = "Motorworks",
                buildingNumber = "WBA211",
                city= "Munich",
                state = "Germany",
                zipCode = "220000W";

        /*
        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);
         */
        String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);

    }
}
