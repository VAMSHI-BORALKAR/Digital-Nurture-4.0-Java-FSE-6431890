public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    public void update(String stockName, double newPrice) {
        System.out.println("Web App [" + user + "]: " + stockName + " updated to $" + newPrice);
    }
}
