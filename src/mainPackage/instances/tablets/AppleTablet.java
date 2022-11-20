package mainPackage.instances.tablets;

public class AppleTablet implements Tablet{

    @Override
    public void draw() {
        System.out.println("Apple Tablet Draw");
    }

    @Override
    public void play() {
        System.out.println("Apple Tablet Play");
    }

    @Override
    public void browse() {
        System.out.println("Apple Tablet Browse");
    }
}
