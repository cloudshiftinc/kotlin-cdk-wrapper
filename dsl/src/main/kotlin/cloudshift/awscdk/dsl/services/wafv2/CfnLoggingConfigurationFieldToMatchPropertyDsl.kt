@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

/**
 * The parts of the request that you want to keep out of the logs.
 *
 * This is used in the logging configuration `RedactedFields` specification.
 *
 * Example JSON for a `QueryString` field to match:
 *
 * `"FieldToMatch": { "QueryString": {} }`
 *
 * Example JSON for a `Method` field to match specification:
 *
 * `"FieldToMatch": { "Method": { "Name": "DELETE" } }`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object jsonBody;
 * Object method;
 * Object queryString;
 * Object singleHeader;
 * Object uriPath;
 * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
 * .jsonBody(jsonBody)
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .uriPath(uriPath)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationFieldToMatchPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.FieldToMatchProperty.Builder =
      CfnLoggingConfiguration.FieldToMatchProperty.builder()

  /**
   * @param jsonBody Redact the request body JSON.
   */
  public fun jsonBody(jsonBody: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(jsonBody)
    cdkBuilder.jsonBody(builder.map)
  }

  /**
   * @param jsonBody Redact the request body JSON.
   */
  public fun jsonBody(jsonBody: Any) {
    cdkBuilder.jsonBody(jsonBody)
  }

  /**
   * @param method Redact the indicated HTTP method.
   * The method indicates the type of operation that the request is asking the origin to perform.
   */
  public fun method(method: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(method)
    cdkBuilder.method(builder.map)
  }

  /**
   * @param method Redact the indicated HTTP method.
   * The method indicates the type of operation that the request is asking the origin to perform.
   */
  public fun method(method: Any) {
    cdkBuilder.method(method)
  }

  /**
   * @param queryString Redact the query string.
   * This is the part of a URL that appears after a `?` character, if any.
   */
  public fun queryString(queryString: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(queryString)
    cdkBuilder.queryString(builder.map)
  }

  /**
   * @param queryString Redact the query string.
   * This is the part of a URL that appears after a `?` character, if any.
   */
  public fun queryString(queryString: Any) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * @param singleHeader Redact a single header.
   * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
   * setting isn't case sensitive.
   *
   * Example JSON: `"SingleHeader": { "Name": "haystack" }`
   */
  public fun singleHeader(singleHeader: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(singleHeader)
    cdkBuilder.singleHeader(builder.map)
  }

  /**
   * @param singleHeader Redact a single header.
   * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
   * setting isn't case sensitive.
   *
   * Example JSON: `"SingleHeader": { "Name": "haystack" }`
   */
  public fun singleHeader(singleHeader: Any) {
    cdkBuilder.singleHeader(singleHeader)
  }

  /**
   * @param uriPath Redact the request URI path.
   * This is the part of the web request that identifies a resource, for example,
   * `/images/daily-ad.jpg` .
   */
  public fun uriPath(uriPath: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(uriPath)
    cdkBuilder.uriPath(builder.map)
  }

  /**
   * @param uriPath Redact the request URI path.
   * This is the part of the web request that identifies a resource, for example,
   * `/images/daily-ad.jpg` .
   */
  public fun uriPath(uriPath: Any) {
    cdkBuilder.uriPath(uriPath)
  }

  public fun build(): CfnLoggingConfiguration.FieldToMatchProperty = cdkBuilder.build()
}
