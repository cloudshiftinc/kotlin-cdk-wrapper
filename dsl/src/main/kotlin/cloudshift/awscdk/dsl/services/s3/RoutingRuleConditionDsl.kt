@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.RoutingRuleCondition

/**
 * Example:
 *
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyRedirectedBucket")
 * .websiteRoutingRules(List.of(RoutingRule.builder()
 * .hostName("www.example.com")
 * .httpRedirectCode("302")
 * .protocol(RedirectProtocol.HTTPS)
 * .replaceKey(ReplaceKey.prefixWith("test/"))
 * .condition(RoutingRuleCondition.builder()
 * .httpErrorCodeReturnedEquals("200")
 * .keyPrefixEquals("prefix")
 * .build())
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class RoutingRuleConditionDsl {
  private val cdkBuilder: RoutingRuleCondition.Builder = RoutingRuleCondition.builder()

  /**
   * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
   * In the event of an error, if the error code equals this value, then the specified redirect is
   * applied.
   *
   * If both condition properties are specified, both must be true for the redirect to be applied.
   */
  public fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
    cdkBuilder.httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals)
  }

  /**
   * @param keyPrefixEquals The object key name prefix when the redirect is applied.
   * If both condition properties are specified, both must be true for the redirect to be applied.
   */
  public fun keyPrefixEquals(keyPrefixEquals: String) {
    cdkBuilder.keyPrefixEquals(keyPrefixEquals)
  }

  public fun build(): RoutingRuleCondition = cdkBuilder.build()
}
