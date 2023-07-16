@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.InventoryDestination

@CdkDslMarker
public class InventoryDestinationDsl {
  private val cdkBuilder: InventoryDestination.Builder = InventoryDestination.builder()

  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  public fun bucketOwner(bucketOwner: String) {
    cdkBuilder.bucketOwner(bucketOwner)
  }

  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): InventoryDestination = cdkBuilder.build()
}
