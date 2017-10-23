import {Component, OnInit} from "@angular/core";
import {ApplicationService} from "../../services/application.service";
import {Constants} from "../../constants";
import {Room} from "../../models/room.model";
import {AuthorEntry} from "../../models/author_list.model";
import {User} from "../../models/user.model";

@Component({
  templateUrl: './roomlist.component.html'
})

export class RoomlistComponent implements OnInit {
  private rooms: Room[];

  constructor(private applicationService: ApplicationService) {
  }

  ngOnInit(): void {
    let roomList: Room[];
    this.applicationService.getRestTemplate.doGet(Constants.ROOM_LIST_URL).subscribe(x => {
      console.log(x.json());
      roomList = x.json();
      roomList.forEach(x=>x.author=this.getAuthor(x));
      this.rooms = roomList;
    });
  }

  private getAuthor(room:Room):User {
    for (var i = 0, len = room.users.length; i < len; i++){
      if (room.users[i].getId===room.authorId){
        return room.users[i];
      }
    }
    return null;
  }

}
