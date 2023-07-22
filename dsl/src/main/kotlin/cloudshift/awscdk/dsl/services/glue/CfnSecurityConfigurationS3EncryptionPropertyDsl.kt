@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

@CdkDslMarker
public class CfnSecurityConfigurationS3EncryptionPropertyDsl {
  private val cdkBuilder: CfnSecurityConfiguration.S3EncryptionProperty.Builder =
      CfnSecurityConfiguration.S3EncryptionProperty.builder()

  /**
   * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  /**
   * @param s3EncryptionMode The encryption mode to use for Amazon S3 data.
   */
  public fun s3EncryptionMode(s3EncryptionMode: String) {
    cdkBuilder.s3EncryptionMode(s3EncryptionMode)
  }

  public fun build(): CfnSecurityConfiguration.S3EncryptionProperty = cdkBuilder.build()
}
