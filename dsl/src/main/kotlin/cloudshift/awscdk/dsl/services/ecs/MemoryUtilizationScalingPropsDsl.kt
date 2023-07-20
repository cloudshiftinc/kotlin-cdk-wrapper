@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.MemoryUtilizationScalingProps

@CdkDslMarker
public class MemoryUtilizationScalingPropsDsl {
  private val cdkBuilder: MemoryUtilizationScalingProps.Builder =
      MemoryUtilizationScalingProps.builder()

  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun scaleInCooldown(scaleInCooldown: Duration) {
    cdkBuilder.scaleInCooldown(scaleInCooldown)
  }

  public fun scaleOutCooldown(scaleOutCooldown: Duration) {
    cdkBuilder.scaleOutCooldown(scaleOutCooldown)
  }

  public fun targetUtilizationPercent(targetUtilizationPercent: Number) {
    cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
  }

  public fun build(): MemoryUtilizationScalingProps = cdkBuilder.build()
}
