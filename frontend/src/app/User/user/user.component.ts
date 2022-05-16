import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../..//Model/User';
import { ServiceService } from '../../Service/service.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: User[] = [];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.service.getUsersVIP()
      .subscribe(data => {
        this.users = data;
      })
  }

}
