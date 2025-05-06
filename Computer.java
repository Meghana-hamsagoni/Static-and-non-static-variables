public class Computer {
    public static String os= "Windows ";
   String ram;

public static void main (String [] args)
 {
System.out.println("OS:" +Computer.os );
Computer obj1= new Computer();
obj1.ram="8 GB"; 
System.out.println(" Computer1 Ram :" + obj1.ram );

Computer obj2= new Computer();
obj2.ram="16 GB"; 
System.out.println(" Computer2 Ram :" + obj2.ram );
}
}

 
