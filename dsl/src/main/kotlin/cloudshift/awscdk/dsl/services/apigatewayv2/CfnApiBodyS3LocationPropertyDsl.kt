@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnApi

/**
 * The `BodyS3Location` property specifies an S3 location from which to import an OpenAPI
 * definition.
 *
 * Supported only for HTTP APIs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * BodyS3LocationProperty bodyS3LocationProperty = BodyS3LocationProperty.builder()
 * .bucket("bucket")
 * .etag("etag")
 * .key("key")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html)
 */
@CdkDslMarker
public class CfnApiBodyS3LocationPropertyDsl {
  private val cdkBuilder: CfnApi.BodyS3LocationProperty.Builder =
      CfnApi.BodyS3LocationProperty.builder()

  /**
   * @param bucket The S3 bucket that contains the OpenAPI definition to import.
   * Required if you specify a `BodyS3Location` for an API.
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param etag The Etag of the S3 object.
   */
  public fun etag(etag: String) {
    cdkBuilder.etag(etag)
  }

  /**
   * @param key The key of the S3 object.
   * Required if you specify a `BodyS3Location` for an API.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param version The version of the S3 object.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApi.BodyS3LocationProperty = cdkBuilder.build()
}
