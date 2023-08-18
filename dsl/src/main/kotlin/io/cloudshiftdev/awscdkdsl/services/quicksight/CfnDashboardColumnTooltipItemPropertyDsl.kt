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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The tooltip item for the columns that are not part of a field well.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnTooltipItemProperty columnTooltipItemProperty = ColumnTooltipItemProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .aggregation(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .label("label")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-columntooltipitem.html)
 */
@CdkDslMarker
public class CfnDashboardColumnTooltipItemPropertyDsl {
    private val cdkBuilder: CfnDashboard.ColumnTooltipItemProperty.Builder =
        CfnDashboard.ColumnTooltipItemProperty.builder()

    /** @param aggregation The aggregation function of the column tooltip item. */
    public fun aggregation(aggregation: IResolvable) {
        cdkBuilder.aggregation(aggregation)
    }

    /** @param aggregation The aggregation function of the column tooltip item. */
    public fun aggregation(aggregation: CfnDashboard.AggregationFunctionProperty) {
        cdkBuilder.aggregation(aggregation)
    }

    /** @param column The target column of the tooltip item. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The target column of the tooltip item. */
    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    /** @param label The label of the tooltip item. */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /** @param visibility The visibility of the tooltip item. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.ColumnTooltipItemProperty = cdkBuilder.build()
}
