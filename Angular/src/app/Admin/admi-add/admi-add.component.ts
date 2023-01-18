import { Component } from '@angular/core';
import { RegistrationService } from 'src/app/registration.service';

@Component({
  selector: 'app-admi-add',
  templateUrl: './admi-add.component.html',
  styleUrls: ['./admi-add.component.css']
})
export class AdmiAddComponent {
  NGODetails: any;
  private employee:RegistrationService;
  
    constructor(e:RegistrationService) { 
      this.employee=e;
    }
  
    ngOnInit(): void {
      this.employee
      .getngo()
      .subscribe(
      (response)=>{this.NGODetails = response;},
      (error)=>{
        alert('Invalid Id Password'),
        console.log(error);}
      );
    }
  
}
