package io.github.tecarter94.simpleproxy;

import io.quarkus.logging.Log;
import io.vertx.ext.web.Router;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class ProxyEndpoint {

    void setup(@Observes Router router) {
        router.get().handler(routingContext -> {
            Log.info("GET");
        });
        router.connect().handler(routingContext -> {
            Log.info("CONNECT");
        });
    }
}
