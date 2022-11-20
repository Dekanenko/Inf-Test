package mainPackage.instances.laptops;

public class AppleLaptop implements Laptop{

    @Override
    public void typeInf() {
        System.out.println("Apple Laptop Type");
    }

    @Override
    public void montage() {
        System.out.println("Apple Laptop Montage");
    }

    @Override
    public void program() {
        System.out.println("Apple Laptop Program");
    }

    @Override
    public void play() {
        System.out.println("Apple Laptop Play");
    }
}
