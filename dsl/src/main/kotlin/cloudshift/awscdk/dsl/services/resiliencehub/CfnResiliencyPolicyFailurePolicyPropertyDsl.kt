@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.resiliencehub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.resiliencehub.CfnResiliencyPolicy

@CdkDslMarker
public class CfnResiliencyPolicyFailurePolicyPropertyDsl {
  private val cdkBuilder: CfnResiliencyPolicy.FailurePolicyProperty.Builder =
      CfnResiliencyPolicy.FailurePolicyProperty.builder()

  public fun rpoInSecs(rpoInSecs: Number) {
    cdkBuilder.rpoInSecs(rpoInSecs)
  }

  public fun rtoInSecs(rtoInSecs: Number) {
    cdkBuilder.rtoInSecs(rtoInSecs)
  }

  public fun build(): CfnResiliencyPolicy.FailurePolicyProperty = cdkBuilder.build()
}
