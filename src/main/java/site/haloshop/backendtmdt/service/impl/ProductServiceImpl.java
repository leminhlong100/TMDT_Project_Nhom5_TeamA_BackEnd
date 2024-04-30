package site.haloshop.backendtmdt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.haloshop.backendtmdt.dto.CategoryDto;
import site.haloshop.backendtmdt.dto.ProductDto;
import site.haloshop.backendtmdt.entities.Product;
import site.haloshop.backendtmdt.exception.ResourceNotFoundException;
import site.haloshop.backendtmdt.mapper.ProductMapper;
import site.haloshop.backendtmdt.repository.ProductRepository;
import site.haloshop.backendtmdt.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductDto findProductById(Long id) {
        return ProductMapper.mapToDto(productRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Product is not exist with id "+id)));
    }

    @Override
    public List<ProductDto> getAllProduct() {
        List<Product> productList = productRepository.findAll();
        List<ProductDto> result = new ArrayList<>();
        for(Product product : productList){
            result.add(ProductMapper.mapToDto(product));
        }
        return result;
    }

    @Override
    public List<ProductDto> findRelatedProducts(Long idProduct, Long subCategoryId) {
        List<Product> productList = productRepository.findRelatedProducts(idProduct,subCategoryId);
        List<ProductDto> result = new ArrayList<>();
        for(Product product : productList){
            result.add(ProductMapper.mapToDto(product));
        }
        return result;
    }



}
