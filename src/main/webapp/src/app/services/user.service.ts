import {User} from "../models/user.model";
import {IUser} from "../models/user.interface";
import {Injectable, OnChanges, SimpleChanges} from "@angular/core";
import {Observable} from "rxjs/Observable";
import {Response} from '@angular/http';

@Injectable()
export class UserService implements OnChanges{
  private afterLogin:boolean = false;
  private _user: User;

  get user(): User {
    return this._user;
  }

  public fetchDataFromServer(fromServer: Observable<Response>) {
    let result: User;
    fromServer.subscribe(next => {
      result = <User>next.json();
    });
    this._user = result;
  }

  ngOnChanges(changes: SimpleChanges): void {
    if (!this.afterLogin) {
      if (this._user) {
        //CLOSE LOGIN COMPONENT, OPEN ANOTHER
      }
    }

  }
}
