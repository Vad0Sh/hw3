package entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Animal {
    @Basic
    @Column(name = "age", nullable = true)
    private int age;
    @Basic
    @Column(name = "name", nullable = true, length = 15)
    private String name;
    @Basic
    @Column(name = "tail", nullable = true)
    private boolean tail;
    @Id
    private Long id;

    public boolean getTail() {
        return tail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTail() {
        return tail;
    }


    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, tail);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
