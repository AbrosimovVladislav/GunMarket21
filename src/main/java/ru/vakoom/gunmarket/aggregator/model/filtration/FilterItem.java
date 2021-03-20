package ru.vakoom.gunmarket.aggregator.model.filtration;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static ru.vakoom.gunmarket.aggregator.model.filtration.KeyPath.KEY_PATH_ID;

@Entity
@Table(name = FilterItem.FILTER_ITEM_TABLE)
@Getter
@Setter
@Builder
public class FilterItem {

    public static final String FILTER_ITEM_TABLE = "filterItem";
    public static final String FILTER_ITEM_ID = "filterItemId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = FILTER_ITEM_ID, nullable = false)
    private Long filterItemId;

    @ApiModelProperty("name")
    private String name;

    @ManyToOne
    @JoinColumn(name = KEY_PATH_ID, nullable = false)
    @ApiModelProperty("keyPath")
    private KeyPath keyPath;

    @ApiModelProperty("type")
    @Enumerated(EnumType.STRING)
    private FilterType type;

    @ApiModelProperty("menuItem")
    private String menuItem;

    @ApiModelProperty("rank")
    private int rank;

    /**
     * For different filter types :
     * range -> min and max
     * checkbox -> list of values
     */
    @Transient
    @ApiModelProperty("values")
    List<String> values;

    public enum FilterType {
        RANGE, CHECKBOX
    }

}
