package com.example.demo.data.repositories;

import com.example.demo.data.models.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,Long> {
}
