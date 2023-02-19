import java.util. *;

public class VendingMachine {
    private  int maxCapasity;
    private List<Product> list = new ArrayList<>();

    public VendingMachine(int maxCapasity, List<Product> list) {
        this.maxCapasity = maxCapasity;
        this.list = list;
    }
    public VendingMachine(int maxCapasity){
        this.maxCapasity = maxCapasity;
    }

    public  void add(Product product){
        if (list.size() < maxCapasity){
            list.add(product);
        }
        else{
            System.out.println("The vending machine is full!!!");
        }
    }

    public Product getProductName(String name) throws Exception{
        for (Product product: list){
            if (product.getName().equals(name)){
                return product;
            }
        }
        throw new Exception("Non");
    }
    public Product getProductPrice(double price) throws Exception {
        for (Product product : list) {
            if (product.getPrice() == price) {
                return product;
            }
        }
        return null;
    }

    public int getMaxCapasity() {
        return maxCapasity;
    }

    public void setMaxCapasity(int maxCapasity) {
        this.maxCapasity = maxCapasity;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

}
