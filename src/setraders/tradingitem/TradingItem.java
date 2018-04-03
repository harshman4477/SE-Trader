
package setraders.tradingitem;

/**
 *
 * @author Harsh Panchal
 */
public abstract class TradingItem {

    private double itemPrice;

    public TradingItem() {
        this.itemPrice = 0;
    }

    public double getTradingItemPrice() {
        return itemPrice;
    }

    public void setTradingPrice(double price) {
        itemPrice = price;
    }



}