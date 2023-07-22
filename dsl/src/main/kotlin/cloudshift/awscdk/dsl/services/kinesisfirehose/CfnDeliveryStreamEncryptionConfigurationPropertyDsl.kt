@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.EncryptionConfigurationProperty.Builder =
      CfnDeliveryStream.EncryptionConfigurationProperty.builder()

  /**
   * @param kmsEncryptionConfig The AWS Key Management Service ( AWS KMS) encryption key that Amazon
   * S3 uses to encrypt your data.
   */
  public fun kmsEncryptionConfig(kmsEncryptionConfig: IResolvable) {
    cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig)
  }

  /**
   * @param kmsEncryptionConfig The AWS Key Management Service ( AWS KMS) encryption key that Amazon
   * S3 uses to encrypt your data.
   */
  public
      fun kmsEncryptionConfig(kmsEncryptionConfig: CfnDeliveryStream.KMSEncryptionConfigProperty) {
    cdkBuilder.kmsEncryptionConfig(kmsEncryptionConfig)
  }

  /**
   * @param noEncryptionConfig Disables encryption.
   * For valid values, see the `NoEncryptionConfig` content for the
   * [EncryptionConfiguration](https://docs.aws.amazon.com/firehose/latest/APIReference/API_EncryptionConfiguration.html)
   * data type in the *Amazon Kinesis Data Firehose API Reference* .
   */
  public fun noEncryptionConfig(noEncryptionConfig: String) {
    cdkBuilder.noEncryptionConfig(noEncryptionConfig)
  }

  public fun build(): CfnDeliveryStream.EncryptionConfigurationProperty = cdkBuilder.build()
}
