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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configured style settings of a radar chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RadarChartAreaStyleSettingsProperty radarChartAreaStyleSettingsProperty =
 * RadarChartAreaStyleSettingsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-radarchartareastylesettings.html)
 */
@CdkDslMarker
public class CfnAnalysisRadarChartAreaStyleSettingsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.RadarChartAreaStyleSettingsProperty.Builder =
        CfnAnalysis.RadarChartAreaStyleSettingsProperty.builder()

    /** @param visibility The visibility settings of a radar chart. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.RadarChartAreaStyleSettingsProperty = cdkBuilder.build()
}
