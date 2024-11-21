
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MiniProjectOnGarment {

    public static void main(String[] args) {
        Garment s1 = new Garment();
        Order s2 = new Order();
        s1.name = "Silk";
        s1.description = "Good Product";
        s1.price = 1000;
        double x = s1.calculateDiscountPrice(10);
        System.out.println(x);
        s2.printOrderDetails();

    }
}

class Garment {

    public String id;
    public String name;
    public String description;
    public String size;
    public String color;
    public double price;
    public int stockQuantity;

    void updateStock(int quantity) {
        this.stockQuantity = quantity;
    }

    double calculateDiscountPrice(double discountPercentage) {
        double discount = price * (discountPercentage / 100);
        return discount;
    }

}

class Fabric {

    public String id;
    public String type;
    public String color;
    public double pricePerMeter;

    double calculateCost(double meters) {
        double newPrice = pricePerMeter * meters;
        return newPrice;
    }
}

class Supplier {

    public String id;
    public String name;
    public String contactInfo;
    List<Fabric> suppliedFabric = new ArrayList<>();

    void addFabric(Fabric fabric) {
        suppliedFabric.add(fabric);
    }

    List<Fabric> getSuppliedFabrics() {
        return suppliedFabric;
    }

}

class Customer {

    public String customerId;
    public String name;
    public String email;
    public String phone;

    void placeOrder(Order order) {

    }

    List<Order> viewOrders() {
        return null;
    }
}

class Order {

    public String orderId;
    public Date orderDate;
    public List<Garment> garments = new ArrayList<>();
    private double totalAmount;

    void addGarment(Garment garment) {
        garments.add(garment);
    }

    double calculateTotalAmount() {
        for (Garment a : garments) {
            totalAmount = totalAmount + a.price;
        }
        return totalAmount;

    }

    void printOrderDetails() {
        System.out.println("--------------------------");
        System.out.println("Order Details");
        System.out.println("--------------------------");
        for (Garment a : garments) {
            System.out.println("Name: " + a.name);
            System.out.println("Price: " + a.price);
            System.out.println("Description: " + a.description);
            System.out.println("--------------------------");
        }
    }
}

class Inventory {

    List<Garment> garments;

    void addGarment(Garment garment) {
        garments.add(garment);
    }

    void removeGarment(String id) {
        garments.remove(id);
    }

    Garment findGarment(String id) {
        for (Garment a : garments) {
            if (a.id == id) {
                return a;
            }
        }
        return null;
    }

}
