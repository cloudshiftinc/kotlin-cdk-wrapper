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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.constructs.Construct

/**
 * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
 *
 * For information, including how to migrate your AWS WAF resources from the prior release, see the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * .
 *
 * Use an `RuleGroup` to define a collection of rules for inspecting and controlling web requests.
 * You use a rule group in an `WebACL` by providing its Amazon Resource Name (ARN) to the rule
 * statement `RuleGroupReferenceStatement` , when you add rules to the web ACL.
 *
 * When you create a rule group, you define an immutable capacity limit. If you update a rule group,
 * you must stay within the capacity. This allows others to reuse the rule group with confidence in
 * its capacity requirements.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object all;
 * Object allow;
 * Object allQueryArguments;
 * Object block;
 * Object captcha;
 * Object challenge;
 * Object count;
 * Object forwardedIp;
 * Object httpMethod;
 * Object ip;
 * Object method;
 * Object queryString;
 * Object singleHeader;
 * Object singleQueryArgument;
 * StatementProperty statementProperty_;
 * Object uriPath;
 * CfnRuleGroup cfnRuleGroup = CfnRuleGroup.Builder.create(this, "MyCfnRuleGroup")
 * .capacity(123)
 * .scope("scope")
 * .visibilityConfig(VisibilityConfigProperty.builder()
 * .cloudWatchMetricsEnabled(false)
 * .metricName("metricName")
 * .sampledRequestsEnabled(false)
 * .build())
 * // the properties below are optional
 * .availableLabels(List.of(LabelSummaryProperty.builder()
 * .name("name")
 * .build()))
 * .consumedLabels(List.of(LabelSummaryProperty.builder()
 * .name("name")
 * .build()))
 * .customResponseBodies(Map.of(
 * "customResponseBodiesKey", CustomResponseBodyProperty.builder()
 * .content("content")
 * .contentType("contentType")
 * .build()))
 * .description("description")
 * .name("name")
 * .rules(List.of(RuleProperty.builder()
 * .name("name")
 * .priority(123)
 * .statement(StatementProperty.builder()
 * .andStatement(AndStatementProperty.builder()
 * .statements(List.of(statementProperty_))
 * .build())
 * .byteMatchStatement(ByteMatchStatementProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .positionalConstraint("positionalConstraint")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .searchString("searchString")
 * .searchStringBase64("searchStringBase64")
 * .build())
 * .geoMatchStatement(GeoMatchStatementProperty.builder()
 * .countryCodes(List.of("countryCodes"))
 * .forwardedIpConfig(ForwardedIPConfigurationProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
 * .headerName("headerName")
 * .build())
 * .build())
 * .ipSetReferenceStatement(Map.of(
 * "arn", "arn",
 * // the properties below are optional
 * "ipSetForwardedIpConfig", Map.of(
 * "fallbackBehavior", "fallbackBehavior",
 * "headerName", "headerName",
 * "position", "position")))
 * .labelMatchStatement(LabelMatchStatementProperty.builder()
 * .key("key")
 * .scope("scope")
 * .build())
 * .notStatement(NotStatementProperty.builder()
 * .statement(statementProperty_)
 * .build())
 * .orStatement(OrStatementProperty.builder()
 * .statements(List.of(statementProperty_))
 * .build())
 * .rateBasedStatement(RateBasedStatementProperty.builder()
 * .aggregateKeyType("aggregateKeyType")
 * .limit(123)
 * // the properties below are optional
 * .customKeys(List.of(RateBasedStatementCustomKeyProperty.builder()
 * .cookie(RateLimitCookieProperty.builder()
 * .name("name")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .forwardedIp(forwardedIp)
 * .header(RateLimitHeaderProperty.builder()
 * .name("name")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .httpMethod(httpMethod)
 * .ip(ip)
 * .labelNamespace(RateLimitLabelNamespaceProperty.builder()
 * .namespace("namespace")
 * .build())
 * .queryArgument(RateLimitQueryArgumentProperty.builder()
 * .name("name")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .queryString(RateLimitQueryStringProperty.builder()
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .uriPath(RateLimitUriPathProperty.builder()
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .build()))
 * .forwardedIpConfig(ForwardedIPConfigurationProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
 * .headerName("headerName")
 * .build())
 * .scopeDownStatement(statementProperty_)
 * .build())
 * .regexMatchStatement(RegexMatchStatementProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .regexString("regexString")
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .regexPatternSetReferenceStatement(RegexPatternSetReferenceStatementProperty.builder()
 * .arn("arn")
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .sizeConstraintStatement(SizeConstraintStatementProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .size(123)
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .sqliMatchStatement(SqliMatchStatementProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .sensitivityLevel("sensitivityLevel")
 * .build())
 * .xssMatchStatement(XssMatchStatementProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .allQueryArguments(allQueryArguments)
 * .body(BodyProperty.builder()
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .cookies(CookiesProperty.builder()
 * .matchPattern(CookieMatchPatternProperty.builder()
 * .all(all)
 * .excludedCookies(List.of("excludedCookies"))
 * .includedCookies(List.of("includedCookies"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .headers(HeadersProperty.builder()
 * .matchPattern(HeaderMatchPatternProperty.builder()
 * .all(all)
 * .excludedHeaders(List.of("excludedHeaders"))
 * .includedHeaders(List.of("includedHeaders"))
 * .build())
 * .matchScope("matchScope")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .jsonBody(JsonBodyProperty.builder()
 * .matchPattern(JsonMatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build())
 * .matchScope("matchScope")
 * // the properties below are optional
 * .invalidFallbackBehavior("invalidFallbackBehavior")
 * .oversizeHandling("oversizeHandling")
 * .build())
 * .method(method)
 * .queryString(queryString)
 * .singleHeader(singleHeader)
 * .singleQueryArgument(singleQueryArgument)
 * .uriPath(uriPath)
 * .build())
 * .textTransformations(List.of(TextTransformationProperty.builder()
 * .priority(123)
 * .type("type")
 * .build()))
 * .build())
 * .build())
 * .visibilityConfig(VisibilityConfigProperty.builder()
 * .cloudWatchMetricsEnabled(false)
 * .metricName("metricName")
 * .sampledRequestsEnabled(false)
 * .build())
 * // the properties below are optional
 * .action(RuleActionProperty.builder()
 * .allow(allow)
 * .block(block)
 * .captcha(captcha)
 * .challenge(challenge)
 * .count(count)
 * .build())
 * .captchaConfig(CaptchaConfigProperty.builder()
 * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
 * .immunityTime(123)
 * .build())
 * .build())
 * .challengeConfig(ChallengeConfigProperty.builder()
 * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
 * .immunityTime(123)
 * .build())
 * .build())
 * .ruleLabels(List.of(LabelProperty.builder()
 * .name("name")
 * .build()))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html)
 */
@CdkDslMarker
public class CfnRuleGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRuleGroup.Builder = CfnRuleGroup.Builder.create(scope, id)

    private val _availableLabels: MutableList<Any> = mutableListOf()

    private val _consumedLabels: MutableList<Any> = mutableListOf()

    private val _rules: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     *
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     *   web requests.
     */
    public fun availableLabels(vararg availableLabels: Any) {
        _availableLabels.addAll(listOf(*availableLabels))
    }

    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     *
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     *   web requests.
     */
    public fun availableLabels(availableLabels: Collection<Any>) {
        _availableLabels.addAll(availableLabels)
    }

    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     *
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     *   web requests.
     */
    public fun availableLabels(availableLabels: IResolvable) {
        cdkBuilder.availableLabels(availableLabels)
    }

    /**
     * The web ACL capacity units (WCUs) required for this rule group.
     *
     * When you create your own rule group, you define this, and you cannot change it after
     * creation. When you add or modify the rules in a rule group, AWS WAF enforces this limit.
     *
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
     * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type,
     * to reflect the relative cost of each rule. Simple rules that cost little to run use fewer
     * WCUs than more complex rules that use more processing power. Rule group capacity is fixed at
     * creation, which helps users plan their web ACL WCU usage when they use a rule group. The WCU
     * limit for web ACLs is 1,500.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-capacity)
     *
     * @param capacity The web ACL capacity units (WCUs) required for this rule group.
     */
    public fun capacity(capacity: Number) {
        cdkBuilder.capacity(capacity)
    }

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     *
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     *   label match statements.
     */
    public fun consumedLabels(vararg consumedLabels: Any) {
        _consumedLabels.addAll(listOf(*consumedLabels))
    }

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     *
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     *   label match statements.
     */
    public fun consumedLabels(consumedLabels: Collection<Any>) {
        _consumedLabels.addAll(consumedLabels)
    }

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     *
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     *   label match statements.
     */
    public fun consumedLabels(consumedLabels: IResolvable) {
        cdkBuilder.consumedLabels(consumedLabels)
    }

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define
     * in the rule group.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-customresponsebodies)
     *
     * @param customResponseBodies A map of custom response keys and content bodies.
     */
    public fun customResponseBodies(customResponseBodies: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(customResponseBodies)
        cdkBuilder.customResponseBodies(builder.map)
    }

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define
     * in the rule group.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-customresponsebodies)
     *
     * @param customResponseBodies A map of custom response keys and content bodies.
     */
    public fun customResponseBodies(customResponseBodies: Map<String, Any>) {
        cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define
     * in the rule group.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in
     * the *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-customresponsebodies)
     *
     * @param customResponseBodies A map of custom response keys and content bodies.
     */
    public fun customResponseBodies(customResponseBodies: IResolvable) {
        cdkBuilder.customResponseBodies(customResponseBodies)
    }

    /**
     * A description of the rule group that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-description)
     *
     * @param description A description of the rule group that helps with identification.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the rule group.
     *
     * You cannot change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-name)
     *
     * @param name The name of the rule group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to allow,
     *   block, or count.
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to allow,
     *   block, or count.
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     *
     * @param rules The rule statements used to identify the web requests that you want to allow,
     *   block, or count.
     */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    /**
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional
     * application.
     *
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or
     * an AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-scope)
     *
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     *   regional application.
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each AWS
     * resource.
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-tags)
     *
     * @param tags Key:value pairs associated with an AWS resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each AWS
     * resource.
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-tags)
     *
     * @param tags Key:value pairs associated with an AWS resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     *
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     *   collection.
     */
    public fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     *
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     *   collection.
     */
    public fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    public fun build(): CfnRuleGroup {
        if (_availableLabels.isNotEmpty()) cdkBuilder.availableLabels(_availableLabels)
        if (_consumedLabels.isNotEmpty()) cdkBuilder.consumedLabels(_consumedLabels)
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
