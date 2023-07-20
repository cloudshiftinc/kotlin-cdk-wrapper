@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@CdkDslMarker
public class CfnInferenceExperimentShadowModeConfigPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.ShadowModeConfigProperty.Builder =
      CfnInferenceExperiment.ShadowModeConfigProperty.builder()

  private val _shadowModelVariants: MutableList<Any> = mutableListOf()

  public fun shadowModelVariants(vararg shadowModelVariants: Any) {
    _shadowModelVariants.addAll(listOf(*shadowModelVariants))
  }

  public fun shadowModelVariants(shadowModelVariants: Collection<Any>) {
    _shadowModelVariants.addAll(shadowModelVariants)
  }

  public fun shadowModelVariants(shadowModelVariants: IResolvable) {
    cdkBuilder.shadowModelVariants(shadowModelVariants)
  }

  public fun sourceModelVariantName(sourceModelVariantName: String) {
    cdkBuilder.sourceModelVariantName(sourceModelVariantName)
  }

  public fun build(): CfnInferenceExperiment.ShadowModeConfigProperty {
    if(_shadowModelVariants.isNotEmpty()) cdkBuilder.shadowModelVariants(_shadowModelVariants)
    return cdkBuilder.build()
  }
}
