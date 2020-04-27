package com;

public class Message {
    private String message;

    public void getMessage() {
        System.out.println("Your message is: "+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}
