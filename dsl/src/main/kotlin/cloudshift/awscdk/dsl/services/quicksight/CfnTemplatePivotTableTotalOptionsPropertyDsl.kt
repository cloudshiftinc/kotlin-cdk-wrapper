@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableTotalOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableTotalOptionsProperty.Builder =
        CfnTemplate.PivotTableTotalOptionsProperty.builder()

    public fun columnSubtotalOptions(columnSubtotalOptions: IResolvable) {
        cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
    }

    public fun columnSubtotalOptions(columnSubtotalOptions: CfnTemplate.SubtotalOptionsProperty) {
        cdkBuilder.columnSubtotalOptions(columnSubtotalOptions)
    }

    public fun columnTotalOptions(columnTotalOptions: IResolvable) {
        cdkBuilder.columnTotalOptions(columnTotalOptions)
    }

    public fun columnTotalOptions(columnTotalOptions: CfnTemplate.PivotTotalOptionsProperty) {
        cdkBuilder.columnTotalOptions(columnTotalOptions)
    }

    public fun rowSubtotalOptions(rowSubtotalOptions: IResolvable) {
        cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
    }

    public fun rowSubtotalOptions(rowSubtotalOptions: CfnTemplate.SubtotalOptionsProperty) {
        cdkBuilder.rowSubtotalOptions(rowSubtotalOptions)
    }

    public fun rowTotalOptions(rowTotalOptions: IResolvable) {
        cdkBuilder.rowTotalOptions(rowTotalOptions)
    }

    public fun rowTotalOptions(rowTotalOptions: CfnTemplate.PivotTotalOptionsProperty) {
        cdkBuilder.rowTotalOptions(rowTotalOptions)
    }

    public fun build(): CfnTemplate.PivotTableTotalOptionsProperty = cdkBuilder.build()
}
