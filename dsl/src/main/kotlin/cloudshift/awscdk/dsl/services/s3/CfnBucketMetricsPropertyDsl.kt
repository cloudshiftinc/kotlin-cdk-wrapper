@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketMetricsPropertyDsl {
  private val cdkBuilder: CfnBucket.MetricsProperty.Builder = CfnBucket.MetricsProperty.builder()

  /**
   * @param eventThreshold A container specifying the time threshold for emitting the
   * `s3:Replication:OperationMissedThreshold` event.
   */
  public fun eventThreshold(eventThreshold: IResolvable) {
    cdkBuilder.eventThreshold(eventThreshold)
  }

  /**
   * @param eventThreshold A container specifying the time threshold for emitting the
   * `s3:Replication:OperationMissedThreshold` event.
   */
  public fun eventThreshold(eventThreshold: CfnBucket.ReplicationTimeValueProperty) {
    cdkBuilder.eventThreshold(eventThreshold)
  }

  /**
   * @param status Specifies whether the replication metrics are enabled. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnBucket.MetricsProperty = cdkBuilder.build()
}
