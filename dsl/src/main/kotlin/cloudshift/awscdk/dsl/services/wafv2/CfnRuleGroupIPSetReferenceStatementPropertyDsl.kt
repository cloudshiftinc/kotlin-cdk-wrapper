@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A rule statement used to detect web requests coming from particular IP addresses or address
 * ranges.
 *
 * To use this, create an `IPSet` that specifies the addresses you want to detect, then use the ARN
 * of that set in this statement.
 *
 * Each IP set rule statement references an IP set. You create and maintain the set independent of
 * your rules. This allows you to use the single set in multiple rules. When you update the referenced
 * set, AWS WAF automatically updates all rules that reference it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * IPSetReferenceStatementProperty iPSetReferenceStatementProperty = Map.of(
 * "arn", "arn",
 * // the properties below are optional
 * "ipSetForwardedIpConfig", Map.of(
 * "fallbackBehavior", "fallbackBehavior",
 * "headerName", "headerName",
 * "position", "position"));
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html)
 */
@CdkDslMarker
public class CfnRuleGroupIPSetReferenceStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.IPSetReferenceStatementProperty.Builder =
      CfnRuleGroup.IPSetReferenceStatementProperty.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the `IPSet` that this statement references. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
   * that you specify, instead of using the IP address that's reported by the web request origin.
   * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
   *
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
   */
  public fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: IResolvable) {
    cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig)
  }

  /**
   * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP header
   * that you specify, instead of using the IP address that's reported by the web request origin.
   * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
   *
   *
   * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
   * request at all.
   */
  public
      fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: CfnRuleGroup.IPSetForwardedIPConfigurationProperty) {
    cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig)
  }

  public fun build(): CfnRuleGroup.IPSetReferenceStatementProperty = cdkBuilder.build()
}
