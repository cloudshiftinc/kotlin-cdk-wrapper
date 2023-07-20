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
import software.amazon.awscdk.services.autoscaling.InstancesDistribution
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy
import software.amazon.awscdk.services.ec2.ILaunchTemplate
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class MixedInstancesPolicyDsl {
    private val cdkBuilder: MixedInstancesPolicy.Builder = MixedInstancesPolicy.builder()

    private val _launchTemplateOverrides: MutableList<LaunchTemplateOverrides> = mutableListOf()

    public fun instancesDistribution(block: InstancesDistributionDsl.() -> Unit = {}) {
        val builder = InstancesDistributionDsl()
        builder.apply(block)
        cdkBuilder.instancesDistribution(builder.build())
    }

    public fun instancesDistribution(instancesDistribution: InstancesDistribution) {
        cdkBuilder.instancesDistribution(instancesDistribution)
    }

    public fun launchTemplate(launchTemplate: ILaunchTemplate) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun launchTemplateOverrides(launchTemplateOverrides: LaunchTemplateOverridesDsl.() -> Unit) {
        _launchTemplateOverrides.add(LaunchTemplateOverridesDsl().apply(launchTemplateOverrides).build())
    }

    public fun launchTemplateOverrides(launchTemplateOverrides: Collection<LaunchTemplateOverrides>) {
        _launchTemplateOverrides.addAll(launchTemplateOverrides)
    }

    public fun build(): MixedInstancesPolicy {
        if (_launchTemplateOverrides.isNotEmpty()) {
            cdkBuilder.launchTemplateOverrides(_launchTemplateOverrides)
        }
        return cdkBuilder.build()
    }
}
