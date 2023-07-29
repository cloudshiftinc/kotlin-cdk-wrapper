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
 * The configuration of the `Select all` options in a list control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ListControlSelectAllOptionsProperty listControlSelectAllOptionsProperty =
 * ListControlSelectAllOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-listcontrolselectalloptions.html)
 */
@CdkDslMarker
public class CfnDashboardListControlSelectAllOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.ListControlSelectAllOptionsProperty.Builder =
        CfnDashboard.ListControlSelectAllOptionsProperty.builder()

    /**
     * @param visibility The visibility configuration of the `Select all` options in a list control.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.ListControlSelectAllOptionsProperty = cdkBuilder.build()
}
