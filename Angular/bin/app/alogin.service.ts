import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AloginService {

  constructor(private http:HttpClient) { }
  // getAdmin(){
  //   return this.http.get("http://localhost:9005/addAdmin")
    

  // }


}
