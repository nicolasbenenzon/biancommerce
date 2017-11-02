package Model;

/**
 * Created by Bianca on 2/11/2017.
 */
public class Customer extends User {
    private ShoppingCart cart;

    public Customer(String name, String mail, String cellphone, String password){
        super(name, mail, cellphone, password);
        cart = new ShoppingCart;
    }

    public void changeName(String newName){
        setName(newName);
    }
}
