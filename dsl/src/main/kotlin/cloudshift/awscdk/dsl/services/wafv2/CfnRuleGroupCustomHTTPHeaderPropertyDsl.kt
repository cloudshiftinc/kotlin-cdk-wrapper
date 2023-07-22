@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A custom header for custom request and response handling.
 *
 * This is used in `CustomResponse` and `CustomRequestHandling`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CustomHTTPHeaderProperty customHTTPHeaderProperty = CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customhttpheader.html)
 */
@CdkDslMarker
public class CfnRuleGroupCustomHTTPHeaderPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.CustomHTTPHeaderProperty.Builder =
      CfnRuleGroup.CustomHTTPHeaderProperty.builder()

  /**
   * @param name The name of the custom header. 
   * For custom request header insertion, when AWS WAF inserts the header into the request, it
   * prefixes this name `x-amzn-waf-` , to avoid confusion with the headers that are already in the
   * request. For example, for the header name `sample` , AWS WAF inserts the header
   * `x-amzn-waf-sample` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the custom header. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRuleGroup.CustomHTTPHeaderProperty = cdkBuilder.build()
}
