package com.sourabh.repository;

import org.springframework.data.repository.CrudRepository;
import com.sourabh.model.Books;

//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer> {
}