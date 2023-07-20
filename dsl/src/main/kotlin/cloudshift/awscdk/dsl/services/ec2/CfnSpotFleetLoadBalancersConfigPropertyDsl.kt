@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetLoadBalancersConfigPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.LoadBalancersConfigProperty.Builder =
        CfnSpotFleet.LoadBalancersConfigProperty.builder()

    public fun classicLoadBalancersConfig(classicLoadBalancersConfig: IResolvable) {
        cdkBuilder.classicLoadBalancersConfig(classicLoadBalancersConfig)
    }

    public fun classicLoadBalancersConfig(classicLoadBalancersConfig: CfnSpotFleet.ClassicLoadBalancersConfigProperty) {
        cdkBuilder.classicLoadBalancersConfig(classicLoadBalancersConfig)
    }

    public fun targetGroupsConfig(targetGroupsConfig: IResolvable) {
        cdkBuilder.targetGroupsConfig(targetGroupsConfig)
    }

    public fun targetGroupsConfig(targetGroupsConfig: CfnSpotFleet.TargetGroupsConfigProperty) {
        cdkBuilder.targetGroupsConfig(targetGroupsConfig)
    }

    public fun build(): CfnSpotFleet.LoadBalancersConfigProperty = cdkBuilder.build()
}
