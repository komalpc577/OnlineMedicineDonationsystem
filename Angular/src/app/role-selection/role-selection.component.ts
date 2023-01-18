import { Component ,OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { FormControl,FormGroup} from '@angular/forms';
@Component({
  selector: 'app-role-selection',
  templateUrl: './role-selection.component.html',
  styleUrls: ['./role-selection.component.css']
})
export class RoleSelectionComponent implements OnInit{
  selectionform:any=FormGroup;
  selectedoption:any;
constructor(public router:Router){}

ngOnInit(): void {
  this.selectionform=new FormGroup({
    role:new FormControl()
  })
}
gotologin(){
  console.log(this.selectionform.value.role);
 this.selectedoption=this.selectionform.value.role;
 if(this.selectedoption=='admin'){
 this.router.navigate(['/adminlogin']);
 }
 else if(this.selectedoption=='user'){
  this.router.navigate(['/userlogin']);
 }
 else if(this.selectedoption=='ngo')
 {
  this.router.navigate(['/ngologin']);
 }
 else if(this.selectedoption=='executive')
 {
  this.router.navigate(['/executivelogin']);
 }
  }
}
