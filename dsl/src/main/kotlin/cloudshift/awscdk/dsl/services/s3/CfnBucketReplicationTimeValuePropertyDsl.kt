@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication
 * metrics `EventThreshold` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ReplicationTimeValueProperty replicationTimeValueProperty =
 * ReplicationTimeValueProperty.builder()
 * .minutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html)
 */
@CdkDslMarker
public class CfnBucketReplicationTimeValuePropertyDsl {
  private val cdkBuilder: CfnBucket.ReplicationTimeValueProperty.Builder =
      CfnBucket.ReplicationTimeValueProperty.builder()

  /**
   * @param minutes Contains an integer specifying time in minutes. 
   * Valid value: 15
   */
  public fun minutes(minutes: Number) {
    cdkBuilder.minutes(minutes)
  }

  public fun build(): CfnBucket.ReplicationTimeValueProperty = cdkBuilder.build()
}
