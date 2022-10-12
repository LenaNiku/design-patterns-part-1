package ru.netology;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test ru.netology.Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! ru.netology.Button says - 'Hello World!'");
    }
}