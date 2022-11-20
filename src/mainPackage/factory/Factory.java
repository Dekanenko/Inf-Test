package mainPackage.factory;

import mainPackage.instances.laptops.Laptop;
import mainPackage.instances.phones.Phone;
import mainPackage.instances.tablets.Tablet;

public abstract class Factory {

    private static Factory instance;
    public static final String APPLE = "apple";
    public static final String SAMSUNG = "samsung";

    public static synchronized Factory getInstance(){
        if(instance == null){
            String company = System.getProperty("company");
            if(company.equals(APPLE)){
                instance = new AppleFactory();
            } else if(company.equals(SAMSUNG)){
                instance = new SamsungFactory();
            }
        }
        return instance;
    }

    public abstract Phone getPhone();
    public abstract Tablet getTablet();
    public abstract Laptop getLaptop();
}
