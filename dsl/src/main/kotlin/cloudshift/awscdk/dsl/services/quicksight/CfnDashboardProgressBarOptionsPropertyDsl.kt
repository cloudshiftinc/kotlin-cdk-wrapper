@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * The options that determine the presentation of the progress bar of a KPI visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ProgressBarOptionsProperty progressBarOptionsProperty = ProgressBarOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-progressbaroptions.html)
 */
@CdkDslMarker
public class CfnDashboardProgressBarOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.ProgressBarOptionsProperty.Builder =
        CfnDashboard.ProgressBarOptionsProperty.builder()

    /**
     * @param visibility The visibility of the progress bar.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.ProgressBarOptionsProperty = cdkBuilder.build()
}
