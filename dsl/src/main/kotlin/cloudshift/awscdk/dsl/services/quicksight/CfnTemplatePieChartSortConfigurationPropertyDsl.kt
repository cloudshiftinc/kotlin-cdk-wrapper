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
 * The sort configuration of a pie chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PieChartSortConfigurationProperty pieChartSortConfigurationProperty =
 * PieChartSortConfigurationProperty.builder()
 * .categoryItemsLimit(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .categorySort(List.of(FieldSortOptionsProperty.builder()
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
 * .smallMultiplesLimitConfiguration(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .smallMultiplesSort(List.of(FieldSortOptionsProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-piechartsortconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplatePieChartSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.PieChartSortConfigurationProperty.Builder =
        CfnTemplate.PieChartSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    private val _smallMultiplesSort: MutableList<Any> = mutableListOf()

    /**
     * @param categoryItemsLimit The limit on the number of categories that are displayed in a pie
     *   chart.
     */
    public fun categoryItemsLimit(categoryItemsLimit: IResolvable) {
        cdkBuilder.categoryItemsLimit(categoryItemsLimit)
    }

    /**
     * @param categoryItemsLimit The limit on the number of categories that are displayed in a pie
     *   chart.
     */
    public fun categoryItemsLimit(categoryItemsLimit: CfnTemplate.ItemsLimitConfigurationProperty) {
        cdkBuilder.categoryItemsLimit(categoryItemsLimit)
    }

    /** @param categorySort The sort configuration of the category fields. */
    public fun categorySort(vararg categorySort: Any) {
        _categorySort.addAll(listOf(*categorySort))
    }

    /** @param categorySort The sort configuration of the category fields. */
    public fun categorySort(categorySort: Collection<Any>) {
        _categorySort.addAll(categorySort)
    }

    /** @param categorySort The sort configuration of the category fields. */
    public fun categorySort(categorySort: IResolvable) {
        cdkBuilder.categorySort(categorySort)
    }

    /**
     * @param smallMultiplesLimitConfiguration The limit on the number of small multiples panels
     *   that are displayed.
     */
    public fun smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration: IResolvable) {
        cdkBuilder.smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration)
    }

    /**
     * @param smallMultiplesLimitConfiguration The limit on the number of small multiples panels
     *   that are displayed.
     */
    public fun smallMultiplesLimitConfiguration(
        smallMultiplesLimitConfiguration: CfnTemplate.ItemsLimitConfigurationProperty
    ) {
        cdkBuilder.smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration)
    }

    /** @param smallMultiplesSort The sort configuration of the small multiples field. */
    public fun smallMultiplesSort(vararg smallMultiplesSort: Any) {
        _smallMultiplesSort.addAll(listOf(*smallMultiplesSort))
    }

    /** @param smallMultiplesSort The sort configuration of the small multiples field. */
    public fun smallMultiplesSort(smallMultiplesSort: Collection<Any>) {
        _smallMultiplesSort.addAll(smallMultiplesSort)
    }

    /** @param smallMultiplesSort The sort configuration of the small multiples field. */
    public fun smallMultiplesSort(smallMultiplesSort: IResolvable) {
        cdkBuilder.smallMultiplesSort(smallMultiplesSort)
    }

    public fun build(): CfnTemplate.PieChartSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        if (_smallMultiplesSort.isNotEmpty()) cdkBuilder.smallMultiplesSort(_smallMultiplesSort)
        return cdkBuilder.build()
    }
}
