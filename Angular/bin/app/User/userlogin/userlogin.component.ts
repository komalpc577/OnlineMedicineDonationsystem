import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Admin } from 'src/app/admin';
import { RegistrationService } from 'src/app/registration.service';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {


    // registerForm: any=FormGroup;
    // loading = false;
    // submitted = false; 
 
    // constructor(
    //   private formBuilder: FormBuilder
    // ){}

    // ngOnInit() {
    //   this.registerForm = this.formBuilder.group({
    //     firstName: ['', Validators.required],
    //     lastName: ['', Validators.required],
    //     username: ['', Validators.required],
    //     password: ['', [Validators.required, Validators.minLength(6)]]
    //   });
    // }

    // onSubmit() {
    //   // this.submitted = true;
    //   // if(this.registerForm.invalid) {
    //   //   return;
    //   // }
    //   console.log(this.registerForm.value)
    //   localStorage.setItem(this.registerForm,'registraion')
    //   console.log(localStorage.getItem(this.registerForm))
    // }
    admin=new Admin();
  msg='';
  

 constructor(private service:RegistrationService,private _router:Router) { }

 ngOnInit(): void {
 }

 User()
 {
   this.service.UserFromRemote(this.admin).subscribe(
     _data =>{
       console.log("response received");
       alert('User Login successfully')
       this._router.navigate(['/userhome'])},
     _error=> 
     {
       console.log("exception occured");
       this.msg="Bad creditials,Please enter valid username and password";
     }
   )
 }
 
}

