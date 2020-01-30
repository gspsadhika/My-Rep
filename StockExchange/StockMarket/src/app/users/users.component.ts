import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../models/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(private userService: UserService, private router:Router) { }

  users:User[];

  ngOnInit() {
    this.userService.getAllUsers().subscribe(data => {
      this.users=data;
    });
  }
  deleteUser(id:number)
  {
    this.userService.deleteUser(id).subscribe();
    this.users=this.users.filter(u => u.id!==id);
  }
 updateUser(user:User)
 {
   localStorage.removeItem('userId');
   localStorage.setItem('userId', user.id.toString());
   this.router.navigate(['update-user']);
 }

}
