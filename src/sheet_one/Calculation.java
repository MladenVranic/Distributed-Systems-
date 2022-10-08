package sheet_one;

import java.util.ArrayList;

public class Calculation {
    public static void main(String[] args){
//        int num = calcFactorial(6);
//        System.out.println("The factorial of 5 is : " + num);
        ArrayList<Publication> pl = new ArrayList<>();

        //publication object
        Publication p =  new Publication("Alchemist","German",99.99);
        //book object
        Book b = new Book("Brida","German",99.99,"Coelho",11111111);
        //add objects of the two classes to the Array
        pl.add(p);
        pl.add(b);
        //loop through array and invoke method printValues()
        for(Publication pub: pl){
            pub.printValues();
        }
    }

    //calculation method for factorial of non-negative integral number
//    public static int calcFactorial(int number){
//        int fact = 1;
//        for(int i = 1; i < number;i++){
//            fact = fact*i;
//        }
//        return fact;
//    }
}
