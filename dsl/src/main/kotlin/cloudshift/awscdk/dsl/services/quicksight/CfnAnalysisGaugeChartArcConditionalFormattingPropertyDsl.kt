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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGaugeChartArcConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GaugeChartArcConditionalFormattingProperty.Builder =
        CfnAnalysis.GaugeChartArcConditionalFormattingProperty.builder()

    public fun foregroundColor(foregroundColor: IResolvable) {
        cdkBuilder.foregroundColor(foregroundColor)
    }

    public fun foregroundColor(foregroundColor: CfnAnalysis.ConditionalFormattingColorProperty) {
        cdkBuilder.foregroundColor(foregroundColor)
    }

    public fun build(): CfnAnalysis.GaugeChartArcConditionalFormattingProperty = cdkBuilder.build()
}
