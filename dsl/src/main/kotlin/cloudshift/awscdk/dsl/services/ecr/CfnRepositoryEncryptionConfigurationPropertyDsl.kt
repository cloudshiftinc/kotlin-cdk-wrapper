@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnRepository

@CdkDslMarker
public class CfnRepositoryEncryptionConfigurationPropertyDsl {
  private val cdkBuilder: CfnRepository.EncryptionConfigurationProperty.Builder =
      CfnRepository.EncryptionConfigurationProperty.builder()

  /**
   * @param encryptionType The encryption type to use. 
   * If you use the `KMS` encryption type, the contents of the repository will be encrypted using
   * server-side encryption with AWS Key Management Service key stored in AWS KMS . When you use AWS
   * KMS to encrypt your data, you can either use the default AWS managed AWS KMS key for Amazon ECR,
   * or specify your own AWS KMS key, which you already created. For more information, see [Protecting
   * data using server-side encryption with an AWS KMS key stored in AWS Key Management Service
   * (SSE-KMS)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html) in the *Amazon
   * Simple Storage Service Console Developer Guide* .
   *
   * If you use the `AES256` encryption type, Amazon ECR uses server-side encryption with Amazon
   * S3-managed encryption keys which encrypts the images in the repository using an AES-256 encryption
   * algorithm. For more information, see [Protecting data using server-side encryption with Amazon
   * S3-managed encryption keys
   * (SSE-S3)](https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html) in the
   * *Amazon Simple Storage Service Console Developer Guide* .
   */
  public fun encryptionType(encryptionType: String) {
    cdkBuilder.encryptionType(encryptionType)
  }

  /**
   * @param kmsKey If you use the `KMS` encryption type, specify the AWS KMS key to use for
   * encryption.
   * The alias, key ID, or full ARN of the AWS KMS key can be specified. The key must exist in the
   * same Region as the repository. If no key is specified, the default AWS managed AWS KMS key for
   * Amazon ECR will be used.
   */
  public fun kmsKey(kmsKey: String) {
    cdkBuilder.kmsKey(kmsKey)
  }

  public fun build(): CfnRepository.EncryptionConfigurationProperty = cdkBuilder.build()
}
