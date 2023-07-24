@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options that determine the default settings of a free-form layout configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DefaultFreeFormLayoutConfigurationProperty defaultFreeFormLayoutConfigurationProperty =
 * DefaultFreeFormLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(FreeFormLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-defaultfreeformlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisDefaultFreeFormLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DefaultFreeFormLayoutConfigurationProperty.Builder =
        CfnAnalysis.DefaultFreeFormLayoutConfigurationProperty.builder()

    /**
     * @param canvasSizeOptions Determines the screen canvas size options for a free-form layout.
     */
    public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    /**
     * @param canvasSizeOptions Determines the screen canvas size options for a free-form layout.
     */
    public fun canvasSizeOptions(canvasSizeOptions: CfnAnalysis.FreeFormLayoutCanvasSizeOptionsProperty) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    public fun build(): CfnAnalysis.DefaultFreeFormLayoutConfigurationProperty = cdkBuilder.build()
}
