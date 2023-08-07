package shopping_Site;

public class Test_Main {

	public static void main(String[] args) {
		Company company = new Company("Shopping Site",219);
		
		Item item1 = new Item("Item 1", 10.0);
        Item item2 = new Item("Item 2", 15.0);
        Item item3 = new Item("Item 3", 20.0);
        
        OrderedItem orderedItem1 = new OrderedItem(2,item1);//20
        OrderedItem orderedItem2 = new OrderedItem(3,item2);//44.9
        OrderedItem orderedItem3 = new OrderedItem(1,item3);//19
    
        Customer customer1 = new Customer(1,"Kishore");
        Customer customer2 = new RegCustomer(2,"Bhanu",10.0);
        Customer customer3 = new RegCustomer(3,"Kiran",5.0);
        
        Order order1 = new Order(1, customer1);
        Order order2 = new Order(2,customer2);
        Order order3 = new Order(3,customer3);
        
        order1.addOrderItem(orderedItem1);
        order1.addOrderItem(orderedItem2);
        order1.addOrderItem(orderedItem3);
        
        order2.addOrderItem(orderedItem1);
        order2.addOrderItem(orderedItem2);
        order2.addOrderItem(orderedItem3);
        
        order3.addOrderItem(orderedItem1);
        order3.addOrderItem(orderedItem2);
        order3.addOrderItem(orderedItem3);

        customer1.addOrder(order1);
        customer2.addOrder(order2);
        customer3.addOrder(order3);
        
        company.addCustomer(customer1);
        company.addCustomer(customer2);
        company.addCustomer(customer3);
        
        // Calculate the total worth of orders placed
        double TotalOrderValue =company.getTotalOrderValue();
        System.out.println("Total worth of orders placed: " + TotalOrderValue);
	
	}
}
