package mainPackage;

import mainPackage.factory.Factory;
import mainPackage.instances.laptops.Laptop;
import mainPackage.instances.phones.Phone;
import mainPackage.instances.tablets.Tablet;

public class Main {
    public static void main(String[] args) {
        //set system conf, in order to understand, which factory to use
        System.setProperty("company", Factory.APPLE);
        //get specific factory
        Factory factory = Factory.getInstance();
        //get phone
        Phone phone = factory.getPhone();
        phone.photo();
        //get tablet
        Tablet tablet = factory.getTablet();
        tablet.draw();
        //get laptop
        Laptop laptop = factory.getLaptop();
        laptop.program();
    }
}
