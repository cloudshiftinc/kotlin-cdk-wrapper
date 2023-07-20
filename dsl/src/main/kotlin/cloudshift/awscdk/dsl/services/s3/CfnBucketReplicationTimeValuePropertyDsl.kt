@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketReplicationTimeValuePropertyDsl {
  private val cdkBuilder: CfnBucket.ReplicationTimeValueProperty.Builder =
      CfnBucket.ReplicationTimeValueProperty.builder()

  public fun minutes(minutes: Number) {
    cdkBuilder.minutes(minutes)
  }

  public fun build(): CfnBucket.ReplicationTimeValueProperty = cdkBuilder.build()
}
