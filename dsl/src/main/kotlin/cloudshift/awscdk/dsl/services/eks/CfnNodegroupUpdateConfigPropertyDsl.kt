@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.eks.CfnNodegroup

@CdkDslMarker
public class CfnNodegroupUpdateConfigPropertyDsl {
  private val cdkBuilder: CfnNodegroup.UpdateConfigProperty.Builder =
      CfnNodegroup.UpdateConfigProperty.builder()

  public fun maxUnavailable(maxUnavailable: Number) {
    cdkBuilder.maxUnavailable(maxUnavailable)
  }

  public fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
    cdkBuilder.maxUnavailablePercentage(maxUnavailablePercentage)
  }

  public fun build(): CfnNodegroup.UpdateConfigProperty = cdkBuilder.build()
}
