package Factories;

import Telephone.Telephone;

public interface TelephoneFactory {
    public Telephone makeTelephone(String telephoneModel);

}
