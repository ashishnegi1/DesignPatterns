package StructuralPattern.FacadePattern;

public interface Car {

    // A class with complicated methods to manage states.
    // Imagine this is a library that is made for buying cars, which is a little complicated process(providing docs, getting registration, paying taxes).
    // So as a Car dealership, you create a facade for the clients and hide these messy processes from client and provide a simple method to just pay sum money to you.
    // and you will handle all the messy processes yourself, most of which are streamlined by you.

    void complicatedMethodToBuyCar();
}
