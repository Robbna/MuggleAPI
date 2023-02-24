import { IEndpoint } from "../interface/IEndpoint";
import { Endpoint } from "../super/Endpoint";
import data from "../../data/books.json";
export class BooksEndpoint extends Endpoint implements IEndpoint {
  initialize(): void {
    this.app.get(this.url, (req, res) => {
      res.json(data);
    });
  }
}
