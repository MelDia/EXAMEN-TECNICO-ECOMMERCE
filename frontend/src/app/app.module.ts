import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './Product/listar/listar.component';
import { AddComponent } from './Cart/add/add.component';
import { FormsModule } from '@angular/forms';
import { ServiceService } from '../app/Service/service.service';
import { HttpClientModule } from '@angular/common/http';
import { UserComponent } from './User/user/user.component';
import { NewVIPComponent } from './newVIP/new-vip/new-vip.component';
import { NoVIPComponent } from './NoVIP/no-vip/no-vip.component';
import { NavbarComponent } from './Commons/navbar/navbar.component';
import { FooterComponent } from './Commons/footer/footer.component';
import { HomeComponent } from './Home/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    AddComponent,
    UserComponent,
    NewVIPComponent,
    NoVIPComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
