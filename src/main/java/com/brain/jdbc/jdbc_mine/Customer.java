package com.brain.jdbc.jdbc_mine;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
public class Customer {
    @NonNull
    private long id;
    @NonNull
    private String surname;
    @NonNull
    private String firstName;
    @NonNull
    private long phone;
    @NonNull
    private String email;
    @NonNull
    private String city;
    @NonNull
    private long discount;
    private LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Customer(@NonNull long id, @NonNull String surname, @NonNull String firstName, @NonNull long phone, @NonNull String email, @NonNull String city, @NonNull long discount) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.discount = discount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }
}
