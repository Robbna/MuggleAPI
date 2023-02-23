import type { Express } from "express";

export class Endpoint {
  protected app: Express;
  protected url: string;

  constructor(app: Express, url: string) {
    this.app = app;
    this.url = url;
  }
}
