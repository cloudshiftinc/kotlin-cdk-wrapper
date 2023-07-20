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
import kotlin.String

@CdkDslMarker
public class CfnAnalysisVisualSubtitleLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.VisualSubtitleLabelOptionsProperty.Builder =
        CfnAnalysis.VisualSubtitleLabelOptionsProperty.builder()

    public fun formatText(formatText: IResolvable) {
        cdkBuilder.formatText(formatText)
    }

    public fun formatText(formatText: CfnAnalysis.LongFormatTextProperty) {
        cdkBuilder.formatText(formatText)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.VisualSubtitleLabelOptionsProperty = cdkBuilder.build()
}
