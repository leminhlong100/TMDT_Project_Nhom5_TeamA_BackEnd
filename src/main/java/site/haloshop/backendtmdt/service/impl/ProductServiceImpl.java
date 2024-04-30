package site.haloshop.backendtmdt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.haloshop.backendtmdt.dto.ProductDto;
import site.haloshop.backendtmdt.entities.Product;
import site.haloshop.backendtmdt.exception.AppException;
import site.haloshop.backendtmdt.exception.ErrorCode;
import site.haloshop.backendtmdt.mapper.ProductMapper;
import site.haloshop.backendtmdt.repository.ProductRepository;
import site.haloshop.backendtmdt.service.ProductService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductDto findProductById(Long id){
            return ProductMapper.mapToDto(productRepository.findById(id).orElseThrow(()->new AppException(ErrorCode.PRODUCT_NOT_EXIST)));
    }

    @Override
    public List<ProductDto> getAllProduct(){
          List<Product> productList = productRepository.findAll();
          return productList.stream().map((ProductMapper::mapToDto)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findRelatedProducts(Long id, Long subCateId){
           List<Product> productList = productRepository.findRelatedProducts(id,subCateId);
            return productList.stream().map((ProductMapper::mapToDto)).collect(Collectors.toList());
    }

}
