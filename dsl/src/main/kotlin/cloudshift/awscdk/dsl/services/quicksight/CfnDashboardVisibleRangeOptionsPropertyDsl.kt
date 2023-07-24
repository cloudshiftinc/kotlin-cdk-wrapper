@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The range options for the data zoom scroll bar.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VisibleRangeOptionsProperty visibleRangeOptionsProperty = VisibleRangeOptionsProperty.builder()
 * .percentRange(PercentVisibleRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-visiblerangeoptions.html)
 */
@CdkDslMarker
public class CfnDashboardVisibleRangeOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.VisibleRangeOptionsProperty.Builder =
        CfnDashboard.VisibleRangeOptionsProperty.builder()

    /**
     * @param percentRange The percent range in the visible range.
     */
    public fun percentRange(percentRange: IResolvable) {
        cdkBuilder.percentRange(percentRange)
    }

    /**
     * @param percentRange The percent range in the visible range.
     */
    public fun percentRange(percentRange: CfnDashboard.PercentVisibleRangeProperty) {
        cdkBuilder.percentRange(percentRange)
    }

    public fun build(): CfnDashboard.VisibleRangeOptionsProperty = cdkBuilder.build()
}
