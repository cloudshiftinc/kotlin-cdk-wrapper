@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.s3.CfnBucket

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
