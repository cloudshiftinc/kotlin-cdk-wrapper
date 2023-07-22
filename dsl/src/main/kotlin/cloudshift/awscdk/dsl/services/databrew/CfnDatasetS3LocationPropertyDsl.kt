@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

@CdkDslMarker
public class CfnDatasetS3LocationPropertyDsl {
  private val cdkBuilder: CfnDataset.S3LocationProperty.Builder =
      CfnDataset.S3LocationProperty.builder()

  /**
   * @param bucket The Amazon S3 bucket name. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key The unique name of the object in the bucket.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun build(): CfnDataset.S3LocationProperty = cdkBuilder.build()
}
