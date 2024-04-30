package site.haloshop.backendtmdt.mapper;

import site.haloshop.backendtmdt.dto.CategoryDto;
import site.haloshop.backendtmdt.entities.Category;

public class CategoryMapper {
    public static CategoryDto mapToDto(Category category) {
        return new CategoryDto(category.getId(),
                category.getNameCategorie(),
                category.getSubCategories());
    }
    public static Category mapToCategory(CategoryDto categoryDto){
        return new Category(categoryDto.getId(),
                categoryDto.getNameCategorie(),
                categoryDto.getSubCategory());
    }
}
