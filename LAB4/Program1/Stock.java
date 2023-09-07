package Program1;

public class Stock {
    private String symbol, name;
    public double previousClosingPrice, currentPrice;

    // Constructor
    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

}
