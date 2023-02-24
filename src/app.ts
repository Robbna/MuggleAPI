import { PotionsEndpoint } from './model/endpoint/PotionsEndpoint';
import { SpellsEndpoint } from './model/endpoint/SpellsEndpoint';
import { CharacterEndpoint } from './model/endpoint/CharacterEndpoint';
import express from "express";
import dotenv from "dotenv";
import { BooksEndpoint } from './model/endpoint/BooksEndpoint';
dotenv.config();

const app = express();

new CharacterEndpoint(app, "/api/characters").initialize();
new SpellsEndpoint(app, "/api/spells").initialize();
new PotionsEndpoint(app, "/api/potions").initialize();
new BooksEndpoint(app, "/api/books").initialize();

app.listen(process.env.PORT || 3000, () => {
  console.log(`Server running!`);
});
