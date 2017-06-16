package version2;

/**
 * Created by Eagle on 20.10.2015 ?..
 */
public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new ShoppingPage());
    }
}
