@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@CdkDslMarker
public class CfnGameServerGroupAutoScalingPolicyPropertyDsl {
  private val cdkBuilder: CfnGameServerGroup.AutoScalingPolicyProperty.Builder =
      CfnGameServerGroup.AutoScalingPolicyProperty.builder()

  /**
   * @param estimatedInstanceWarmup Length of time, in seconds, it takes for a new instance to start
   * new game server processes and register with Amazon GameLift FleetIQ.
   * Specifying a warm-up time can be useful, particularly with game servers that take a long time
   * to start up, because it avoids prematurely starting new instances.
   */
  public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
    cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
  }

  /**
   * @param targetTrackingConfiguration Settings for a target-based scaling policy applied to Auto
   * Scaling group. 
   * These settings are used to create a target-based policy that tracks the GameLift FleetIQ metric
   * `PercentUtilizedGameServers` and specifies a target value for the metric. As player usage changes,
   * the policy triggers to adjust the game server group capacity so that the metric returns to the
   * target value.
   */
  public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable) {
    cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration)
  }

  /**
   * @param targetTrackingConfiguration Settings for a target-based scaling policy applied to Auto
   * Scaling group. 
   * These settings are used to create a target-based policy that tracks the GameLift FleetIQ metric
   * `PercentUtilizedGameServers` and specifies a target value for the metric. As player usage changes,
   * the policy triggers to adjust the game server group capacity so that the metric returns to the
   * target value.
   */
  public
      fun targetTrackingConfiguration(targetTrackingConfiguration: CfnGameServerGroup.TargetTrackingConfigurationProperty) {
    cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration)
  }

  public fun build(): CfnGameServerGroup.AutoScalingPolicyProperty = cdkBuilder.build()
}
