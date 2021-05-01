package edu.handong.csee.java.converters;

public class TONToGConverter implements Convertible{
	private double ton = 0;
    private double g = 0;
    /**
 * setting From Value
 */
    @Override
    public void setFromValue(double fromValue){
        ton = fromValue;
    }
    /**
 *  convert
 */
    @Override
    public void convert(){
        g=ton/1000000;
    }  
    /**
 * return convertvalue
 */
    @Override
    public double getConvertedValue(){
        return g;
    }
}
