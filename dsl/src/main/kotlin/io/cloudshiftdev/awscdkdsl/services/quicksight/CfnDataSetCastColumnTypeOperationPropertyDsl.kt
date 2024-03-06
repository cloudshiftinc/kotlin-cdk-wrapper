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
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A transform operation that casts a column to a different type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CastColumnTypeOperationProperty castColumnTypeOperationProperty =
 * CastColumnTypeOperationProperty.builder()
 * .columnName("columnName")
 * .newColumnType("newColumnType")
 * // the properties below are optional
 * .format("format")
 * .subType("subType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-castcolumntypeoperation.html)
 */
@CdkDslMarker
public class CfnDataSetCastColumnTypeOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.CastColumnTypeOperationProperty.Builder =
        CfnDataSet.CastColumnTypeOperationProperty.builder()

    /** @param columnName Column name. */
    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    /**
     * @param format When casting a column from string to datetime type, you can supply a string in
     *   a format supported by Amazon QuickSight to denote the source data format.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /** @param newColumnType New column data type. */
    public fun newColumnType(newColumnType: String) {
        cdkBuilder.newColumnType(newColumnType)
    }

    /**
     * @param subType The sub data type of the new column. Sub types are only available for decimal
     *   columns that are part of a SPICE dataset.
     */
    public fun subType(subType: String) {
        cdkBuilder.subType(subType)
    }

    public fun build(): CfnDataSet.CastColumnTypeOperationProperty = cdkBuilder.build()
}
