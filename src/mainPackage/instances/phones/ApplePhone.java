package mainPackage.instances.phones;

public class ApplePhone implements Phone{

    @Override
    public void call() {
        System.out.println("Apple Phone Call");
    }

    @Override
    public void photo() {
        System.out.println("Apple Phone Photo");
    }

    @Override
    public void charge() {
        System.out.println("Apple Phone Charge");
    }
}
