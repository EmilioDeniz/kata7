package server;

import java.util.ArrayList;
import static spark.Spark.*;
import static spark.ExceptionMapper.getInstance;


public class Main{

    public static void main(String[] args) {
        Server server = new Server();

        get("/flights/get/all", (req, res) -> {
            return server.getAll();
        });

        get("/flights/get/day/:day", (req, res) -> {
            return server.getDay(req.params(":day"));
        });

        get("/flights/distance/bigger/:distance", (req, res) -> {
            return "distancia de vuelo " + req.params("distance");
        });

        get("/flights/distance/lower/:distance", (req, res) -> {
            return server.getLowerDistance(req.params(":distance"));
        });

        get("/flights/get/cancelled", (req, res) -> {
            return server.getCancelled();
        });

        get("/flights/get/diverted", (req, res) -> {
            return server.getDiverted();
        });
    }

    public static void stop() {
        stop();
    }
}