import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'e-commerce';

  constructor(private router:Router){}

  List(){
    this.router.navigate(["list"]);
  }

  Add(){
    this.router.navigate(["add"]);
  }

  listVIP(){
    this.router.navigate(["listVIP"]);
  }

  newUsersVIP(){
    this.router.navigate(["newUsersVIP"]);
  }

  NoVIP(){
    this.router.navigate(["NoVIP"]);
  }
}
