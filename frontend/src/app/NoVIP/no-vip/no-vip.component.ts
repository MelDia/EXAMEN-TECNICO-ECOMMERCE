import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../..//Model/User';
import { ServiceService } from '../../Service/service.service';

@Component({
  selector: 'app-no-vip',
  templateUrl: './no-vip.component.html',
  styleUrls: ['./no-vip.component.css']
})
export class NoVIPComponent implements OnInit {

  users: User[] = [];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.service.getNoVIP()
      .subscribe(data => {
        this.users = data;
      })
  }

}
