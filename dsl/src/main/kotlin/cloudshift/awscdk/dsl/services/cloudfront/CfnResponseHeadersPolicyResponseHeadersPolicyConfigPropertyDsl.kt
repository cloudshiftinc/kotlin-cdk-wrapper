@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@CdkDslMarker
public class CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl {
  private val cdkBuilder: CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder =
      CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.builder()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun corsConfig(corsConfig: IResolvable) {
    cdkBuilder.corsConfig(corsConfig)
  }

  public fun corsConfig(corsConfig: CfnResponseHeadersPolicy.CorsConfigProperty) {
    cdkBuilder.corsConfig(corsConfig)
  }

  public fun customHeadersConfig(customHeadersConfig: IResolvable) {
    cdkBuilder.customHeadersConfig(customHeadersConfig)
  }

  public
      fun customHeadersConfig(customHeadersConfig: CfnResponseHeadersPolicy.CustomHeadersConfigProperty) {
    cdkBuilder.customHeadersConfig(customHeadersConfig)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun removeHeadersConfig(removeHeadersConfig: IResolvable) {
    cdkBuilder.removeHeadersConfig(removeHeadersConfig)
  }

  public
      fun removeHeadersConfig(removeHeadersConfig: CfnResponseHeadersPolicy.RemoveHeadersConfigProperty) {
    cdkBuilder.removeHeadersConfig(removeHeadersConfig)
  }

  public fun securityHeadersConfig(securityHeadersConfig: IResolvable) {
    cdkBuilder.securityHeadersConfig(securityHeadersConfig)
  }

  public
      fun securityHeadersConfig(securityHeadersConfig: CfnResponseHeadersPolicy.SecurityHeadersConfigProperty) {
    cdkBuilder.securityHeadersConfig(securityHeadersConfig)
  }

  public fun serverTimingHeadersConfig(serverTimingHeadersConfig: IResolvable) {
    cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig)
  }

  public
      fun serverTimingHeadersConfig(serverTimingHeadersConfig: CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty) {
    cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig)
  }

  public fun build(): CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty =
      cdkBuilder.build()
}
