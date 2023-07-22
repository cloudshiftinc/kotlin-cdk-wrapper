@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

@CdkDslMarker
public class CfnFlowSuccessResponseHandlingConfigPropertyDsl {
  private val cdkBuilder: CfnFlow.SuccessResponseHandlingConfigProperty.Builder =
      CfnFlow.SuccessResponseHandlingConfigProperty.builder()

  /**
   * @param bucketName The name of the Amazon S3 bucket.
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param bucketPrefix The Amazon S3 bucket prefix.
   */
  public fun bucketPrefix(bucketPrefix: String) {
    cdkBuilder.bucketPrefix(bucketPrefix)
  }

  public fun build(): CfnFlow.SuccessResponseHandlingConfigProperty = cdkBuilder.build()
}
