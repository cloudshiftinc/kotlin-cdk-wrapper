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
public class CfnAnalysisConditionalFormattingGradientColorPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ConditionalFormattingGradientColorProperty.Builder =
        CfnAnalysis.ConditionalFormattingGradientColorProperty.builder()

    public fun color(color: IResolvable) {
        cdkBuilder.color(color)
    }

    public fun color(color: CfnAnalysis.GradientColorProperty) {
        cdkBuilder.color(color)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnAnalysis.ConditionalFormattingGradientColorProperty = cdkBuilder.build()
}
