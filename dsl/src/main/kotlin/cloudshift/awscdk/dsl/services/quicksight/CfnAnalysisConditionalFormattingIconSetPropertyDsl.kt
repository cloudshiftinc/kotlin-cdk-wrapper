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
public class CfnAnalysisConditionalFormattingIconSetPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ConditionalFormattingIconSetProperty.Builder =
        CfnAnalysis.ConditionalFormattingIconSetProperty.builder()

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun iconSetType(iconSetType: String) {
        cdkBuilder.iconSetType(iconSetType)
    }

    public fun build(): CfnAnalysis.ConditionalFormattingIconSetProperty = cdkBuilder.build()
}
