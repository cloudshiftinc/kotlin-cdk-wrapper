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
 * The options that determine the sizing of the canvas used in a grid layout.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GridLayoutScreenCanvasSizeOptionsProperty gridLayoutScreenCanvasSizeOptionsProperty =
 * GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-gridlayoutscreencanvassizeoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisGridLayoutScreenCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GridLayoutScreenCanvasSizeOptionsProperty.Builder =
        CfnAnalysis.GridLayoutScreenCanvasSizeOptionsProperty.builder()

    /**
     * @param optimizedViewPortWidth The width that the view port will be optimized for when the
     *   layout renders.
     */
    public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
        cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
    }

    /**
     * @param resizeOption This value determines the layout behavior when the viewport is resized.
     * * `FIXED` : A fixed width will be used when optimizing the layout. In the Amazon QuickSight
     *   console, this option is called `Classic` .
     * * `RESPONSIVE` : The width of the canvas will be responsive and optimized to the view port.
     *   In the Amazon QuickSight console, this option is called `Tiled` .
     */
    public fun resizeOption(resizeOption: String) {
        cdkBuilder.resizeOption(resizeOption)
    }

    public fun build(): CfnAnalysis.GridLayoutScreenCanvasSizeOptionsProperty = cdkBuilder.build()
}
