import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../../Model/Product';
import { ServiceService } from '../../Service/service.service';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  products: Product[] = [];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.service.getProducts()
      .subscribe(data => {
        this.products = data;
      })
  }

  addToCart(product: Product) {
    this.service.addToCart(product)
      .subscribe(data => {
        alert("Has been add to the cart");
        this.router.navigate(["add"])
      })
  }

}
