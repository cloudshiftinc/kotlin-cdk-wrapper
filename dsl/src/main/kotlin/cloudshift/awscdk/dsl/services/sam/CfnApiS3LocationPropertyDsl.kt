@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sam.CfnApi

@CdkDslMarker
public class CfnApiS3LocationPropertyDsl {
  private val cdkBuilder: CfnApi.S3LocationProperty.Builder = CfnApi.S3LocationProperty.builder()

  /**
   * @param bucket the value to be set. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key the value to be set. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version the value to be set. 
   */
  public fun version(version: Number) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApi.S3LocationProperty = cdkBuilder.build()
}
