import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-addmedicine',
  templateUrl: './addmedicine.component.html',
  styleUrls: ['./addmedicine.component.css']
})
export class AddmedicineComponent {
  private registerService!: RegistrationService

  addmedicine=new FormGroup({
  medicineName: new FormControl('', [Validators.required]),
  price: new FormControl('',[Validators.required]),
  mfdDate: new FormControl('',[Validators.required]),
  expDate: new FormControl('',[Validators.required]),
  quantity:new FormControl('',[Validators.required])
  })

  constructor(Rs:RegistrationService,private _router:Router) { 
    this.registerService = Rs;
  }

  ngOnInit(): void {
  }

  regstration(){
    console.log(this.addmedicine.value);
    this.registerService.addmedicine(this.addmedicine.value).subscribe(
      res=>{alert('Medicine Added successfully'),console.log(res);
      this._router.navigate(['/adminhome'])
    },
      err=>{
        this.addmedicine.reset();
        alert('Invalid medicine Details'),console.log(err);}
    );
  }

}
