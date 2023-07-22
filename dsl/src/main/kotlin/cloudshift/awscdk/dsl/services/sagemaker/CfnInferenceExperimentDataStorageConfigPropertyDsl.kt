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

  /**
   * @param contentType Configuration specifying how to treat different headers.
   * If no headers are specified SageMaker will by default base64 encode when capturing the data.
   */
  public fun contentType(contentType: IResolvable) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param contentType Configuration specifying how to treat different headers.
   * If no headers are specified SageMaker will by default base64 encode when capturing the data.
   */
  public fun contentType(contentType: CfnInferenceExperiment.CaptureContentTypeHeaderProperty) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param destination The Amazon S3 bucket where the inference request and response data is
   * stored. 
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param kmsKey The AWS Key Management Service key that Amazon SageMaker uses to encrypt captured
   * data at rest using Amazon S3 server-side encryption.
   */
  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): CfnInferenceExperiment.DataStorageConfigProperty = cdkBuilder.build()
}
