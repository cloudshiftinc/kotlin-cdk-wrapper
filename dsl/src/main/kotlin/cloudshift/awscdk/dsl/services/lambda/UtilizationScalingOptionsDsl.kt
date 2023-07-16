@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.UtilizationScalingOptions

@CdkDslMarker
public class UtilizationScalingOptionsDsl {
  private val cdkBuilder: UtilizationScalingOptions.Builder = UtilizationScalingOptions.builder()

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

  public fun utilizationTarget(utilizationTarget: Number) {
    cdkBuilder.utilizationTarget(utilizationTarget)
  }

  public fun build(): UtilizationScalingOptions = cdkBuilder.build()
}
