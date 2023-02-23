import express from "express";
import dotenv from "dotenv";
dotenv.config();

const app = express();

app.get("/api/test", (_req, res) => {
  res.json("Avada Kedavra!");
});

app.listen(process.env.PORT || 3000, () => {
  console.log(`Server running!`);
});
