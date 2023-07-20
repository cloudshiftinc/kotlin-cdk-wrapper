@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@CdkDslMarker
public class CfnInferenceExperimentDataStorageConfigPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.DataStorageConfigProperty.Builder =
      CfnInferenceExperiment.DataStorageConfigProperty.builder()

  public fun contentType(contentType: IResolvable) {
    cdkBuilder.contentType(contentType)
  }

  public fun contentType(contentType: CfnInferenceExperiment.CaptureContentTypeHeaderProperty) {
    cdkBuilder.contentType(contentType)
  }

  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): CfnInferenceExperiment.DataStorageConfigProperty = cdkBuilder.build()
}
