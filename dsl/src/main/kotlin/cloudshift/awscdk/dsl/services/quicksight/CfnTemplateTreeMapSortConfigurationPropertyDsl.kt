@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The sort configuration of a tree map.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TreeMapSortConfigurationProperty treeMapSortConfigurationProperty =
 * TreeMapSortConfigurationProperty.builder()
 * .treeMapGroupItemsLimitConfiguration(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .treeMapSort(List.of(FieldSortOptionsProperty.builder()
 * .columnSort(ColumnSortProperty.builder()
 * .direction("direction")
 * .sortBy(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .aggregationFunction(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .build())
 * .fieldSort(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-treemapsortconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateTreeMapSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.TreeMapSortConfigurationProperty.Builder =
        CfnTemplate.TreeMapSortConfigurationProperty.builder()

    private val _treeMapSort: MutableList<Any> = mutableListOf()

    /**
     * @param treeMapGroupItemsLimitConfiguration The limit on the number of groups that are
     *   displayed.
     */
    public fun treeMapGroupItemsLimitConfiguration(
        treeMapGroupItemsLimitConfiguration: IResolvable
    ) {
        cdkBuilder.treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration)
    }

    /**
     * @param treeMapGroupItemsLimitConfiguration The limit on the number of groups that are
     *   displayed.
     */
    public fun treeMapGroupItemsLimitConfiguration(
        treeMapGroupItemsLimitConfiguration: CfnTemplate.ItemsLimitConfigurationProperty
    ) {
        cdkBuilder.treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration)
    }

    /** @param treeMapSort The sort configuration of group by fields. */
    public fun treeMapSort(vararg treeMapSort: Any) {
        _treeMapSort.addAll(listOf(*treeMapSort))
    }

    /** @param treeMapSort The sort configuration of group by fields. */
    public fun treeMapSort(treeMapSort: Collection<Any>) {
        _treeMapSort.addAll(treeMapSort)
    }

    /** @param treeMapSort The sort configuration of group by fields. */
    public fun treeMapSort(treeMapSort: IResolvable) {
        cdkBuilder.treeMapSort(treeMapSort)
    }

    public fun build(): CfnTemplate.TreeMapSortConfigurationProperty {
        if (_treeMapSort.isNotEmpty()) cdkBuilder.treeMapSort(_treeMapSort)
        return cdkBuilder.build()
    }
}
