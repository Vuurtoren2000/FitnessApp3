package teun.demo.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.Name;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor(access =  AccessLevel.PUBLIC,force = true)
@Entity
@Table(name = "groupTable")
public class Category {

    @Id
    private String id;
    private String name;
    private List<SubCategory> listOfSubCategories = new ArrayList<>();



}
