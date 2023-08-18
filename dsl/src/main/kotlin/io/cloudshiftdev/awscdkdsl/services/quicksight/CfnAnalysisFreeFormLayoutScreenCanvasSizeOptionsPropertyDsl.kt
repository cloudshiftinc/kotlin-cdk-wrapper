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
 * The options that determine the sizing of the canvas used in a free-form layout.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FreeFormLayoutScreenCanvasSizeOptionsProperty freeFormLayoutScreenCanvasSizeOptionsProperty =
 * FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-freeformlayoutscreencanvassizeoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FreeFormLayoutScreenCanvasSizeOptionsProperty.Builder =
        CfnAnalysis.FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()

    /**
     * @param optimizedViewPortWidth The width that the view port will be optimized for when the
     *   layout renders.
     */
    public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
        cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
    }

    public fun build(): CfnAnalysis.FreeFormLayoutScreenCanvasSizeOptionsProperty =
        cdkBuilder.build()
}
