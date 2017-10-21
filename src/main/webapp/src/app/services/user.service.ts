import {User} from "../models/user.model";
import {IUser} from "../models/user.interface";
import {DoCheck, Injectable, OnChanges, SimpleChanges} from "@angular/core";
import {Observable} from "rxjs/Observable";
import {Response} from '@angular/http';

@Injectable()
export class UserService {

  private afterLogin: boolean = false;
  private _user: User;

  get user(): User {
    return this._user;
  }

  public fetchDataFromServer(fromServer: Observable<Response>) {
    let result: User;
    fromServer.subscribe(next => {
      result = <User>next.json();
      this._user = result;
      this.checkUserChangesAndCloseLoginForm();
    });
  }

  checkUserChangesAndCloseLoginForm(): void {
    if (this.afterLogin == false) {
      if (this._user) {
        console.log("user.id=" + this._user.id + ", user.name=" + this._user.name)
        //CLOSE LOGIN COMPONENT, OPEN ANOTHER
        this.afterLogin = true;
      }
    }
  }

}
