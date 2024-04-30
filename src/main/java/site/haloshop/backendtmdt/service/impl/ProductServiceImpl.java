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
    public ProductDto findProductById(String id){
        Long idProduct;
        try {
            idProduct = Long.parseLong(id);
            return ProductMapper.mapToDto(productRepository.findById(idProduct).orElseThrow(()->new AppException(ErrorCode.PRODUCT_NOT_EXIST)));
        } catch (NumberFormatException e) {
            throw new AppException(ErrorCode.INVALID_ID_FORMAT);
        }
    }

    @Override
    public List<ProductDto> getAllProduct(){
          List<Product> productList = productRepository.findAll();
          return productList.stream().map((ProductMapper::mapToDto)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findRelatedProducts(String id, String subCateId){
        Long productId,subCategoryId;
        List<Product> productList;
        try {
            productId = Long.parseLong(id);
            subCategoryId = Long.parseLong(subCateId);
            productList = productRepository.findRelatedProducts(productId,subCategoryId);
            return productList.stream().map((ProductMapper::mapToDto)).collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new AppException(ErrorCode.INVALID_ID_FORMAT);
        }

    }

}
