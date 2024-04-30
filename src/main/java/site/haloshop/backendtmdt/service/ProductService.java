package site.haloshop.backendtmdt.service;

import org.springframework.stereotype.Service;
import site.haloshop.backendtmdt.dto.ProductDto;

import java.util.List;


@Service
public interface ProductService {
    public ProductDto findProductById(Long id)throws RuntimeException;
    public List<ProductDto> getAllProduct()throws RuntimeException;
    public List<ProductDto> findRelatedProducts(Long idProduct,Long subCategoryId)throws RuntimeException;

}

