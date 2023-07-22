@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A custom response to send to the client.
 *
 * You can define a custom response for rule actions and default web ACL actions that are set to
 * `Block` .
 *
 * For information about customizing web requests and responses, see [Customizing web requests and
 * responses in AWS
 * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CustomResponseProperty customResponseProperty = CustomResponseProperty.builder()
 * .responseCode(123)
 * // the properties below are optional
 * .customResponseBodyKey("customResponseBodyKey")
 * .responseHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponse.html)
 */
@CdkDslMarker
public class CfnRuleGroupCustomResponsePropertyDsl {
  private val cdkBuilder: CfnRuleGroup.CustomResponseProperty.Builder =
      CfnRuleGroup.CustomResponseProperty.builder()

  private val _responseHeaders: MutableList<Any> = mutableListOf()

  /**
   * @param customResponseBodyKey References the response body that you want AWS WAF to return to
   * the web request client.
   * You can define a custom response for a rule action or a default web ACL action that is set to
   * block. To do this, you first define the response body key and value in the `CustomResponseBodies`
   * setting for the `WebACL` or `RuleGroup` where you want to use it. Then, in the rule action or web
   * ACL default action `BlockAction` setting, you reference the response body using this key.
   */
  public fun customResponseBodyKey(customResponseBodyKey: String) {
    cdkBuilder.customResponseBodyKey(customResponseBodyKey)
  }

  /**
   * @param responseCode The HTTP status code to return to the client. 
   * For a list of status codes that you can use in your custom responses, see [Supported status
   * codes for custom
   * response](https://docs.aws.amazon.com/waf/latest/developerguide/customizing-the-response-status-codes.html)
   * in the *AWS WAF Developer Guide* .
   */
  public fun responseCode(responseCode: Number) {
    cdkBuilder.responseCode(responseCode)
  }

  /**
   * @param responseHeaders The HTTP headers to use in the response. Duplicate header names are not
   * allowed.
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun responseHeaders(vararg responseHeaders: Any) {
    _responseHeaders.addAll(listOf(*responseHeaders))
  }

  /**
   * @param responseHeaders The HTTP headers to use in the response. Duplicate header names are not
   * allowed.
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun responseHeaders(responseHeaders: Collection<Any>) {
    _responseHeaders.addAll(responseHeaders)
  }

  /**
   * @param responseHeaders The HTTP headers to use in the response. Duplicate header names are not
   * allowed.
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun responseHeaders(responseHeaders: IResolvable) {
    cdkBuilder.responseHeaders(responseHeaders)
  }

  public fun build(): CfnRuleGroup.CustomResponseProperty {
    if(_responseHeaders.isNotEmpty()) cdkBuilder.responseHeaders(_responseHeaders)
    return cdkBuilder.build()
  }
}
