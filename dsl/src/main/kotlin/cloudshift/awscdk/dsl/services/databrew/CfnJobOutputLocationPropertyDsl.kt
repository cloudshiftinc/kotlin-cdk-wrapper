@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobOutputLocationPropertyDsl {
  private val cdkBuilder: CfnJob.OutputLocationProperty.Builder =
      CfnJob.OutputLocationProperty.builder()

  /**
   * @param bucket The Amazon S3 bucket name. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param bucketOwner the value to be set.
   */
  public fun bucketOwner(bucketOwner: String) {
    cdkBuilder.bucketOwner(bucketOwner)
  }

  /**
   * @param key The unique name of the object in the bucket.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnJob.OutputLocationProperty = cdkBuilder.build()
}
