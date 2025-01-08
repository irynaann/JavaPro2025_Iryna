package ua.com.ithillel.homework.lesson05.productcost.app;

public class CalcCostBase {
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice();
    }
}