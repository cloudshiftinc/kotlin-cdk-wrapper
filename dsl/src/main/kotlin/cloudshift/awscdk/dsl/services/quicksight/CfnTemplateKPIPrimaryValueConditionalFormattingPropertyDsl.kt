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
public class CfnTemplateKPIPrimaryValueConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPIPrimaryValueConditionalFormattingProperty.Builder =
        CfnTemplate.KPIPrimaryValueConditionalFormattingProperty.builder()

    public fun icon(icon: IResolvable) {
        cdkBuilder.icon(icon)
    }

    public fun icon(icon: CfnTemplate.ConditionalFormattingIconProperty) {
        cdkBuilder.icon(icon)
    }

    public fun textColor(textColor: IResolvable) {
        cdkBuilder.textColor(textColor)
    }

    public fun textColor(textColor: CfnTemplate.ConditionalFormattingColorProperty) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnTemplate.KPIPrimaryValueConditionalFormattingProperty = cdkBuilder.build()
}
