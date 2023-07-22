@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLIPSetForwardedIPConfigurationPropertyDsl {
  private val cdkBuilder: CfnWebACL.IPSetForwardedIPConfigurationProperty.Builder =
      CfnWebACL.IPSetForwardedIPConfigurationProperty.builder()

  /**
   * @param fallbackBehavior The match status to assign to the web request if the request doesn't
   * have a valid IP address in the specified position. 
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
   *
   *
   * You can specify the following fallback behaviors:
   *
   * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
   * action to the request.
   * * `NO_MATCH` - Treat the web request as not matching the rule statement.
   */
  public fun fallbackBehavior(fallbackBehavior: String) {
    cdkBuilder.fallbackBehavior(fallbackBehavior)
  }

  /**
   * @param headerName The name of the HTTP header to use for the IP address. 
   * For example, to use the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
   *
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
   */
  public fun headerName(headerName: String) {
    cdkBuilder.headerName(headerName)
  }

  /**
   * @param position The position in the header to search for the IP address. 
   * The header can contain IP addresses of the original client and also of proxies. For example,
   * the header value could be `10.1.1.1, 127.0.0.0, 10.10.10.10` where the first IP address identifies
   * the original client and the rest identify proxies that the request went through.
   *
   * The options for this setting are the following:
   *
   * * FIRST - Inspect the first IP address in the list of IP addresses in the header. This is
   * usually the client's original IP.
   * * LAST - Inspect the last IP address in the list of IP addresses in the header.
   * * ANY - Inspect all IP addresses in the header for a match. If the header contains more than 10
   * IP addresses, AWS WAF inspects the last 10.
   */
  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  public fun build(): CfnWebACL.IPSetForwardedIPConfigurationProperty = cdkBuilder.build()
}
