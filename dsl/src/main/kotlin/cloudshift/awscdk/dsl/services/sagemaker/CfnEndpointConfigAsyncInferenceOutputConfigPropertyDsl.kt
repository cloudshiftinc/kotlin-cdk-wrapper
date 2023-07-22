@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigAsyncInferenceOutputConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.AsyncInferenceOutputConfigProperty.Builder =
      CfnEndpointConfig.AsyncInferenceOutputConfigProperty.builder()

  /**
   * @param kmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker uses to
   * encrypt the asynchronous inference output in Amazon S3.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param notificationConfig Specifies the configuration for notifications of inference results
   * for asynchronous inference.
   */
  public fun notificationConfig(notificationConfig: IResolvable) {
    cdkBuilder.notificationConfig(notificationConfig)
  }

  /**
   * @param notificationConfig Specifies the configuration for notifications of inference results
   * for asynchronous inference.
   */
  public
      fun notificationConfig(notificationConfig: CfnEndpointConfig.AsyncInferenceNotificationConfigProperty) {
    cdkBuilder.notificationConfig(notificationConfig)
  }

  /**
   * @param s3FailurePath the value to be set.
   */
  public fun s3FailurePath(s3FailurePath: String) {
    cdkBuilder.s3FailurePath(s3FailurePath)
  }

  /**
   * @param s3OutputPath The Amazon S3 location to upload inference responses to.
   */
  public fun s3OutputPath(s3OutputPath: String) {
    cdkBuilder.s3OutputPath(s3OutputPath)
  }

  public fun build(): CfnEndpointConfig.AsyncInferenceOutputConfigProperty = cdkBuilder.build()
}
