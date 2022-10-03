public class Stock 
{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) 
    {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() 
    {
        return symbol;
    }

    public void setSymbol(String symbol) 
    {
        this.symbol = symbol;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getCurrentPrice() 
    {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) 
    {
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }

    public double getPreviousClosingPrice() 
    {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice)
    {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent() 
    {
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
    public static void main(String[] args) 
    {
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		System.out.println("\nStock name: " + stock.name);
		System.out.println("Stock symbol: " + stock.symbol);
		System.out.printf("Price-change percentage: %.2f%%\n", 
			stock.getChangePercent());
	}
}