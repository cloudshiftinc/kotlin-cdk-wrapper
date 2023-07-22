@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

/**
 * *This data type is used with the Amazon GameLift FleetIQ and game server groups.*.
 *
 * Settings for a target-based scaling policy as part of a `GameServerGroupAutoScalingPolicy` .
 * These settings are used to create a target-based policy that tracks the GameLift FleetIQ metric
 * `"PercentUtilizedGameServers"` and specifies a target value for the metric. As player usage changes,
 * the policy triggers to adjust the game server group capacity so that the metric returns to the
 * target value.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * TargetTrackingConfigurationProperty targetTrackingConfigurationProperty =
 * TargetTrackingConfigurationProperty.builder()
 * .targetValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gameservergroup-targettrackingconfiguration.html)
 */
@CdkDslMarker
public class CfnGameServerGroupTargetTrackingConfigurationPropertyDsl {
  private val cdkBuilder: CfnGameServerGroup.TargetTrackingConfigurationProperty.Builder =
      CfnGameServerGroup.TargetTrackingConfigurationProperty.builder()

  /**
   * @param targetValue Desired value to use with a game server group target-based scaling policy. 
   */
  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnGameServerGroup.TargetTrackingConfigurationProperty = cdkBuilder.build()
}
