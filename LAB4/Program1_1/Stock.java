package Program1_1;

public class Stock {
    public String symbol, name;
    public double previousClosingPrice, currentPrice;

    // Constructor
    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

}
