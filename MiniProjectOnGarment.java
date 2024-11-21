
import java.util.ArrayList;
import java.util.List;

public class MiniProjectOnGarment {

    public static void main(String[] args) {

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

}

class Fabric {

    public String id;
    public String type;
    public String color;
    public double pricePerMeter;
}

class Supplier {

    public String id;
    public String name;
    public String contactInfo;

    List<Fabric> suppliedFabric = new ArrayList<>();

}

class Customer {

}

class Order {

}

class Inventory {

}
