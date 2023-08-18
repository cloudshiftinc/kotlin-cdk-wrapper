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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The total options for a pivot table visual.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-pivottabletotaloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisPivotTableTotalOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PivotTableTotalOptionsProperty.Builder =
        CfnAnalysis.PivotTableTotalOptionsProperty.builder()

    /** @param columnSubtotalOptions The column subtotal options. */
    public fun columnSubtotalOptions(columnSubtotalOptions: IResolvable) {
        cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
    }

    /** @param columnSubtotalOptions The column subtotal options. */
    public fun columnSubtotalOptions(columnSubtotalOptions: CfnAnalysis.SubtotalOptionsProperty) {
        cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
    }

    /** @param columnTotalOptions The column total options. */
    public fun columnTotalOptions(columnTotalOptions: IResolvable) {
        cdkBuilder.columnTotalOptions(columnTotalOptions)
    }

    /** @param columnTotalOptions The column total options. */
    public fun columnTotalOptions(columnTotalOptions: CfnAnalysis.PivotTotalOptionsProperty) {
        cdkBuilder.columnTotalOptions(columnTotalOptions)
    }

    /** @param rowSubtotalOptions The row subtotal options. */
    public fun rowSubtotalOptions(rowSubtotalOptions: IResolvable) {
        cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
    }

    /** @param rowSubtotalOptions The row subtotal options. */
    public fun rowSubtotalOptions(rowSubtotalOptions: CfnAnalysis.SubtotalOptionsProperty) {
        cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
    }

    /** @param rowTotalOptions The row total options. */
    public fun rowTotalOptions(rowTotalOptions: IResolvable) {
        cdkBuilder.rowTotalOptions(rowTotalOptions)
    }

    /** @param rowTotalOptions The row total options. */
    public fun rowTotalOptions(rowTotalOptions: CfnAnalysis.PivotTotalOptionsProperty) {
        cdkBuilder.rowTotalOptions(rowTotalOptions)
    }

    public fun build(): CfnAnalysis.PivotTableTotalOptionsProperty = cdkBuilder.build()
}
