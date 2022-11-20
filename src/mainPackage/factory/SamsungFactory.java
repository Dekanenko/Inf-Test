package mainPackage.factory;

import mainPackage.instances.laptops.Laptop;
import mainPackage.instances.laptops.SamsungLaptop;
import mainPackage.instances.phones.Phone;
import mainPackage.instances.phones.SamsungPhone;
import mainPackage.instances.tablets.SamsungTablet;
import mainPackage.instances.tablets.Tablet;

public class SamsungFactory extends Factory{

    @Override
    public Phone getPhone() {
        return new SamsungPhone();
    }

    @Override
    public Tablet getTablet() {
        return new SamsungTablet();
    }

    @Override
    public Laptop getLaptop() {
        return new SamsungLaptop();
    }
}
