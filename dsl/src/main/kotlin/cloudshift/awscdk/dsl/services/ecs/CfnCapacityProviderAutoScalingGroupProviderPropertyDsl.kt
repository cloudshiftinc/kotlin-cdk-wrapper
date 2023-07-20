@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCapacityProvider

@CdkDslMarker
public class CfnCapacityProviderAutoScalingGroupProviderPropertyDsl {
  private val cdkBuilder: CfnCapacityProvider.AutoScalingGroupProviderProperty.Builder =
      CfnCapacityProvider.AutoScalingGroupProviderProperty.builder()

  public fun autoScalingGroupArn(autoScalingGroupArn: String) {
    cdkBuilder.autoScalingGroupArn(autoScalingGroupArn)
  }

  public fun managedScaling(managedScaling: IResolvable) {
    cdkBuilder.managedScaling(managedScaling)
  }

  public fun managedScaling(managedScaling: CfnCapacityProvider.ManagedScalingProperty) {
    cdkBuilder.managedScaling(managedScaling)
  }

  public fun managedTerminationProtection(managedTerminationProtection: String) {
    cdkBuilder.managedTerminationProtection(managedTerminationProtection)
  }

  public fun build(): CfnCapacityProvider.AutoScalingGroupProviderProperty = cdkBuilder.build()
}
