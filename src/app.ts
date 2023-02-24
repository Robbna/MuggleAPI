import { PotionsEndpoint } from './model/endpoint/PotionsEndpoint';
import { SpellsEndpoint } from './model/endpoint/SpellsEndpoint';
import { CharactersEndpoint } from './model/endpoint/CharactersEndpoint';
import express from "express";
import dotenv from "dotenv";
import { BooksEndpoint } from './model/endpoint/BooksEndpoint';
dotenv.config();

const app = express();

new CharactersEndpoint(app, "/api/characters").initialize();
new SpellsEndpoint(app, "/api/spells").initialize();
new PotionsEndpoint(app, "/api/potions").initialize();
new BooksEndpoint(app, "/api/books").initialize();

app.listen(process.env.PORT || 3000, () => {
  console.log(`Server running!`);
});
