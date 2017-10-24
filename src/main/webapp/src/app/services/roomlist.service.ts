import {Injectable} from "@angular/core";
import {Subject} from "rxjs/Subject";
import {WebsocketService} from "./websocket.service";
import {Constants} from "../constants";
import {Room} from "../models/room.model";

export interface Message {
  rooms:Room[]
}

@Injectable()
export class RoomlistService {
  public messages: Subject<Message>;

  constructor(wsService: WebsocketService) {
    this.messages = <Subject<Message>>wsService
      .connect(Constants.WS_ROOMLIST_URL)
      .map((response: MessageEvent): Message => {
        let data = JSON.parse(response.data);
        console.log('roomlist service data parse!!!!');
        return {
          rooms: data.rooms,
        }
      });
  }
}
