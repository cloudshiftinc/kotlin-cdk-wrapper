@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLRateBasedStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.RateBasedStatementProperty.Builder =
      CfnWebACL.RateBasedStatementProperty.builder()

  /**
   * @param aggregateKeyType Setting that indicates how to aggregate the request counts. The options
   * are the following:. 
   * * `IP` - Aggregate the request counts on the IP address from the web request origin.
   * * `FORWARDED_IP` - Aggregate the request counts on the first IP address in an HTTP header. If
   * you use this, configure the `ForwardedIPConfig` , to specify the header to use.
   *
   *
   * You can only use the `IP` and `FORWARDED_IP` key types.
   */
  public fun aggregateKeyType(aggregateKeyType: String) {
    cdkBuilder.aggregateKeyType(aggregateKeyType)
  }

  /**
   * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that
   * you specify, instead of using the IP address that's reported by the web request origin.
   * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
   *
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
   *
   *
   * This is required if you specify a forwarded IP in the rule's aggregate key settings.
   */
  public fun forwardedIpConfig(forwardedIpConfig: IResolvable) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  /**
   * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that
   * you specify, instead of using the IP address that's reported by the web request origin.
   * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
   *
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
   *
   *
   * This is required if you specify a forwarded IP in the rule's aggregate key settings.
   */
  public fun forwardedIpConfig(forwardedIpConfig: CfnWebACL.ForwardedIPConfigurationProperty) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  /**
   * @param limit The limit on requests per 5-minute period for a single originating IP address. 
   * If the statement includes a `ScopeDownStatement` , this limit is applied only to the requests
   * that match the statement.
   */
  public fun limit(limit: Number) {
    cdkBuilder.limit(limit)
  }

  /**
   * @param scopeDownStatement An optional nested statement that narrows the scope of the web
   * requests that are evaluated by the rate-based statement.
   * Requests are only tracked by the rate-based statement if they match the scope-down statement.
   * You can use any nestable `Statement` in the scope-down statement, and you can nest statements at
   * any level, the same as you can for a rule statement.
   */
  public fun scopeDownStatement(scopeDownStatement: IResolvable) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  /**
   * @param scopeDownStatement An optional nested statement that narrows the scope of the web
   * requests that are evaluated by the rate-based statement.
   * Requests are only tracked by the rate-based statement if they match the scope-down statement.
   * You can use any nestable `Statement` in the scope-down statement, and you can nest statements at
   * any level, the same as you can for a rule statement.
   */
  public fun scopeDownStatement(scopeDownStatement: CfnWebACL.StatementProperty) {
    cdkBuilder.scopeDownStatement(scopeDownStatement)
  }

  public fun build(): CfnWebACL.RateBasedStatementProperty = cdkBuilder.build()
}
