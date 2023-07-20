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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardPivotTotalOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTotalOptionsProperty.Builder =
        CfnDashboard.PivotTotalOptionsProperty.builder()

    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun metricHeaderCellStyle(metricHeaderCellStyle: IResolvable) {
        cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
    }

    public fun metricHeaderCellStyle(metricHeaderCellStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.metricHeaderCellStyle(metricHeaderCellStyle)
    }

    public fun placement(placement: String) {
        cdkBuilder.placement(placement)
    }

    public fun scrollStatus(scrollStatus: String) {
        cdkBuilder.scrollStatus(scrollStatus)
    }

    public fun totalCellStyle(totalCellStyle: IResolvable) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    public fun totalCellStyle(totalCellStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.totalCellStyle(totalCellStyle)
    }

    public fun totalsVisibility(totalsVisibility: String) {
        cdkBuilder.totalsVisibility(totalsVisibility)
    }

    public fun valueCellStyle(valueCellStyle: IResolvable) {
        cdkBuilder.valueCellStyle(valueCellStyle)
    }

    public fun valueCellStyle(valueCellStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.valueCellStyle(valueCellStyle)
    }

    public fun build(): CfnDashboard.PivotTotalOptionsProperty = cdkBuilder.build()
}
