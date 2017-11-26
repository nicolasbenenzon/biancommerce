package Model;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Bianca on 2/11/2017.
 */
public class ShoppingCart {
    private HashMap<Product, Integer> products;
    public HashMap<Product, Integer> getProducts(){return products;}
    
	/*public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		@SuppressWarnings("unused")
		Controller controller = new Controller(model, view);
		view.setBounds(100, 100, 500, 500);
		view.setVisible(true);
	}*/

}
