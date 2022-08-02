//code by my self <3 ahahaha//
//G.H.T.T.Dewmin//
//IT20266400//
//////////////////
package Models;

public class Bill {
    
  double price;
  int qun;
  double total;//total  price per item//
  static double fullbill;//tottal bill //
  //!!!!!dnt remove Static!!! //

    //add button//
    public Bill(double price, int qun) {
        this.price = price;
        this.qun = qun;
    }
    
    public double item_total()
    {
       total=qun*price;
       return total;
    }
    
    public static double cbill(double itotal)
    {
        fullbill=itotal+fullbill;
        return fullbill;
    }

    
    //calculate bill button//
    public static double PrintBill()
    {
        return fullbill;
    }
    
    public static void setdefaultvalues()//after bill calculate & Pint  fullbill=0//
    {
       fullbill=0;
    }

    
}
