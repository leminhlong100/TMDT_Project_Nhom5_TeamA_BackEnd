package site.haloshop.backendtmdt.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.haloshop.backendtmdt.entities.Category;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubCategoryDto {
    private Long id;
    private String nameSubCategorie;
    private Category category;
}
