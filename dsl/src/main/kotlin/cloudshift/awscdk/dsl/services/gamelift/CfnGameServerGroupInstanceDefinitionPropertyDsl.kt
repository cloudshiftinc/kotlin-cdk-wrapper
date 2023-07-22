@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@CdkDslMarker
public class CfnGameServerGroupInstanceDefinitionPropertyDsl {
  private val cdkBuilder: CfnGameServerGroup.InstanceDefinitionProperty.Builder =
      CfnGameServerGroup.InstanceDefinitionProperty.builder()

  /**
   * @param instanceType An Amazon EC2 instance type designation. 
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param weightedCapacity Instance weighting that indicates how much this instance type
   * contributes to the total capacity of a game server group.
   * Instance weights are used by Amazon GameLift FleetIQ to calculate the instance type's cost per
   * unit hour and better identify the most cost-effective options. For detailed information on
   * weighting instance capacity, see [Instance
   * Weighting](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-weighting.html) in
   * the *Amazon Elastic Compute Cloud Auto Scaling User Guide* . Default value is "1".
   */
  public fun weightedCapacity(weightedCapacity: String) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): CfnGameServerGroup.InstanceDefinitionProperty = cdkBuilder.build()
}
