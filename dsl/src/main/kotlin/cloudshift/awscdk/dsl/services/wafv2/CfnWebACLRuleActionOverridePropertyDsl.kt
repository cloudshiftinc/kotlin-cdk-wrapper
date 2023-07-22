@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Action setting to use in the place of a rule action that is configured inside the rule group.
 *
 * You specify one override for each rule whose action you want to change.
 *
 * You can use overrides for testing, for example you can override all of rule actions to `Count`
 * and then monitor the resulting count metrics to understand how the rule group would handle your web
 * traffic. You can also permanently override some or all actions, to modify how the rule group manages
 * your web traffic.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RuleActionOverrideProperty ruleActionOverrideProperty = RuleActionOverrideProperty.builder()
 * .actionToUse(RuleActionProperty.builder()
 * .allow(AllowActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .block(BlockActionProperty.builder()
 * .customResponse(CustomResponseProperty.builder()
 * .responseCode(123)
 * // the properties below are optional
 * .customResponseBodyKey("customResponseBodyKey")
 * .responseHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .captcha(CaptchaActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .challenge(ChallengeActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .count(CountActionProperty.builder()
 * .customRequestHandling(CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleactionoverride.html)
 */
@CdkDslMarker
public class CfnWebACLRuleActionOverridePropertyDsl {
  private val cdkBuilder: CfnWebACL.RuleActionOverrideProperty.Builder =
      CfnWebACL.RuleActionOverrideProperty.builder()

  /**
   * @param actionToUse The override action to use, in place of the configured action of the rule in
   * the rule group. 
   */
  public fun actionToUse(actionToUse: IResolvable) {
    cdkBuilder.actionToUse(actionToUse)
  }

  /**
   * @param actionToUse The override action to use, in place of the configured action of the rule in
   * the rule group. 
   */
  public fun actionToUse(actionToUse: CfnWebACL.RuleActionProperty) {
    cdkBuilder.actionToUse(actionToUse)
  }

  /**
   * @param name The name of the rule to override. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnWebACL.RuleActionOverrideProperty = cdkBuilder.build()
}
