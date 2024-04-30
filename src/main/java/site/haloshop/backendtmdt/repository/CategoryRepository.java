package site.haloshop.backendtmdt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.haloshop.backendtmdt.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
