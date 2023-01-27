package chapter12.MultiInterface;

public class Customermain {

	public static void main(String[] args) {

      Customer customer=new Customer();
      System.out.println("---------Buy---------");
      Buy buyer=customer;
      buyer.buy();
      buyer.order();
      
      System.out.println("---------Buy---------");
      Sell seller=customer;
      seller.sell();
      seller.sellorder();
      //seller.order();
      //seller 부모 / Customer 자식
      if(seller instanceof Customer) {
    	  Customer customer2=(Customer)seller;
    	  System.out.println("--Down Chasting");
    	  customer2.buy();
    	  customer2.sell();
    	  customer2.sellorder();
      }
      
      customer.order();

	}

}
