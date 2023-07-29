@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * The action that AWS WAF should take on a web request when it matches a rule's statement.
 *
 * Settings at the web ACL level can override the rule action setting.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RuleActionProperty ruleActionProperty = RuleActionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ruleaction.html)
 */
@CdkDslMarker
public class CfnWebACLRuleActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.RuleActionProperty.Builder =
        CfnWebACL.RuleActionProperty.builder()

    /** @param allow Instructs AWS WAF to allow the web request. */
    public fun allow(allow: IResolvable) {
        cdkBuilder.allow(allow)
    }

    /** @param allow Instructs AWS WAF to allow the web request. */
    public fun allow(allow: CfnWebACL.AllowActionProperty) {
        cdkBuilder.allow(allow)
    }

    /** @param block Instructs AWS WAF to block the web request. */
    public fun block(block: IResolvable) {
        cdkBuilder.block(block)
    }

    /** @param block Instructs AWS WAF to block the web request. */
    public fun block(block: CfnWebACL.BlockActionProperty) {
        cdkBuilder.block(block)
    }

    /**
     * @param captcha Specifies that AWS WAF should run a `CAPTCHA` check against the request:.
     * * If the request includes a valid, unexpired `CAPTCHA` token, AWS WAF allows the web request
     *   inspection to proceed to the next rule, similar to a `CountAction` .
     * * If the request doesn't include a valid, unexpired `CAPTCHA` token, AWS WAF discontinues the
     *   web ACL evaluation of the request and blocks it from going to its intended destination.
     *
     * AWS WAF generates a response that it sends back to the client, which includes the following:
     * * The header `x-amzn-waf-action` with a value of `captcha` .
     * * The HTTP status code `405 Method Not Allowed` .
     * * If the request contains an `Accept` header with a value of `text/html` , the response
     *   includes a `CAPTCHA` challenge.
     *
     * You can configure the expiration time in the `CaptchaConfig` `ImmunityTimeProperty` setting
     * at the rule and web ACL level. The rule setting overrides the web ACL setting.
     *
     * This action option is available for rules. It isn't available for web ACL default actions.
     */
    public fun captcha(captcha: IResolvable) {
        cdkBuilder.captcha(captcha)
    }

    /**
     * @param captcha Specifies that AWS WAF should run a `CAPTCHA` check against the request:.
     * * If the request includes a valid, unexpired `CAPTCHA` token, AWS WAF allows the web request
     *   inspection to proceed to the next rule, similar to a `CountAction` .
     * * If the request doesn't include a valid, unexpired `CAPTCHA` token, AWS WAF discontinues the
     *   web ACL evaluation of the request and blocks it from going to its intended destination.
     *
     * AWS WAF generates a response that it sends back to the client, which includes the following:
     * * The header `x-amzn-waf-action` with a value of `captcha` .
     * * The HTTP status code `405 Method Not Allowed` .
     * * If the request contains an `Accept` header with a value of `text/html` , the response
     *   includes a `CAPTCHA` challenge.
     *
     * You can configure the expiration time in the `CaptchaConfig` `ImmunityTimeProperty` setting
     * at the rule and web ACL level. The rule setting overrides the web ACL setting.
     *
     * This action option is available for rules. It isn't available for web ACL default actions.
     */
    public fun captcha(captcha: CfnWebACL.CaptchaActionProperty) {
        cdkBuilder.captcha(captcha)
    }

    /** @param challenge Instructs AWS WAF to run a `Challenge` check against the web request. */
    public fun challenge(challenge: IResolvable) {
        cdkBuilder.challenge(challenge)
    }

    /** @param challenge Instructs AWS WAF to run a `Challenge` check against the web request. */
    public fun challenge(challenge: CfnWebACL.ChallengeActionProperty) {
        cdkBuilder.challenge(challenge)
    }

    /**
     * @param count Instructs AWS WAF to count the web request and then continue evaluating the
     *   request using the remaining rules in the web ACL.
     */
    public fun count(count: IResolvable) {
        cdkBuilder.count(count)
    }

    /**
     * @param count Instructs AWS WAF to count the web request and then continue evaluating the
     *   request using the remaining rules in the web ACL.
     */
    public fun count(count: CfnWebACL.CountActionProperty) {
        cdkBuilder.count(count)
    }

    public fun build(): CfnWebACL.RuleActionProperty = cdkBuilder.build()
}
