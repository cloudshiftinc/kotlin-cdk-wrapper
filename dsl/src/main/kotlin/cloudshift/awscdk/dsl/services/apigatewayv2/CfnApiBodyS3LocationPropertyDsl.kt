@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnApi

@CdkDslMarker
public class CfnApiBodyS3LocationPropertyDsl {
  private val cdkBuilder: CfnApi.BodyS3LocationProperty.Builder =
      CfnApi.BodyS3LocationProperty.builder()

  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  public fun etag(etag: String) {
    cdkBuilder.etag(etag)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApi.BodyS3LocationProperty = cdkBuilder.build()
}
