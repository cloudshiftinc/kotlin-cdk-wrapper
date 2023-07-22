@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.CfnWebACL

@CdkDslMarker
public class CfnWebACLWafActionPropertyDsl {
  private val cdkBuilder: CfnWebACL.WafActionProperty.Builder =
      CfnWebACL.WafActionProperty.builder()

  /**
   * @param type Specifies how you want AWS WAF to respond to requests that match the settings in a
   * `Rule` . 
   * Valid settings include the following:
   *
   * * `ALLOW` : AWS WAF allows requests
   * * `BLOCK` : AWS WAF blocks requests
   * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions in
   * the rule. AWS WAF then continues to inspect the web request based on the remaining rules in the
   * web ACL. You can't specify `COUNT` for the default action for a `WebACL` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnWebACL.WafActionProperty = cdkBuilder.build()
}
