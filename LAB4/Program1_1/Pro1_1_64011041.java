package Program1_1;

public class Pro1_1_64011041 {
    public static void main(String[] args) {
        Stock data = new Stock("ORCL", "Oracle Corporation");
        data.previousClosingPrice = 34.5;
        data.currentPrice = 34.35;

        System.out.println("Symbol: "+ data.symbol);
        System.out.printf("Name: %s \n", data.name);
        System.out.printf("Previous Closing Price: %.1f \n", data.previousClosingPrice);
        System.out.printf("Current Price: %.f \n", data.currentPrice);
        System.out.printf("Price Change: %f", data.getChangePercent());
        System.out.print("%");
    }
}