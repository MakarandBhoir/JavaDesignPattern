package version1;

public class LunchOrderBeanDemo {

	public static void main(String[] args) {

		/*//LunchOrderBean order = new LunchOrderBean();
		LunchOrderTele order = new LunchOrderTele("Wheat", "Lettuce");
		order.setBread("Wheat");
		order.setCondiments("Lettuce");
		order.setDressing("Mustard");
		order.setMeat("Ham");
		*/
		// Builder pattern
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").meat("Chicken").dressing("");
		LunchOrder order = builder.build();
		
		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDressing());
		System.out.println(order.getMeat());
		
		
		
	}

}
