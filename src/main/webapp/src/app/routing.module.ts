import {RouterModule, Routes} from "@angular/router";
import {LoginComponent} from "./components/login/login.component";
import {RoomComponent} from "./components/room/room.component";
import {RoomlistComponent} from "./components/roomlist/roomlist.component";
import {PageNotFoundComponent} from "./components/pagenotfound/notfound.component";
import {NgModule} from "@angular/core";

const appRoutes: Routes = [
  {
    path: 'login',
    component: LoginComponent,
    data: {title: 'Login'}
  },
  {
    path: 'room/:id',
    component: RoomComponent,
    data: {title: 'Room'}
  },
  {
    path: 'roomlist',
    component: RoomlistComponent,
    data: {title: 'RoomList'}
  },
  {
    path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  },
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(
      appRoutes,
      {
        enableTracing: true, // <-- debugging purposes only
      }
    )
  ],
  exports: [
    RouterModule
  ]
})
export class RoutingModule { }
