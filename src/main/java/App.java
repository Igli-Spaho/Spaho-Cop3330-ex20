//UCF COP3330 Summer 2021 Assignment 20 Solution
// *  Copyright 2021 Igli Spaho

//More complex programs may have decisions nested in other decisions, so that when one decision is made, additional decisions must be made.
//
//Create a tax calculator that handles multiple states and multiple counties within each state. The program prompts the user for the order amount and the state where the order will be shipped.
//
//Wisconsin residents must be changed 5% sales tax with an additional county-level charge. For Wisconsin residents, prompt for the county of residence.
//For Eau Claire county residents, add an additional 0.005 tax.
//For Dunn county residents, add an additional 0.004 tax.
//Illinois residents must be charged 8% sales tax with no additional county-level charge.
//All other states are not charged tax.
//The program then displays the tax and the total for Wisconsin and Illinois residents but just the total for everyone else.
//
//Example Output
//What is the order amount? 10
//What state do you live in? Wisconsin
//What county do you live in? Dane
//The tax is $0.50.
//The total is $10.50.
//Constraints
//Ensure that all money is rounded up to the nearest cent.
//Use a single output statement at the end of the program to display the program results.




import java.util.Scanner;


public class App {
    public static void main (String[]arg){
        //final double claireTAX = 0.005;
        //final double dunnTAX = 0.004;
        final double illinoisTAX = 0.08;
        final double wisDunnTAX = 0.055;
        final double wisClaireTAX = 0.054;
        Scanner in = new Scanner(System.in);
        System.out.print("What is the order amount ?");
        Double amount = in.nextDouble();

        System.out.print("What is the state ?");
        String state = in.next();

        System.out.print("What is the county ?");
        String county = in.next();





        if(state.equals("Wisconsin ")){
            System.out.print("What county do you live in?");
        } if(county.equals("Dunn")){

            double firstTax = wisDunnTAX*amount;
            double dunnFinal = firstTax+amount;
            System.out.print("The tax is  " +firstTax +"\n"+ "The total is "+dunnFinal);


        }if(county.equals("claire")){
                double secondTax = wisClaireTAX*amount;
                double claireFinal = secondTax+amount;
                System.out.print("The tax is  " +secondTax +"\n"+ "The total is "+claireFinal);
        }
                if(state.equals("Illinois")){
                    double chiTax =  illinoisTAX*amount;
                    double newFinal = illinoisTAX+amount;
                    System.out.print("The tax is "+chiTax+ "\n"+ "the total is "+newFinal);
                }


    }
                

}
