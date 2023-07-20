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

@CdkDslMarker
public class CfnAnalysisConditionalFormattingIconPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ConditionalFormattingIconProperty.Builder =
        CfnAnalysis.ConditionalFormattingIconProperty.builder()

    public fun customCondition(customCondition: IResolvable) {
        cdkBuilder.customCondition(customCondition)
    }

    public fun customCondition(customCondition: CfnAnalysis.ConditionalFormattingCustomIconConditionProperty) {
        cdkBuilder.customCondition(customCondition)
    }

    public fun iconSet(iconSet: IResolvable) {
        cdkBuilder.iconSet(iconSet)
    }

    public fun iconSet(iconSet: CfnAnalysis.ConditionalFormattingIconSetProperty) {
        cdkBuilder.iconSet(iconSet)
    }

    public fun build(): CfnAnalysis.ConditionalFormattingIconProperty = cdkBuilder.build()
}
