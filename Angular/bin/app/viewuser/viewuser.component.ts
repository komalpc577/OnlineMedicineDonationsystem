import { Component, OnInit } from '@angular/core';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-viewuser',
  templateUrl: './viewuser.component.html',
  styleUrls: ['./viewuser.component.css']
})
export class ViewuserComponent implements OnInit {
  UserDetails: any;
  private employee:RegistrationService;
  
    constructor(e:RegistrationService) { 
      this.employee=e;
    }
  
    ngOnInit(): void {
      this.employee
      .getuser()
      .subscribe(
      (response)=>{this.UserDetails = response;},
      (error)=>{
        alert('Invalid Id Password'),
        console.log(error);}
      );
    }
  
}
