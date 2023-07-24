@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The sort configuration of a `FilledMapVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilledMapSortConfigurationProperty filledMapSortConfigurationProperty =
 * FilledMapSortConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-filledmapsortconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisFilledMapSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilledMapSortConfigurationProperty.Builder =
        CfnAnalysis.FilledMapSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    /**
     * @param categorySort The sort configuration of the location fields.
     */
    public fun categorySort(vararg categorySort: Any) {
        _categorySort.addAll(listOf(*categorySort))
    }

    /**
     * @param categorySort The sort configuration of the location fields.
     */
    public fun categorySort(categorySort: Collection<Any>) {
        _categorySort.addAll(categorySort)
    }

    /**
     * @param categorySort The sort configuration of the location fields.
     */
    public fun categorySort(categorySort: IResolvable) {
        cdkBuilder.categorySort(categorySort)
    }

    public fun build(): CfnAnalysis.FilledMapSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        return cdkBuilder.build()
    }
}
