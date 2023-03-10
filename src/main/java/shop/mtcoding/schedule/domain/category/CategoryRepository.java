package shop.mtcoding.schedule.domain.category;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("select c from Category c where c.name = :name")
    Optional<Category> findByName(@Param("name") String name);
}
