import java.math.MathContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Double total=0.0;
        Shopping sp1=new Shopping("Leather wallet",1100,18,1);
        Shopping sp2=new Shopping("Umbrella",900,12,4);
        Shopping sp3=new Shopping("Cigarette",200,28,3);
        Shopping sp4=new Shopping("Honey",100,0,2);
        System.out.println("Product with maximum GST is "+sp3.product);
    }
}