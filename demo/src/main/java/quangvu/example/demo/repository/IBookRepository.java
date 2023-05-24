package quangvu.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quangvu.example.demo.entity.Book;
import org.springframework.stereotype.Repository;
@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {
}
