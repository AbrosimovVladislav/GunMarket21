package ru.vakoom.gunmarket.aggregator.model.filtration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = KeyPath.KEY_PATH_TABLE)
@Getter
@Setter
@Builder
public class KeyPath {

    public static final String KEY_PATH_TABLE = "keyPath";
    public static final String KEY_PATH_ID = "keyPathId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = KEY_PATH_ID, nullable = false)
    private Long keyPathId;

    @ApiModelProperty("source")
    private String source;

    @ApiModelProperty("targetEntity")
    private String targetEntity;

    @ApiModelProperty("targetParam")
    private String targetParam;

    @ApiModelProperty("value")
    private String value;

    @JsonIgnore
    @OneToMany(mappedBy = KEY_PATH_TABLE)
    @ApiModelProperty("filterItem")
    private List<FilterItem> filterItem;

}
