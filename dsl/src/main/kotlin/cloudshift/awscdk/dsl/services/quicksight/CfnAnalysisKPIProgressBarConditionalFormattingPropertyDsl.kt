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
public class CfnAnalysisKPIProgressBarConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnAnalysis.KPIProgressBarConditionalFormattingProperty.Builder =
        CfnAnalysis.KPIProgressBarConditionalFormattingProperty.builder()

    public fun foregroundColor(foregroundColor: IResolvable) {
        cdkBuilder.foregroundColor(foregroundColor)
    }

    public fun foregroundColor(foregroundColor: CfnAnalysis.ConditionalFormattingColorProperty) {
        cdkBuilder.foregroundColor(foregroundColor)
    }

    public fun build(): CfnAnalysis.KPIProgressBarConditionalFormattingProperty = cdkBuilder.build()
}
