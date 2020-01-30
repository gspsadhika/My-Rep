import { Injectable } from '@angular/core';
import { User } from './models/user';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  httpUrl='http://localhost:3000/users/';

constructor(private httpClient:HttpClient)
{}
getAllUsers() : Observable<User[]>
{
  return this.httpClient.get<User[]>(this.httpUrl);
}
saveUser(user:User):Observable<User>
{
  return this.httpClient.post<User>(this.httpUrl, user);
}
// deleteUser(email:String):Observable<User>
// {
//   return this.httpClient.delete<User>(this.httpUrl + '/' + email);
// }
}