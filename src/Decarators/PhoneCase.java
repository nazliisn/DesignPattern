package Decarators;

import Telephone.Telephone;

public class PhoneCase extends TelephoneDecorators {
    Telephone telephone;

    public PhoneCase(Telephone telephone) {
        this.telephone = telephone;
    }
    @Override
    public String getDescription() {
        return telephone.getDescription()+ " ,Phone Case ";
    }

    @Override
    public double cost() {
        return .020 + telephone.cost();
    }
}
