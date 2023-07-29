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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Line styles options for a line series in `LineChartVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LineChartLineStyleSettingsProperty lineChartLineStyleSettingsProperty =
 * LineChartLineStyleSettingsProperty.builder()
 * .lineInterpolation("lineInterpolation")
 * .lineStyle("lineStyle")
 * .lineVisibility("lineVisibility")
 * .lineWidth("lineWidth")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-linechartlinestylesettings.html)
 */
@CdkDslMarker
public class CfnTemplateLineChartLineStyleSettingsPropertyDsl {
    private val cdkBuilder: CfnTemplate.LineChartLineStyleSettingsProperty.Builder =
        CfnTemplate.LineChartLineStyleSettingsProperty.builder()

    /**
     * @param lineInterpolation Interpolation style for line series.
     * * `LINEAR` : Show as default, linear style.
     * * `SMOOTH` : Show as a smooth curve.
     * * `STEPPED` : Show steps in line.
     */
    public fun lineInterpolation(lineInterpolation: String) {
        cdkBuilder.lineInterpolation(lineInterpolation)
    }

    /**
     * @param lineStyle Line style for line series.
     * * `SOLID` : Show as a solid line.
     * * `DOTTED` : Show as a dotted line.
     * * `DASHED` : Show as a dashed line.
     */
    public fun lineStyle(lineStyle: String) {
        cdkBuilder.lineStyle(lineStyle)
    }

    /**
     * @param lineVisibility Configuration option that determines whether to show the line for the
     *   series.
     */
    public fun lineVisibility(lineVisibility: String) {
        cdkBuilder.lineVisibility(lineVisibility)
    }

    /** @param lineWidth Width that determines the line thickness. */
    public fun lineWidth(lineWidth: String) {
        cdkBuilder.lineWidth(lineWidth)
    }

    public fun build(): CfnTemplate.LineChartLineStyleSettingsProperty = cdkBuilder.build()
}
