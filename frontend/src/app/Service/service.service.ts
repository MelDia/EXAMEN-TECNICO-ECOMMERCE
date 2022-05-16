import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../Model/Product';
import { Cart } from '../Model/Cart';
import { User } from '../Model/User';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {


  constructor(private http: HttpClient) { }

  URL = "http://localhost:8081/products";

  getProducts() {
    return this.http.get<Product[]>(this.URL + '/all');
  }

  getCart() {
    return this.http.get<Cart[]>(this.URL + '/cart');
  }

  addToCart(product: Product) {
    return this.http.post<Product>(this.URL + '/add/cart', product);
  }

  removeToCart(cart: Cart) {
    return this.http.delete<Cart>(this.URL + '/remove/cart/' + cart.product.id);
  }

  getDiscount(username: string) {
    return this.http.get<Cart>(this.URL + '/get/discount/' + username);
  }

  checkout() {
    return this.http.get(this.URL + '/cart/checkout');
  }

  getUsersVIP() {
    return this.http.get<User[]>(this.URL + '/get/users/VIP');
  }

  getNewUsersVIP() {
    return this.http.get<User[]>(this.URL + '/get/new/users/VIP');
  }

  getNoVIP() {
    return this.http.get<User[]>(this.URL + '/get/off/VIP')
  }


}
