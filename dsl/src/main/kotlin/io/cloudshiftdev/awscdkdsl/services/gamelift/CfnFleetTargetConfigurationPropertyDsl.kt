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

package io.cloudshiftdev.awscdkdsl.services.gamelift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnFleet

/**
 * Settings for a target-based scaling policy.
 *
 * A target-based policy tracks a particular fleet metric specifies a target value for the metric.
 * As player usage changes, the policy triggers Amazon GameLift to adjust capacity so that the
 * metric returns to the target value. The target configuration specifies settings as needed for the
 * target based policy, including the target value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * TargetConfigurationProperty targetConfigurationProperty = TargetConfigurationProperty.builder()
 * .targetValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-targetconfiguration.html)
 */
@CdkDslMarker
public class CfnFleetTargetConfigurationPropertyDsl {
    private val cdkBuilder: CfnFleet.TargetConfigurationProperty.Builder =
        CfnFleet.TargetConfigurationProperty.builder()

    /**
     * @param targetValue Desired value to use with a target-based scaling policy. The value must be
     *   relevant for whatever metric the scaling policy is using. For example, in a policy using
     *   the metric PercentAvailableGameSessions, the target value should be the preferred size of
     *   the fleet's buffer (the percent of capacity that should be idle and ready for new game
     *   sessions).
     */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): CfnFleet.TargetConfigurationProperty = cdkBuilder.build()
}
