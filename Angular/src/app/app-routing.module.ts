import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddmedicineComponent } from './addmedicine/addmedicine.component';
import { Admin } from './admin';
import { AdmiAddComponent } from './Admin/admi-add/admi-add.component';
import { AdminHomeComponent } from './Admin/admin-home/admin-home.component';
import { AdminViewComponent } from './Admin/admin-view/admin-view.component';
import { AdminComponent } from './Admin/adminlogin/adminlogin.component';
import { ExecutiveloginComponent } from './Executive/executivelogin/executivelogin.component';
import { ExecutivehomeComponent } from './executivehome/executivehome.component';
import { NgologinComponent } from './NGO/ngologin/ngologin.component';
import { NgohomeComponent } from './ngohome/ngohome.component';
import { NgoregisterComponent } from './ngoregister/ngoregister.component';
import { RegistersComponent } from './registers/registers.component';

import { RoleSelectionComponent } from './role-selection/role-selection.component';
import { UserloginComponent } from './User/userlogin/userlogin.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { ViewmedicineComponent } from './viewmedicine/viewmedicine.component';
import { ViewuserComponent } from './viewuser/viewuser.component';


const routes: Routes = [
  {path:'',component:RoleSelectionComponent},
  {path: 'adminlogin', component: AdminComponent},
  {path:'adminhome',component:AdminHomeComponent},
  {path:'adminview',component:AdminViewComponent},
  {path:'adminadd',component:AdmiAddComponent},
  {path:'userlogin',component:UserloginComponent},
  {path:'ngologin',component:NgologinComponent},
  {path:'executivelogin',component:ExecutiveloginComponent},
  {path:'register',component:RegistersComponent},
  {path:'executivehome',component:ExecutivehomeComponent},
  {path:'viewuser',component:ViewuserComponent},
  {path:'userhome',component:UserhomeComponent},
  {path:'ngohome',component:NgohomeComponent},
  {path:'viewmedicine',component:ViewmedicineComponent},
  {path:'ngoregister',component:NgoregisterComponent},
  {path:'addmedicine',component:AddmedicineComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
