import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './Admin/adminlogin/adminlogin.component';
import { AdminViewComponent } from './Admin/admin-view/admin-view.component';
import { AdmiAddComponent } from './Admin/admi-add/admi-add.component';
import { AdminHomeComponent } from './Admin/admin-home/admin-home.component';
import { FormGroup, FormsModule,ReactiveFormsModule } from '@angular/forms';
import { RoleSelectionComponent } from './role-selection/role-selection.component';
import { CommonModule } from '@angular/common';
import { UserloginComponent } from './User/userlogin/userlogin.component';
import { NgologinComponent } from './NGO/ngologin/ngologin.component';
import{ HttpClientModule} from '@angular/common/http'
import { ExecutiveloginComponent } from './Executive/executivelogin/executivelogin.component';
import { ExecutivehomeComponent } from './executivehome/executivehome.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { RegistersComponent } from './registers/registers.component';
import { ViewuserComponent } from './viewuser/viewuser.component';
import { NgohomeComponent } from './ngohome/ngohome.component';
import { ViewmedicineComponent } from './viewmedicine/viewmedicine.component';
import { NgoregisterComponent } from './ngoregister/ngoregister.component';
import { AddmedicineComponent } from './addmedicine/addmedicine.component';
import { ReportComponent } from './report/report.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AdminViewComponent,
    AdmiAddComponent,
    AdminHomeComponent,
    RoleSelectionComponent,
    UserloginComponent,
    NgologinComponent,
    ExecutiveloginComponent,
    ExecutivehomeComponent,
    UserhomeComponent,
    RegistersComponent,
    ViewuserComponent,
    NgohomeComponent,
    ViewmedicineComponent,
    NgoregisterComponent,
    AddmedicineComponent,
    ReportComponent,
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
