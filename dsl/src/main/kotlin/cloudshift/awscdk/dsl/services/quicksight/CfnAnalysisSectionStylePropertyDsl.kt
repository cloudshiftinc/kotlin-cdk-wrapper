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
public class CfnAnalysisSectionStylePropertyDsl {
    private val cdkBuilder: CfnAnalysis.SectionStyleProperty.Builder =
        CfnAnalysis.SectionStyleProperty.builder()

    public fun height(height: String) {
        cdkBuilder.height(height)
    }

    public fun padding(padding: IResolvable) {
        cdkBuilder.padding(padding)
    }

    public fun padding(padding: CfnAnalysis.SpacingProperty) {
        cdkBuilder.padding(padding)
    }

    public fun build(): CfnAnalysis.SectionStyleProperty = cdkBuilder.build()
}
