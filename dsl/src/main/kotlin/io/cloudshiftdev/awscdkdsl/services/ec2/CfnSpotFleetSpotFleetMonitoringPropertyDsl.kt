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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Describes whether monitoring is enabled.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SpotFleetMonitoringProperty spotFleetMonitoringProperty = SpotFleetMonitoringProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetmonitoring.html)
 */
@CdkDslMarker
public class CfnSpotFleetSpotFleetMonitoringPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.SpotFleetMonitoringProperty.Builder =
        CfnSpotFleet.SpotFleetMonitoringProperty.builder()

    /** @param enabled Enables monitoring for the instance. Default: `false` */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Enables monitoring for the instance. Default: `false` */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnSpotFleet.SpotFleetMonitoringProperty = cdkBuilder.build()
}
