import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../models/user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private userService: UserService) { }

  users:User[];

  ngOnInit() {
    this.userService.getAllUsers().subscribe(data => {
      this.users=data;
    });
  }


}
