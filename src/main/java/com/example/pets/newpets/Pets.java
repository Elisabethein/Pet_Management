package com.example.pets.newpets;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Pets implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pets_seq")
    @SequenceGenerator(name = "pets_seq", sequenceName = "pets_seq", allocationSize = 1)
    @Column(unique = true, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long code;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String fur;
    @Column(nullable = false)
    private String origin;

    public Pets(String name, Long code, String type, String fur, String origin) {
        this.name = name;
        this.code = code;
        this.type = type;
        this.fur = fur;
        this.origin = origin;
    }

    public Pets() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getType() { return type; }

    public void setType(String type) {
        this.type = type;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", type='" + type + '\'' +
                ", fur='" + fur + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
