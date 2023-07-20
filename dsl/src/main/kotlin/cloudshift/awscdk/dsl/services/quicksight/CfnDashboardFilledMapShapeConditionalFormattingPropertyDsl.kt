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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardFilledMapShapeConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilledMapShapeConditionalFormattingProperty.Builder =
        CfnDashboard.FilledMapShapeConditionalFormattingProperty.builder()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun format(format: IResolvable) {
        cdkBuilder.format(format)
    }

    public fun format(format: CfnDashboard.ShapeConditionalFormatProperty) {
        cdkBuilder.format(format)
    }

    public fun build(): CfnDashboard.FilledMapShapeConditionalFormattingProperty = cdkBuilder.build()
}
