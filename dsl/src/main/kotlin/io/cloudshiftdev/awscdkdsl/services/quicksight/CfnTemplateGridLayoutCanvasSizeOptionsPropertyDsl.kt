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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Configuration options for the canvas of a grid layout.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GridLayoutCanvasSizeOptionsProperty gridLayoutCanvasSizeOptionsProperty =
 * GridLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(GridLayoutScreenCanvasSizeOptionsProperty.builder()
 * .resizeOption("resizeOption")
 * // the properties below are optional
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-gridlayoutcanvassizeoptions.html)
 */
@CdkDslMarker
public class CfnTemplateGridLayoutCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.GridLayoutCanvasSizeOptionsProperty.Builder =
        CfnTemplate.GridLayoutCanvasSizeOptionsProperty.builder()

    /**
     * @param screenCanvasSizeOptions The options that determine the sizing of the canvas used in a
     *   grid layout.
     */
    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: IResolvable) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    /**
     * @param screenCanvasSizeOptions The options that determine the sizing of the canvas used in a
     *   grid layout.
     */
    public fun screenCanvasSizeOptions(
        screenCanvasSizeOptions: CfnTemplate.GridLayoutScreenCanvasSizeOptionsProperty
    ) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    public fun build(): CfnTemplate.GridLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
