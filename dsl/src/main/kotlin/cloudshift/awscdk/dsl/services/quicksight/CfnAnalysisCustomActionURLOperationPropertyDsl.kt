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
public class CfnAnalysisCustomActionURLOperationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CustomActionURLOperationProperty.Builder =
        CfnAnalysis.CustomActionURLOperationProperty.builder()

    public fun urlTarget(urlTarget: String) {
        cdkBuilder.urlTarget(urlTarget)
    }

    public fun urlTemplate(urlTemplate: String) {
        cdkBuilder.urlTemplate(urlTemplate)
    }

    public fun build(): CfnAnalysis.CustomActionURLOperationProperty = cdkBuilder.build()
}
