package sheet_one;

public class Publication {
    //attributes
    String title;
    String language;
    double price;

    //constructor with parameters
    public Publication(String title, String language, double price){
        this.title = title;
        this.language = language;
        this.price = price;
    }


    //print method that display the values
    public void printValues(){
        System.out.println("title: " + this.title);
        System.out.println("language: " + this.language);
        System.out.println("price: " + this.price);
    }

}
