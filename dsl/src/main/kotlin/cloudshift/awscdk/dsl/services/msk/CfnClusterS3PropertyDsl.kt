@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * The details of the Amazon S3 destination for broker logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * S3Property s3Property = S3Property.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bucket("bucket")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-s3.html)
 */
@CdkDslMarker
public class CfnClusterS3PropertyDsl {
  private val cdkBuilder: CfnCluster.S3Property.Builder = CfnCluster.S3Property.builder()

  /**
   * @param bucket The name of the S3 bucket that is the destination for broker logs.
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param enabled Specifies whether broker logs get sent to the specified Amazon S3 destination. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether broker logs get sent to the specified Amazon S3 destination. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param prefix The S3 prefix that is the destination for broker logs.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnCluster.S3Property = cdkBuilder.build()
}
