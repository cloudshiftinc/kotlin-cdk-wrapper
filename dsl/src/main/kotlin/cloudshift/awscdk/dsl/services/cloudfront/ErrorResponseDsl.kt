@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.ErrorResponse

/**
 * Options for configuring custom error responses.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.cloudfront.*;
 * ErrorResponse errorResponse = ErrorResponse.builder()
 * .httpStatus(123)
 * // the properties below are optional
 * .responseHttpStatus(123)
 * .responsePagePath("responsePagePath")
 * .ttl(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class ErrorResponseDsl {
  private val cdkBuilder: ErrorResponse.Builder = ErrorResponse.builder()

  /**
   * @param httpStatus The HTTP status code for which you want to specify a custom error page and/or
   * a caching duration. 
   */
  public fun httpStatus(httpStatus: Number) {
    cdkBuilder.httpStatus(httpStatus)
  }

  /**
   * @param responseHttpStatus The HTTP status code that you want CloudFront to return to the viewer
   * along with the custom error page.
   * If you specify a value for `responseHttpStatus`, you must also specify a value for
   * `responsePagePath`.
   */
  public fun responseHttpStatus(responseHttpStatus: Number) {
    cdkBuilder.responseHttpStatus(responseHttpStatus)
  }

  /**
   * @param responsePagePath The path to the custom error page that you want CloudFront to return to
   * a viewer when your origin returns the `httpStatus`, for example, /4xx-errors/403-forbidden.html.
   */
  public fun responsePagePath(responsePagePath: String) {
    cdkBuilder.responsePagePath(responsePagePath)
  }

  /**
   * @param ttl The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP
   * status code specified in ErrorCode.
   */
  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  public fun build(): ErrorResponse = cdkBuilder.build()
}
