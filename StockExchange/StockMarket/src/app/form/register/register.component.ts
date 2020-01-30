import { Component, OnInit } from '@angular/core';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import { UserService } from 'src/app/user.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private userService: UserService) { }

  ngOnInit() {
    this.registerForm= this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password:['', Validators.required],
      confirmPassword:['', Validators.required],
      mobile:['', Validators.required]    

    });
  }
  addUser()
  {
    this.userService.saveUser(this.registerForm.value).subscribe(data => {
      console.log('User Inserted Successfully');
  });
  }
  onsubmit(){  
  console.log(this.registerForm.value);
  }

}
