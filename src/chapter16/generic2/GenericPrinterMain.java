package chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {
		
        GenericPrinter<Powder> printerPowder=new GenericPrinter<Powder>();
        printerPowder.setMaterial(new Powder());
        Powder powder=printerPowder.getMaterial();
        System.out.println(powder);
        powder.doprinting();
        
        System.out.println();
        
        GenericPrinter<Plastic> printerPlastic=new GenericPrinter<Plastic>();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic=printerPlastic.getMaterial();
        System.out.println(plastic);
        plastic.doprinting();
        
        System.out.println();
        //물의 재료는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생한다.
        Water water=new Water();
        water.doprinting();
        /*
        GenericPrinter<Water> printerWater=new GenericPrinter<Water>();
        printerWater.setMaterial(new Water());
        System.out.println(printerWater);*/
       
        
     
        
        
	}

}
