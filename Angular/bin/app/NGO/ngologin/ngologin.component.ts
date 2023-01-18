import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from 'src/app/admin';
import { RegistrationService } from 'src/app/registration.service';

@Component({
  selector: 'app-ngologin',
  templateUrl: './ngologin.component.html',
  styleUrls: ['./ngologin.component.css']
})
export class NgologinComponent {

  admin=new Admin();
  msg='';
  

 constructor(private service:RegistrationService,private _router:Router) { }

 ngOnInit(): void {
 }

 loginngo()
 {
   this.service.loginngoFromRemote(this.admin).subscribe(
     _data =>{
       console.log("response received");
       alert('NGO login successfully')
       this._router.navigate(['/ngohome'])},
     _error=> 
     {
       console.log("exception occured");
       this.msg="Bad creditials,Please enter valid username and password";
     }
   )
 }
}
