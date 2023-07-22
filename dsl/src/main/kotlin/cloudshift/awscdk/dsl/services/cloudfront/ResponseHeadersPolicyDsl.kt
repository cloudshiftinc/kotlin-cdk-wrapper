@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior
import software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior
import software.constructs.Construct

@CdkDslMarker
public class ResponseHeadersPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ResponseHeadersPolicy.Builder =
      ResponseHeadersPolicy.Builder.create(scope, id)

  private val _removeHeaders: MutableList<String> = mutableListOf()

  /**
   * A comment to describe the response headers policy.
   *
   * Default: - no comment
   *
   * @param comment A comment to describe the response headers policy. 
   */
  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  /**
   * A configuration for a set of HTTP response headers that are used for cross-origin resource
   * sharing (CORS).
   *
   * Default: - no cors behavior
   *
   * @param corsBehavior A configuration for a set of HTTP response headers that are used for
   * cross-origin resource sharing (CORS). 
   */
  public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehaviorDsl.() -> Unit = {}) {
    val builder = ResponseHeadersCorsBehaviorDsl()
    builder.apply(corsBehavior)
    cdkBuilder.corsBehavior(builder.build())
  }

  /**
   * A configuration for a set of HTTP response headers that are used for cross-origin resource
   * sharing (CORS).
   *
   * Default: - no cors behavior
   *
   * @param corsBehavior A configuration for a set of HTTP response headers that are used for
   * cross-origin resource sharing (CORS). 
   */
  public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior) {
    cdkBuilder.corsBehavior(corsBehavior)
  }

  /**
   * A configuration for a set of custom HTTP response headers.
   *
   * Default: - no custom headers behavior
   *
   * @param customHeadersBehavior A configuration for a set of custom HTTP response headers. 
   */
  public
      fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehaviorDsl.() -> Unit =
      {}) {
    val builder = ResponseCustomHeadersBehaviorDsl()
    builder.apply(customHeadersBehavior)
    cdkBuilder.customHeadersBehavior(builder.build())
  }

  /**
   * A configuration for a set of custom HTTP response headers.
   *
   * Default: - no custom headers behavior
   *
   * @param customHeadersBehavior A configuration for a set of custom HTTP response headers. 
   */
  public fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior) {
    cdkBuilder.customHeadersBehavior(customHeadersBehavior)
  }

  /**
   * A list of HTTP response headers that CloudFront removes from HTTP responses that it sends to
   * viewers.
   *
   * Default: - no headers are removed
   *
   * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
   * responses that it sends to viewers. 
   */
  public fun removeHeaders(vararg removeHeaders: String) {
    _removeHeaders.addAll(listOf(*removeHeaders))
  }

  /**
   * A list of HTTP response headers that CloudFront removes from HTTP responses that it sends to
   * viewers.
   *
   * Default: - no headers are removed
   *
   * @param removeHeaders A list of HTTP response headers that CloudFront removes from HTTP
   * responses that it sends to viewers. 
   */
  public fun removeHeaders(removeHeaders: Collection<String>) {
    _removeHeaders.addAll(removeHeaders)
  }

  /**
   * A unique name to identify the response headers policy.
   *
   * Default: - generated from the `id`
   *
   * @param responseHeadersPolicyName A unique name to identify the response headers policy. 
   */
  public fun responseHeadersPolicyName(responseHeadersPolicyName: String) {
    cdkBuilder.responseHeadersPolicyName(responseHeadersPolicyName)
  }

  /**
   * A configuration for a set of security-related HTTP response headers.
   *
   * Default: - no security headers behavior
   *
   * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
   * headers. 
   */
  public
      fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehaviorDsl.() -> Unit
      = {}) {
    val builder = ResponseSecurityHeadersBehaviorDsl()
    builder.apply(securityHeadersBehavior)
    cdkBuilder.securityHeadersBehavior(builder.build())
  }

  /**
   * A configuration for a set of security-related HTTP response headers.
   *
   * Default: - no security headers behavior
   *
   * @param securityHeadersBehavior A configuration for a set of security-related HTTP response
   * headers. 
   */
  public fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior) {
    cdkBuilder.securityHeadersBehavior(securityHeadersBehavior)
  }

  /**
   * The percentage of responses that you want CloudFront to add the Server-Timing header to.
   *
   * Default: - no Server-Timing header is added to HTTP responses
   *
   * @param serverTimingSamplingRate The percentage of responses that you want CloudFront to add the
   * Server-Timing header to. 
   */
  public fun serverTimingSamplingRate(serverTimingSamplingRate: Number) {
    cdkBuilder.serverTimingSamplingRate(serverTimingSamplingRate)
  }

  public fun build(): ResponseHeadersPolicy {
    if(_removeHeaders.isNotEmpty()) cdkBuilder.removeHeaders(_removeHeaders)
    return cdkBuilder.build()
  }
}
