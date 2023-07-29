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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

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
 * Object allow;
 * Object block;
 * Object captcha;
 * Object challenge;
 * Object count;
 * RuleActionProperty ruleActionProperty = RuleActionProperty.builder()
 * .allow(allow)
 * .block(block)
 * .captcha(captcha)
 * .challenge(challenge)
 * .count(count)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ruleaction.html)
 */
@CdkDslMarker
public class CfnRuleGroupRuleActionPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RuleActionProperty.Builder =
        CfnRuleGroup.RuleActionProperty.builder()

    /** @param allow Instructs AWS WAF to allow the web request. */
    public fun allow(allow: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(allow)
        cdkBuilder.allow(builder.map)
    }

    /** @param allow Instructs AWS WAF to allow the web request. */
    public fun allow(allow: Any) {
        cdkBuilder.allow(allow)
    }

    /** @param block Instructs AWS WAF to block the web request. */
    public fun block(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.block(builder.map)
    }

    /** @param block Instructs AWS WAF to block the web request. */
    public fun block(block: Any) {
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
    public fun captcha(captcha: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(captcha)
        cdkBuilder.captcha(builder.map)
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
    public fun captcha(captcha: Any) {
        cdkBuilder.captcha(captcha)
    }

    /** @param challenge Instructs AWS WAF to run a `Challenge` check against the web request. */
    public fun challenge(challenge: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(challenge)
        cdkBuilder.challenge(builder.map)
    }

    /** @param challenge Instructs AWS WAF to run a `Challenge` check against the web request. */
    public fun challenge(challenge: Any) {
        cdkBuilder.challenge(challenge)
    }

    /**
     * @param count Instructs AWS WAF to count the web request and then continue evaluating the
     *   request using the remaining rules in the web ACL.
     */
    public fun count(count: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(count)
        cdkBuilder.count(builder.map)
    }

    /**
     * @param count Instructs AWS WAF to count the web request and then continue evaluating the
     *   request using the remaining rules in the web ACL.
     */
    public fun count(count: Any) {
        cdkBuilder.count(count)
    }

    public fun build(): CfnRuleGroup.RuleActionProperty = cdkBuilder.build()
}
