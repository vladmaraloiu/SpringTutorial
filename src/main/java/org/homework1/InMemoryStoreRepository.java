package org.homework1;

public class InMemoryStoreRepository implements MessageRepository {

    public void store(Message message) {
        System.out.println("In Memory Store Repository message: " + message + " message ID: " + message.getID().printID());
    }
}
