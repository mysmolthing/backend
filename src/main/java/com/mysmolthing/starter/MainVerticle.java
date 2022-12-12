package com.mysmolthing.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    vertx.deployVerticle("com.mysmolthing.starter.HttpServerVerticle",
        new DeploymentOptions().setInstances(2));
  }
}
