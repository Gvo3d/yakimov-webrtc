import {Inject, Injectable} from "@angular/core";
import {RestTemplate} from "./rest.service";
import {DataHolder} from "./data.service";
import {WebsocketService} from "./websocket.service";
import {RoomlistService} from "./roomlist.service";

@Injectable()
export class ApplicationService {
  constructor(private _rest: RestTemplate, private _user: DataHolder, private _socket:WebsocketService, private _roomlist:RoomlistService) {
  }

  get getRestTemplate(): RestTemplate {
    return this._rest;
  }

  get getDataHolder(): DataHolder {
    return this._user;
  }

  get getWebSocket(): WebsocketService {
    return this._socket;
  }

  get roomlist(): RoomlistService {
    return this._roomlist;
  }
}
