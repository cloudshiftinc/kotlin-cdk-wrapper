@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

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
