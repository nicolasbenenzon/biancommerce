package Model;

/**
 * Created by Bianca on 2/11/2017.
 */
public class Customer extends User {
    private ShoppingCart cart;

    public Customer(String name, String mail, String cellphone, String password){
        super(name, mail, cellphone, password);
        cart = new ShoppingCart();
    }

    public void changeName(String newName){
        setName(newName);
    }

    public void changeMail(String newMail){
        setMail(newMail);
    }

    public void changeCellphone(String newCellphone){
        setCellphone(newCellphone);
    }

    public void changePassword(String oldPassword, String newPassword) throws wrongOldPasswordException{
        if (!oldPassword.equals(this.getPassword()))
            throw new wrongOldPasswordException();

        setPassword(newPassword);
    }

    public boolean addProductToCart(Product product, int quantity){
        if (cart.getProducts().containsKey(product)) {
            if (cart.getProducts().get(product) < quantity) {
                cart.getProducts().put(product, quantity);
                return true;
            }
            else
                return false;
        }
        cart.getProducts().put(product, quantity);
        return true;
    }

    public boolean payCart(CreditCard creditCard, double ammount){
        if (creditCard.hasEnoughBalance(ammount)) {
            creditCard.setBalance(creditCard.getBalance() - ammount);
            return true;
        }
            return false;
    }
}
