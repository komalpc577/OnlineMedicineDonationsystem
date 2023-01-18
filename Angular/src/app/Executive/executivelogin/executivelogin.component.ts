import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from 'src/app/admin';
import { RegistrationService } from 'src/app/registration.service';

@Component({
  selector: 'app-executivelogin',
  templateUrl: './executivelogin.component.html',
  styleUrls: ['./executivelogin.component.css']
})
export class ExecutiveloginComponent {
  admin = new Admin();
  msg = '';
  constructor(private service: RegistrationService, private _router: Router) { }

  ngOnInit(): void {
  }

  loginexecutive() {
    this.service.loginexecutiveFromRemote(this.admin).subscribe(
      (data) => {
        console.log("response received");
        console.log(data);
        this._router.navigate(['/executivehome'])
      },

      _error => {
        console.log("exception occured");
        this.msg = "Bad creditials,Please enter valid username and password";
      }
    )
  }
}
