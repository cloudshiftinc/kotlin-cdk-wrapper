@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

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
