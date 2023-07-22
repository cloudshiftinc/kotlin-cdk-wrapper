@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.InstancesDistribution
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
import software.amazon.awscdk.services.autoscaling.MixedInstancesPolicy
import software.amazon.awscdk.services.ec2.ILaunchTemplate

@CdkDslMarker
public class MixedInstancesPolicyDsl {
  private val cdkBuilder: MixedInstancesPolicy.Builder = MixedInstancesPolicy.builder()

  private val _launchTemplateOverrides: MutableList<LaunchTemplateOverrides> = mutableListOf()

  /**
   * @param instancesDistribution InstancesDistribution to use.
   */
  public fun instancesDistribution(instancesDistribution: InstancesDistributionDsl.() -> Unit =
      {}) {
    val builder = InstancesDistributionDsl()
    builder.apply(instancesDistribution)
    cdkBuilder.instancesDistribution(builder.build())
  }

  /**
   * @param instancesDistribution InstancesDistribution to use.
   */
  public fun instancesDistribution(instancesDistribution: InstancesDistribution) {
    cdkBuilder.instancesDistribution(instancesDistribution)
  }

  /**
   * @param launchTemplate Launch template to use. 
   */
  public fun launchTemplate(launchTemplate: ILaunchTemplate) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  /**
   * @param launchTemplateOverrides Launch template overrides.
   * The maximum number of instance types that can be associated with an Auto Scaling group is 40.
   *
   * The maximum number of distinct launch templates you can define for an Auto Scaling group is 20.
   */
  public
      fun launchTemplateOverrides(launchTemplateOverrides: LaunchTemplateOverridesDsl.() -> Unit) {
    _launchTemplateOverrides.add(LaunchTemplateOverridesDsl().apply(launchTemplateOverrides).build())
  }

  /**
   * @param launchTemplateOverrides Launch template overrides.
   * The maximum number of instance types that can be associated with an Auto Scaling group is 40.
   *
   * The maximum number of distinct launch templates you can define for an Auto Scaling group is 20.
   */
  public fun launchTemplateOverrides(launchTemplateOverrides: Collection<LaunchTemplateOverrides>) {
    _launchTemplateOverrides.addAll(launchTemplateOverrides)
  }

  public fun build(): MixedInstancesPolicy {
    if(_launchTemplateOverrides.isNotEmpty())
        cdkBuilder.launchTemplateOverrides(_launchTemplateOverrides)
    return cdkBuilder.build()
  }
}
