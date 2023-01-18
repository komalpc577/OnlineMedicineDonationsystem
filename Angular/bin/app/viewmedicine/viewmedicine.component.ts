import { Component, OnInit } from '@angular/core';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-viewmedicine',
  templateUrl: './viewmedicine.component.html',
  styleUrls: ['./viewmedicine.component.css']
})
export class ViewmedicineComponent implements OnInit{
  MedicineDetails: any;
  private employee:RegistrationService;
  
    constructor(e:RegistrationService) { 
      this.employee=e;
    }
  
    ngOnInit(): void {
      this.employee
      .getmedicine()
      .subscribe(
      (response)=>{this.MedicineDetails = response;},
      (error)=>{
        alert('Invalid Id Password'),
        console.log(error);}
      );
    }
  
}
