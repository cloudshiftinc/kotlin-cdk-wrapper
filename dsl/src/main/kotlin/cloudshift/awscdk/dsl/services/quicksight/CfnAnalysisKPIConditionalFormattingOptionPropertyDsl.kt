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
public class CfnAnalysisKPIConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.KPIConditionalFormattingOptionProperty.Builder =
        CfnAnalysis.KPIConditionalFormattingOptionProperty.builder()

    public fun primaryValue(primaryValue: IResolvable) {
        cdkBuilder.primaryValue(primaryValue)
    }

    public fun primaryValue(primaryValue: CfnAnalysis.KPIPrimaryValueConditionalFormattingProperty) {
        cdkBuilder.primaryValue(primaryValue)
    }

    public fun progressBar(progressBar: IResolvable) {
        cdkBuilder.progressBar(progressBar)
    }

    public fun progressBar(progressBar: CfnAnalysis.KPIProgressBarConditionalFormattingProperty) {
        cdkBuilder.progressBar(progressBar)
    }

    public fun build(): CfnAnalysis.KPIConditionalFormattingOptionProperty = cdkBuilder.build()
}
