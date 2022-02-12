
public class Pizza {
//Different data type of parameters
	public static void pizzaOrder(String pizzaType, int price) {
		System.out.println("pizza type is: " + pizzaType + " and price is $" + price);
	}

//Different order of parameters
	public static void pizzaOrder(int price, String pizzaType) {
		System.out.println("pizza price  is $: " + price + " and type is :" + pizzaType);
	}

//Different number of parameters of the same type
	public static void pizzaOrder(String toppings, String delivery, String size) {
		System.out.println("pizza toppings are :" + toppings + "& method of delivery is:" + delivery
				+ "& size of pizza is:" + size);
	}
}
