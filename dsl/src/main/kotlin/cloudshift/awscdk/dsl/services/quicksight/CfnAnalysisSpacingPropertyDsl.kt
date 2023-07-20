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
public class CfnAnalysisSpacingPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SpacingProperty.Builder =
        CfnAnalysis.SpacingProperty.builder()

    public fun bottom(bottom: String) {
        cdkBuilder.bottom(bottom)
    }

    public fun left(left: String) {
        cdkBuilder.left(left)
    }

    public fun right(right: String) {
        cdkBuilder.right(right)
    }

    public fun top(top: String) {
        cdkBuilder.top(top)
    }

    public fun build(): CfnAnalysis.SpacingProperty = cdkBuilder.build()
}
