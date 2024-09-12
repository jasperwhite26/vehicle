public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Vehicle("Ford", "Fusion");
        System.out.println(myCar.getMake());
        myCar.setMake("Chevy");
        System.out.println(myCar.getMake());


    }
}
