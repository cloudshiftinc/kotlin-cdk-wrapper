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
public class CfnAnalysisFreeFormLayoutElementBackgroundStylePropertyDsl {
    private val cdkBuilder: CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty.Builder =
        CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty = cdkBuilder.build()
}
