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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The sort configuration of a line chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LineChartSortConfigurationProperty lineChartSortConfigurationProperty =
 * LineChartSortConfigurationProperty.builder()
 * .categoryItemsLimitConfiguration(ItemsLimitConfigurationProperty.builder()
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
 * .attributeAggregationFunction(AttributeAggregationFunctionProperty.builder()
 * .simpleAttributeAggregation("simpleAttributeAggregation")
 * .valueForMultipleValues("valueForMultipleValues")
 * .build())
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
 * .colorItemsLimitConfiguration(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
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
 * .attributeAggregationFunction(AttributeAggregationFunctionProperty.builder()
 * .simpleAttributeAggregation("simpleAttributeAggregation")
 * .valueForMultipleValues("valueForMultipleValues")
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-linechartsortconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisLineChartSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LineChartSortConfigurationProperty.Builder =
        CfnAnalysis.LineChartSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    private val _smallMultiplesSort: MutableList<Any> = mutableListOf()

    /**
     * @param categoryItemsLimitConfiguration The limit on the number of categories that are
     *   displayed in a line chart.
     */
    public fun categoryItemsLimitConfiguration(categoryItemsLimitConfiguration: IResolvable) {
        cdkBuilder.categoryItemsLimitConfiguration(categoryItemsLimitConfiguration)
    }

    /**
     * @param categoryItemsLimitConfiguration The limit on the number of categories that are
     *   displayed in a line chart.
     */
    public fun categoryItemsLimitConfiguration(
        categoryItemsLimitConfiguration: CfnAnalysis.ItemsLimitConfigurationProperty
    ) {
        cdkBuilder.categoryItemsLimitConfiguration(categoryItemsLimitConfiguration)
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
     * @param colorItemsLimitConfiguration The limit on the number of lines that are displayed in a
     *   line chart.
     */
    public fun colorItemsLimitConfiguration(colorItemsLimitConfiguration: IResolvable) {
        cdkBuilder.colorItemsLimitConfiguration(colorItemsLimitConfiguration)
    }

    /**
     * @param colorItemsLimitConfiguration The limit on the number of lines that are displayed in a
     *   line chart.
     */
    public fun colorItemsLimitConfiguration(
        colorItemsLimitConfiguration: CfnAnalysis.ItemsLimitConfigurationProperty
    ) {
        cdkBuilder.colorItemsLimitConfiguration(colorItemsLimitConfiguration)
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
        smallMultiplesLimitConfiguration: CfnAnalysis.ItemsLimitConfigurationProperty
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

    public fun build(): CfnAnalysis.LineChartSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        if (_smallMultiplesSort.isNotEmpty()) cdkBuilder.smallMultiplesSort(_smallMultiplesSort)
        return cdkBuilder.build()
    }
}
