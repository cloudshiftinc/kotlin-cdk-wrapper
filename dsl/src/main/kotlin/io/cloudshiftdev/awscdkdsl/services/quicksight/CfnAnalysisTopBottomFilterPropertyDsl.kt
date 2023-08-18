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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A `TopBottomFilter` filters values that are at the top or the bottom.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopBottomFilterProperty topBottomFilterProperty = TopBottomFilterProperty.builder()
 * .aggregationSortConfigurations(List.of(AggregationSortConfigurationProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sortDirection("sortDirection")
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
 * .build()))
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * // the properties below are optional
 * .limit(123)
 * .parameterName("parameterName")
 * .timeGranularity("timeGranularity")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-topbottomfilter.html)
 */
@CdkDslMarker
public class CfnAnalysisTopBottomFilterPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TopBottomFilterProperty.Builder =
        CfnAnalysis.TopBottomFilterProperty.builder()

    private val _aggregationSortConfigurations: MutableList<Any> = mutableListOf()

    /**
     * @param aggregationSortConfigurations The aggregation and sort configuration of the top bottom
     *   filter.
     */
    public fun aggregationSortConfigurations(vararg aggregationSortConfigurations: Any) {
        _aggregationSortConfigurations.addAll(listOf(*aggregationSortConfigurations))
    }

    /**
     * @param aggregationSortConfigurations The aggregation and sort configuration of the top bottom
     *   filter.
     */
    public fun aggregationSortConfigurations(aggregationSortConfigurations: Collection<Any>) {
        _aggregationSortConfigurations.addAll(aggregationSortConfigurations)
    }

    /**
     * @param aggregationSortConfigurations The aggregation and sort configuration of the top bottom
     *   filter.
     */
    public fun aggregationSortConfigurations(aggregationSortConfigurations: IResolvable) {
        cdkBuilder.aggregationSortConfigurations(aggregationSortConfigurations)
    }

    /** @param column The column that the filter is applied to. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The column that the filter is applied to. */
    public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    /**
     * @param filterId An identifier that uniquely identifies a filter within a dashboard, analysis,
     *   or template.
     */
    public fun filterId(filterId: String) {
        cdkBuilder.filterId(filterId)
    }

    /** @param limit The number of items to include in the top bottom filter results. */
    public fun limit(limit: Number) {
        cdkBuilder.limit(limit)
    }

    /** @param parameterName The parameter whose value should be used for the filter value. */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
     *   values.
     */
    public fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
    }

    public fun build(): CfnAnalysis.TopBottomFilterProperty {
        if (_aggregationSortConfigurations.isNotEmpty())
            cdkBuilder.aggregationSortConfigurations(_aggregationSortConfigurations)
        return cdkBuilder.build()
    }
}
