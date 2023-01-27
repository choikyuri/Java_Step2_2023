package chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		//방법1
        ThreeDPrinter printerPowder=new ThreeDPrinter();
        Powder p1=new Powder();
        printerPowder.setMaterial(p1);
        System.out.println(p1);
        //방법2
        Powder p2=(Powder)printerPowder.getMaterial();
        System.out.println(p2);  
        
         //방법1
        ThreeDPrinter printerPlastic=new ThreeDPrinter();
        Plastic p3=new Plastic();
        printerPlastic.setMaterial(p3);
        System.out.println(p3);
        
        //방법2
        Plastic p4=(Plastic)printerPlastic.getMaterial();
        System.out.println(p4);  
        
        
	}

}
