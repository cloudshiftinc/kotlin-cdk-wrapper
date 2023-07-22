@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplatePresignedUrlConfigPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.PresignedUrlConfigProperty.Builder =
      CfnJobTemplate.PresignedUrlConfigProperty.builder()

  /**
   * @param expiresInSec How long (in seconds) pre-signed URLs are valid.
   * Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are generated
   * when Jobs receives an MQTT request for the job document.
   */
  public fun expiresInSec(expiresInSec: Number) {
    cdkBuilder.expiresInSec(expiresInSec)
  }

  /**
   * @param roleArn The ARN of an IAM role that grants grants permission to download files from the
   * S3 bucket where the job data/updates are stored. 
   * The role must also grant permission for IoT to download the files.
   *
   *
   * For information about addressing the confused deputy problem, see [cross-service confused
   * deputy
   * prevention](https://docs.aws.amazon.com/iot/latest/developerguide/cross-service-confused-deputy-prevention.html)
   * in the *AWS IoT Core developer guide* .
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnJobTemplate.PresignedUrlConfigProperty = cdkBuilder.build()
}
