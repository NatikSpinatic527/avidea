package com.example.avidea.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "city")
    private String city;
    @Column(name = "author")
    private String author;

    private Long previewImageId;
    privateLocalDateTime dateOfCreated;
    public void addImageToProduct(Image image) {
        @PrePersist
                private void init() {
            dateOfCreated = LocalDateTime.now();
        }
        public void addImageToProduct(Image image) {
            image.setProduct(this);
            images.add(image);
        }
    }
}
