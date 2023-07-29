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
 * The options that determine the presentation of a waterfall visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * WaterfallChartOptionsProperty waterfallChartOptionsProperty =
 * WaterfallChartOptionsProperty.builder()
 * .totalBarLabel("totalBarLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-waterfallchartoptions.html)
 */
@CdkDslMarker
public class CfnDashboardWaterfallChartOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.WaterfallChartOptionsProperty.Builder =
        CfnDashboard.WaterfallChartOptionsProperty.builder()

    /** @param totalBarLabel This option determines the total bar label of a waterfall visual. */
    public fun totalBarLabel(totalBarLabel: String) {
        cdkBuilder.totalBarLabel(totalBarLabel)
    }

    public fun build(): CfnDashboard.WaterfallChartOptionsProperty = cdkBuilder.build()
}
