@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.LaunchTemplateOverrides
import software.amazon.awscdk.services.ec2.ILaunchTemplate
import software.amazon.awscdk.services.ec2.InstanceType

@CdkDslMarker
public class LaunchTemplateOverridesDsl {
  private val cdkBuilder: LaunchTemplateOverrides.Builder = LaunchTemplateOverrides.builder()

  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun launchTemplate(launchTemplate: ILaunchTemplate) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  public fun weightedCapacity(weightedCapacity: Number) {
    cdkBuilder.weightedCapacity(weightedCapacity)
  }

  public fun build(): LaunchTemplateOverrides = cdkBuilder.build()
}
