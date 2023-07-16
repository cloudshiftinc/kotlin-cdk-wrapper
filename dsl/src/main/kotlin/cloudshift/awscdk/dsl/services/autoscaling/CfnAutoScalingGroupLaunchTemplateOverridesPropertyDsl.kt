@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupLaunchTemplateOverridesPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder =
      CfnAutoScalingGroup.LaunchTemplateOverridesProperty.builder()

  public fun instanceRequirements(instanceRequirements: IResolvable) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  public
      fun instanceRequirements(instanceRequirements: CfnAutoScalingGroup.InstanceRequirementsProperty) {
    cdkBuilder.instanceRequirements(instanceRequirements)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  public
      fun launchTemplateSpecification(launchTemplateSpecification: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  public fun weightedCapacity(weightedCapacity: String) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): CfnAutoScalingGroup.LaunchTemplateOverridesProperty = cdkBuilder.build()
}
