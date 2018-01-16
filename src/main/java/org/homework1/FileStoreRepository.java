package org.homework1;

public class FileStoreRepository implements MessageRepository {

    public void store(Message message) {
        System.out.println("File Store Repository message: " + message + " message ID: " + message.getID().printID());
    }
}
