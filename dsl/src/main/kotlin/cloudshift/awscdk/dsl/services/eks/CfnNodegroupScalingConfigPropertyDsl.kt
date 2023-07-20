@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.eks.CfnNodegroup

@CdkDslMarker
public class CfnNodegroupScalingConfigPropertyDsl {
  private val cdkBuilder: CfnNodegroup.ScalingConfigProperty.Builder =
      CfnNodegroup.ScalingConfigProperty.builder()

  public fun desiredSize(desiredSize: Number) {
    cdkBuilder.desiredSize(desiredSize)
  }

  public fun maxSize(maxSize: Number) {
    cdkBuilder.maxSize(maxSize)
  }

  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  public fun build(): CfnNodegroup.ScalingConfigProperty = cdkBuilder.build()
}
