import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-registers',
  templateUrl: './registers.component.html',
  styleUrls: ['./registers.component.css']
})
export class RegistersComponent implements OnInit {
  private registerService!: RegistrationService

  register=new FormGroup({
  username: new FormControl('', [Validators.required]),
  emailId: new FormControl('',[Validators.required]),
  address: new FormControl('',[Validators.required]),
  contactNumber: new FormControl('',[Validators.required]),
  password:new FormControl('',[Validators.required])
  })
  

  constructor(Rs:RegistrationService,private _router:Router) { 
    this.registerService = Rs;
  }

  ngOnInit(): void {
  }

  regstration(){
    console.log(this.register.value);
    this.registerService.registerUser(this.register.value).subscribe(
      res=>{alert('User register successfully'),console.log(res);
      this._router.navigate(['/'])
    },
    
      err=>{
        this.register.reset();
        alert('Invalid User Details'),console.log(err);}
    );
  }

}
