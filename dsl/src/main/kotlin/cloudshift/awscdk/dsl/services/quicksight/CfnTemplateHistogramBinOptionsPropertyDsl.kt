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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTemplateHistogramBinOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.HistogramBinOptionsProperty.Builder =
        CfnTemplate.HistogramBinOptionsProperty.builder()

    public fun binCount(binCount: IResolvable) {
        cdkBuilder.binCount(binCount)
    }

    public fun binCount(binCount: CfnTemplate.BinCountOptionsProperty) {
        cdkBuilder.binCount(binCount)
    }

    public fun binWidth(binWidth: IResolvable) {
        cdkBuilder.binWidth(binWidth)
    }

    public fun binWidth(binWidth: CfnTemplate.BinWidthOptionsProperty) {
        cdkBuilder.binWidth(binWidth)
    }

    public fun selectedBinType(selectedBinType: String) {
        cdkBuilder.selectedBinType(selectedBinType)
    }

    public fun startValue(startValue: Number) {
        cdkBuilder.startValue(startValue)
    }

    public fun build(): CfnTemplate.HistogramBinOptionsProperty = cdkBuilder.build()
}
