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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The style options of the box plot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * BoxPlotStyleOptionsProperty boxPlotStyleOptionsProperty = BoxPlotStyleOptionsProperty.builder()
 * .fillStyle("fillStyle")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-boxplotstyleoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisBoxPlotStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.BoxPlotStyleOptionsProperty.Builder =
        CfnAnalysis.BoxPlotStyleOptionsProperty.builder()

    /** @param fillStyle The fill styles (solid, transparent) of the box plot. */
    public fun fillStyle(fillStyle: String) {
        cdkBuilder.fillStyle(fillStyle)
    }

    public fun build(): CfnAnalysis.BoxPlotStyleOptionsProperty = cdkBuilder.build()
}
