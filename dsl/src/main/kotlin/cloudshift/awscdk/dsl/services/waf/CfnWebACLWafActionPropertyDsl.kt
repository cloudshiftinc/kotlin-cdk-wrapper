@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.CfnWebACL

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see [AWS WAF
 * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
 * developer guide.
 *
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
 * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
 * version, AWS WAF has a single set of endpoints for regional and global use.
 *
 *
 * For the action that is associated with a rule in a `WebACL` , specifies the action that you want
 * AWS WAF to perform when a web request matches all of the conditions in a rule. For the default
 * action in a `WebACL` , specifies the action that you want AWS WAF to take when a web request doesn't
 * match all of the conditions in any of the rules in a `WebACL` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * WafActionProperty wafActionProperty = WafActionProperty.builder()
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-webacl-wafaction.html)
 */
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
