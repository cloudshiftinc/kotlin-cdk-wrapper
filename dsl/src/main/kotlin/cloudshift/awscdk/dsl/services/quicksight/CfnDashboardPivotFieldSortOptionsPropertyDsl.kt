@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * The field sort options for a pivot table sort configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotFieldSortOptionsProperty pivotFieldSortOptionsProperty =
 * PivotFieldSortOptionsProperty.builder()
 * .fieldId("fieldId")
 * .sortBy(PivotTableSortByProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivotfieldsortoptions.html)
 */
@CdkDslMarker
public class CfnDashboardPivotFieldSortOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotFieldSortOptionsProperty.Builder =
        CfnDashboard.PivotFieldSortOptionsProperty.builder()

    /**
     * @param fieldId The field ID for the field sort options.
     */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /**
     * @param sortBy The sort by field for the field sort options.
     */
    public fun sortBy(sortBy: IResolvable) {
        cdkBuilder.sortBy(sortBy)
    }

    /**
     * @param sortBy The sort by field for the field sort options.
     */
    public fun sortBy(sortBy: CfnDashboard.PivotTableSortByProperty) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun build(): CfnDashboard.PivotFieldSortOptionsProperty = cdkBuilder.build()
}
