import {Component} from '@angular/core';
import {ApplicationService} from "../../services/application.service";
import {Constants} from "../../constants";
import {Room} from "../../models/room.model";

@Component({
  selector: 'main',
  templateUrl: './main.component.html'
})
export class MainComponent {
  constructor(private applicationService: ApplicationService) {
  }

  public onClick() {
    this.applicationService.getDataHolder.logout(this.applicationService.getRestTemplate.doPost(Constants.LOGOUT_URL, this.applicationService.getDataHolder.user));
  }

  public createRoom() {
    let room:Room = new Room;
    room.authorId = this.applicationService.getDataHolder.user.getId;
    this.applicationService.getDataHolder.signUpToARoom(this.applicationService.getRestTemplate.doPost(Constants.ROOM_CREATE_URL, room));
  }

}
