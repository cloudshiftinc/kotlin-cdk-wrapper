@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.MTLSConfig
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class MTLSConfigDsl {
  private val cdkBuilder: MTLSConfig.Builder = MTLSConfig.builder()

  /**
   * @param bucket The bucket that the trust store is hosted in. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param key The key in S3 to look at for the trust store. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version The version of the S3 object that contains your truststore.
   * To specify a version, you must have versioning enabled for the S3 bucket.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): MTLSConfig = cdkBuilder.build()
}
