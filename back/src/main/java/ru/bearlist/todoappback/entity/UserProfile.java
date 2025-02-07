package ru.bearlist.todoappback.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;
}


/**
 *
 *  Hibernate Best Practices для начинающих
 *  <a href="https://habr.com/ru/articles/679216/"></a>
 *
 *  Hibernate — о чем молчат туториалы
 *  <a href="https://habr.com/ru/articles/416851/"></a>
 *
 *  Taking control of identifiers with hibernate
 *  <a href="https://medium.com/@adikale123/taking-control-of-identifiers-with-hibernate-bf47799539de"></a>
 *
 *  what is the use of annotations @Id and @GeneratedValue(strategy = GenerationType.IDENTITY)?
 *  <a href="https://stackoverflow.com/questions/20603638/what-is-the-use-of-annotations-id-and-generatedvaluestrategy-generationtype"></a>
 *
 *  Путеводитель по ID для JPA сущностей. Часть 1: ID, генерируемые на сервере
 *  <a href="https://habr.com/ru/companies/haulmont/articles/653843/"></a>
 *
 *  Caching in Hibernate
 *  <a href="https://medium.com/@himani.prasad016/caching-in-hibernate-3ad4f479fcc0"></a>
 *
 *  Hibernate Cache
 *  <a href="https://beratyesbek.medium.com/hibernate-cache-c49e7407f6e3"></a>
 *
 *  When Hibernate caching can go wrong
 *  <a href="https://blog.lunatech.com/posts/2020-03-23-when-hibernate-caching-can-go-wrong"></a>
 */