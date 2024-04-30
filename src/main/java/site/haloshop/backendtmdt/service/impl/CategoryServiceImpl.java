package site.haloshop.backendtmdt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.haloshop.backendtmdt.dto.CategoryDto;
import site.haloshop.backendtmdt.entities.Category;
import site.haloshop.backendtmdt.mapper.CategoryMapper;
import site.haloshop.backendtmdt.repository.CategoryRepository;
import site.haloshop.backendtmdt.service.CategoryService;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<CategoryDto> getAllCategory() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map((CategoryMapper::mapToDto)).collect(Collectors.toList());
    }
}
