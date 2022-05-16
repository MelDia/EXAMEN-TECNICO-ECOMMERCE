import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/Model/Product';
import { Cart } from '../../Model/Cart';
import { ServiceService } from '../../Service/service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  inCart: Cart[] = [];

  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.service.getCart()
      .subscribe(data => {
        this.inCart = data;
      })
  }

  removeToCart(cart: Cart) {
    this.service.removeToCart(cart)
      .subscribe(data => {
        alert("Has been removed to the cart");
        this.router.navigate(["list"]);
      })
  }

  getDiscount(username: string) {
    this.service.getDiscount(username)
      .subscribe(data => {
        alert("Applying discount in your buy");
        this.router.navigate(["list"]);
      })
  }

  checkout() {
    this.service.checkout()
      .subscribe(data => {
        alert("Thank you for your purchase, Enjoy");
        this.router.navigate(["list"]);
      })
  }


}
