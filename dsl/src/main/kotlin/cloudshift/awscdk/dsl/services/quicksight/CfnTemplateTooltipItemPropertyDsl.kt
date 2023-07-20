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
public class CfnTemplateTooltipItemPropertyDsl {
    private val cdkBuilder: CfnTemplate.TooltipItemProperty.Builder =
        CfnTemplate.TooltipItemProperty.builder()

    public fun columnTooltipItem(columnTooltipItem: IResolvable) {
        cdkBuilder.columnTooltipItem(columnTooltipItem)
    }

    public fun columnTooltipItem(columnTooltipItem: CfnTemplate.ColumnTooltipItemProperty) {
        cdkBuilder.columnTooltipItem(columnTooltipItem)
    }

    public fun fieldTooltipItem(fieldTooltipItem: IResolvable) {
        cdkBuilder.fieldTooltipItem(fieldTooltipItem)
    }

    public fun fieldTooltipItem(fieldTooltipItem: CfnTemplate.FieldTooltipItemProperty) {
        cdkBuilder.fieldTooltipItem(fieldTooltipItem)
    }

    public fun build(): CfnTemplate.TooltipItemProperty = cdkBuilder.build()
}
