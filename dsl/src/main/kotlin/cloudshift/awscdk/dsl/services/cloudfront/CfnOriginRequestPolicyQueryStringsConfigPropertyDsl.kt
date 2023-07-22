@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

/**
 * An object that determines whether any URL query strings in viewer requests (and if so, which
 * query strings) are included in requests that CloudFront sends to the origin.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * QueryStringsConfigProperty queryStringsConfigProperty = QueryStringsConfigProperty.builder()
 * .queryStringBehavior("queryStringBehavior")
 * // the properties below are optional
 * .queryStrings(List.of("queryStrings"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-querystringsconfig.html)
 */
@CdkDslMarker
public class CfnOriginRequestPolicyQueryStringsConfigPropertyDsl {
  private val cdkBuilder: CfnOriginRequestPolicy.QueryStringsConfigProperty.Builder =
      CfnOriginRequestPolicy.QueryStringsConfigProperty.builder()

  private val _queryStrings: MutableList<String> = mutableListOf()

  /**
   * @param queryStringBehavior Determines whether any URL query strings in viewer requests are
   * included in requests that CloudFront sends to the origin. 
   * Valid values are:
   *
   * * `none` – No query strings in viewer requests are included in requests that CloudFront sends
   * to the origin. Even when this field is set to `none` , any query strings that are listed in a
   * `CachePolicy` *are* included in origin requests.
   * * `whitelist` – Only the query strings in viewer requests that are listed in the
   * `QueryStringNames` type are included in requests that CloudFront sends to the origin.
   * * `all` – All query strings in viewer requests are included in requests that CloudFront sends
   * to the origin.
   * * `allExcept` – All query strings in viewer requests are included in requests that CloudFront
   * sends to the origin, **except** for those listed in the `QueryStringNames` type, which are not
   * included.
   */
  public fun queryStringBehavior(queryStringBehavior: String) {
    cdkBuilder.queryStringBehavior(queryStringBehavior)
  }

  /**
   * @param queryStrings Contains a list of query string names.
   */
  public fun queryStrings(vararg queryStrings: String) {
    _queryStrings.addAll(listOf(*queryStrings))
  }

  /**
   * @param queryStrings Contains a list of query string names.
   */
  public fun queryStrings(queryStrings: Collection<String>) {
    _queryStrings.addAll(queryStrings)
  }

  public fun build(): CfnOriginRequestPolicy.QueryStringsConfigProperty {
    if(_queryStrings.isNotEmpty()) cdkBuilder.queryStrings(_queryStrings)
    return cdkBuilder.build()
  }
}
