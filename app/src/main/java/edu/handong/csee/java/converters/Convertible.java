package edu.handong.csee.java.converters;

public interface Convertible {
	/**
	 * value function 
	 */ 
	    public void setFromValue(double fromValue);
	    /**
	 * get conoverted value function
	 */ 
	    public double getConvertedValue();
	     /**
	 * convert function 
	 */ 
	    public void convert();
}
