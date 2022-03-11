package Factories;

import Laptop.Laptop;
import Laptop.*;

public class MSIFactory implements LaptopFactory {
    @Override
    public Laptop makeLaptop(String laptopModel) {
        switch (laptopModel){
            case "MSI Katana":
                return new MSI_Katana();
            case "MSI Prestige 14":
                return new MSI_Prestige_14();
            case "MSI Summit E13":
                return new MSI_Summit_E13();
            default:
                return null;
        }
    }
}
