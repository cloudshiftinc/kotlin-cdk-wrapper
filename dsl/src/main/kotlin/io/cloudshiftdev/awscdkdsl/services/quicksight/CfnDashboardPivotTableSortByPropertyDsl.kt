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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The sort by field for the field sort options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableSortByProperty pivotTableSortByProperty = PivotTableSortByProperty.builder()
 * .column(ColumnSortProperty.builder()
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
 * .dataPath(DataPathSortProperty.builder()
 * .direction("direction")
 * .sortPaths(List.of(DataPathValueProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build()))
 * .build())
 * .field(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablesortby.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableSortByPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableSortByProperty.Builder =
        CfnDashboard.PivotTableSortByProperty.builder()

    /** @param column The column sort (field id, direction) for the pivot table sort by options. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The column sort (field id, direction) for the pivot table sort by options. */
    public fun column(column: CfnDashboard.ColumnSortProperty) {
        cdkBuilder.column(column)
    }

    /**
     * @param dataPath The data path sort (data path value, direction) for the pivot table sort by
     *   options.
     */
    public fun dataPath(dataPath: IResolvable) {
        cdkBuilder.dataPath(dataPath)
    }

    /**
     * @param dataPath The data path sort (data path value, direction) for the pivot table sort by
     *   options.
     */
    public fun dataPath(dataPath: CfnDashboard.DataPathSortProperty) {
        cdkBuilder.dataPath(dataPath)
    }

    /** @param field The field sort (field id, direction) for the pivot table sort by options. */
    public fun `field`(`field`: IResolvable) {
        cdkBuilder.`field`(`field`)
    }

    /** @param field The field sort (field id, direction) for the pivot table sort by options. */
    public fun `field`(`field`: CfnDashboard.FieldSortProperty) {
        cdkBuilder.`field`(`field`)
    }

    public fun build(): CfnDashboard.PivotTableSortByProperty = cdkBuilder.build()
}
