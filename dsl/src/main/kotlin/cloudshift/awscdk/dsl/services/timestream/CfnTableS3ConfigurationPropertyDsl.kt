@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.timestream.CfnTable

/**
 * The configuration that specifies an S3 location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .objectKeyPrefix("objectKeyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html)
 */
@CdkDslMarker
public class CfnTableS3ConfigurationPropertyDsl {
  private val cdkBuilder: CfnTable.S3ConfigurationProperty.Builder =
      CfnTable.S3ConfigurationProperty.builder()

  /**
   * @param bucketName The bucket name of the customer S3 bucket. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  /**
   * @param encryptionOption The encryption option for the customer S3 location. 
   * Options are S3 server-side encryption with an S3 managed key or AWS managed key.
   */
  public fun encryptionOption(encryptionOption: String) {
    cdkBuilder.encryptionOption(encryptionOption)
  }

  /**
   * @param kmsKeyId The AWS KMS key ID for the customer S3 location when encrypting with an AWS
   * managed key.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param objectKeyPrefix The object key preview for the customer S3 location.
   */
  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  public fun build(): CfnTable.S3ConfigurationProperty = cdkBuilder.build()
}
