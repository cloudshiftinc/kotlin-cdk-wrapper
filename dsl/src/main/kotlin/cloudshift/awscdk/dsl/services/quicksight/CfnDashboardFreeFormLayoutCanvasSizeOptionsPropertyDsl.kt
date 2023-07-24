@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Configuration options for the canvas of a free-form layout.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FreeFormLayoutCanvasSizeOptionsProperty freeFormLayoutCanvasSizeOptionsProperty =
 * FreeFormLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-freeformlayoutcanvassizeoptions.html)
 */
@CdkDslMarker
public class CfnDashboardFreeFormLayoutCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty.Builder =
        CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty.builder()

    /**
     * @param screenCanvasSizeOptions The options that determine the sizing of the canvas used in a
     * free-form layout.
     */
    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: IResolvable) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    /**
     * @param screenCanvasSizeOptions The options that determine the sizing of the canvas used in a
     * free-form layout.
     */
    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: CfnDashboard.FreeFormLayoutScreenCanvasSizeOptionsProperty) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    public fun build(): CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
