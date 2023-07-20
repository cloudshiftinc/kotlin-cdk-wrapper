@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketDestinationPropertyDsl {
  private val cdkBuilder: CfnBucket.DestinationProperty.Builder =
      CfnBucket.DestinationProperty.builder()

  public fun bucketAccountId(bucketAccountId: String) {
    cdkBuilder.bucketAccountId(bucketAccountId)
  }

  public fun bucketArn(bucketArn: String) {
    cdkBuilder.bucketArn(bucketArn)
  }

  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnBucket.DestinationProperty = cdkBuilder.build()
}
