import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {RestTemplate} from "./services/rest.service";
import {LoginComponent} from "./components/login/login.component";
import {FormsModule} from "@angular/forms";
import {ApplicationService} from "./services/application.service";
import {HttpModule} from "@angular/http";
import {RoomComponent} from "./components/room/room.component";
import {RoomlistComponent} from "./components/roomlist/roomlist.component";
import {PageNotFoundComponent} from "./components/pagenotfound/notfound.component";
import {MainComponent} from "./components/main/main.component";
import {RoutingModule} from "./routing.module";
import {DataHolder} from "./services/data.service";
import {WebsocketService} from "./services/websocket.service";
import {RoomlistService} from "./services/roomlist.service";

@NgModule({
  imports: [RoutingModule, BrowserModule, FormsModule, HttpModule],
  declarations: [MainComponent, LoginComponent, RoomComponent, RoomlistComponent, PageNotFoundComponent],
  providers: [RestTemplate, DataHolder, WebsocketService, RoomlistService, ApplicationService],
  bootstrap: [MainComponent]
})

export class AppModule {
}
