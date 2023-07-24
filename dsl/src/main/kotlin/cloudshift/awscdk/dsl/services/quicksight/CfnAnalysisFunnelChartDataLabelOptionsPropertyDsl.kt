@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The options that determine the presentation of the data labels.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FunnelChartDataLabelOptionsProperty funnelChartDataLabelOptionsProperty =
 * FunnelChartDataLabelOptionsProperty.builder()
 * .categoryLabelVisibility("categoryLabelVisibility")
 * .labelColor("labelColor")
 * .labelFontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .measureDataLabelStyle("measureDataLabelStyle")
 * .measureLabelVisibility("measureLabelVisibility")
 * .position("position")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-funnelchartdatalabeloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisFunnelChartDataLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FunnelChartDataLabelOptionsProperty.Builder =
        CfnAnalysis.FunnelChartDataLabelOptionsProperty.builder()

    /**
     * @param categoryLabelVisibility The visibility of the category labels within the data labels.
     */
    public fun categoryLabelVisibility(categoryLabelVisibility: String) {
        cdkBuilder.categoryLabelVisibility(categoryLabelVisibility)
    }

    /**
     * @param labelColor The color of the data label text.
     */
    public fun labelColor(labelColor: String) {
        cdkBuilder.labelColor(labelColor)
    }

    /**
     * @param labelFontConfiguration The font configuration for the data labels.
     * Only the `FontSize` attribute of the font configuration is used for data labels.
     */
    public fun labelFontConfiguration(labelFontConfiguration: IResolvable) {
        cdkBuilder.labelFontConfiguration(labelFontConfiguration)
    }

    /**
     * @param labelFontConfiguration The font configuration for the data labels.
     * Only the `FontSize` attribute of the font configuration is used for data labels.
     */
    public fun labelFontConfiguration(labelFontConfiguration: CfnAnalysis.FontConfigurationProperty) {
        cdkBuilder.labelFontConfiguration(labelFontConfiguration)
    }

    /**
     * @param measureDataLabelStyle Determines the style of the metric labels.
     */
    public fun measureDataLabelStyle(measureDataLabelStyle: String) {
        cdkBuilder.measureDataLabelStyle(measureDataLabelStyle)
    }

    /**
     * @param measureLabelVisibility The visibility of the measure labels within the data labels.
     */
    public fun measureLabelVisibility(measureLabelVisibility: String) {
        cdkBuilder.measureLabelVisibility(measureLabelVisibility)
    }

    /**
     * @param position Determines the positioning of the data label relative to a section of the
     * funnel.
     */
    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    /**
     * @param visibility The visibility option that determines if data labels are displayed.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.FunnelChartDataLabelOptionsProperty = cdkBuilder.build()
}
