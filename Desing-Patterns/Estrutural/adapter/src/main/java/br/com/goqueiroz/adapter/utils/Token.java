package br.com.goqueiroz.adapter.utils;

public class Token {

    private String authToken;

    public Token() {
        this.authToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkdvcXVlaXJveiIsImlhdCI6MTUxNjIzOTAyMn0.3OCPEaq8QMfOJI-wVFd_JU7RFd-wzJy2TpXOF1iQdKA";
    }


    public String getAuthToken(){
        return this.authToken;
    }
}