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

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun notificationConfig(notificationConfig: IResolvable) {
    cdkBuilder.notificationConfig(notificationConfig)
  }

  public
      fun notificationConfig(notificationConfig: CfnEndpointConfig.AsyncInferenceNotificationConfigProperty) {
    cdkBuilder.notificationConfig(notificationConfig)
  }

  public fun s3FailurePath(s3FailurePath: String) {
    cdkBuilder.s3FailurePath(s3FailurePath)
  }

  public fun s3OutputPath(s3OutputPath: String) {
    cdkBuilder.s3OutputPath(s3OutputPath)
  }

  public fun build(): CfnEndpointConfig.AsyncInferenceOutputConfigProperty = cdkBuilder.build()
}
