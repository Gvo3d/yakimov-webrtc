export class AuthorEntry{
  private _roomId:number;
  private _authorName:string;

  constructor(roomId: number, authorName: string) {
    this._roomId = roomId;
    this._authorName = authorName;
  }

  get roomId(): number {
    return this._roomId;
  }

  get authorName(): string {
    return this._authorName;
  }
}
