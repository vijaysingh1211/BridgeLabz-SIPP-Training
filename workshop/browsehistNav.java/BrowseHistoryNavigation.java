public class BrowseHistoryNavigation {
    public static void main(String[] args) {
      BrowserHistory history = new BrowserHistory();

        history.visit("google.com");
        history.visit("github.com");
        history.visit("bing.com");

        System.out.println(history.getCurrentPage()); // stackoverflow.com
        history.goBack();
        System.out.println(history.getCurrentPage()); // github.com
        history.goBack();
        System.out.println(history.getCurrentPage()); // google.com
        history.goForward();
        System.out.println(history.getCurrentPage()); // github.com
    }
}
