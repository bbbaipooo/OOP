package Program1;

public class Pro1_64011041 {
    public static void main(String[] args) {
        Stock data = new Stock("ORCL", "Oracle Corporation");
        data.previousClosingPrice = 34.5;
        data.currentPrice = 34.35;

        System.out.println("Symbol: "+ data.getSymbol());
        System.out.println("Name: "+ data.getName());
        System.out.println("Previous Closing Price: "+ data.previousClosingPrice);
        System.out.println("Current Price: "+ data.currentPrice);
        System.out.println("Price Change: "+ data.getChangePercent()+"%");
    }
}