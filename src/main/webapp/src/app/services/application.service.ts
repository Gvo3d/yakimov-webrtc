import {Inject, Injectable} from "@angular/core";
import {RestTemplate} from "./rest-template";
import {UserService} from "./user.service";

@Injectable()
export class ApplicationService {
  constructor(private _rest: RestTemplate, private _user: UserService) {
  }

  get getRestTemplate(): RestTemplate {
    return this._rest;
  }

  get getUserService(): UserService {
    return this._user;
  }
}
