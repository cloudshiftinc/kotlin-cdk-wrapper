@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetLoadBalancersConfigPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.LoadBalancersConfigProperty.Builder =
      CfnSpotFleet.LoadBalancersConfigProperty.builder()

  /**
   * @param classicLoadBalancersConfig The Classic Load Balancers.
   */
  public fun classicLoadBalancersConfig(classicLoadBalancersConfig: IResolvable) {
    cdkBuilder.classicLoadBalancersConfig(classicLoadBalancersConfig)
  }

  /**
   * @param classicLoadBalancersConfig The Classic Load Balancers.
   */
  public
      fun classicLoadBalancersConfig(classicLoadBalancersConfig: CfnSpotFleet.ClassicLoadBalancersConfigProperty) {
    cdkBuilder.classicLoadBalancersConfig(classicLoadBalancersConfig)
  }

  /**
   * @param targetGroupsConfig The target groups.
   */
  public fun targetGroupsConfig(targetGroupsConfig: IResolvable) {
    cdkBuilder.targetGroupsConfig(targetGroupsConfig)
  }

  /**
   * @param targetGroupsConfig The target groups.
   */
  public fun targetGroupsConfig(targetGroupsConfig: CfnSpotFleet.TargetGroupsConfigProperty) {
    cdkBuilder.targetGroupsConfig(targetGroupsConfig)
  }

  public fun build(): CfnSpotFleet.LoadBalancersConfigProperty = cdkBuilder.build()
}
