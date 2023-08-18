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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options of a box plot visual.
 *
 * Example:
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-boxplotoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisBoxPlotOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.BoxPlotOptionsProperty.Builder =
        CfnAnalysis.BoxPlotOptionsProperty.builder()

    /**
     * @param allDataPointsVisibility Determines the visibility of all data points of the box plot.
     */
    public fun allDataPointsVisibility(allDataPointsVisibility: String) {
        cdkBuilder.allDataPointsVisibility(allDataPointsVisibility)
    }

    /** @param outlierVisibility Determines the visibility of the outlier in a box plot. */
    public fun outlierVisibility(outlierVisibility: String) {
        cdkBuilder.outlierVisibility(outlierVisibility)
    }

    /** @param styleOptions The style options of the box plot. */
    public fun styleOptions(styleOptions: IResolvable) {
        cdkBuilder.styleOptions(styleOptions)
    }

    /** @param styleOptions The style options of the box plot. */
    public fun styleOptions(styleOptions: CfnAnalysis.BoxPlotStyleOptionsProperty) {
        cdkBuilder.styleOptions(styleOptions)
    }

    public fun build(): CfnAnalysis.BoxPlotOptionsProperty = cdkBuilder.build()
}
