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
public class CfnDashboardVisualTitleLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.VisualTitleLabelOptionsProperty.Builder =
        CfnDashboard.VisualTitleLabelOptionsProperty.builder()

    public fun formatText(formatText: IResolvable) {
        cdkBuilder.formatText(formatText)
    }

    public fun formatText(formatText: CfnDashboard.ShortFormatTextProperty) {
        cdkBuilder.formatText(formatText)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.VisualTitleLabelOptionsProperty = cdkBuilder.build()
}
