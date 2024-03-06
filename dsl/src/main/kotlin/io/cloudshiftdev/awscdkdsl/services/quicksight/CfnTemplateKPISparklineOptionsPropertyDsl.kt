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
 * The options that determine the visibility, color, type, and tooltip visibility of the sparkline
 * of a KPI visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * KPISparklineOptionsProperty kPISparklineOptionsProperty = KPISparklineOptionsProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .color("color")
 * .tooltipVisibility("tooltipVisibility")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-kpisparklineoptions.html)
 */
@CdkDslMarker
public class CfnTemplateKPISparklineOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPISparklineOptionsProperty.Builder =
        CfnTemplate.KPISparklineOptionsProperty.builder()

    /** @param color The color of the sparkline. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /** @param tooltipVisibility The tooltip visibility of the sparkline. */
    public fun tooltipVisibility(tooltipVisibility: String) {
        cdkBuilder.tooltipVisibility(tooltipVisibility)
    }

    /** @param type The type of the sparkline. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param visibility The visibility of the sparkline. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.KPISparklineOptionsProperty = cdkBuilder.build()
}
