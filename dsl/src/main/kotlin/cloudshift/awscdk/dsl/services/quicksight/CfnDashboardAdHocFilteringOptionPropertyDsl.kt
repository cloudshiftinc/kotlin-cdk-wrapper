@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * An ad hoc (one-time) filtering option.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AdHocFilteringOptionProperty adHocFilteringOptionProperty =
 * AdHocFilteringOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-adhocfilteringoption.html)
 */
@CdkDslMarker
public class CfnDashboardAdHocFilteringOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.AdHocFilteringOptionProperty.Builder =
        CfnDashboard.AdHocFilteringOptionProperty.builder()

    /**
     * @param availabilityStatus Availability status.
     */
    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    public fun build(): CfnDashboard.AdHocFilteringOptionProperty = cdkBuilder.build()
}
