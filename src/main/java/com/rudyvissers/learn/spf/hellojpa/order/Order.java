package com.rudyvissers.learn.spf.hellojpa.order;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_t")
public class Order {

    @Column(nullable = false)
    private final String number;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Order(String number) {
        this.number = number;
    }

    public Order() {
        this(null);
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(number, order.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
