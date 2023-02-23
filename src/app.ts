import { CharacterEndpoint } from './model/CharacterEndpoint';
import express from "express";
import dotenv from "dotenv";
dotenv.config();

const app = express();

new CharacterEndpoint(app, "/api/characters").initialize();

app.listen(process.env.PORT || 3000, () => {
  console.log(`Server running!`);
});
