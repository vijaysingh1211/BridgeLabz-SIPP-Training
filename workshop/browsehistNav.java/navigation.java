abstract class Navigation {
    public abstract void visit(String url);
    public abstract boolean canGoBack();
    public abstract boolean canGoForward();
    public abstract String goBack();
    public abstract String goForward();
    public abstract String getCurrentPage();
}

class PageNode {
    String url;
    PageNode prev;
    PageNode next;

    public PageNode(String url) {
        this.url = url;
    }
}

class BrowserHistory extends Navigation {
    private PageNode current;

    @Override
    public void visit(String url) {
        PageNode newNode = new PageNode(url);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
    }
    
    @Override
    public boolean canGoBack() {
        return current != null && current.prev != null;
    }

    @Override
    public boolean canGoForward() {
        return current != null && current.next != null;
    }

    @Override
    public String goBack() {
        if (canGoBack()) {
            current = current.prev;
        }
        return getCurrentPage();
    }

    @Override
    public String goForward() {
        if (canGoForward()) {
            current = current.next;
        }
        return getCurrentPage();
    }

    @Override
    public String getCurrentPage() {
        return current != null ? current.url : "No page visited yet";
    }
}
