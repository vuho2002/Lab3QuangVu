package quangvu.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quangvu.example.demo.entity.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
