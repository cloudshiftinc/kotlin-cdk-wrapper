@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnRestApi

@CdkDslMarker
public class CfnRestApiS3LocationPropertyDsl {
  private val cdkBuilder: CfnRestApi.S3LocationProperty.Builder =
      CfnRestApi.S3LocationProperty.builder()

  /**
   * @param bucket The name of the S3 bucket where the OpenAPI file is stored.
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param eTag The Amazon S3 ETag (a file checksum) of the OpenAPI file.
   * If you don't specify a value, API Gateway skips ETag validation of your OpenAPI file.
   */
  public fun eTag(eTag: String) {
    cdkBuilder.eTag(eTag)
  }

  /**
   * @param key The file name of the OpenAPI file (Amazon S3 object name).
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version For versioning-enabled buckets, a specific version of the OpenAPI file.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnRestApi.S3LocationProperty = cdkBuilder.build()
}
