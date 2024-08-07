package com.lms.book.management.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookDAO extends CrudRepository, PagingAndSortingRepository {
}
