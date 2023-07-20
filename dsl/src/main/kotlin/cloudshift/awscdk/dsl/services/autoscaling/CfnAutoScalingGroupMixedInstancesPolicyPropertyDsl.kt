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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupMixedInstancesPolicyPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder =
        CfnAutoScalingGroup.MixedInstancesPolicyProperty.builder()

    public fun instancesDistribution(instancesDistribution: IResolvable) {
        cdkBuilder.instancesDistribution(instancesDistribution)
    }

    public fun instancesDistribution(instancesDistribution: CfnAutoScalingGroup.InstancesDistributionProperty) {
        cdkBuilder.instancesDistribution(instancesDistribution)
    }

    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateProperty) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun build(): CfnAutoScalingGroup.MixedInstancesPolicyProperty = cdkBuilder.build()
}
