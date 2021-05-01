package edu.handong.csee.java.converters;

public class KMToMILEConverter implements Convertible{
	private double km;
    private double mile;
/**
 * setting from value 
 */
    @Override
    public void setFromValue(double fromValue){
        km = fromValue;
    }
    /**
 * convert measure
 */
    @Override
    public void convert(){
        mile=(1.6)*km;
    }
    /**
 * return convertvalue
 */
    @Override  
    public double getConvertedValue(){
        return mile;
    }
}
