@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTableTargetTrackingScalingPolicyConfigurationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.Builder =
      CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty.builder()

  public fun disableScaleIn(disableScaleIn: Boolean) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun disableScaleIn(disableScaleIn: IResolvable) {
    cdkBuilder.disableScaleIn(disableScaleIn)
  }

  public fun scaleInCooldown(scaleInCooldown: Number) {
    cdkBuilder.scaleInCooldown(scaleInCooldown)
  }

  public fun scaleOutCooldown(scaleOutCooldown: Number) {
    cdkBuilder.scaleOutCooldown(scaleOutCooldown)
  }

  public fun targetValue(targetValue: Number) {
    cdkBuilder.targetValue(targetValue)
  }

  public fun build(): CfnGlobalTable.TargetTrackingScalingPolicyConfigurationProperty =
      cdkBuilder.build()
}
