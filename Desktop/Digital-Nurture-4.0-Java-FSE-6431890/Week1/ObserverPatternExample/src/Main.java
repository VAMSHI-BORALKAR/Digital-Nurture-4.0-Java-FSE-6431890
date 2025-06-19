public class Main {
    public static void main(String[] args) {
        
        StockMarket appleStock = new StockMarket("AAPL");

        Observer mobileUser = new MobileApp("Vamshi");
        Observer webUser = new WebApp("Investor123");

        appleStock.registerObserver(mobileUser);
        appleStock.registerObserver(webUser);

        appleStock.setStockPrice(180.25);
        appleStock.setStockPrice(182.75);

        appleStock.removeObserver(mobileUser);
        appleStock.setStockPrice(185.00);
    }
}
