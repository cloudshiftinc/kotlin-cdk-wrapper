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
 * The range ends label type of a data path label.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RangeEndsLabelTypeProperty rangeEndsLabelTypeProperty = RangeEndsLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-rangeendslabeltype.html)
 */
@CdkDslMarker
public class CfnDashboardRangeEndsLabelTypePropertyDsl {
    private val cdkBuilder: CfnDashboard.RangeEndsLabelTypeProperty.Builder =
        CfnDashboard.RangeEndsLabelTypeProperty.builder()

    /** @param visibility The visibility of the range ends label. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.RangeEndsLabelTypeProperty = cdkBuilder.build()
}
