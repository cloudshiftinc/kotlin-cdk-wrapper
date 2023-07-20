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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisConditionalFormattingCustomIconOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty.Builder =
        CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty.builder()

    public fun icon(icon: String) {
        cdkBuilder.icon(icon)
    }

    public fun unicodeIcon(unicodeIcon: String) {
        cdkBuilder.unicodeIcon(unicodeIcon)
    }

    public fun build(): CfnAnalysis.ConditionalFormattingCustomIconOptionsProperty =
        cdkBuilder.build()
}
