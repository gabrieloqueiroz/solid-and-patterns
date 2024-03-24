package br.com.goqueiroz.cor;

import br.com.goqueiroz.cor.middlewares.CheckPermissionMiddleware;
import br.com.goqueiroz.cor.middlewares.CheckUserMiddleware;
import br.com.goqueiroz.cor.middlewares.Middleware;
import br.com.goqueiroz.cor.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    private static final BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
    private static Server server;
    public static void init(){
        server = new Server();
        server.registerUser("master@goqueiroz.com.br", "aassddd");
        server.registerUser("user@goqueiroz.com.br", "1234");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
        boolean done;

        init();

        do{
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String password = reader.readLine();

            done = server.logIn(email, password);
        }while (!done);

    }
}