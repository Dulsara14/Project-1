public class Main {

    String langvage;

    Main (String l){

        langvage = l;
        System.out.println("langvage is " + langvage);
    }



    public static void main(String[] args) {

        Main m1 = new Main ("Java");
        Main m2 = new Main ("Python");
        Main m3 = new Main ("C");
        Main m4 = new Main ("HTML");




    }
}
