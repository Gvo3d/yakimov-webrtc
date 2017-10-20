import {IUser} from "./user.interface";

export class User implements IUser{
  private id: number;
  private name: string;

  get getId(): number {
    return this.id;
  }

  set setId(value: number) {
    this.id = value;
  }

  get getName(): string {
    return this.name;
  }

  set setName(value: string) {
    this.name = value;
  }

  public toString(): string {
    return 'User: { id=' + this.id + ', name=' + this.name + ' };'
  }
}
