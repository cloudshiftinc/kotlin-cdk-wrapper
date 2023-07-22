@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupGeoMatchStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.GeoMatchStatementProperty.Builder =
      CfnRuleGroup.GeoMatchStatementProperty.builder()

  private val _countryCodes: MutableList<String> = mutableListOf()

  /**
   * @param countryCodes An array of two-character country codes that you want to match against, for
   * example, `[ "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166 international
   * standard.
   * When you use a geo match statement just for the region and country labels that it adds to
   * requests, you still have to supply a country code for the rule to evaluate. In this case, you
   * configure the rule to only count matching requests, but it will still generate logging and count
   * metrics for any matches. You can reduce the logging and metrics that the rule produces by
   * specifying a country that's unlikely to be a source of traffic to your site.
   */
  public fun countryCodes(vararg countryCodes: String) {
    _countryCodes.addAll(listOf(*countryCodes))
  }

  /**
   * @param countryCodes An array of two-character country codes that you want to match against, for
   * example, `[ "US", "CN" ]` , from the alpha-2 country ISO codes of the ISO 3166 international
   * standard.
   * When you use a geo match statement just for the region and country labels that it adds to
   * requests, you still have to supply a country code for the rule to evaluate. In this case, you
   * configure the rule to only count matching requests, but it will still generate logging and count
   * metrics for any matches. You can reduce the logging and metrics that the rule produces by
   * specifying a country that's unlikely to be a source of traffic to your site.
   */
  public fun countryCodes(countryCodes: Collection<String>) {
    _countryCodes.addAll(countryCodes)
  }

  /**
   * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that
   * you specify, instead of using the IP address that's reported by the web request origin.
   * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
   *
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
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
   */
  public fun forwardedIpConfig(forwardedIpConfig: CfnRuleGroup.ForwardedIPConfigurationProperty) {
    cdkBuilder.forwardedIpConfig(forwardedIpConfig)
  }

  public fun build(): CfnRuleGroup.GeoMatchStatementProperty {
    if(_countryCodes.isNotEmpty()) cdkBuilder.countryCodes(_countryCodes)
    return cdkBuilder.build()
  }
}
