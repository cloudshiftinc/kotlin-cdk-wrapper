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
public class CfnAnalysisArcOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ArcOptionsProperty.Builder =
        CfnAnalysis.ArcOptionsProperty.builder()

    public fun arcThickness(arcThickness: String) {
        cdkBuilder.arcThickness(arcThickness)
    }

    public fun build(): CfnAnalysis.ArcOptionsProperty = cdkBuilder.build()
}
