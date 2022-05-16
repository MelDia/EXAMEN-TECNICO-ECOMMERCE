import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../..//Model/User';
import { ServiceService } from '../../Service/service.service';

@Component({
  selector: 'app-new-vip',
  templateUrl: './new-vip.component.html',
  styleUrls: ['./new-vip.component.css']
})
export class NewVIPComponent implements OnInit {

  users: User[] = [];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.service.getNewUsersVIP()
      .subscribe(data => {
        this.users = data;
      })
  }

}
