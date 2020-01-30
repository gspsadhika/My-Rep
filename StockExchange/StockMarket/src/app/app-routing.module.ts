import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RegisterComponent} from'./form/register/register.component';
import { from } from 'rxjs';
import { LoginComponent } from './login/login.component';
import { UsersComponent } from './users/users.component';


const routes: Routes = [

 {path: "register",component:RegisterComponent},
 {path: "login", component:LoginComponent},
 {path: "users", component: UsersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
