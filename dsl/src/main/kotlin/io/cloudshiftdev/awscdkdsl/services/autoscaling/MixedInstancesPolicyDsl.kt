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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.InstancesDistribution
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy
import software.amazon.awscdk.services.ec2.ILaunchTemplate

/**
 * MixedInstancesPolicy allows you to configure a group that diversifies across On-Demand Instances
 * and Spot Instances of multiple instance types.
 *
 * For more information, see Auto Scaling groups with multiple instance types and purchase options
 * in the Amazon EC2 Auto Scaling User Guide:
 *
 * https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-purchase-options.html
 *
 * Example:
 * ```
 * Vpc vpc;
 * LaunchTemplate launchTemplate1;
 * LaunchTemplate launchTemplate2;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .mixedInstancesPolicy(MixedInstancesPolicy.builder()
 * .instancesDistribution(InstancesDistribution.builder()
 * .onDemandPercentageAboveBaseCapacity(50)
 * .build())
 * .launchTemplate(launchTemplate1)
 * .launchTemplateOverrides(List.of(LaunchTemplateOverrides.builder().instanceType(new
 * InstanceType("t3.micro")).build(), LaunchTemplateOverrides.builder().instanceType(new
 * InstanceType("t3a.micro")).build(), LaunchTemplateOverrides.builder().instanceType(new
 * InstanceType("t4g.micro")).launchTemplate(launchTemplate2).build()))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class MixedInstancesPolicyDsl {
    private val cdkBuilder: MixedInstancesPolicy.Builder = MixedInstancesPolicy.builder()

    private val _launchTemplateOverrides: MutableList<LaunchTemplateOverrides> = mutableListOf()

    /** @param instancesDistribution InstancesDistribution to use. */
    public fun instancesDistribution(
        instancesDistribution: InstancesDistributionDsl.() -> Unit = {}
    ) {
        val builder = InstancesDistributionDsl()
        builder.apply(instancesDistribution)
        cdkBuilder.instancesDistribution(builder.build())
    }

    /** @param instancesDistribution InstancesDistribution to use. */
    public fun instancesDistribution(instancesDistribution: InstancesDistribution) {
        cdkBuilder.instancesDistribution(instancesDistribution)
    }

    /** @param launchTemplate Launch template to use. */
    public fun launchTemplate(launchTemplate: ILaunchTemplate) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * @param launchTemplateOverrides Launch template overrides. The maximum number of instance
     *   types that can be associated with an Auto Scaling group is 40.
     *
     * The maximum number of distinct launch templates you can define for an Auto Scaling group
     * is 20.
     */
    public fun launchTemplateOverrides(
        launchTemplateOverrides: LaunchTemplateOverridesDsl.() -> Unit
    ) {
        _launchTemplateOverrides.add(
            LaunchTemplateOverridesDsl().apply(launchTemplateOverrides).build()
        )
    }

    /**
     * @param launchTemplateOverrides Launch template overrides. The maximum number of instance
     *   types that can be associated with an Auto Scaling group is 40.
     *
     * The maximum number of distinct launch templates you can define for an Auto Scaling group
     * is 20.
     */
    public fun launchTemplateOverrides(
        launchTemplateOverrides: Collection<LaunchTemplateOverrides>
    ) {
        _launchTemplateOverrides.addAll(launchTemplateOverrides)
    }

    public fun build(): MixedInstancesPolicy {
        if (_launchTemplateOverrides.isNotEmpty())
            cdkBuilder.launchTemplateOverrides(_launchTemplateOverrides)
        return cdkBuilder.build()
    }
}
