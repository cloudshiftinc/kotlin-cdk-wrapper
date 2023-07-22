@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sam.CfnApi

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .version(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-s3location.html)
 */
@CdkDslMarker
public class CfnApiS3LocationPropertyDsl {
  private val cdkBuilder: CfnApi.S3LocationProperty.Builder = CfnApi.S3LocationProperty.builder()

  /**
   * @param bucket the value to be set. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key the value to be set. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version the value to be set. 
   */
  public fun version(version: Number) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApi.S3LocationProperty = cdkBuilder.build()
}
