@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobS3LocationPropertyDsl {
  private val cdkBuilder: CfnJob.S3LocationProperty.Builder = CfnJob.S3LocationProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun bucketOwner(bucketOwner: String) {
    cdkBuilder.bucketOwner(bucketOwner)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnJob.S3LocationProperty = cdkBuilder.build()
}
