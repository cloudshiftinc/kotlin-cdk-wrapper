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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDashboardHistogramBinOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.HistogramBinOptionsProperty.Builder =
        CfnDashboard.HistogramBinOptionsProperty.builder()

    public fun binCount(binCount: IResolvable) {
        cdkBuilder.binCount(binCount)
    }

    public fun binCount(binCount: CfnDashboard.BinCountOptionsProperty) {
        cdkBuilder.binCount(binCount)
    }

    public fun binWidth(binWidth: IResolvable) {
        cdkBuilder.binWidth(binWidth)
    }

    public fun binWidth(binWidth: CfnDashboard.BinWidthOptionsProperty) {
        cdkBuilder.binWidth(binWidth)
    }

    public fun selectedBinType(selectedBinType: String) {
        cdkBuilder.selectedBinType(selectedBinType)
    }

    public fun startValue(startValue: Number) {
        cdkBuilder.startValue(startValue)
    }

    public fun build(): CfnDashboard.HistogramBinOptionsProperty = cdkBuilder.build()
}
