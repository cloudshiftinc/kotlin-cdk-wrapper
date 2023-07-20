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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateConditionalFormattingIconPropertyDsl {
    private val cdkBuilder: CfnTemplate.ConditionalFormattingIconProperty.Builder =
        CfnTemplate.ConditionalFormattingIconProperty.builder()

    public fun customCondition(customCondition: IResolvable) {
        cdkBuilder.customCondition(customCondition)
    }

    public fun customCondition(customCondition: CfnTemplate.ConditionalFormattingCustomIconConditionProperty) {
        cdkBuilder.customCondition(customCondition)
    }

    public fun iconSet(iconSet: IResolvable) {
        cdkBuilder.iconSet(iconSet)
    }

    public fun iconSet(iconSet: CfnTemplate.ConditionalFormattingIconSetProperty) {
        cdkBuilder.iconSet(iconSet)
    }

    public fun build(): CfnTemplate.ConditionalFormattingIconProperty = cdkBuilder.build()
}
