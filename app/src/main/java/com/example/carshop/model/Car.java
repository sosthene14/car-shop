package com.example.carshop.model;


import java.io.Serializable;

public class Car implements Serializable {
    private final String marque;
    private final String type;
    private final String modele;
    private final int annee;
    private final String couleur;
    private final String description;
    private final String imageUrl;
    private final String imageInteriorUrl;
    private final String imageExteriorUrl;

    public Car(String marque, String type, String modele, int annee, String couleur, String description, String imageUrl, String imageInteriorUrl, String imageExteriorUrl) {
        this.marque = marque;
        this.type = type;
        this.modele = modele;
        this.annee = annee;
        this.couleur = couleur;
        this.description = description;
        this.imageUrl = imageUrl;
        this.imageInteriorUrl = imageInteriorUrl;
        this.imageExteriorUrl = imageExteriorUrl;
    }

    // Getters
    public String getMarque() { return marque; }
    public String getType() { return type; }
    public String getModele() { return modele; }
    public int getAnnee() { return annee; }
    public String getCouleur() { return couleur; }
    public String getDescription() { return description; }
    public String getImageUrl() { return imageUrl; }
    public String getImageInteriorUrl() { return imageInteriorUrl; }
    public String getImageExteriorUrl() { return imageExteriorUrl; }
}
