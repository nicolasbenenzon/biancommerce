package Model;

/**
 * Created by Bianca on 2/11/2017.
 */
//Class description :
//The product defines an item that can be sold and exposed on the website.
public class Product {
    //public parameters

    // private parameters
    private String name;
    private String description;
    private int qtyPhotos;
    private int price;
    private int stock;

    private Category typeOfProduct;

    //public methods
    public Product(){

    }
    public Product(String pName, String pDescription){
        this.name = pName;
        this.description = pDescription;
    }
    public Product(String pName, String pDescription, int pQty, int pPrice, int pStock, Category pType){
        this.name = pName;
        this.description = pDescription;
        if( pQty < 0 || pPrice < 0 || pStock < 0) {
            // for now we don't do anything (this should be check in the controller package and not in the model package IMO)
            System.out.println("Wrong assignement");
        }
        this.qtyPhotos = pQty;
        this.price = pPrice;
        this.stock = pStock;
        this.typeOfProduct = pType;
    }
    //getters and setters
    public void setName(String pName){
        this.name = pName;
    }
    public String getName(){
        return this.name;
    }
    public void setDescription(String pDescription){
        this.description = pDescription;
    }
    public String getDescription(){
        return this.description;
    }
    public void setQtyPhotos(int pQty){
        this.qtyPhotos = pQty;
    }
    public int  getQtyPhotos(){
        return this.qtyPhotos;
    }
    public void setPrice(int pPrice){
        this.price = pPrice;
    }
    public int  getPrice(){
        return this.price;
    }
    public void setStock(int pStock){
        this.stock = pStock;
    }
    public int getStock(){
        return this.stock;
    }
    public void setCategory(Category pType){
        this.typeOfProduct = pType;
    }
    public Category getCategory(){
        return this.typeOfProduct;
    }

    //private methods



}