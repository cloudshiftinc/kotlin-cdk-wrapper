@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModel

@CdkDslMarker
public class CfnModelMultiModelConfigPropertyDsl {
  private val cdkBuilder: CfnModel.MultiModelConfigProperty.Builder =
      CfnModel.MultiModelConfigProperty.builder()

  public fun modelCacheSetting(modelCacheSetting: String) {
    cdkBuilder.modelCacheSetting(modelCacheSetting)
  }

  public fun build(): CfnModel.MultiModelConfigProperty = cdkBuilder.build()
}
