package com.example.effectivejava.chapter01.item03.serialization;

import java.io.*;
import java.time.LocalDate;

public class SerializationExample {

    private void serialize(Book book) {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
            out.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Book deserialize() {
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))) {
            return (Book) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "이팩티브 자바 완벽 공략", "백기선",
                LocalDate.of(2022, 3, 21));
        book.setNumberOfSold(200);
        // static한 값은 인스턴스가 아닌, 클래스에 할당되는 값이기 때문에 직렬화되지 않음
        Book.name = "이승우";

        SerializationExample example = new SerializationExample();

        example.serialize(book);
        // static한 값은 인스턴스가 아닌, 클래스에 할당되는 값이기 때문에 직렬화되지 않음
        Book.name = "seungwoo";
        Book deserializedBook = example.deserialize();

        System.out.println(book);
        System.out.println(deserializedBook);
    }
}
