import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent} from '../../../../../temp/app.component';
import {RestTemplate} from "./services/rest-template";
import {LoginComponent} from "./components/login/login.component";
import {FormsModule} from "@angular/forms";
import {UserService} from "./services/user.service";
import {ApplicationService} from "./services/application.service";
import {HttpModule} from "@angular/http";
import {RouterModule, Routes} from '@angular/router';
import {RoomComponent} from "./components/room/room.component";
import {RoomlistComponent} from "./components/roomlist/roomlist.component";
import {PageNotFoundComponent} from "./components/pagenotfound/notfound.component";

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
  imports: [RouterModule.forRoot(
    appRoutes,
    {enableTracing: true} // <-- debugging purposes only
  ), BrowserModule, FormsModule, HttpModule],
  declarations: [AppComponent, LoginComponent],
  providers: [RestTemplate, UserService, ApplicationService],
  bootstrap: [LoginComponent]
})

export class AppModule {
}
