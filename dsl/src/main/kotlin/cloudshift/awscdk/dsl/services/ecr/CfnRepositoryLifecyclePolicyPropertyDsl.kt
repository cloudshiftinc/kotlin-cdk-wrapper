@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnRepository

@CdkDslMarker
public class CfnRepositoryLifecyclePolicyPropertyDsl {
  private val cdkBuilder: CfnRepository.LifecyclePolicyProperty.Builder =
      CfnRepository.LifecyclePolicyProperty.builder()

  /**
   * @param lifecyclePolicyText The JSON repository policy text to apply to the repository.
   */
  public fun lifecyclePolicyText(lifecyclePolicyText: String) {
    cdkBuilder.lifecyclePolicyText(lifecyclePolicyText)
  }

  /**
   * @param registryId The AWS account ID associated with the registry that contains the repository.
   * If you do not specify a registry, the default registry is assumed.
   */
  public fun registryId(registryId: String) {
    cdkBuilder.registryId(registryId)
  }

  public fun build(): CfnRepository.LifecyclePolicyProperty = cdkBuilder.build()
}
