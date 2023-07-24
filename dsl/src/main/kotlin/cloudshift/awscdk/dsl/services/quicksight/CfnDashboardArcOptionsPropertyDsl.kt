@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * The options that determine the arc thickness of a `GaugeChartVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ArcOptionsProperty arcOptionsProperty = ArcOptionsProperty.builder()
 * .arcThickness("arcThickness")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-arcoptions.html)
 */
@CdkDslMarker
public class CfnDashboardArcOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.ArcOptionsProperty.Builder =
        CfnDashboard.ArcOptionsProperty.builder()

    /**
     * @param arcThickness The arc thickness of a `GaugeChartVisual` .
     */
    public fun arcThickness(arcThickness: String) {
        cdkBuilder.arcThickness(arcThickness)
    }

    public fun build(): CfnDashboard.ArcOptionsProperty = cdkBuilder.build()
}
