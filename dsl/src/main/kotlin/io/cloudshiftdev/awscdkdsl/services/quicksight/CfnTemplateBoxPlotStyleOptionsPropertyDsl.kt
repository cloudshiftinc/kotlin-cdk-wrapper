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
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-boxplotstyleoptions.html)
 */
@CdkDslMarker
public class CfnTemplateBoxPlotStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.BoxPlotStyleOptionsProperty.Builder =
        CfnTemplate.BoxPlotStyleOptionsProperty.builder()

    /** @param fillStyle The fill styles (solid, transparent) of the box plot. */
    public fun fillStyle(fillStyle: String) {
        cdkBuilder.fillStyle(fillStyle)
    }

    public fun build(): CfnTemplate.BoxPlotStyleOptionsProperty = cdkBuilder.build()
}
