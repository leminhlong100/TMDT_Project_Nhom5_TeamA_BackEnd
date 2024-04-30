package site.haloshop.backendtmdt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import site.haloshop.backendtmdt.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT p FROM Product p WHERE p.subCategory.id = :subCategoryId AND p.id <> :idProduct")
    public List<Product> findRelatedProducts(@Param("idProduct") Long idProduct, @Param("subCategoryId") Long subCategoryId);
}
