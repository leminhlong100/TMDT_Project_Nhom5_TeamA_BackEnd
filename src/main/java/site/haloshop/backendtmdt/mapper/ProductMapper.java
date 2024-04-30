package site.haloshop.backendtmdt.mapper;

import site.haloshop.backendtmdt.dto.ProductDto;
import site.haloshop.backendtmdt.entities.Product;

public class ProductMapper {
    public static ProductDto mapToDto(Product product){
        return new ProductDto(product.getId(),
                product.getNameProduct(),
                product.getDescription(),
                product.getSupplier(),
                product.getProducer(),
                product.getCategory(),
                product.getSubCategory(),
                product.getIsActive(),
                product.getIsDelete(),
                product.getStatus(),
                product.getProductPrice(),
                product.getImageProducts(),
                product.getSizeColorProducts(),
                product.getRates(),
                product.getImportCouponDetails(),
                product.getOrderDetails());
    }
    public static Product mapToProduct(ProductDto productDto){
        return new Product(productDto.getId(),
                productDto.getNameProduct(),
                productDto.getDescription(),
                productDto.getSupplier(),
                productDto.getProducer(),
                productDto.getCategory(),
                productDto.getSubCategory(),
                productDto.getIsActive(),
                productDto.getIsDelete(),
                productDto.getStatus(),
                productDto.getProductPrice(),
                productDto.getImageProducts(),
                productDto.getSizeColorProducts(),
                productDto.getRates(),
                productDto.getImportCouponDetails(),
                productDto.getOrderDetails());
    }
}
