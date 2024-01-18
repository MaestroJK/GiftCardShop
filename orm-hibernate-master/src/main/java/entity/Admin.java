package entity;

import jakarta.persistence.*;

import java.util.List;

public class Admin {
    @Id
    private String adminName;

    private String password;

    private String role;

    @OneToMany(mappedBy = "admin")
    private List<Gebruiker> gebruikerList;

    @OneToMany(mappedBy = "admin")
    private List<GiftCard> giftCards;

    // Constructors, getters, setters, and other methods


    // Additional method to add users
    public void addUser(Gebruiker user) {
        Gebruiker.add(gebruikerList);
        user.setAdmin(this);
    }

}