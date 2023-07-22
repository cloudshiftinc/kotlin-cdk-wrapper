@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * Details about delivering logs to Amazon S3.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * S3LogDeliveryProperty s3LogDeliveryProperty = S3LogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bucket("bucket")
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-s3logdelivery.html)
 */
@CdkDslMarker
public class CfnConnectorS3LogDeliveryPropertyDsl {
  private val cdkBuilder: CfnConnector.S3LogDeliveryProperty.Builder =
      CfnConnector.S3LogDeliveryProperty.builder()

  /**
   * @param bucket The name of the S3 bucket that is the destination for log delivery.
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param enabled Specifies whether connector logs get sent to the specified Amazon S3
   * destination. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether connector logs get sent to the specified Amazon S3
   * destination. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param prefix The S3 prefix that is the destination for log delivery.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnConnector.S3LogDeliveryProperty = cdkBuilder.build()
}
