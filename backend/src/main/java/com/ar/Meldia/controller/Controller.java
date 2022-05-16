package com.ar.Meldia.controller;

import com.ar.Meldia.functions.Functions;
import static com.ar.Meldia.functions.Functions.getLastProduct;
import com.ar.Meldia.models.Cart;
import com.ar.Meldia.models.Product;
import com.ar.Meldia.models.User;
import com.ar.Meldia.services.ProductService;
import com.ar.Meldia.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("products")
public class Controller {

    @Autowired
    private ProductService service;

    @Autowired
    private UserService serviceU;

    List<Cart> cart = new ArrayList();
    String DNI = null;

    @GetMapping(value = "/all")
    public List<Product> allProduct() throws JsonProcessingException {
        System.out.println(service.findAllProducts());
        return service.findAllProducts();
    }

    @GetMapping(value = "/cart")
    public List<Cart> getCart() {
        System.out.println("List Cart = " + cart.toString());
        return cart;
    }

    @PostMapping(value = "/add/cart")
    public List<Cart> add(@RequestBody Product p) {
        Cart item = new Cart();
        Double totalPrice = Functions.finalPrice(cart, p.getPrice());
        item.setProduct(p);
        cart.add(item);

        item.setTotalPrice(totalPrice);
        cart.set(cart.size() - 1, item);
        System.out.println("List cart after add = " + cart.toString());
        return cart;
    }

    @DeleteMapping(value = "/remove/cart/{id}")
    public List<Product> removeToCart(@PathVariable("id") Integer id) throws JsonProcessingException {
        Product p = new Product();
        p.setId(id);
        System.out.println("ID OF PRODUCT TO REMOVE = " + p.getId());
        Functions.removeProduct(p, cart);

        return allProduct();
    }

    @GetMapping(value = "/get/discount/{dni}")
    public List<Product> getDiscount(@PathVariable("dni") String dni) throws JsonProcessingException {
        DNI = dni;
        User u = new User();
        u.setDni(dni);
        Double discount = Functions.setDiscount(cart, serviceU.findUser(u).get().getPrivilege(), serviceU, dni);
        System.out.println("The uses was founded = " + serviceU.findUser(u).get().getPrivilege());
        getLastProduct(cart, discount);

        return allProduct();
    }

    @GetMapping(value = "/cart/checkout")
    public List<Product> checkout() throws JsonProcessingException {
        System.out.println("DNI GETTING = " + DNI);
        if (cart.size() >= 10) {
            int month = new GregorianCalendar().get(Calendar.MONTH);
            int actualMonth = month + 1;
            int day = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
            int year = new GregorianCalendar().get(Calendar.YEAR);
            String stringActualMonth = Integer.toString(actualMonth);
            String stringDay = Integer.toString(day);
            String stringYear = Integer.toString(year);

            String date = stringYear + "-" + stringActualMonth + "-" + stringDay;
            System.out.println(serviceU.updateDateVIP(DNI, date));
        }

        cart.clear();
        return allProduct();
    }

    @GetMapping(value = "/get/new/users/VIP")
    public List<User> getNewUsersVIP() {
        return serviceU.findUserVIP();
    }

    @GetMapping(value = "/get/users/VIP")
    public List<User> getUsersVIP() {
        return serviceU.findAll();
    }

    @GetMapping(value = "/get/off/VIP")
    public List<User> getOffVIP() {
        return serviceU.findNoVIP();
    }

}
