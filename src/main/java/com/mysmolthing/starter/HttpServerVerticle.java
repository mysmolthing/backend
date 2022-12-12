package com.mysmolthing.starter;

import com.mysmolthing.starter.dto.User;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import java.util.Arrays;
import java.util.List;

public class HttpServerVerticle extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    Router router = Router.router(vertx);
    router.get("/users").respond(this::getAllUsers);

    HttpServer server = vertx.createHttpServer();
    server.requestHandler(router).listen(8080);

  }

  private Future<List<User>> getAllUsers(RoutingContext context) {
    // Create a list of users
    List<User> users = Arrays.asList(
        new User("Alice", "alice@example.com"),
        new User("Bob", "bob@example.com"),
        new User("Charlie", "charlie@example.com")
    );
    return Future.succeededFuture(users);
  }
}
