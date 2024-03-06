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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The type of the data path value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataPathTypeProperty dataPathTypeProperty = DataPathTypeProperty.builder()
 * .pivotTableDataPathType("pivotTableDataPathType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-datapathtype.html)
 */
@CdkDslMarker
public class CfnTemplateDataPathTypePropertyDsl {
    private val cdkBuilder: CfnTemplate.DataPathTypeProperty.Builder =
        CfnTemplate.DataPathTypeProperty.builder()

    /**
     * @param pivotTableDataPathType The type of data path value utilized in a pivot table. Choose
     *   one of the following options:.
     * * `HIERARCHY_ROWS_LAYOUT_COLUMN` - The type of data path for the rows layout column, when
     *   `RowsLayout` is set to `HIERARCHY` .
     * * `MULTIPLE_ROW_METRICS_COLUMN` - The type of data path for the metric column when the row is
     *   set to Metric Placement.
     * * `EMPTY_COLUMN_HEADER` - The type of data path for the column with empty column header, when
     *   there is no field in `ColumnsFieldWell` and the row is set to Metric Placement.
     * * `COUNT_METRIC_COLUMN` - The type of data path for the column with `COUNT` as the metric,
     *   when there is no field in the `ValuesFieldWell` .
     */
    public fun pivotTableDataPathType(pivotTableDataPathType: String) {
        cdkBuilder.pivotTableDataPathType(pivotTableDataPathType)
    }

    public fun build(): CfnTemplate.DataPathTypeProperty = cdkBuilder.build()
}
