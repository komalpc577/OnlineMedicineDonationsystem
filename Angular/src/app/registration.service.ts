import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from './admin';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
 



  constructor(private http:HttpClient) { }

public  loginadminFromRemote(admin: any) {
   return this.http.post<any>("http://localhost:9005/admin/adminLogin",admin)
 }
 public  loginexecutiveFromRemote(Executive: any) {
  return this.http.post<any>("http://localhost:8080/executiveLogin",Executive);
}
public loginngoFromRemote(admin: any) {
  return this.http.post<any>("http://localhost:9007/NgoLogin",admin)
}
public UserFromRemote(admin: any) {
  return this.http.post<any>("http://localhost:8082/login",admin);
}
// public registerUser(data: any) {
//   return this._http.post<any>("http://localhost:8082/register",data);
// }
registerUser(data:any){
  return this.http.post("http://localhost:8082/register",data);
}
getngo(){//add to the 
  return this.http.get("http://localhost:9007/getNgo");
 }
 getuser(){//add to the 
  return this.http.get("http://localhost:8082/getuser");
 }
 getmedicine(){//add to the 
  return this.http.get("http://localhost:8089/getAllmedicine");
 }
 registerngo(data:any){
  return this.http.post("http://localhost:9007/addNgo",data);
}
addmedicine(data:any){
  return this.http.post("http://localhost:8089/addMedicine",data);
}

}