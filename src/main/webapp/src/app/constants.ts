export class Constants {
  public static get HOME_URL(): string { return "http://localhost:8080"; };
  public static get LOGIN_URL(): string { return "/doLogin"; };
  public static get LOGOUT_URL(): string { return "/doLogout"; };
  public static get ROOM_LIST_URL(): string { return "/roomList"; };
  public static get ROOM_CREATE_URL(): string { return "/createRoom"; };
  public static get ROOM_DISBAND_URL(): string { return "/disband/"; };
  public static get USER_ROOM_EXIT_URL(): string { return "/exit/"; };
  public static get WS_ROOMLIST_URL(): string { return "/app/ws-roomlist"; };
}
