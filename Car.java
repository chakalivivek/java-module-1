class Car {
    String Model;
    int Year;
    double Price;
    String Type;

    // Constructor
    Car(String model, int year, double price, String type) {
        this.Model = model;
        this.Year = year;
        this.Price = price;
        this.Type = type;
    }

    void displayInfo() {
        System.out.println("Model: " + Model + ", Year: " + Year + ", Price: " + Price + ", Type: " + Type);
    }
}