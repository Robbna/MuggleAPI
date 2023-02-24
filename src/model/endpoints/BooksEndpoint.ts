import { IEndpoint } from "../interfaces/IEndpoint";
import { Endpoint } from "../supers/Endpoint";
import data from "../../data/books.json";
export class BooksEndpoint extends Endpoint implements IEndpoint {
  initialize(): void {
    this.app.get(this.url, (req, res) => {
      res.json(data);
    });
  }
}
