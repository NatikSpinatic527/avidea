package com.example.avidea.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "images")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private long id;
    @Column(name= "name")
    private String name;
    @Column(name= "originalFileName")
    private String originalFileName;
    @Column(name= "size")
    private long size;
    @Column(name= "contentType")
    private String contentType;
    @Column(name= "isPreviewImage")
    private boolean isPreviewImage;
    private byte[] bytes;
    @ManyToOne(cascade = CascadeType.REFRESH,
    fetch = FetchType.EAGER)
    private Product product;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Image> images = new ArrayList<>();
    private Long previewImageId;
    private LocalDateTime dateOfCreated;
    @PrePersist
    private void init() {
        dateOfCreated = LocalDateTime.now();
    }
}
