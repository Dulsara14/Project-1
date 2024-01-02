public class Sample {
    String name;
    Sample(){

        System.out.println("Costructor called!");
        name = "Java";

    }
    public static void main(String[] args) {

        Sample s = new Sample();
        System.out.println("This name is " + s.name);

    }
}
