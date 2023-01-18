import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-ngoregister',
  templateUrl: './ngoregister.component.html',
  styleUrls: ['./ngoregister.component.css']
})
export class NgoregisterComponent implements OnInit{
  private registerService!: RegistrationService
  ngoregister=new FormGroup({
    password: new FormControl('',[Validators.required]),
    username: new FormControl('',[Validators.required]),
    nEmailid: new FormControl('',[Validators.required]),
    nAddress:new FormControl('',[Validators.required]),
    nPhonenumber:new FormControl('',[Validators.required])
    })
  
    constructor(Rs:RegistrationService,private _router:Router) { 
      this.registerService = Rs;
    }
  
    ngOnInit(): void {
    }
  
    regstration(){
      console.log(this.ngoregister.value);
      this.registerService.registerngo(this.ngoregister.value).subscribe(
        res=>{alert('NGO register successfully'),

        console.log(res);
        this._router.navigate(['/adminhome'])},
        err=>{
          this.ngoregister.reset();
          alert('Invalid NGO Details'),console.log(err);}
      );
    }
}
