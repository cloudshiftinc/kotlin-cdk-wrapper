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
public class CfnAnalysisTextControlPlaceholderOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TextControlPlaceholderOptionsProperty.Builder =
        CfnAnalysis.TextControlPlaceholderOptionsProperty.builder()

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.TextControlPlaceholderOptionsProperty = cdkBuilder.build()
}
