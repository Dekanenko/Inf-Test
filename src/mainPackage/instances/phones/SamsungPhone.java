package mainPackage.instances.phones;

public class SamsungPhone implements Phone{

    @Override
    public void call() { System.out.println("Samsung Phone Call"); }

    @Override
    public void photo() { System.out.println("Samsung Phone Photo"); }

    @Override
    public void charge() {
        System.out.println("Samsung Phone Charge");
    }
}
