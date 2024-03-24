@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRuleGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wafv2.*;
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
 * CfnRuleGroupProps cfnRuleGroupProps = CfnRuleGroupProps.builder()
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
 * .ja3Fingerprint(JA3FingerprintProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
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
 * .evaluationWindowSec(123)
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
 * .ja3Fingerprint(JA3FingerprintProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
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
 * .ja3Fingerprint(JA3FingerprintProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
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
 * .ja3Fingerprint(JA3FingerprintProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
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
 * .ja3Fingerprint(JA3FingerprintProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
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
 * .ja3Fingerprint(JA3FingerprintProperty.builder()
 * .fallbackBehavior("fallbackBehavior")
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
public interface CfnRuleGroupProps {
  /**
   * The labels that one or more rules in this rule group add to matching web requests.
   *
   * These labels are defined in the `RuleLabels` for a `Rule` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
   */
  public fun availableLabels(): Any? = unwrap(this).getAvailableLabels()

  /**
   * The web ACL capacity units (WCUs) required for this rule group.
   *
   * When you create your own rule group, you define this, and you cannot change it after creation.
   * When you add or modify the rules in a rule group, AWS WAF enforces this limit.
   *
   * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
   * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
   * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
   * more complex rules that use more processing power. Rule group capacity is fixed at creation, which
   * helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is
   * 1,500.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-capacity)
   */
  public fun capacity(): Number

  /**
   * The labels that one or more rules in this rule group match against in label match statements.
   *
   * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
   * definition of a rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
   */
  public fun consumedLabels(): Any? = unwrap(this).getConsumedLabels()

  /**
   * A map of custom response keys and content bodies.
   *
   * When you create a rule with a block action, you can send a custom response to the web request.
   * You define these for the rule group, and then use them in the rules that you define in the rule
   * group.
   *
   * For information about customizing web requests and responses, see [Customizing web requests and
   * responses in AWS
   * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
   * the *AWS WAF Developer Guide* .
   *
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-customresponsebodies)
   */
  public fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

  /**
   * A description of the rule group that helps with identification.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the rule group.
   *
   * You cannot change the name of a rule group after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The rule statements used to identify the web requests that you want to allow, block, or count.
   *
   * Each rule includes one top-level statement that AWS WAF uses to identify matching web requests,
   * and parameters that govern how AWS WAF handles them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
   */
  public fun rules(): Any? = unwrap(this).getRules()

  /**
   * Specifies whether this is for an Amazon CloudFront distribution or for a regional application.
   *
   * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
   * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an AWS
   * Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
   *
   *
   * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
   * `us-east-1` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-scope)
   */
  public fun scope(): String

  /**
   * Key:value pairs associated with an AWS resource.
   *
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   *
   * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With AWS
   * CloudFormation , you can only add tags to AWS WAF resources during resource creation.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Defines and enables Amazon CloudWatch metrics and web request sample collection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
   */
  public fun visibilityConfig(): Any

  /**
   * A builder for [CfnRuleGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    public fun availableLabels(availableLabels: IResolvable)

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    public fun availableLabels(availableLabels: List<Any>)

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    public fun availableLabels(vararg availableLabels: Any)

    /**
     * @param capacity The web ACL capacity units (WCUs) required for this rule group. 
     * When you create your own rule group, you define this, and you cannot change it after
     * creation. When you add or modify the rules in a rule group, AWS WAF enforces this limit.
     *
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
     * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
     * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
     * more complex rules that use more processing power. Rule group capacity is fixed at creation,
     * which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     */
    public fun capacity(capacity: Number)

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    public fun consumedLabels(consumedLabels: IResolvable)

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    public fun consumedLabels(consumedLabels: List<Any>)

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    public fun consumedLabels(vararg consumedLabels: Any)

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     */
    public fun customResponseBodies(customResponseBodies: IResolvable)

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     */
    public fun customResponseBodies(customResponseBodies: Map<String, Any>)

    /**
     * @param description A description of the rule group that helps with identification.
     */
    public fun description(description: String)

    /**
     * @param name The name of the rule group.
     * You cannot change the name of a rule group after you create it.
     */
    public fun name(name: String)

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    public fun rules(vararg rules: Any)

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an
     * AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     */
    public fun scope(scope: String)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: IResolvable)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    public fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64221d10455c9f28cf050e8e2ab95a6a1d4fd0cae07f9195a4d7951b4627371a")
    public
        fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps.Builder =
        software.amazon.awscdk.services.wafv2.CfnRuleGroupProps.builder()

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    override fun availableLabels(availableLabels: IResolvable) {
      cdkBuilder.availableLabels(availableLabels.let(IResolvable::unwrap))
    }

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    override fun availableLabels(availableLabels: List<Any>) {
      cdkBuilder.availableLabels(availableLabels.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param availableLabels The labels that one or more rules in this rule group add to matching
     * web requests.
     * These labels are defined in the `RuleLabels` for a `Rule` .
     */
    override fun availableLabels(vararg availableLabels: Any): Unit =
        availableLabels(availableLabels.toList())

    /**
     * @param capacity The web ACL capacity units (WCUs) required for this rule group. 
     * When you create your own rule group, you define this, and you cannot change it after
     * creation. When you add or modify the rules in a rule group, AWS WAF enforces this limit.
     *
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
     * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
     * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
     * more complex rules that use more processing power. Rule group capacity is fixed at creation,
     * which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     */
    override fun capacity(capacity: Number) {
      cdkBuilder.capacity(capacity)
    }

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    override fun consumedLabels(consumedLabels: IResolvable) {
      cdkBuilder.consumedLabels(consumedLabels.let(IResolvable::unwrap))
    }

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    override fun consumedLabels(consumedLabels: List<Any>) {
      cdkBuilder.consumedLabels(consumedLabels.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param consumedLabels The labels that one or more rules in this rule group match against in
     * label match statements.
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     */
    override fun consumedLabels(vararg consumedLabels: Any): Unit =
        consumedLabels(consumedLabels.toList())

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     */
    override fun customResponseBodies(customResponseBodies: IResolvable) {
      cdkBuilder.customResponseBodies(customResponseBodies.let(IResolvable::unwrap))
    }

    /**
     * @param customResponseBodies A map of custom response keys and content bodies.
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     */
    override fun customResponseBodies(customResponseBodies: Map<String, Any>) {
      cdkBuilder.customResponseBodies(customResponseBodies.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param description A description of the rule group that helps with identification.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the rule group.
     * You cannot change the name of a rule group after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param rules The rule statements used to identify the web requests that you want to allow,
     * block, or count.
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * @param scope Specifies whether this is for an Amazon CloudFront distribution or for a
     * regional application. 
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an
     * AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     */
    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: IResolvable) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(IResolvable::unwrap))
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    override fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty) {
      cdkBuilder.visibilityConfig(visibilityConfig.let(CfnRuleGroup.VisibilityConfigProperty::unwrap))
    }

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample
     * collection. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64221d10455c9f28cf050e8e2ab95a6a1d4fd0cae07f9195a4d7951b4627371a")
    override
        fun visibilityConfig(visibilityConfig: CfnRuleGroup.VisibilityConfigProperty.Builder.() -> Unit):
        Unit = visibilityConfig(CfnRuleGroup.VisibilityConfigProperty(visibilityConfig))

    public fun build(): software.amazon.awscdk.services.wafv2.CfnRuleGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps,
  ) : CdkObject(cdkObject), CfnRuleGroupProps {
    /**
     * The labels that one or more rules in this rule group add to matching web requests.
     *
     * These labels are defined in the `RuleLabels` for a `Rule` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-availablelabels)
     */
    override fun availableLabels(): Any? = unwrap(this).getAvailableLabels()

    /**
     * The web ACL capacity units (WCUs) required for this rule group.
     *
     * When you create your own rule group, you define this, and you cannot change it after
     * creation. When you add or modify the rules in a rule group, AWS WAF enforces this limit.
     *
     * AWS WAF uses WCUs to calculate and control the operating resources that are used to run your
     * rules, rule groups, and web ACLs. AWS WAF calculates capacity differently for each rule type, to
     * reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than
     * more complex rules that use more processing power. Rule group capacity is fixed at creation,
     * which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web
     * ACLs is 1,500.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-capacity)
     */
    override fun capacity(): Number = unwrap(this).getCapacity()

    /**
     * The labels that one or more rules in this rule group match against in label match statements.
     *
     * These labels are defined in a `LabelMatchStatement` specification, in the `Statement`
     * definition of a rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-consumedlabels)
     */
    override fun consumedLabels(): Any? = unwrap(this).getConsumedLabels()

    /**
     * A map of custom response keys and content bodies.
     *
     * When you create a rule with a block action, you can send a custom response to the web
     * request. You define these for the rule group, and then use them in the rules that you define in
     * the rule group.
     *
     * For information about customizing web requests and responses, see [Customizing web requests
     * and responses in AWS
     * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in
     * the *AWS WAF Developer Guide* .
     *
     * For information about the limits on count and size for custom request and response settings,
     * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
     * *AWS WAF Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-customresponsebodies)
     */
    override fun customResponseBodies(): Any? = unwrap(this).getCustomResponseBodies()

    /**
     * A description of the rule group that helps with identification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the rule group.
     *
     * You cannot change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The rule statements used to identify the web requests that you want to allow, block, or
     * count.
     *
     * Each rule includes one top-level statement that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-rules)
     */
    override fun rules(): Any? = unwrap(this).getRules()

    /**
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional
     * application.
     *
     * A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST
     * API, an AWS AppSync GraphQL API, an Amazon Cognito user pool, an AWS App Runner service, or an
     * AWS Verified Access instance. Valid Values are `CLOUDFRONT` and `REGIONAL` .
     *
     *
     * For `CLOUDFRONT` , you must create your WAFv2 resources in the US East (N. Virginia) Region,
     * `us-east-1` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-scope)
     */
    override fun scope(): String = unwrap(this).getScope()

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     *
     * To modify tags on existing resources, use the AWS WAF APIs or command line interface. With
     * AWS CloudFormation , you can only add tags to AWS WAF resources during resource creation.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-rulegroup.html#cfn-wafv2-rulegroup-visibilityconfig)
     */
    override fun visibilityConfig(): Any = unwrap(this).getVisibilityConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnRuleGroupProps):
        CfnRuleGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRuleGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupProps):
        software.amazon.awscdk.services.wafv2.CfnRuleGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.wafv2.CfnRuleGroupProps
  }
}
