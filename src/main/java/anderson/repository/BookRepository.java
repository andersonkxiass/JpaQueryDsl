package anderson.repository;

import anderson.domain.Book;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("bookRepository")
public interface BookRepository extends CrudRepository<Book, Integer>, QueryDslPredicateExecutor<Book> {
}
