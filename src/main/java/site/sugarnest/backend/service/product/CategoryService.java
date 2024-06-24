package site.sugarnest.backend.service.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import site.sugarnest.backend.dto.dto.CategoryDto;
import site.sugarnest.backend.entities.CategoryEntity;
import site.sugarnest.backend.mapper.ICategoryMapper;
import site.sugarnest.backend.reponsitoties.ICategoryRepository;

import java.util.List;
import java.util.stream.Collectors;
@AllArgsConstructor
@Service
public class CategoryService {
    ICategoryRepository iCategoryRepository;
    ICategoryMapper iCategoryMapper;

    public List<CategoryDto> getAllCategory() {
        List<CategoryEntity> categoryEntityList = iCategoryRepository.findAll();
        return categoryEntityList.stream().map(iCategoryMapper::mapToCategoryDto).collect(Collectors.toList());
    }

    public CategoryDto getCategoryById(Long id) {
        return iCategoryMapper.mapToCategoryDto(iCategoryRepository.findById(id).orElse(null));
    }

    public CategoryDto createCategory(CategoryDto categoryDto) {
        CategoryEntity categoryEntity = iCategoryMapper.mapToCategory(categoryDto);
        return iCategoryMapper.mapToCategoryDto(iCategoryRepository.save(categoryEntity));
    }

    public CategoryDto updateCategory(CategoryDto categoryDto) {
        CategoryEntity categoryEntity = iCategoryMapper.mapToCategory(categoryDto);
        return iCategoryMapper.mapToCategoryDto(iCategoryRepository.save(categoryEntity));
    }

    public void deleteCategory(Long id) {
        iCategoryRepository.deleteById(id);
    }

    public boolean checkCategoryExistByName(String name) {
        return iCategoryRepository.existsByNameCategory(name);
    }

}
