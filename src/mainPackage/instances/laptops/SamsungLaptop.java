package mainPackage.instances.laptops;

public class SamsungLaptop implements Laptop{

    @Override
    public void typeInf() {
        System.out.println("Samsung Laptop Type");
    }

    @Override
    public void montage() {
        System.out.println("Samsung Laptop Montage");
    }

    @Override
    public void program() {
        System.out.println("Samsung Laptop Program");
    }

    @Override
    public void play() {
        System.out.println("Samsung Laptop Play");
    }
}
