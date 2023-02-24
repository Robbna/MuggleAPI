import { IEndpoint } from "../interface/IEndpoint";
import { Endpoint } from "../super/Endpoint";
import data from "../../data/spells.json";
export class SpellsEndpoint extends Endpoint implements IEndpoint {
  initialize(): void {
    this.app.get(this.url, (req, res) => {
      res.json(data);
    });
  }
}
