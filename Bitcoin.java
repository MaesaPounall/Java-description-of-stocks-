public class Bitcoin {
    //instance variables//
    private int Totalbitcoin;
    private double Marketcapitalization;
    private double tradingprice;
    private String exchange;
    private double percentincrease;

    //default constructor//
    public Bitcoin()

    {
        Totalbitcoin = 19248682;
        Marketcapitalization = 318.45 ;
        tradingprice = 16543.77;
        exchange = " Crypto does not have a set and stone exchange like other assets, crypto trades through companies who are willing to hold and trade bitcoin, for bitcoin these include: Binance, FTX(not anymore lol), Coinbase, Kraken, and KuCoin ";
        percentincrease = 0.03;
    }

    //periameter constructor//
    public Bitcoin(int tb, double mc, double tp, String e, double pi)

    {
        Totalbitcoin = tb;
        Marketcapitalization = mc;
        tradingprice = tp;
        exchange = e;
        percentincrease = pi;
    }

    // getters // 

    public int getTotalbitcoin()

    {
        return Totalbitcoin;
    }

    public double getMarketcapitalization()

    {
        return Marketcapitalization;
    }

    public double getTradingprice()

    {
        return tradingprice;
    }

    public double getPercentincrease()

    {
        return percentincrease;
    }

    public String getExchange()

    {
        return exchange;
    }

    // setters //

    public int setTotalbitcoin(int Totalbitcoin)

    {
        return this.Totalbitcoin;
    }

    public double setMarketcapitalization(double Marketcapitalization)

    {
        return this.Marketcapitalization;
    }

    public double setTradingprice(double tradingprice)

    {
        return this.tradingprice;
    }

    public String setExchange(String exchange)

    {
        return exchange;
    }

    public double setPercentincrease()

    {
        return this.percentincrease;
    }

    // behaviours methods for all asset properties //

    public void btcBitcointotal()

    {
        System.out.println("The total amount of bitcoin (BTC) circulating the international market is " + Totalbitcoin);
    }

    public void btcMarketcap()

    {
        System.out.println("The total market capitalization of bitcoin is " + Marketcapitalization);
    }

    public void btcExchange()

    {
        System.out.println(exchange);
    }

    public void btcTradingprice()

    {
        System.out.println("Bitcoin is currently trading at " + tradingprice + " per share");
    }

    public void btcPercentincrease()

    {
        System.out.println("Bitcoin is up " + percentincrease + " today!");
    }

    public String toString()

    {
        String description = (exchange + " there is currently " + Totalbitcoin + "M" + " circulating in the global economy " + "bitcoin is currently trading at " + tradingprice + " pershare" + " it is up " + percentincrease + "%" + " today" + " bitcoin has a market capitlization of " + Marketcapitalization + "B");
        return description;
    }

    public void descriptionbtc()

    {
        System.out.println("This code was created to display the most imporant aspects of the crypto asset, bitcoin(ticker symbol BTC");
    }




} 


