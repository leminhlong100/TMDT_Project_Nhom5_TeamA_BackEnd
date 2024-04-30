package site.haloshop.backendtmdt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.haloshop.backendtmdt.entities.SubCategory;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryDto {
    private Long id;
    private String nameCategorie;
    private List<SubCategory> subCategory;
}
