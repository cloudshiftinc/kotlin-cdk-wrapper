@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * The part of the web request that you want AWS WAF to inspect.
 *
 * Include the single `FieldToMatch` type that you want to inspect, with additional specifications
 * as needed, according to the type. You specify a single request component in `FieldToMatch` for each
 * rule statement that requires it. To inspect more than one component of the web request, create a
 * separate rule statement for each component.
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
 * Object all;
 * Object allQueryArguments;
 * Object method;
 * Object queryString;
 * Object singleHeader;
 * Object singleQueryArgument;
 * Object uriPath;
 * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html)
 */
@CdkDslMarker
public class CfnRuleGroupFieldToMatchPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.FieldToMatchProperty.Builder =
      CfnRuleGroup.FieldToMatchProperty.builder()

  /**
   * @param allQueryArguments Inspect all query arguments.
   */
  public fun allQueryArguments(allQueryArguments: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(allQueryArguments)
    cdkBuilder.allQueryArguments(builder.map)
  }

  /**
   * @param allQueryArguments Inspect all query arguments.
   */
  public fun allQueryArguments(allQueryArguments: Any) {
    cdkBuilder.allQueryArguments(allQueryArguments)
  }

  /**
   * @param body Inspect the request body as plain text.
   * The request body immediately follows the request headers. This is the part of a request that
   * contains any additional data that you want to send to your web server as the HTTP request body,
   * such as data from a form.
   *
   * A limited amount of the request body is forwarded to AWS WAF for inspection by the underlying
   * host service. For regional resources, the limit is 8 KB (8,192 kilobytes) and for CloudFront
   * distributions, the limit is 16 KB (16,384 kilobytes). For CloudFront distributions, you can
   * increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
   *
   * For information about how to handle oversized request bodies, see the `Body` object
   * configuration.
   */
  public fun body(body: IResolvable) {
    cdkBuilder.body(body)
  }

  /**
   * @param body Inspect the request body as plain text.
   * The request body immediately follows the request headers. This is the part of a request that
   * contains any additional data that you want to send to your web server as the HTTP request body,
   * such as data from a form.
   *
   * A limited amount of the request body is forwarded to AWS WAF for inspection by the underlying
   * host service. For regional resources, the limit is 8 KB (8,192 kilobytes) and for CloudFront
   * distributions, the limit is 16 KB (16,384 kilobytes). For CloudFront distributions, you can
   * increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
   *
   * For information about how to handle oversized request bodies, see the `Body` object
   * configuration.
   */
  public fun body(body: CfnRuleGroup.BodyProperty) {
    cdkBuilder.body(body)
  }

  /**
   * @param cookies Inspect the request cookies.
   * You must configure scope and pattern matching filters in the `Cookies` object, to define the
   * set of cookies and the parts of the cookies that AWS WAF inspects.
   *
   * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
   * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
   * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern matching
   * filters to the cookies that it receives from the underlying host service.
   */
  public fun cookies(cookies: IResolvable) {
    cdkBuilder.cookies(cookies)
  }

  /**
   * @param cookies Inspect the request cookies.
   * You must configure scope and pattern matching filters in the `Cookies` object, to define the
   * set of cookies and the parts of the cookies that AWS WAF inspects.
   *
   * Only the first 8 KB (8192 bytes) of a request's cookies and only the first 200 cookies are
   * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
   * handle any oversize cookie content in the `Cookies` object. AWS WAF applies the pattern matching
   * filters to the cookies that it receives from the underlying host service.
   */
  public fun cookies(cookies: CfnRuleGroup.CookiesProperty) {
    cdkBuilder.cookies(cookies)
  }

  /**
   * @param headers Inspect the request headers.
   * You must configure scope and pattern matching filters in the `Headers` object, to define the
   * set of headers to and the parts of the headers that AWS WAF inspects.
   *
   * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
   * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
   * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern matching
   * filters to the headers that it receives from the underlying host service.
   */
  public fun headers(headers: IResolvable) {
    cdkBuilder.headers(headers)
  }

  /**
   * @param headers Inspect the request headers.
   * You must configure scope and pattern matching filters in the `Headers` object, to define the
   * set of headers to and the parts of the headers that AWS WAF inspects.
   *
   * Only the first 8 KB (8192 bytes) of a request's headers and only the first 200 headers are
   * forwarded to AWS WAF for inspection by the underlying host service. You must configure how to
   * handle any oversize header content in the `Headers` object. AWS WAF applies the pattern matching
   * filters to the headers that it receives from the underlying host service.
   */
  public fun headers(headers: CfnRuleGroup.HeadersProperty) {
    cdkBuilder.headers(headers)
  }

  /**
   * @param jsonBody Inspect the request body as JSON.
   * The request body immediately follows the request headers. This is the part of a request that
   * contains any additional data that you want to send to your web server as the HTTP request body,
   * such as data from a form.
   *
   * A limited amount of the request body is forwarded to AWS WAF for inspection by the underlying
   * host service. For regional resources, the limit is 8 KB (8,192 kilobytes) and for CloudFront
   * distributions, the limit is 16 KB (16,384 kilobytes). For CloudFront distributions, you can
   * increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
   *
   * For information about how to handle oversized request bodies, see the `JsonBody` object
   * configuration.
   */
  public fun jsonBody(jsonBody: IResolvable) {
    cdkBuilder.jsonBody(jsonBody)
  }

  /**
   * @param jsonBody Inspect the request body as JSON.
   * The request body immediately follows the request headers. This is the part of a request that
   * contains any additional data that you want to send to your web server as the HTTP request body,
   * such as data from a form.
   *
   * A limited amount of the request body is forwarded to AWS WAF for inspection by the underlying
   * host service. For regional resources, the limit is 8 KB (8,192 kilobytes) and for CloudFront
   * distributions, the limit is 16 KB (16,384 kilobytes). For CloudFront distributions, you can
   * increase the limit in the web ACL's `AssociationConfig` , for additional processing fees.
   *
   * For information about how to handle oversized request bodies, see the `JsonBody` object
   * configuration.
   */
  public fun jsonBody(jsonBody: CfnRuleGroup.JsonBodyProperty) {
    cdkBuilder.jsonBody(jsonBody)
  }

  /**
   * @param method Inspect the HTTP method.
   * The method indicates the type of operation that the request is asking the origin to perform.
   */
  public fun method(method: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(method)
    cdkBuilder.method(builder.map)
  }

  /**
   * @param method Inspect the HTTP method.
   * The method indicates the type of operation that the request is asking the origin to perform.
   */
  public fun method(method: Any) {
    cdkBuilder.method(method)
  }

  /**
   * @param queryString Inspect the query string.
   * This is the part of a URL that appears after a `?` character, if any.
   */
  public fun queryString(queryString: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(queryString)
    cdkBuilder.queryString(builder.map)
  }

  /**
   * @param queryString Inspect the query string.
   * This is the part of a URL that appears after a `?` character, if any.
   */
  public fun queryString(queryString: Any) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * @param singleHeader Inspect a single header.
   * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
   * setting isn't case sensitive.
   *
   * Example JSON: `"SingleHeader": { "Name": "haystack" }`
   *
   * Alternately, you can filter and inspect all headers with the `Headers` `FieldToMatch` setting.
   */
  public fun singleHeader(singleHeader: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(singleHeader)
    cdkBuilder.singleHeader(builder.map)
  }

  /**
   * @param singleHeader Inspect a single header.
   * Provide the name of the header to inspect, for example, `User-Agent` or `Referer` . This
   * setting isn't case sensitive.
   *
   * Example JSON: `"SingleHeader": { "Name": "haystack" }`
   *
   * Alternately, you can filter and inspect all headers with the `Headers` `FieldToMatch` setting.
   */
  public fun singleHeader(singleHeader: Any) {
    cdkBuilder.singleHeader(singleHeader)
  }

  /**
   * @param singleQueryArgument Inspect a single query argument.
   * Provide the name of the query argument to inspect, such as *UserName* or *SalesRegion* . The
   * name can be up to 30 characters long and isn't case sensitive.
   *
   * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
   */
  public fun singleQueryArgument(singleQueryArgument: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(singleQueryArgument)
    cdkBuilder.singleQueryArgument(builder.map)
  }

  /**
   * @param singleQueryArgument Inspect a single query argument.
   * Provide the name of the query argument to inspect, such as *UserName* or *SalesRegion* . The
   * name can be up to 30 characters long and isn't case sensitive.
   *
   * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
   */
  public fun singleQueryArgument(singleQueryArgument: Any) {
    cdkBuilder.singleQueryArgument(singleQueryArgument)
  }

  /**
   * @param uriPath Inspect the request URI path.
   * This is the part of the web request that identifies a resource, for example,
   * `/images/daily-ad.jpg` .
   */
  public fun uriPath(uriPath: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(uriPath)
    cdkBuilder.uriPath(builder.map)
  }

  /**
   * @param uriPath Inspect the request URI path.
   * This is the part of the web request that identifies a resource, for example,
   * `/images/daily-ad.jpg` .
   */
  public fun uriPath(uriPath: Any) {
    cdkBuilder.uriPath(uriPath)
  }

  public fun build(): CfnRuleGroup.FieldToMatchProperty = cdkBuilder.build()
}
