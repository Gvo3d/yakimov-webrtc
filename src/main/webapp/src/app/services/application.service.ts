import {Inject, Injectable} from "@angular/core";
import {RestTemplate} from "./rest-template";
import {DataHolder} from "./data.holder";

@Injectable()
export class ApplicationService {
  constructor(private _rest: RestTemplate, private _user: DataHolder) {
  }

  get getRestTemplate(): RestTemplate {
    return this._rest;
  }

  get getDataHolder(): DataHolder {
    return this._user;
  }
}
