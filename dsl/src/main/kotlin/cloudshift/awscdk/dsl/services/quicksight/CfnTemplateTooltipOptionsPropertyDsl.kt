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
import kotlin.String

@CdkDslMarker
public class CfnTemplateTooltipOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TooltipOptionsProperty.Builder =
        CfnTemplate.TooltipOptionsProperty.builder()

    public fun fieldBasedTooltip(fieldBasedTooltip: IResolvable) {
        cdkBuilder.fieldBasedTooltip(fieldBasedTooltip)
    }

    public fun fieldBasedTooltip(fieldBasedTooltip: CfnTemplate.FieldBasedTooltipProperty) {
        cdkBuilder.fieldBasedTooltip(fieldBasedTooltip)
    }

    public fun selectedTooltipType(selectedTooltipType: String) {
        cdkBuilder.selectedTooltipType(selectedTooltipType)
    }

    public fun tooltipVisibility(tooltipVisibility: String) {
        cdkBuilder.tooltipVisibility(tooltipVisibility)
    }

    public fun build(): CfnTemplate.TooltipOptionsProperty = cdkBuilder.build()
}
