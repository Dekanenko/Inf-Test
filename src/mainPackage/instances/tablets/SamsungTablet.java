package mainPackage.instances.tablets;

public class SamsungTablet implements Tablet{

    @Override
    public void draw() {
        System.out.println("Samsung Tablet Draw");
    }

    @Override
    public void play() {
        System.out.println("Samsung Tablet Play");
    }

    @Override
    public void browse() {
        System.out.println("Samsung Tablet Browse");
    }
}
