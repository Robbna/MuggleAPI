import { IEndpoint } from "../interfaces/IEndpoint";
import { Endpoint } from "../supers/Endpoint";
import data from "../../data/spells.json";
export class SpellsEndpoint extends Endpoint implements IEndpoint {
  initialize(): void {
    this.app.get(this.url, (req, res) => {
      res.json(data);
    });
  }
}
