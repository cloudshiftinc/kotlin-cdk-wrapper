@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

/**
 * Specifies how Amazon CloudWatch data should be encrypted.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CloudWatchEncryptionProperty cloudWatchEncryptionProperty =
 * CloudWatchEncryptionProperty.builder()
 * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-securityconfiguration-cloudwatchencryption.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationCloudWatchEncryptionPropertyDsl {
  private val cdkBuilder: CfnSecurityConfiguration.CloudWatchEncryptionProperty.Builder =
      CfnSecurityConfiguration.CloudWatchEncryptionProperty.builder()

  /**
   * @param cloudWatchEncryptionMode The encryption mode to use for CloudWatch data.
   */
  public fun cloudWatchEncryptionMode(cloudWatchEncryptionMode: String) {
    cdkBuilder.cloudWatchEncryptionMode(cloudWatchEncryptionMode)
  }

  /**
   * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun build(): CfnSecurityConfiguration.CloudWatchEncryptionProperty = cdkBuilder.build()
}
