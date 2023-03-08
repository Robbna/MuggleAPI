import { PotionsEndpoint }    from './model/endpoints/PotionsEndpoint';
import { SpellsEndpoint }     from './model/endpoints/SpellsEndpoint';
import { CharactersEndpoint } from './model/endpoints/CharactersEndpoint';
import { BooksEndpoint }      from './model/endpoints/BooksEndpoint';
import express  from "express";
import dotenv   from "dotenv";
dotenv.config();

const app = express();

app.use("/api", (_req, res, next) => {
  res.setHeader("Access-Control-Allow-Origin", "*");
  next();
});

new CharactersEndpoint(app, "/api/characters").initialize();
new SpellsEndpoint(app, "/api/spells").initialize();
new PotionsEndpoint(app, "/api/potions").initialize();
new BooksEndpoint(app, "/api/books").initialize();

app.listen(process.env.PORT || 3000, () => {
  console.log(`Server running!`);
});
