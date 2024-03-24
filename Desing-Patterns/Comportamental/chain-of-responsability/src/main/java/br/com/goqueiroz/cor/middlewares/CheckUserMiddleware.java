package br.com.goqueiroz.cor.middlewares;

import br.com.goqueiroz.cor.server.Server;

public class CheckUserMiddleware extends Middleware{
    private Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)){
            System.out.println("Email ou senha invalido!");
            return false;
        }

        if (!server.isValidPassword(email, password)){
            System.out.println("Email ou senha invalido!");
            return false;
        }

        return checkNext(email, password);
    }
}
