package version2;

/**
 * Created by Eagle on 20.10.2015 ?..
 */
public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new ShoppingPage());
        pages.add(new ContactPage());
        pages.add(new CartPage());
    }
}
