package edu.handong.csee.java.converters;

public class KMToMConverter implements Convertible{
	  private double km = 0;
	    private double m = 0;
	      /**
	 * setting value 
	 */
	    @Override
	    public void setFromValue(double fromValue){
	        km = fromValue;
	    }
	     /**
	 *  converting
	 */
	    @Override
	    public void convert(){
	        m=km/1000;
	    } 
	      /**
	 * return convertvalue
	 */ 
	    @Override
	    public double getConvertedValue(){
	        return m;
	    }
}
