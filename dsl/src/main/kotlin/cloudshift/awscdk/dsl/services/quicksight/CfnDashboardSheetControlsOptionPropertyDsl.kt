@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Sheet controls option.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetControlsOptionProperty sheetControlsOptionProperty = SheetControlsOptionProperty.builder()
 * .visibilityState("visibilityState")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sheetcontrolsoption.html)
 */
@CdkDslMarker
public class CfnDashboardSheetControlsOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.SheetControlsOptionProperty.Builder =
        CfnDashboard.SheetControlsOptionProperty.builder()

    /** @param visibilityState Visibility state. */
    public fun visibilityState(visibilityState: String) {
        cdkBuilder.visibilityState(visibilityState)
    }

    public fun build(): CfnDashboard.SheetControlsOptionProperty = cdkBuilder.build()
}
