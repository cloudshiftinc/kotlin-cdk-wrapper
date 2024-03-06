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
 * The sort configuration of a KPI visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * KPISortConfigurationProperty kPISortConfigurationProperty =
 * KPISortConfigurationProperty.builder()
 * .trendGroupSort(List.of(FieldSortOptionsProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-kpisortconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisKPISortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.KPISortConfigurationProperty.Builder =
        CfnAnalysis.KPISortConfigurationProperty.builder()

    private val _trendGroupSort: MutableList<Any> = mutableListOf()

    /** @param trendGroupSort The sort configuration of the trend group fields. */
    public fun trendGroupSort(vararg trendGroupSort: Any) {
        _trendGroupSort.addAll(listOf(*trendGroupSort))
    }

    /** @param trendGroupSort The sort configuration of the trend group fields. */
    public fun trendGroupSort(trendGroupSort: Collection<Any>) {
        _trendGroupSort.addAll(trendGroupSort)
    }

    /** @param trendGroupSort The sort configuration of the trend group fields. */
    public fun trendGroupSort(trendGroupSort: IResolvable) {
        cdkBuilder.trendGroupSort(trendGroupSort)
    }

    public fun build(): CfnAnalysis.KPISortConfigurationProperty {
        if (_trendGroupSort.isNotEmpty()) cdkBuilder.trendGroupSort(_trendGroupSort)
        return cdkBuilder.build()
    }
}
