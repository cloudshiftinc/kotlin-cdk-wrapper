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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options that determine the default settings for a grid layout configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DefaultGridLayoutConfigurationProperty defaultGridLayoutConfigurationProperty =
 * DefaultGridLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(GridLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-defaultgridlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisDefaultGridLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DefaultGridLayoutConfigurationProperty.Builder =
        CfnAnalysis.DefaultGridLayoutConfigurationProperty.builder()

    /** @param canvasSizeOptions Determines the screen canvas size options for a grid layout. */
    public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    /** @param canvasSizeOptions Determines the screen canvas size options for a grid layout. */
    public fun canvasSizeOptions(
        canvasSizeOptions: CfnAnalysis.GridLayoutCanvasSizeOptionsProperty
    ) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    public fun build(): CfnAnalysis.DefaultGridLayoutConfigurationProperty = cdkBuilder.build()
}
