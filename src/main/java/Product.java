public class Product {
    private String id;
    private  String Name;
    private double prime;
    private int amount;
    private  String describe;

    public Product() {
    }

    public Product(String id, String name, double prime, int amount, String describe) {
        this.id = id;
        Name = name;
        this.prime = prime;
        this.amount = amount;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", prime='" + prime + '\'' +
                ", amount=" + amount +
                ", describe='" + describe + '\'' +
                '}';
    }
}
