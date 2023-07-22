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

  /**
   * @param comment A comment to describe the response headers policy.
   * The comment cannot be longer than 128 characters.
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * @param corsConfig A configuration for a set of HTTP response headers that are used for
   * cross-origin resource sharing (CORS).
   */
  public fun corsConfig(corsConfig: IResolvable) {
    cdkBuilder.corsConfig(corsConfig)
  }

  /**
   * @param corsConfig A configuration for a set of HTTP response headers that are used for
   * cross-origin resource sharing (CORS).
   */
  public fun corsConfig(corsConfig: CfnResponseHeadersPolicy.CorsConfigProperty) {
    cdkBuilder.corsConfig(corsConfig)
  }

  /**
   * @param customHeadersConfig A configuration for a set of custom HTTP response headers.
   */
  public fun customHeadersConfig(customHeadersConfig: IResolvable) {
    cdkBuilder.customHeadersConfig(customHeadersConfig)
  }

  /**
   * @param customHeadersConfig A configuration for a set of custom HTTP response headers.
   */
  public
      fun customHeadersConfig(customHeadersConfig: CfnResponseHeadersPolicy.CustomHeadersConfigProperty) {
    cdkBuilder.customHeadersConfig(customHeadersConfig)
  }

  /**
   * @param name A name to identify the response headers policy. 
   * The name must be unique for response headers policies in this AWS account .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the HTTP
   * response.
   */
  public fun removeHeadersConfig(removeHeadersConfig: IResolvable) {
    cdkBuilder.removeHeadersConfig(removeHeadersConfig)
  }

  /**
   * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the HTTP
   * response.
   */
  public
      fun removeHeadersConfig(removeHeadersConfig: CfnResponseHeadersPolicy.RemoveHeadersConfigProperty) {
    cdkBuilder.removeHeadersConfig(removeHeadersConfig)
  }

  /**
   * @param securityHeadersConfig A configuration for a set of security-related HTTP response
   * headers.
   */
  public fun securityHeadersConfig(securityHeadersConfig: IResolvable) {
    cdkBuilder.securityHeadersConfig(securityHeadersConfig)
  }

  /**
   * @param securityHeadersConfig A configuration for a set of security-related HTTP response
   * headers.
   */
  public
      fun securityHeadersConfig(securityHeadersConfig: CfnResponseHeadersPolicy.SecurityHeadersConfigProperty) {
    cdkBuilder.securityHeadersConfig(securityHeadersConfig)
  }

  /**
   * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
   * HTTP responses sent from CloudFront.
   */
  public fun serverTimingHeadersConfig(serverTimingHeadersConfig: IResolvable) {
    cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig)
  }

  /**
   * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
   * HTTP responses sent from CloudFront.
   */
  public
      fun serverTimingHeadersConfig(serverTimingHeadersConfig: CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty) {
    cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig)
  }

  public fun build(): CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty =
      cdkBuilder.build()
}
