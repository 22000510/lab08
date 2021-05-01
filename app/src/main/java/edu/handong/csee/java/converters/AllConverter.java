package edu.handong.csee.java.converters;

public class AllConverter {

    private double x;
    private String kind;
     /**
 * set from value
 */ 
    public AllConverter setFromValue(double fromValue){
        this.x = fromValue; 
        return this;
    }
         /**0
 * return convertvalue
 */ 
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.kind = originalMeasure;
        return this;
    }
         /**
 * convert and print out
 */ 
    public void convertAndPrintOut(){
        if(kind == "KM"){
           double m;
           double mile;
           m = 1000*x; 
           mile = (1.6)*x;
            System.out.println(x+" KM to"+m+" M");
            System.out.println(x+" KM to"+mile+" MILE");
        }
        else if(kind == "TON"){
            double g;
            double kg;
            g = x/1000000; 
            kg = x/1000;
             System.out.println(x+" TON to"+g+" KG");
             System.out.println(x+" TON to"+kg+" G");
         }
        
    }
}
