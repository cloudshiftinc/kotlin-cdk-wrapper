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

@CdkDslMarker
public class CfnDashboardTableRowConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableRowConditionalFormattingProperty.Builder =
        CfnDashboard.TableRowConditionalFormattingProperty.builder()

    public fun backgroundColor(backgroundColor: IResolvable) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun backgroundColor(backgroundColor: CfnDashboard.ConditionalFormattingColorProperty) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun textColor(textColor: IResolvable) {
        cdkBuilder.textColor(textColor)
    }

    public fun textColor(textColor: CfnDashboard.ConditionalFormattingColorProperty) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnDashboard.TableRowConditionalFormattingProperty = cdkBuilder.build()
}
