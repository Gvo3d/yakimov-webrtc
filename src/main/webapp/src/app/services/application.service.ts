import {Inject, Injectable} from "@angular/core";
import {RestTemplate} from "./rest.service";
import {DataHolder} from "./data.service";
import {WebsocketService} from "./websocket.service";
import {RoomlistService} from "./roomlist.service";
import {StompService} from '@stomp/ng2-stompjs';

@Injectable()
export class ApplicationService {
  constructor(private _rest: RestTemplate, private _user: DataHolder, private _stompService: StompService) {
  }

  get getRestTemplate(): RestTemplate {
    return this._rest;
  }

  get getDataHolder(): DataHolder {
    return this._user;
  }
  //
  // get getWebSocket(): WebsocketService {
  //   return this._socket;
  // }
  //
  // get roomlist(): AbstractStompService {
  //   return this._roomlist;
  // }


  get getStompService(): StompService {
    return this._stompService;
  }
}
