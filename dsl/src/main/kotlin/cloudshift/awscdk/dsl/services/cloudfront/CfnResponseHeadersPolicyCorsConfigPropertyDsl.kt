@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyCorsConfigPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.CorsConfigProperty.Builder =
      CfnResponseHeadersPolicy.CorsConfigProperty.builder()

  public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
    cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
  }

  public fun accessControlAllowCredentials(accessControlAllowCredentials: IResolvable) {
    cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
  }

  public fun accessControlAllowHeaders(accessControlAllowHeaders: IResolvable) {
    cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders)
  }

  public
      fun accessControlAllowHeaders(accessControlAllowHeaders: CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty) {
    cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders)
  }

  public fun accessControlAllowMethods(accessControlAllowMethods: IResolvable) {
    cdkBuilder.accessControlAllowMethods(accessControlAllowMethods)
  }

  public
      fun accessControlAllowMethods(accessControlAllowMethods: CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty) {
    cdkBuilder.accessControlAllowMethods(accessControlAllowMethods)
  }

  public fun accessControlAllowOrigins(accessControlAllowOrigins: IResolvable) {
    cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins)
  }

  public
      fun accessControlAllowOrigins(accessControlAllowOrigins: CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty) {
    cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins)
  }

  public fun accessControlExposeHeaders(accessControlExposeHeaders: IResolvable) {
    cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders)
  }

  public
      fun accessControlExposeHeaders(accessControlExposeHeaders: CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty) {
    cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders)
  }

  public fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number) {
    cdkBuilder.accessControlMaxAgeSec(accessControlMaxAgeSec)
  }

  public fun originOverride(originOverride: Boolean) {
    cdkBuilder.originOverride(originOverride)
  }

  public fun originOverride(originOverride: IResolvable) {
    cdkBuilder.originOverride(originOverride)
  }

  public fun build(): CfnResponseHeadersPolicy.CorsConfigProperty = cdkBuilder.build()
}
