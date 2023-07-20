@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModel

@CdkDslMarker
public class CfnModelInferenceExecutionConfigPropertyDsl {
  private val cdkBuilder: CfnModel.InferenceExecutionConfigProperty.Builder =
      CfnModel.InferenceExecutionConfigProperty.builder()

  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnModel.InferenceExecutionConfigProperty = cdkBuilder.build()
}
