@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sam.CfnHttpApi

@CdkDslMarker
public class CfnHttpApiS3LocationPropertyDsl {
  private val cdkBuilder: CfnHttpApi.S3LocationProperty.Builder =
      CfnHttpApi.S3LocationProperty.builder()

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

  public fun build(): CfnHttpApi.S3LocationProperty = cdkBuilder.build()
}
