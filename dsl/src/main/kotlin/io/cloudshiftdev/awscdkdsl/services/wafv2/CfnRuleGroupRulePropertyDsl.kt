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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A single rule, which you can use in a `WebACL` or `RuleGroup` to identify web requests that you
 * want to manage in some way.
 *
 * Each rule includes one top-level `Statement` that AWS WAF uses to identify matching web requests,
 * and parameters that govern how AWS WAF handles them.
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
 * RuleProperty ruleProperty = RuleProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-rule.html)
 */
@CdkDslMarker
public class CfnRuleGroupRulePropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RuleProperty.Builder = CfnRuleGroup.RuleProperty.builder()

    private val _ruleLabels: MutableList<Any> = mutableListOf()

    /**
     * @param action The action that AWS WAF should take on a web request when it matches the rule
     *   statement. Settings at the web ACL level can override the rule action setting.
     */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /**
     * @param action The action that AWS WAF should take on a web request when it matches the rule
     *   statement. Settings at the web ACL level can override the rule action setting.
     */
    public fun action(action: CfnRuleGroup.RuleActionProperty) {
        cdkBuilder.action(action)
    }

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations. If you don't
     *   specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the web ACL.
     */
    public fun captchaConfig(captchaConfig: IResolvable) {
        cdkBuilder.captchaConfig(captchaConfig)
    }

    /**
     * @param captchaConfig Specifies how AWS WAF should handle `CAPTCHA` evaluations. If you don't
     *   specify this, AWS WAF uses the `CAPTCHA` configuration that's defined for the web ACL.
     */
    public fun captchaConfig(captchaConfig: CfnRuleGroup.CaptchaConfigProperty) {
        cdkBuilder.captchaConfig(captchaConfig)
    }

    /**
     * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations. If you
     *   don't specify this, AWS WAF uses the challenge configuration that's defined for the web
     *   ACL.
     */
    public fun challengeConfig(challengeConfig: IResolvable) {
        cdkBuilder.challengeConfig(challengeConfig)
    }

    /**
     * @param challengeConfig Specifies how AWS WAF should handle `Challenge` evaluations. If you
     *   don't specify this, AWS WAF uses the challenge configuration that's defined for the web
     *   ACL.
     */
    public fun challengeConfig(challengeConfig: CfnRuleGroup.ChallengeConfigProperty) {
        cdkBuilder.challengeConfig(challengeConfig)
    }

    /**
     * @param name The name of the rule. If you change the name of a `Rule` after you create it and
     *   you want the rule's metric name to reflect the change, update the metric name in the rule's
     *   `VisibilityConfig` settings. AWS WAF doesn't automatically update the metric name when you
     *   update the rule name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param priority If you define more than one `Rule` in a `WebACL` , AWS WAF evaluates each
     *   request against the `Rules` in order based on the value of `Priority` . AWS WAF processes
     *   rules with lower priority first. The priorities don't need to be consecutive, but they must
     *   all be different.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * @param ruleLabels Labels to apply to web requests that match the rule match statement. AWS
     *   WAF applies fully qualified labels to matching web requests. A fully qualified label is the
     *   concatenation of a label namespace and a rule label. The rule's rule group or web ACL
     *   defines the label namespace.
     *
     * Rules that run after this rule in the web ACL can match against these labels using a
     * `LabelMatchStatement` .
     *
     * For each label, provide a case-sensitive string containing optional namespaces and a label
     * name, according to the following guidelines:
     * * Separate each component of the label with a colon.
     * * Each namespace or name can have up to 128 characters.
     * * You can specify up to 5 namespaces in a label.
     * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
     *   `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
     *
     * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
     */
    public fun ruleLabels(vararg ruleLabels: Any) {
        _ruleLabels.addAll(listOf(*ruleLabels))
    }

    /**
     * @param ruleLabels Labels to apply to web requests that match the rule match statement. AWS
     *   WAF applies fully qualified labels to matching web requests. A fully qualified label is the
     *   concatenation of a label namespace and a rule label. The rule's rule group or web ACL
     *   defines the label namespace.
     *
     * Rules that run after this rule in the web ACL can match against these labels using a
     * `LabelMatchStatement` .
     *
     * For each label, provide a case-sensitive string containing optional namespaces and a label
     * name, according to the following guidelines:
     * * Separate each component of the label with a colon.
     * * Each namespace or name can have up to 128 characters.
     * * You can specify up to 5 namespaces in a label.
     * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
     *   `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
     *
     * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
     */
    public fun ruleLabels(ruleLabels: Collection<Any>) {
        _ruleLabels.addAll(ruleLabels)
    }

    /**
     * @param ruleLabels Labels to apply to web requests that match the rule match statement. AWS
     *   WAF applies fully qualified labels to matching web requests. A fully qualified label is the
     *   concatenation of a label namespace and a rule label. The rule's rule group or web ACL
     *   defines the label namespace.
     *
     * Rules that run after this rule in the web ACL can match against these labels using a
     * `LabelMatchStatement` .
     *
     * For each label, provide a case-sensitive string containing optional namespaces and a label
     * name, according to the following guidelines:
     * * Separate each component of the label with a colon.
     * * Each namespace or name can have up to 128 characters.
     * * You can specify up to 5 namespaces in a label.
     * * Don't use the following reserved words in your label specification: `aws` , `waf` ,
     *   `managed` , `rulegroup` , `webacl` , `regexpatternset` , or `ipset` .
     *
     * For example, `myLabelName` or `nameSpace1:nameSpace2:myLabelName` .
     */
    public fun ruleLabels(ruleLabels: IResolvable) {
        cdkBuilder.ruleLabels(ruleLabels)
    }

    /**
     * @param statement The AWS WAF processing statement for the rule, for example
     *   `ByteMatchStatement` or `SizeConstraintStatement` .
     */
    public fun statement(statement: IResolvable) {
        cdkBuilder.statement(statement)
    }

    /**
     * @param statement The AWS WAF processing statement for the rule, for example
     *   `ByteMatchStatement` or `SizeConstraintStatement` .
     */
    public fun statement(statement: CfnRuleGroup.StatementProperty) {
        cdkBuilder.statement(statement)
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     *   collection. If you change the name of a `Rule` after you create it and you want the rule's
     *   metric name to reflect the change, update the metric name as well. AWS WAF doesn't
     *   automatically update the metric name.
     */
    public fun visibilityConfig(visibilityConfig: IResolvable) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     *   collection. If you change the name of a `Rule` after you create it and you want the rule's
     *   metric name to reflect the change, update the metric name as well. AWS WAF doesn't
     *   automatically update the metric name.
     */
    public fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty) {
        cdkBuilder.visibilityConfig(visibilityConfig)
    }

    public fun build(): CfnRuleGroup.RuleProperty {
        if (_ruleLabels.isNotEmpty()) cdkBuilder.ruleLabels(_ruleLabels)
        return cdkBuilder.build()
    }
}
