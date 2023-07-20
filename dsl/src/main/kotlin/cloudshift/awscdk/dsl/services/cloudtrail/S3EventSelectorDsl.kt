@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudtrail.S3EventSelector
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class S3EventSelectorDsl {
  private val cdkBuilder: S3EventSelector.Builder = S3EventSelector.builder()

  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  public fun objectPrefix(objectPrefix: String) {
    cdkBuilder.objectPrefix(objectPrefix)
  }

  public fun build(): S3EventSelector = cdkBuilder.build()
}
