import { IEndpoint } from "../interfaces/IEndpoint";
import { Endpoint } from "../supers/Endpoint";
import data from "../../data/characters.json";
export class CharactersEndpoint extends Endpoint implements IEndpoint {
  initialize(): void {
    this.app.get(this.url, (req, res) => {
      res.json(data);
    });
  }
}
