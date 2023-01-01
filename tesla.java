
public class tesla {
 // instance variables//
 private String exchange;
 private double currenttradingprice;
 private double marketcap;
 private double currentpercentincrease;
 private double PEratio;

 // default constructor //
 public tesla ()

 {
     exchange = " NASDAQ ";
     currenttradingprice = 123.18;
     marketcap = 385.98;
     currentpercentincrease = 1.12;
     PEratio = 37.95;

     
 }

 // periamter constuctor //
 public tesla (String e, double ctp, double mc, double cpi, double pe)

 {
     exchange = e;
     currenttradingprice = ctp;
     marketcap = mc;
     currentpercentincrease = cpi;
     PEratio = pe;

 }

 // getters//

 public String getExchange()

 {
     return exchange;
 }

 public double getCurrenttradingprice()

 {
     return currenttradingprice;
 }

 public double getMarketcap()

 {
     return marketcap;
 }

 public double getCurrentpercentincrease()

 {
     return currentpercentincrease;
 }

 public double getPEratio()

 {
     return PEratio;
 }
 // setters//
 public String setExchange(String exchange)

 {
     return this.exchange;
 }
 public double setCurrenttradingplace(double currenttradingprice)

 {
     return this.currenttradingprice;
 }

 public double setMarketcap(double marketcap)

 {
     return this.marketcap;
 }

 public double setCurrentpercentincrease(double currentpercentincrease)

 {
     return this.currentpercentincrease;
 }
 
 public double setPEratio(double PEratio)

 {
     return this.PEratio;
 }

 // behaviour methods for all variabless 

 public void tslaexchange()

 {
     System.out.println(" Tesla motors is currently trading on the" + exchange +"exchange"); 
 }

 public void tslacurrenttradingprice()

 {
    System.out.println(" One share of Tesla Motors is currently trading at " + currenttradingprice + " USD ");
 }
 public void tslamarketcap()

 {
    System.out.println(" Tesla Motors currently has a market cap of " + marketcap);
 }

 public void tslacurrentpercentincrease()

 {
    System.out.println(" Tesla Motors is up " + currentpercentincrease + "%" +  " today ");
 }

 public void tslaPEratio()

 {
    System.out.println(" Tesla Motors price-earnings ratio is currently " + PEratio);
 }

 public String toString()

{
    String description = (" Tesla Motors, currently trading on the" + exchange + "exchange," + " is trading at " + currenttradingprice + " per share, " +"and are up " + currentpercentincrease + "%"+  " today " + ", Tesla Motors has a market cap of " + marketcap +  "B" +  " and a price-earnings ratio of " + PEratio);
    return description;
}

// code description(not the same as the toString method)//
public void description()

{
    System.out.println(" This code was made to track the most important stock statistics of a given stock, with this case being Tesla Motors (ticker symbol TSLA)");
}
      
      
 
    
 


}
