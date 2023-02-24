import { IEndpoint } from "../interface/IEndpoint";
import { Endpoint } from "../super/Endpoint";
import characterJson from "../../data/characters.json";
export class CharacterEndpoint extends Endpoint implements IEndpoint {
  initialize(): void {
    this.app.get(this.url, (req, res) => {
      res.json(characterJson);
    });
  }
}
