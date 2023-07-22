@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketReplicationTimePropertyDsl {
  private val cdkBuilder: CfnBucket.ReplicationTimeProperty.Builder =
      CfnBucket.ReplicationTimeProperty.builder()

  /**
   * @param status Specifies whether the replication time is enabled. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param time A container specifying the time by which replication should be complete for all
   * objects and operations on objects. 
   */
  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  /**
   * @param time A container specifying the time by which replication should be complete for all
   * objects and operations on objects. 
   */
  public fun time(time: CfnBucket.ReplicationTimeValueProperty) {
    cdkBuilder.time(time)
  }

  public fun build(): CfnBucket.ReplicationTimeProperty = cdkBuilder.build()
}
