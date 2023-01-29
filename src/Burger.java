public class Burger {
    public boolean bun;
    public boolean meat;
    public boolean cheese;
    public boolean onion;
    public boolean mayonnaise;

    public Burger() {


        System.out.println("Simple burger");

    }

    public Burger(boolean mayounnaise) {
        System.out.println(" Burger without mayounnaise");

    }

    public Burger(int doubleMeat) {
        System.out.println(" Burger with double meat");

    }
}