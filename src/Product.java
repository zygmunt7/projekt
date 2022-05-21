public class Product {
    private String productName;
    private double priceOfProduct;

    public Product(String productName, double priceOfProduct){
        this.productName = productName;
        this.priceOfProduct = priceOfProduct;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setPriceOfProduct(double priceOfProduct){
        this.priceOfProduct = priceOfProduct;
    }
    public double getPriceOfProduct(){
        return priceOfProduct;
    }
}