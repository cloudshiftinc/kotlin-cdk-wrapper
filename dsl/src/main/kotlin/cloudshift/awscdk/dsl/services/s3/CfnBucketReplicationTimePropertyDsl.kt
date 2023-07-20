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

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  public fun time(time: CfnBucket.ReplicationTimeValueProperty) {
    cdkBuilder.time(time)
  }

  public fun build(): CfnBucket.ReplicationTimeProperty = cdkBuilder.build()
}
