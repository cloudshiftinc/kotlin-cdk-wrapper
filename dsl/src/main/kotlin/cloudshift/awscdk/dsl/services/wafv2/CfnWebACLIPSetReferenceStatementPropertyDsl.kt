@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLIPSetReferenceStatementPropertyDsl {
  private val cdkBuilder: CfnWebACL.IPSetReferenceStatementProperty.Builder =
      CfnWebACL.IPSetReferenceStatementProperty.builder()

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
      fun ipSetForwardedIpConfig(ipSetForwardedIpConfig: CfnWebACL.IPSetForwardedIPConfigurationProperty) {
    cdkBuilder.ipSetForwardedIpConfig(ipSetForwardedIpConfig)
  }

  public fun build(): CfnWebACL.IPSetReferenceStatementProperty = cdkBuilder.build()
}
