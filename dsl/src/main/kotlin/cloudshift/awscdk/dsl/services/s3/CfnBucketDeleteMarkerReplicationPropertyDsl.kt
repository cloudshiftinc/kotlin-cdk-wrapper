@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketDeleteMarkerReplicationPropertyDsl {
  private val cdkBuilder: CfnBucket.DeleteMarkerReplicationProperty.Builder =
      CfnBucket.DeleteMarkerReplicationProperty.builder()

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnBucket.DeleteMarkerReplicationProperty = cdkBuilder.build()
}
