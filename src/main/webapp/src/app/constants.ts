import {StompConfig} from '@stomp/ng2-stompjs';

export class Constants {
  public static get HOME_URL(): string { return "http://localhost:8080"; };
  public static get LOGIN_URL(): string { return "/doLogin"; };
  public static get LOGOUT_URL(): string { return "/doLogout"; };
  public static get ROOM_LIST_URL(): string { return "/roomList"; };
  public static get ROOM_CREATE_URL(): string { return "/createRoom"; };
  public static get ROOM_DISBAND_URL(): string { return "/disband/"; };
  public static get USER_ROOM_EXIT_URL(): string { return "/exit/"; };
  public static get WS_ROOMLIST_URL(): string { return "/app/ws-roomlist"; };

  public static stompConfig: StompConfig = {
    // Which server?
    url: 'ws://127.0.0.1:15674/ws',

    // Headers
    // Typical keys: login, passcode, host
    headers: {
      login: 'guest',
      passcode: 'guest'
    },

    // How often to heartbeat?
    // Interval in milliseconds, set to 0 to disable
    heartbeat_in: 0, // Typical value 0 - disabled
    heartbeat_out: 20000, // Typical value 20000 - every 20 seconds
    // Wait in milliseconds before attempting auto reconnect
    // Set to 0 to disable
    // Typical value 5000 (5 seconds)
    reconnect_delay: 5000,

    // Will log diagnostics on console
    debug: true
  };


  // public get stompConfig(): StompConfig {
  //   return this._stompConfig;
  // }
}
