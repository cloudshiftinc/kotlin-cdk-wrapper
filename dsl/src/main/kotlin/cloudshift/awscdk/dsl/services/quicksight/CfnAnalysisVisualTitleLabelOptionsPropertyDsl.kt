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
public class CfnAnalysisVisualTitleLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.VisualTitleLabelOptionsProperty.Builder =
        CfnAnalysis.VisualTitleLabelOptionsProperty.builder()

    public fun formatText(formatText: IResolvable) {
        cdkBuilder.formatText(formatText)
    }

    public fun formatText(formatText: CfnAnalysis.ShortFormatTextProperty) {
        cdkBuilder.formatText(formatText)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.VisualTitleLabelOptionsProperty = cdkBuilder.build()
}
