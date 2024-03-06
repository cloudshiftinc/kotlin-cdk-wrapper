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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Configures the properties of a chart's axes that are used by small multiples panels.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SmallMultiplesAxisPropertiesProperty smallMultiplesAxisPropertiesProperty =
 * SmallMultiplesAxisPropertiesProperty.builder()
 * .placement("placement")
 * .scale("scale")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-smallmultiplesaxisproperties.html)
 */
@CdkDslMarker
public class CfnDashboardSmallMultiplesAxisPropertiesPropertyDsl {
    private val cdkBuilder: CfnDashboard.SmallMultiplesAxisPropertiesProperty.Builder =
        CfnDashboard.SmallMultiplesAxisPropertiesProperty.builder()

    /**
     * @param placement Defines the placement of the axis. By default, axes are rendered `OUTSIDE`
     *   of the panels. Axes with `INDEPENDENT` scale are rendered `INSIDE` the panels.
     */
    public fun placement(placement: String) {
        cdkBuilder.placement(placement)
    }

    /**
     * @param scale Determines whether scale of the axes are shared or independent. The default
     *   value is `SHARED` .
     */
    public fun scale(scale: String) {
        cdkBuilder.scale(scale)
    }

    public fun build(): CfnDashboard.SmallMultiplesAxisPropertiesProperty = cdkBuilder.build()
}
