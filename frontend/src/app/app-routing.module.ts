import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './Cart/add/add.component';
import { NewVIPComponent } from './newVIP/new-vip/new-vip.component';
import { NoVIPComponent } from './NoVIP/no-vip/no-vip.component';
import { ListarComponent } from './Product/listar/listar.component';
import { UserComponent } from './User/user/user.component';
import { HomeComponent } from './Home/home/home.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:"list", component:ListarComponent},
  {path:"add", component:AddComponent},
  {path:"listVIP", component:UserComponent},
  {path:"newUsersVIP", component:NewVIPComponent},
  {path:"NoVIP", component:NoVIPComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
