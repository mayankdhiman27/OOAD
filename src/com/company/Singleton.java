package com.company;

import java.util.List;

class ZipCodeLoader{

    private static ZipCodeLoader zipCodeLoader;
    private List<String> zipcodes;

    private ZipCodeLoader(){
        // load zipcodes from the DB
    }

    public List<String> getZipcodes() {
        return zipcodes;
    }

    public static ZipCodeLoader getZipCodeLoader(){
        if(zipCodeLoader == null){
            return new ZipCodeLoader();
        }
        return zipCodeLoader;
    }

}

public class Singleton {

    List<String> zipcodes = ZipCodeLoader.getZipCodeLoader().getZipcodes();

}
