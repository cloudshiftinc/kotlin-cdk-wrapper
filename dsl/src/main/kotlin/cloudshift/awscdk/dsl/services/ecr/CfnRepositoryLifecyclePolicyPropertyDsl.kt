@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnRepository

@CdkDslMarker
public class CfnRepositoryLifecyclePolicyPropertyDsl {
  private val cdkBuilder: CfnRepository.LifecyclePolicyProperty.Builder =
      CfnRepository.LifecyclePolicyProperty.builder()

  public fun lifecyclePolicyText(lifecyclePolicyText: String) {
    cdkBuilder.lifecyclePolicyText(lifecyclePolicyText)
  }

  public fun registryId(registryId: String) {
    cdkBuilder.registryId(registryId)
  }

  public fun build(): CfnRepository.LifecyclePolicyProperty = cdkBuilder.build()
}
