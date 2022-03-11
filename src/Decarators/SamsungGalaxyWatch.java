package Decarators;

import Telephone.Telephone;

public class SamsungGalaxyWatch extends TelephoneDecorators {
    Telephone telephone;

    public SamsungGalaxyWatch(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public String getDescription() {
        return telephone.getDescription() +" ,Samsung Galaxy Watch";
    }

    @Override
    public double cost() {
        return 3.299 + telephone.cost();
    }
}
