package com.iqmsoft.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.iqmsoft.entities.Book;

@RepositoryRestResource
public interface BookDao extends JpaRepository<Book, Integer> {
}
