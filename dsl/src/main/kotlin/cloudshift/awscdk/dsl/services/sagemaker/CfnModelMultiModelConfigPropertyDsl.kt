@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModel

@CdkDslMarker
public class CfnModelMultiModelConfigPropertyDsl {
  private val cdkBuilder: CfnModel.MultiModelConfigProperty.Builder =
      CfnModel.MultiModelConfigProperty.builder()

  /**
   * @param modelCacheSetting Whether to cache models for a multi-model endpoint.
   * By default, multi-model endpoints cache models so that a model does not have to be loaded into
   * memory each time it is invoked. Some use cases do not benefit from model caching. For example, if
   * an endpoint hosts a large number of models that are each invoked infrequently, the endpoint might
   * perform better if you disable model caching. To disable model caching, set the value of this
   * parameter to Disabled.
   */
  public fun modelCacheSetting(modelCacheSetting: String) {
    cdkBuilder.modelCacheSetting(modelCacheSetting)
  }

  public fun build(): CfnModel.MultiModelConfigProperty = cdkBuilder.build()
}
