import { IEndpoint } from "../interfaces/IEndpoint";
import { Endpoint } from "../supers/Endpoint";
import data from "../../data/potions.json";
export class PotionsEndpoint extends Endpoint implements IEndpoint {
  initialize(): void {
    this.app.get(this.url, (req, res) => {
      res.json(data);
    });
  }
}
