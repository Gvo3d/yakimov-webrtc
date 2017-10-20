import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent} from './components/main/app.component';
import {RestTemplate} from "./services/rest-template";
import {LoginComponent} from "./components/login/login.component";
import {FormsModule} from "@angular/forms";
import {UserService} from "./services/user.service";
import {ApplicationService} from "./services/application.service";
import {HttpModule} from "@angular/http";

@NgModule({
  imports: [BrowserModule, FormsModule, HttpModule],
  declarations: [AppComponent, LoginComponent],
  providers: [RestTemplate, UserService, ApplicationService],
  bootstrap: [LoginComponent]
})

export class AppModule {
}
