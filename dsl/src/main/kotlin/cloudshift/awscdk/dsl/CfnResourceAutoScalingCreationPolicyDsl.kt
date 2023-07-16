@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy

@CdkDslMarker
public class CfnResourceAutoScalingCreationPolicyDsl {
  private val cdkBuilder: CfnResourceAutoScalingCreationPolicy.Builder =
      CfnResourceAutoScalingCreationPolicy.builder()

  public fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
    cdkBuilder.minSuccessfulInstancesPercent(minSuccessfulInstancesPercent)
  }

  public fun build(): CfnResourceAutoScalingCreationPolicy = cdkBuilder.build()
}
