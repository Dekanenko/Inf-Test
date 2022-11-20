package mainPackage.factory;

import mainPackage.instances.laptops.AppleLaptop;
import mainPackage.instances.laptops.Laptop;
import mainPackage.instances.phones.ApplePhone;
import mainPackage.instances.phones.Phone;
import mainPackage.instances.tablets.AppleTablet;
import mainPackage.instances.tablets.Tablet;

public class AppleFactory extends Factory{
    @Override
    public Phone getPhone() { return new ApplePhone(); }

    @Override
    public Tablet getTablet() {
        return new AppleTablet();
    }

    @Override
    public Laptop getLaptop() {
        return new AppleLaptop();
    }
}
