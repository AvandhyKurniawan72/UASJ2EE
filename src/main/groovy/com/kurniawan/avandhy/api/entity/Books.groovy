package com.kurniawan.avandhy.api.entity
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.*

@Entity
@Table(name = "books")
class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id
    
    @NotNull
    @Column(nullable = false)
    String category_id

    @NotNull
    @Column(nullable = false)
    String name

    @NotNull
    @Column(nullable = false)
    String isbn

    @NotNull
    @Column(nullable = false)
    String pengarang

    @NotNull
    @Column(nullable = false)
    String penerbit
}