import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import { RegistrationService } from 'src/app/registration.service';
import { Admin } from 'src/app/admin';
@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminComponent implements OnInit {
  admin=new Admin();
  msg='';
  

 constructor(private service:RegistrationService,private _router:Router) { }

 ngOnInit(): void {
 }

 loginadmin()
 {
   this.service.loginadminFromRemote(this.admin).subscribe(
     _data =>{
       console.log("response received");
       this._router.navigate(['/adminhome'])},
     _error=> 
     {
       console.log("exception occured");
       this.msg="Bad creditials,Please enter valid username and password";
     }
   )
 }
 
}
