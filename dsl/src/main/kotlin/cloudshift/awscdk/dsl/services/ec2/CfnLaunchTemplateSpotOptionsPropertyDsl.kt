@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateSpotOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.SpotOptionsProperty.Builder =
      CfnLaunchTemplate.SpotOptionsProperty.builder()

  public fun blockDurationMinutes(blockDurationMinutes: Number) {
    cdkBuilder.blockDurationMinutes(blockDurationMinutes)
  }

  public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
    cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
  }

  public fun maxPrice(maxPrice: String) {
    cdkBuilder.maxPrice(maxPrice)
  }

  public fun spotInstanceType(spotInstanceType: String) {
    cdkBuilder.spotInstanceType(spotInstanceType)
  }

  public fun validUntil(validUntil: String) {
    cdkBuilder.validUntil(validUntil)
  }

  public fun build(): CfnLaunchTemplate.SpotOptionsProperty = cdkBuilder.build()
}
