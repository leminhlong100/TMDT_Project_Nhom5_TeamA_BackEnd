package site.haloshop.backendtmdt.service;

import org.springframework.stereotype.Service;
import site.haloshop.backendtmdt.dto.CategoryDto;

import java.util.List;
@Service

public interface CategoryService {
    public List<CategoryDto> getAllCategory();
}
