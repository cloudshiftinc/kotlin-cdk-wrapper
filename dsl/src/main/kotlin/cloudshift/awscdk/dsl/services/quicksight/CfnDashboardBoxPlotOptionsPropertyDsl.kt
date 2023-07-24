@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * The options of a box plot visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * BoxPlotOptionsProperty boxPlotOptionsProperty = BoxPlotOptionsProperty.builder()
 * .allDataPointsVisibility("allDataPointsVisibility")
 * .outlierVisibility("outlierVisibility")
 * .styleOptions(BoxPlotStyleOptionsProperty.builder()
 * .fillStyle("fillStyle")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-boxplotoptions.html)
 */
@CdkDslMarker
public class CfnDashboardBoxPlotOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.BoxPlotOptionsProperty.Builder =
        CfnDashboard.BoxPlotOptionsProperty.builder()

    /**
     * @param allDataPointsVisibility Determines the visibility of all data points of the box plot.
     */
    public fun allDataPointsVisibility(allDataPointsVisibility: String) {
        cdkBuilder.allDataPointsVisibility(allDataPointsVisibility)
    }

    /**
     * @param outlierVisibility Determines the visibility of the outlier in a box plot.
     */
    public fun outlierVisibility(outlierVisibility: String) {
        cdkBuilder.outlierVisibility(outlierVisibility)
    }

    /**
     * @param styleOptions The style options of the box plot.
     */
    public fun styleOptions(styleOptions: IResolvable) {
        cdkBuilder.styleOptions(styleOptions)
    }

    /**
     * @param styleOptions The style options of the box plot.
     */
    public fun styleOptions(styleOptions: CfnDashboard.BoxPlotStyleOptionsProperty) {
        cdkBuilder.styleOptions(styleOptions)
    }

    public fun build(): CfnDashboard.BoxPlotOptionsProperty = cdkBuilder.build()
}
