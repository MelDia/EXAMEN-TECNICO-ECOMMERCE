package com.ar.Meldia.functions;

import com.ar.Meldia.models.Cart;
import com.ar.Meldia.models.Product;
import com.ar.Meldia.services.UserService;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Functions {

    public static Double finalPrice(List<Cart> list, Double price) {
        double actualPrice = 0;
        double totalPrice = price;
        for (int i = 0; list.size() > i; i++) {
            actualPrice = list.get(i).getProduct().getPrice();
            totalPrice = actualPrice + totalPrice;
        }

        return totalPrice;
    }

    public static List<Cart> removeProduct(Product p, List<Cart> cart) {
        Cart item = new Cart();
        for (int i = 0; cart.size() > i; i++) {
            if (cart.get(i).getProduct().getId() == p.getId()) {
                Double totalPrice = removeFinalPrice(cart, i);
                item.setProduct(new Product(cart.get(cart.size() - 1).getProduct().getId(), cart.get(cart.size() - 1).getProduct().getName(), cart.get(cart.size() - 1).getProduct().getPrice(), cart.get(cart.size() - 1).getProduct().getImage()));
                item.setTotalPrice(totalPrice);
                System.out.println("TOTAL PRICES " + totalPrice);
                cart.remove(i);
                cart.set(cart.size() - 1, item);
                return cart;
            }
        }

        return cart;
    }

    public static Double removeFinalPrice(List<Cart> list, Integer index) {
        double actualPrice = 0;
        double totalPrice = list.get(list.size() - 1).getTotalPrice();
        actualPrice = list.get(index).getProduct().getPrice();
        System.out.println("PRICE PRODUCT ACTUAL TO REMOVE = " + actualPrice);
        totalPrice = totalPrice - actualPrice;

        return totalPrice;
    }

    public static Double setDiscount(List<Cart> cart, String privilege, UserService serviceU, String dni) {
        double casualDiscount = 100;
        double vipDiscount = 500;
        double totalPrice = cart.get(cart.size() - 1).getTotalPrice();
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        ++month;

        Cart item = new Cart();
        //December 24th discount
        if (cart.size() == 4) {
            return totalPrice * 0.25;
        }
        if (cart.size() >= 10) {
            if (privilege.equalsIgnoreCase("VIP")) {
                if (day == 24 && month == 12) {
                    return totalPrice - 800;
                }
                return totalPrice - 500;
            } else {
                if (day == 24 && month == 12) {
                    return totalPrice - 400;
                }
                if (totalPrice - 100 >= 10000) {
                    String stringActualMonth = Integer.toString(month);
                    String stringDay = Integer.toString(day);
                    String stringYear = Integer.toString(year);
                    String date = stringYear + "-" + stringActualMonth + "-" + stringDay;
                    serviceU.updateDateVIP(dni, date);
                }
                return totalPrice - 100;
            }
        }
        return totalPrice;

    }

    public static void getLastProduct(List<Cart> cart, Double totalPrice) {
        Cart item = new Cart();
        item.setProduct(new Product(cart.get(cart.size() - 1).getProduct().getId(), cart.get(cart.size() - 1).getProduct().getName(), cart.get(cart.size() - 1).getProduct().getPrice(), cart.get(cart.size() - 1).getProduct().getImage()));
        item.setTotalPrice(totalPrice);
        cart.set(cart.size() - 1, item);
    }

}
