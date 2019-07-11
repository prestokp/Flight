package airport;

public class Airport {
    public static void main(String[] args) {

        Flight singaporeAir, quantasAir, americanAir;  //Instantiate three objects of Flight type

        //Arguments are passed into the parameters of the Flight objects

        singaporeAir = new Flight("Singapore Airlines", 2342, "Dallas/Fort Worth",
                "Singapore");
        quantasAir = new Flight("Quantas Airlines", 3422, "Australia",
                "Seattle");
        americanAir = new Flight("American Airlines", 317, "Los Angeles",
                "Miami");


        //Display the flight data using toString
        //If you use sout, etc and you put an object in the parentheses, the toString method is automatically called
        //Every object has a toString method, it can be explicitly written
        //or implicitly inherited by builtin object method

        System.out.println("First Flight\n" + singaporeAir.toString());
        System.out.println();
        System.out.println("Second Flight\n" + quantasAir.toString());
        System.out.println();
        System.out.println("Third Flight\n" + americanAir.toString());

    }
}

//Github Push