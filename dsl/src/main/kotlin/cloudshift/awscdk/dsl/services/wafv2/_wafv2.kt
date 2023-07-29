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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnIPSet
import software.amazon.awscdk.services.wafv2.CfnIPSetProps
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import software.amazon.awscdk.services.wafv2.CfnLoggingConfigurationProps
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSet
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.amazon.awscdk.services.wafv2.CfnRuleGroupProps
import software.amazon.awscdk.services.wafv2.CfnWebACL
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociation
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociationProps
import software.amazon.awscdk.services.wafv2.CfnWebACLProps
import software.constructs.Construct

public object wafv2 {
    /**
     * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
     *
     * For information, including how to migrate your AWS WAF resources from the prior release, see
     * the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Use an `IPSet` to identify web requests that originate from specific IP addresses or ranges
     * of IP addresses. For example, if you're receiving a lot of requests from a ranges of IP
     * addresses, you can configure AWS WAF to block them using an IP set that lists those IP
     * addresses.
     *
     * You use an IP set by providing its Amazon Resource Name (ARN) to the rule statement
     * `IPSetReferenceStatement` , when you add a rule to a rule group or web ACL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CfnIPSet cfnIPSet = CfnIPSet.Builder.create(this, "MyCfnIPSet")
     * .addresses(List.of("addresses"))
     * .ipAddressVersion("ipAddressVersion")
     * .scope("scope")
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html)
     */
    public inline fun cfnIPSet(
        scope: Construct,
        id: String,
        block: CfnIPSetDsl.() -> Unit = {},
    ): CfnIPSet {
        val builder = CfnIPSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIPSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CfnIPSetProps cfnIPSetProps = CfnIPSetProps.builder()
     * .addresses(List.of("addresses"))
     * .ipAddressVersion("ipAddressVersion")
     * .scope("scope")
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-ipset.html)
     */
    public inline fun cfnIPSetProps(block: CfnIPSetPropsDsl.() -> Unit = {}): CfnIPSetProps {
        val builder = CfnIPSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an association between logging destinations and a web ACL resource, for logging from
     * AWS WAF .
     *
     * As part of the association, you can specify parts of the standard logging fields to keep out
     * of the logs and you can specify filters so that you log only a subset of the logging records.
     *
     * You can define one logging destination per web ACL.
     *
     * You can access information about the traffic that AWS WAF inspects using the following steps:
     * * Create your logging destination. You can use an Amazon CloudWatch Logs log group, an Amazon
     *   Simple Storage Service (Amazon S3) bucket, or an Amazon Kinesis Data Firehose.
     *
     * The name that you give the destination must start with `aws-waf-logs-` . Depending on the
     * type of destination, you might need to configure additional settings or permissions.
     *
     * For configuration requirements and pricing information for each destination type, see
     * [Logging web ACL traffic](https://docs.aws.amazon.com/waf/latest/developerguide/logging.html)
     * in the *AWS WAF Developer Guide* .
     * * Associate your logging destination to your web ACL using a `PutLoggingConfiguration`
     *   request.
     *
     * When you successfully enable logging using a `PutLoggingConfiguration` request, AWS WAF
     * creates an additional role or policy that is required to write logs to the logging
     * destination. For an Amazon CloudWatch Logs log group, AWS WAF creates a resource policy on
     * the log group. For an Amazon S3 bucket, AWS WAF creates a bucket policy. For an Amazon
     * Kinesis Data Firehose, AWS WAF creates a service-linked role.
     *
     * For additional information about web ACL logging, see
     * [Logging web ACL traffic information](https://docs.aws.amazon.com/waf/latest/developerguide/logging.html)
     * in the *AWS WAF Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object jsonBody;
     * Object loggingFilter;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object uriPath;
     * CfnLoggingConfiguration cfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this,
     * "MyCfnLoggingConfiguration")
     * .logDestinationConfigs(List.of("logDestinationConfigs"))
     * .resourceArn("resourceArn")
     * // the properties below are optional
     * .loggingFilter(loggingFilter)
     * .redactedFields(List.of(FieldToMatchProperty.builder()
     * .jsonBody(jsonBody)
     * .method(method)
     * .queryString(queryString)
     * .singleHeader(singleHeader)
     * .uriPath(uriPath)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html)
     */
    public inline fun cfnLoggingConfiguration(
        scope: Construct,
        id: String,
        block: CfnLoggingConfigurationDsl.() -> Unit = {},
    ): CfnLoggingConfiguration {
        val builder = CfnLoggingConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single action condition for a condition in a logging filter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ActionConditionProperty actionConditionProperty = ActionConditionProperty.builder()
     * .action("action")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-actioncondition.html)
     */
    public inline fun cfnLoggingConfigurationActionConditionProperty(
        block: CfnLoggingConfigurationActionConditionPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.ActionConditionProperty {
        val builder = CfnLoggingConfigurationActionConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single match condition for a log filter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ConditionProperty conditionProperty = ConditionProperty.builder()
     * .actionCondition(ActionConditionProperty.builder()
     * .action("action")
     * .build())
     * .labelNameCondition(LabelNameConditionProperty.builder()
     * .labelName("labelName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-condition.html)
     */
    public inline fun cfnLoggingConfigurationConditionProperty(
        block: CfnLoggingConfigurationConditionPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.ConditionProperty {
        val builder = CfnLoggingConfigurationConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The parts of the request that you want to keep out of the logs.
     *
     * This is used in the logging configuration `RedactedFields` specification.
     *
     * Example JSON for a `QueryString` field to match:
     *
     * `"FieldToMatch": { "QueryString": {} }`
     *
     * Example JSON for a `Method` field to match specification:
     *
     * `"FieldToMatch": { "Method": { "Name": "DELETE" } }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object jsonBody;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object uriPath;
     * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
     * .jsonBody(jsonBody)
     * .method(method)
     * .queryString(queryString)
     * .singleHeader(singleHeader)
     * .uriPath(uriPath)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-fieldtomatch.html)
     */
    public inline fun cfnLoggingConfigurationFieldToMatchProperty(
        block: CfnLoggingConfigurationFieldToMatchPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.FieldToMatchProperty {
        val builder = CfnLoggingConfigurationFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single logging filter, used in `LoggingFilter` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * FilterProperty filterProperty = FilterProperty.builder()
     * .behavior("behavior")
     * .conditions(List.of(ConditionProperty.builder()
     * .actionCondition(ActionConditionProperty.builder()
     * .action("action")
     * .build())
     * .labelNameCondition(LabelNameConditionProperty.builder()
     * .labelName("labelName")
     * .build())
     * .build()))
     * .requirement("requirement")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-filter.html)
     */
    public inline fun cfnLoggingConfigurationFilterProperty(
        block: CfnLoggingConfigurationFilterPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.FilterProperty {
        val builder = CfnLoggingConfigurationFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect the body of the web request as JSON. The body immediately follows the request
     * headers.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Use the specifications in this object to indicate which parts of the JSON body to inspect
     * using the rule's inspection criteria. AWS WAF inspects only the parts of the JSON that result
     * from the matches that you indicate.
     *
     * Example JSON: `"JsonBody": { "MatchPattern": { "All": {} }, "MatchScope": "ALL" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * JsonBodyProperty jsonBodyProperty = JsonBodyProperty.builder()
     * .matchPattern(MatchPatternProperty.builder()
     * .all(all)
     * .includedPaths(List.of("includedPaths"))
     * .build())
     * .matchScope("matchScope")
     * // the properties below are optional
     * .invalidFallbackBehavior("invalidFallbackBehavior")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-jsonbody.html)
     */
    public inline fun cfnLoggingConfigurationJsonBodyProperty(
        block: CfnLoggingConfigurationJsonBodyPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.JsonBodyProperty {
        val builder = CfnLoggingConfigurationJsonBodyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single label name condition for a condition in a logging filter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * LabelNameConditionProperty labelNameConditionProperty = LabelNameConditionProperty.builder()
     * .labelName("labelName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-labelnamecondition.html)
     */
    public inline fun cfnLoggingConfigurationLabelNameConditionProperty(
        block: CfnLoggingConfigurationLabelNameConditionPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.LabelNameConditionProperty {
        val builder = CfnLoggingConfigurationLabelNameConditionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Filtering that specifies which web requests are kept in the logs and which are dropped,
     * defined for a web ACL's `LoggingConfiguration` .
     *
     * You can filter on the rule action and on the web request labels that were applied by matching
     * rules during web ACL evaluation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * LoggingFilterProperty loggingFilterProperty = LoggingFilterProperty.builder()
     * .defaultBehavior("defaultBehavior")
     * .filters(List.of(FilterProperty.builder()
     * .behavior("behavior")
     * .conditions(List.of(ConditionProperty.builder()
     * .actionCondition(ActionConditionProperty.builder()
     * .action("action")
     * .build())
     * .labelNameCondition(LabelNameConditionProperty.builder()
     * .labelName("labelName")
     * .build())
     * .build()))
     * .requirement("requirement")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-loggingfilter.html)
     */
    public inline fun cfnLoggingConfigurationLoggingFilterProperty(
        block: CfnLoggingConfigurationLoggingFilterPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.LoggingFilterProperty {
        val builder = CfnLoggingConfigurationLoggingFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The patterns to look for in the JSON body.
     *
     * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * MatchPatternProperty matchPatternProperty = MatchPatternProperty.builder()
     * .all(all)
     * .includedPaths(List.of("includedPaths"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-matchpattern.html)
     */
    public inline fun cfnLoggingConfigurationMatchPatternProperty(
        block: CfnLoggingConfigurationMatchPatternPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.MatchPatternProperty {
        val builder = CfnLoggingConfigurationMatchPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLoggingConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object jsonBody;
     * Object loggingFilter;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object uriPath;
     * CfnLoggingConfigurationProps cfnLoggingConfigurationProps =
     * CfnLoggingConfigurationProps.builder()
     * .logDestinationConfigs(List.of("logDestinationConfigs"))
     * .resourceArn("resourceArn")
     * // the properties below are optional
     * .loggingFilter(loggingFilter)
     * .redactedFields(List.of(FieldToMatchProperty.builder()
     * .jsonBody(jsonBody)
     * .method(method)
     * .queryString(queryString)
     * .singleHeader(singleHeader)
     * .uriPath(uriPath)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-loggingconfiguration.html)
     */
    public inline fun cfnLoggingConfigurationProps(
        block: CfnLoggingConfigurationPropsDsl.() -> Unit = {}
    ): CfnLoggingConfigurationProps {
        val builder = CfnLoggingConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect one of the headers in the web request, identified by name, for example, `User-Agent`
     * or `Referer` .
     *
     * The name isn't case sensitive.
     *
     * You can filter and inspect all headers with the `FieldToMatch` setting `Headers` .
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example JSON: `"SingleHeader": { "Name": "haystack" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * SingleHeaderProperty singleHeaderProperty = SingleHeaderProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-singleheader.html)
     */
    public inline fun cfnLoggingConfigurationSingleHeaderProperty(
        block: CfnLoggingConfigurationSingleHeaderPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.SingleHeaderProperty {
        val builder = CfnLoggingConfigurationSingleHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
     *
     * For information, including how to migrate your AWS WAF resources from the prior release, see
     * the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Use an `RegexPatternSet` to have AWS WAF inspect a web request component for a specific set
     * of regular expression patterns.
     *
     * You use a regex pattern set by providing its Amazon Resource Name (ARN) to the rule statement
     * `RegexPatternSetReferenceStatement` , when you add a rule to a rule group or web ACL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CfnRegexPatternSet cfnRegexPatternSet = CfnRegexPatternSet.Builder.create(this,
     * "MyCfnRegexPatternSet")
     * .regularExpressionList(List.of("regularExpressionList"))
     * .scope("scope")
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html)
     */
    public inline fun cfnRegexPatternSet(
        scope: Construct,
        id: String,
        block: CfnRegexPatternSetDsl.() -> Unit = {},
    ): CfnRegexPatternSet {
        val builder = CfnRegexPatternSetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRegexPatternSet`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CfnRegexPatternSetProps cfnRegexPatternSetProps = CfnRegexPatternSetProps.builder()
     * .regularExpressionList(List.of("regularExpressionList"))
     * .scope("scope")
     * // the properties below are optional
     * .description("description")
     * .name("name")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-regexpatternset.html)
     */
    public inline fun cfnRegexPatternSetProps(
        block: CfnRegexPatternSetPropsDsl.() -> Unit = {}
    ): CfnRegexPatternSetProps {
        val builder = CfnRegexPatternSetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
     *
     * For information, including how to migrate your AWS WAF resources from the prior release, see
     * the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Use an `RuleGroup` to define a collection of rules for inspecting and controlling web
     * requests. You use a rule group in an `WebACL` by providing its Amazon Resource Name (ARN) to
     * the rule statement `RuleGroupReferenceStatement` , when you add rules to the web ACL.
     *
     * When you create a rule group, you define an immutable capacity limit. If you update a rule
     * group, you must stay within the capacity. This allows others to reuse the rule group with
     * confidence in its capacity requirements.
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
    public inline fun cfnRuleGroup(
        scope: Construct,
        id: String,
        block: CfnRuleGroupDsl.() -> Unit = {},
    ): CfnRuleGroup {
        val builder = CfnRuleGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Allow traffic towards application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * AllowProperty allowProperty = AllowProperty.builder()
     * .customRequestHandling(CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-allow.html)
     */
    public inline fun cfnRuleGroupAllowProperty(
        block: CfnRuleGroupAllowPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.AllowProperty {
        val builder = CfnRuleGroupAllowPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logical rule statement used to combine other rule statements with AND logic.
     *
     * You provide more than one `Statement` within the `AndStatement` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * AndStatementProperty andStatementProperty_;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * StatementProperty statementProperty_;
     * Object uriPath;
     * AndStatementProperty andStatementProperty = AndStatementProperty.builder()
     * .statements(List.of(StatementProperty.builder()
     * .andStatement(andStatementProperty_)
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
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-andstatement.html)
     */
    public inline fun cfnRuleGroupAndStatementProperty(
        block: CfnRuleGroupAndStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.AndStatementProperty {
        val builder = CfnRuleGroupAndStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Block traffic towards application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * BlockProperty blockProperty = BlockProperty.builder()
     * .customResponse(CustomResponseProperty.builder()
     * .responseCode(123)
     * // the properties below are optional
     * .customResponseBodyKey("customResponseBodyKey")
     * .responseHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-block.html)
     */
    public inline fun cfnRuleGroupBlockProperty(
        block: CfnRuleGroupBlockPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.BlockProperty {
        val builder = CfnRuleGroupBlockPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect the body of the web request. The body immediately follows the request headers.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * BodyProperty bodyProperty = BodyProperty.builder()
     * .oversizeHandling("oversizeHandling")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-body.html)
     */
    public inline fun cfnRuleGroupBodyProperty(
        block: CfnRuleGroupBodyPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.BodyProperty {
        val builder = CfnRuleGroupBodyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests.
     *
     * The byte match statement provides the bytes to search for, the location in requests that you
     * want AWS WAF to search, and other settings. The bytes to search for are typically a string
     * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
     * is called a string match statement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * ByteMatchStatementProperty byteMatchStatementProperty = ByteMatchStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html)
     */
    public inline fun cfnRuleGroupByteMatchStatementProperty(
        block: CfnRuleGroupByteMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.ByteMatchStatementProperty {
        val builder = CfnRuleGroupByteMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations.
     *
     * This is available at the web ACL level and in each rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CaptchaConfigProperty captchaConfigProperty = CaptchaConfigProperty.builder()
     * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
     * .immunityTime(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-captchaconfig.html)
     */
    public inline fun cfnRuleGroupCaptchaConfigProperty(
        block: CfnRuleGroupCaptchaConfigPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CaptchaConfigProperty {
        val builder = CfnRuleGroupCaptchaConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Checks valid token exists with request.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CaptchaProperty captchaProperty = CaptchaProperty.builder()
     * .customRequestHandling(CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-captcha.html)
     */
    public inline fun cfnRuleGroupCaptchaProperty(
        block: CfnRuleGroupCaptchaPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CaptchaProperty {
        val builder = CfnRuleGroupCaptchaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how AWS WAF should handle `Challenge` evaluations.
     *
     * This is available at the web ACL level and in each rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ChallengeConfigProperty challengeConfigProperty = ChallengeConfigProperty.builder()
     * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
     * .immunityTime(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-challengeconfig.html)
     */
    public inline fun cfnRuleGroupChallengeConfigProperty(
        block: CfnRuleGroupChallengeConfigPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.ChallengeConfigProperty {
        val builder = CfnRuleGroupChallengeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Checks that the request has a valid token with an unexpired challenge timestamp and, if not,
     * returns a browser challenge to the client.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ChallengeProperty challengeProperty = ChallengeProperty.builder()
     * .customRequestHandling(CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-challenge.html)
     */
    public inline fun cfnRuleGroupChallengeProperty(
        block: CfnRuleGroupChallengePropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.ChallengeProperty {
        val builder = CfnRuleGroupChallengePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The filter to use to identify the subset of cookies to inspect in a web request.
     *
     * You must specify exactly one setting: either `All` , `IncludedCookies` , or `ExcludedCookies`
     * .
     *
     * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * CookieMatchPatternProperty cookieMatchPatternProperty = CookieMatchPatternProperty.builder()
     * .all(all)
     * .excludedCookies(List.of("excludedCookies"))
     * .includedCookies(List.of("includedCookies"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookiematchpattern.html)
     */
    public inline fun cfnRuleGroupCookieMatchPatternProperty(
        block: CfnRuleGroupCookieMatchPatternPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CookieMatchPatternProperty {
        val builder = CfnRuleGroupCookieMatchPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect the cookies in the web request.
     *
     * You can specify the parts of the cookies to inspect and you can narrow the set of cookies to
     * inspect by including or excluding specific keys.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example JSON: `"Cookies": { "MatchPattern": { "All": {} }, "MatchScope": "KEY",
     * "OversizeHandling": "MATCH" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * CookiesProperty cookiesProperty = CookiesProperty.builder()
     * .matchPattern(CookieMatchPatternProperty.builder()
     * .all(all)
     * .excludedCookies(List.of("excludedCookies"))
     * .includedCookies(List.of("includedCookies"))
     * .build())
     * .matchScope("matchScope")
     * .oversizeHandling("oversizeHandling")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-cookies.html)
     */
    public inline fun cfnRuleGroupCookiesProperty(
        block: CfnRuleGroupCookiesPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CookiesProperty {
        val builder = CfnRuleGroupCookiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Count traffic towards application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CountProperty countProperty = CountProperty.builder()
     * .customRequestHandling(CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-count.html)
     */
    public inline fun cfnRuleGroupCountProperty(
        block: CfnRuleGroupCountPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CountProperty {
        val builder = CfnRuleGroupCountPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom header for custom request and response handling.
     *
     * This is used in `CustomResponse` and `CustomRequestHandling`
     *
     * Example:
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
    public inline fun cfnRuleGroupCustomHTTPHeaderProperty(
        block: CfnRuleGroupCustomHTTPHeaderPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CustomHTTPHeaderProperty {
        val builder = CfnRuleGroupCustomHTTPHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Custom request handling behavior that inserts custom headers into a web request.
     *
     * You can add custom request handling for AWS WAF to use when the rule action doesn't block the
     * request. For example, `CaptchaAction` for requests with valid t okens, and `AllowAction` .
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CustomRequestHandlingProperty customRequestHandlingProperty =
     * CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customrequesthandling.html)
     */
    public inline fun cfnRuleGroupCustomRequestHandlingProperty(
        block: CfnRuleGroupCustomRequestHandlingPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CustomRequestHandlingProperty {
        val builder = CfnRuleGroupCustomRequestHandlingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The response body to use in a custom response to a web request.
     *
     * This is referenced by key from `CustomResponse` `CustomResponseBodyKey` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CustomResponseBodyProperty customResponseBodyProperty = CustomResponseBodyProperty.builder()
     * .content("content")
     * .contentType("contentType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-customresponsebody.html)
     */
    public inline fun cfnRuleGroupCustomResponseBodyProperty(
        block: CfnRuleGroupCustomResponseBodyPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CustomResponseBodyProperty {
        val builder = CfnRuleGroupCustomResponseBodyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom response to send to the client.
     *
     * You can define a custom response for rule actions and default web ACL actions that are set to
     * `Block` .
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Example:
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
    public inline fun cfnRuleGroupCustomResponseProperty(
        block: CfnRuleGroupCustomResponsePropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CustomResponseProperty {
        val builder = CfnRuleGroupCustomResponsePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * Include the single `FieldToMatch` type that you want to inspect, with additional
     * specifications as needed, according to the type. You specify a single request component in
     * `FieldToMatch` for each rule statement that requires it. To inspect more than one component
     * of the web request, create a separate rule statement for each component.
     *
     * Example JSON for a `QueryString` field to match:
     *
     * `"FieldToMatch": { "QueryString": {} }`
     *
     * Example JSON for a `Method` field to match specification:
     *
     * `"FieldToMatch": { "Method": { "Name": "DELETE" } }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html)
     */
    public inline fun cfnRuleGroupFieldToMatchProperty(
        block: CfnRuleGroupFieldToMatchPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.FieldToMatchProperty {
        val builder = CfnRuleGroupFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of
     * using the IP address that's reported by the web request origin.
     *
     * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     * This configuration is used for `GeoMatchStatement` and `RateBasedStatement` . For
     * `IPSetReferenceStatement` , use `IPSetForwardedIPConfig` instead.
     *
     * AWS WAF only evaluates the first IP address found in the specified HTTP header.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ForwardedIPConfigurationProperty forwardedIPConfigurationProperty =
     * ForwardedIPConfigurationProperty.builder()
     * .fallbackBehavior("fallbackBehavior")
     * .headerName("headerName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-forwardedipconfiguration.html)
     */
    public inline fun cfnRuleGroupForwardedIPConfigurationProperty(
        block: CfnRuleGroupForwardedIPConfigurationPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.ForwardedIPConfigurationProperty {
        val builder = CfnRuleGroupForwardedIPConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that labels web requests by country and region and that matches against web
     * requests based on country code.
     *
     * A geo match rule labels every request that it inspects regardless of whether it finds a
     * match.
     * * To manage requests only by country, you can use this statement by itself and specify the
     *   countries that you want to match against in the `CountryCodes` array.
     * * Otherwise, configure your geo match rule with Count action so that it only labels requests.
     *   Then, add one or more label match rules to run after the geo match rule and configure them
     *   to match against the geographic labels and handle the requests as needed.
     *
     * AWS WAF labels requests using the alpha-2 country and region codes from the International
     * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
     * either the IP address in the web request origin or, if you specify it, the address in the geo
     * match `ForwardedIPConfig` .
     *
     * If you use the web request origin, the label formats are `awswaf:clientip:geo:region:&lt;ISO
     * country code&gt;-&lt;ISO region code&gt;` and `awswaf:clientip:geo:country:&lt;ISO country
     * code&gt;` .
     *
     * If you use a forwarded IP address, the label formats are
     * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
     * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
     *
     * For additional details, see
     * [Geographic match rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
     * in the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * GeoMatchStatementProperty geoMatchStatementProperty = GeoMatchStatementProperty.builder()
     * .countryCodes(List.of("countryCodes"))
     * .forwardedIpConfig(ForwardedIPConfigurationProperty.builder()
     * .fallbackBehavior("fallbackBehavior")
     * .headerName("headerName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-geomatchstatement.html)
     */
    public inline fun cfnRuleGroupGeoMatchStatementProperty(
        block: CfnRuleGroupGeoMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.GeoMatchStatementProperty {
        val builder = CfnRuleGroupGeoMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The filter to use to identify the subset of headers to inspect in a web request.
     *
     * You must specify exactly one setting: either `All` , `IncludedHeaders` , or `ExcludedHeaders`
     * .
     *
     * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * HeaderMatchPatternProperty headerMatchPatternProperty = HeaderMatchPatternProperty.builder()
     * .all(all)
     * .excludedHeaders(List.of("excludedHeaders"))
     * .includedHeaders(List.of("includedHeaders"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headermatchpattern.html)
     */
    public inline fun cfnRuleGroupHeaderMatchPatternProperty(
        block: CfnRuleGroupHeaderMatchPatternPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.HeaderMatchPatternProperty {
        val builder = CfnRuleGroupHeaderMatchPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect all headers in the web request.
     *
     * You can specify the parts of the headers to inspect and you can narrow the set of headers to
     * inspect by including or excluding specific keys.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * If you want to inspect just the value of a single header, use the `SingleHeader`
     * `FieldToMatch` setting instead.
     *
     * Example JSON: `"Headers": { "MatchPattern": { "All": {} }, "MatchScope": "KEY",
     * "OversizeHandling": "MATCH" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * HeadersProperty headersProperty = HeadersProperty.builder()
     * .matchPattern(HeaderMatchPatternProperty.builder()
     * .all(all)
     * .excludedHeaders(List.of("excludedHeaders"))
     * .includedHeaders(List.of("includedHeaders"))
     * .build())
     * .matchScope("matchScope")
     * .oversizeHandling("oversizeHandling")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-headers.html)
     */
    public inline fun cfnRuleGroupHeadersProperty(
        block: CfnRuleGroupHeadersPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.HeadersProperty {
        val builder = CfnRuleGroupHeadersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of
     * using the IP address that's reported by the web request origin.
     *
     * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     * This configuration is used only for `IPSetReferenceStatement` . For `GeoMatchStatement` and
     * `RateBasedStatement` , use `ForwardedIPConfig` instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * IPSetForwardedIPConfigurationProperty iPSetForwardedIPConfigurationProperty = Map.of(
     * "fallbackBehavior", "fallbackBehavior",
     * "headerName", "headerName",
     * "position", "position");
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetforwardedipconfiguration.html)
     */
    public inline fun cfnRuleGroupIPSetForwardedIPConfigurationProperty(
        block: CfnRuleGroupIPSetForwardedIPConfigurationPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.IPSetForwardedIPConfigurationProperty {
        val builder = CfnRuleGroupIPSetForwardedIPConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address
     * ranges.
     *
     * To use this, create an `IPSet` that specifies the addresses you want to detect, then use the
     * ARN of that set in this statement.
     *
     * Each IP set rule statement references an IP set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the
     * referenced set, AWS WAF automatically updates all rules that reference it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * IPSetReferenceStatementProperty iPSetReferenceStatementProperty = Map.of(
     * "arn", "arn",
     * // the properties below are optional
     * "ipSetForwardedIpConfig", Map.of(
     * "fallbackBehavior", "fallbackBehavior",
     * "headerName", "headerName",
     * "position", "position"));
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ipsetreferencestatement.html)
     */
    public inline fun cfnRuleGroupIPSetReferenceStatementProperty(
        block: CfnRuleGroupIPSetReferenceStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.IPSetReferenceStatementProperty {
        val builder = CfnRuleGroupIPSetReferenceStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used for CAPTCHA and challenge token settings.
     *
     * Determines how long a `CAPTCHA` or challenge timestamp remains valid after AWS WAF updates it
     * for a successful `CAPTCHA` or challenge response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ImmunityTimePropertyProperty immunityTimePropertyProperty =
     * ImmunityTimePropertyProperty.builder()
     * .immunityTime(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-immunitytimeproperty.html)
     */
    public inline fun cfnRuleGroupImmunityTimePropertyProperty(
        block: CfnRuleGroupImmunityTimePropertyPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.ImmunityTimePropertyProperty {
        val builder = CfnRuleGroupImmunityTimePropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect the body of the web request as JSON. The body immediately follows the request
     * headers.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Use the specifications in this object to indicate which parts of the JSON body to inspect
     * using the rule's inspection criteria. AWS WAF inspects only the parts of the JSON that result
     * from the matches that you indicate.
     *
     * Example JSON: `"JsonBody": { "MatchPattern": { "All": {} }, "MatchScope": "ALL" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * JsonBodyProperty jsonBodyProperty = JsonBodyProperty.builder()
     * .matchPattern(JsonMatchPatternProperty.builder()
     * .all(all)
     * .includedPaths(List.of("includedPaths"))
     * .build())
     * .matchScope("matchScope")
     * // the properties below are optional
     * .invalidFallbackBehavior("invalidFallbackBehavior")
     * .oversizeHandling("oversizeHandling")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonbody.html)
     */
    public inline fun cfnRuleGroupJsonBodyProperty(
        block: CfnRuleGroupJsonBodyPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.JsonBodyProperty {
        val builder = CfnRuleGroupJsonBodyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The patterns to look for in the JSON body.
     *
     * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     * This is used with the `FieldToMatch` option `JsonBody` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * JsonMatchPatternProperty jsonMatchPatternProperty = JsonMatchPatternProperty.builder()
     * .all(all)
     * .includedPaths(List.of("includedPaths"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-jsonmatchpattern.html)
     */
    public inline fun cfnRuleGroupJsonMatchPatternProperty(
        block: CfnRuleGroupJsonMatchPatternPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.JsonMatchPatternProperty {
        val builder = CfnRuleGroupJsonMatchPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement to match against labels that have been added to the web request by rules
     * that have already run in the web ACL.
     *
     * The label match statement provides the label or namespace string to search for. The label
     * string can represent a part or all of the fully qualified label name that had been added to
     * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
     * The prefix identifies the rule group or web ACL context of the rule that added the label. If
     * you do not provide the fully qualified name in your label match string, AWS WAF performs the
     * search for labels that were added in the same context as the label match statement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * LabelMatchStatementProperty labelMatchStatementProperty = LabelMatchStatementProperty.builder()
     * .key("key")
     * .scope("scope")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelmatchstatement.html)
     */
    public inline fun cfnRuleGroupLabelMatchStatementProperty(
        block: CfnRuleGroupLabelMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.LabelMatchStatementProperty {
        val builder = CfnRuleGroupLabelMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single label container.
     *
     * This is used as an element of a label array in `RuleLabels` inside a rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * LabelProperty labelProperty = LabelProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-label.html)
     */
    public inline fun cfnRuleGroupLabelProperty(
        block: CfnRuleGroupLabelPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.LabelProperty {
        val builder = CfnRuleGroupLabelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * List of labels used by one or more of the rules of a `RuleGroup` .
     *
     * This summary object is used for the following rule group lists:
     * * `AvailableLabels` - Labels that rules add to matching requests. These labels are defined in
     *   the `RuleLabels` for a rule.
     * * `ConsumedLabels` - Labels that rules match against. These labels are defined in a
     *   `LabelMatchStatement` specification, in the `Statement` definition of a rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * LabelSummaryProperty labelSummaryProperty = LabelSummaryProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelsummary.html)
     */
    public inline fun cfnRuleGroupLabelSummaryProperty(
        block: CfnRuleGroupLabelSummaryPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.LabelSummaryProperty {
        val builder = CfnRuleGroupLabelSummaryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logical rule statement used to negate the results of another rule statement.
     *
     * You provide one `Statement` within the `NotStatement` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * NotStatementProperty notStatementProperty_;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * StatementProperty statementProperty_;
     * Object uriPath;
     * NotStatementProperty notStatementProperty = NotStatementProperty.builder()
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
     * .notStatement(notStatementProperty_)
     * .orStatement(OrStatementProperty.builder()
     * .statements(List.of(statementProperty_))
     * .build())
     * .rateBasedStatement(RateBasedStatementProperty.builder()
     * .aggregateKeyType("aggregateKeyType")
     * .limit(123)
     * // the properties below are optional
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-notstatement.html)
     */
    public inline fun cfnRuleGroupNotStatementProperty(
        block: CfnRuleGroupNotStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.NotStatementProperty {
        val builder = CfnRuleGroupNotStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic.
     *
     * You provide more than one `Statement` within the `OrStatement` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * OrStatementProperty orStatementProperty_;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * StatementProperty statementProperty_;
     * Object uriPath;
     * OrStatementProperty orStatementProperty = OrStatementProperty.builder()
     * .statements(List.of(StatementProperty.builder()
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
     * .orStatement(orStatementProperty_)
     * .rateBasedStatement(RateBasedStatementProperty.builder()
     * .aggregateKeyType("aggregateKeyType")
     * .limit(123)
     * // the properties below are optional
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
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-orstatement.html)
     */
    public inline fun cfnRuleGroupOrStatementProperty(
        block: CfnRuleGroupOrStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.OrStatementProperty {
        val builder = CfnRuleGroupOrStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRuleGroup`.
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
    public inline fun cfnRuleGroupProps(
        block: CfnRuleGroupPropsDsl.() -> Unit = {}
    ): CfnRuleGroupProps {
        val builder = CfnRuleGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rate-based rule tracks the rate of requests for each originating IP address, and triggers
     * the rule action when the rate exceeds a limit that you specify on the number of requests in
     * any 5-minute time span.
     *
     * You can use this to put a temporary block on requests from an IP address that is sending
     * excessive requests.
     *
     * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
     * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
     * each of the two rule statements represents a separate instance of the rate-based rule and
     * gets its own tracking and management by AWS WAF . If you define a rate-based rule inside a
     * rule group, and then use that rule group in multiple places, each use creates a separate
     * instance of the rate-based rule that gets its own tracking and management by AWS WAF .
     *
     * When the rule action triggers, AWS WAF blocks additional requests from the IP address until
     * the request rate falls below the limit.
     *
     * You can optionally nest another statement inside the rate-based statement, to narrow the
     * scope of the rule so that it only counts requests that match the nested statement. For
     * example, based on recent requests that you have seen from an attacker, you might create a
     * rate-based rule with a nested AND rule statement that contains the following nested
     * statements:
     * * An IP match statement with an IP set that specifies the address 192.0.2.44.
     * * A string match statement that searches in the User-Agent header for the string BadBot.
     *
     * In this rate-based rule, you also define a rate limit. For this example, the rate limit is
     * 1,000. Requests that meet the criteria of both of the nested statements are counted. If the
     * count exceeds 1,000 requests per five minutes, the rule action triggers. Requests that do not
     * meet the criteria of both of the nested statements are not counted towards the rate limit and
     * are not affected by this rule.
     *
     * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
     * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
     * inside a rule group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * RateBasedStatementProperty rateBasedStatementProperty_;
     * Object singleHeader;
     * Object singleQueryArgument;
     * StatementProperty statementProperty_;
     * Object uriPath;
     * RateBasedStatementProperty rateBasedStatementProperty = RateBasedStatementProperty.builder()
     * .aggregateKeyType("aggregateKeyType")
     * .limit(123)
     * // the properties below are optional
     * .forwardedIpConfig(ForwardedIPConfigurationProperty.builder()
     * .fallbackBehavior("fallbackBehavior")
     * .headerName("headerName")
     * .build())
     * .scopeDownStatement(StatementProperty.builder()
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
     * .rateBasedStatement(rateBasedStatementProperty_)
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatement.html)
     */
    public inline fun cfnRuleGroupRateBasedStatementProperty(
        block: CfnRuleGroupRateBasedStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RateBasedStatementProperty {
        val builder = CfnRuleGroupRateBasedStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement used to search web request components for a match against a single regular
     * expression.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * RegexMatchStatementProperty regexMatchStatementProperty = RegexMatchStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexmatchstatement.html)
     */
    public inline fun cfnRuleGroupRegexMatchStatementProperty(
        block: CfnRuleGroupRegexMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RegexMatchStatementProperty {
        val builder = CfnRuleGroupRegexMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions.
     *
     * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
     * detect, then use the ARN of that set in this statement. A web request matches the pattern set
     * rule statement if the request component matches any of the patterns in the set.
     *
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain
     * the set independent of your rules. This allows you to use the single set in multiple rules.
     * When you update the referenced set, AWS WAF automatically updates all rules that reference
     * it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * RegexPatternSetReferenceStatementProperty regexPatternSetReferenceStatementProperty =
     * RegexPatternSetReferenceStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html)
     */
    public inline fun cfnRuleGroupRegexPatternSetReferenceStatementProperty(
        block: CfnRuleGroupRegexPatternSetReferenceStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RegexPatternSetReferenceStatementProperty {
        val builder = CfnRuleGroupRegexPatternSetReferenceStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnRuleGroupRuleActionProperty(
        block: CfnRuleGroupRuleActionPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RuleActionProperty {
        val builder = CfnRuleGroupRuleActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single rule, which you can use in a `WebACL` or `RuleGroup` to identify web requests that
     * you want to allow, block, or count.
     *
     * Each rule includes one top-level `Statement` that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
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
    public inline fun cfnRuleGroupRuleProperty(
        block: CfnRuleGroupRulePropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RuleProperty {
        val builder = CfnRuleGroupRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect one of the headers in the web request, identified by name, for example, `User-Agent`
     * or `Referer` .
     *
     * The name isn't case sensitive.
     *
     * You can filter and inspect all headers with the `FieldToMatch` setting `Headers` .
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example JSON: `"SingleHeader": { "Name": "haystack" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * SingleHeaderProperty singleHeaderProperty = SingleHeaderProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-singleheader.html)
     */
    public inline fun cfnRuleGroupSingleHeaderProperty(
        block: CfnRuleGroupSingleHeaderPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.SingleHeaderProperty {
        val builder = CfnRuleGroupSingleHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect one query argument in the web request, identified by name, for example *UserName* or
     * *SalesRegion* .
     *
     * The name isn't case sensitive.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * SingleQueryArgumentProperty singleQueryArgumentProperty = SingleQueryArgumentProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-singlequeryargument.html)
     */
    public inline fun cfnRuleGroupSingleQueryArgumentProperty(
        block: CfnRuleGroupSingleQueryArgumentPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.SingleQueryArgumentProperty {
        val builder = CfnRuleGroupSingleQueryArgumentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component,
     * using a comparison operator, such as greater than (&gt;) or less than (&lt;).
     *
     * For example, you can use a size constraint statement to look for query strings that are
     * longer than 100 bytes.
     *
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
     * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
     * limit is 8 KB (8,192 kilobytes) and for CloudFront web ACLs, this limit is 16 KB (16,384
     * kilobytes). For CloudFront web ACLs, you can increase the limit in the web ACL
     * `AssociationConfig` , for additional fees. If you know that the request body for your web
     * requests should never exceed the inspection limit, you could use a size constraint statement
     * to block requests that have a larger request body size.
     *
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI
     * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * SizeConstraintStatementProperty sizeConstraintStatementProperty =
     * SizeConstraintStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sizeconstraintstatement.html)
     */
    public inline fun cfnRuleGroupSizeConstraintStatementProperty(
        block: CfnRuleGroupSizeConstraintStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.SizeConstraintStatementProperty {
        val builder = CfnRuleGroupSizeConstraintStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that inspects for malicious SQL code.
     *
     * Attackers insert malicious SQL code into web requests to do things like modify your database
     * or extract data from it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * SqliMatchStatementProperty sqliMatchStatementProperty = SqliMatchStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html)
     */
    public inline fun cfnRuleGroupSqliMatchStatementProperty(
        block: CfnRuleGroupSqliMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.SqliMatchStatementProperty {
        val builder = CfnRuleGroupSqliMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The processing guidance for a rule, used by AWS WAF to determine whether a web request
     * matches the rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * StatementProperty statementProperty_;
     * Object uriPath;
     * StatementProperty statementProperty = StatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-statement.html)
     */
    public inline fun cfnRuleGroupStatementProperty(
        block: CfnRuleGroupStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.StatementProperty {
        val builder = CfnRuleGroupStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * TextTransformationProperty textTransformationProperty = TextTransformationProperty.builder()
     * .priority(123)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-texttransformation.html)
     */
    public inline fun cfnRuleGroupTextTransformationProperty(
        block: CfnRuleGroupTextTransformationPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.TextTransformationProperty {
        val builder = CfnRuleGroupTextTransformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * VisibilityConfigProperty visibilityConfigProperty = VisibilityConfigProperty.builder()
     * .cloudWatchMetricsEnabled(false)
     * .metricName("metricName")
     * .sampledRequestsEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-visibilityconfig.html)
     */
    public inline fun cfnRuleGroupVisibilityConfigProperty(
        block: CfnRuleGroupVisibilityConfigPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.VisibilityConfigProperty {
        val builder = CfnRuleGroupVisibilityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that inspects for cross-site scripting (XSS) attacks.
     *
     * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to inject
     * malicious client-site scripts into other legitimate web browsers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * XssMatchStatementProperty xssMatchStatementProperty = XssMatchStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-xssmatchstatement.html)
     */
    public inline fun cfnRuleGroupXssMatchStatementProperty(
        block: CfnRuleGroupXssMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.XssMatchStatementProperty {
        val builder = CfnRuleGroupXssMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
     *
     * For information, including how to migrate your AWS WAF resources from the prior release, see
     * the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Use an `WebACL` to define a collection of rules to use to inspect and control web requests.
     * Each rule has an action defined (allow, block, or count) for requests that match the
     * statement of the rule. In the web ACL, you specify a default action to take (allow, block)
     * for any request that doesn't match any of the rules. The rules in a web ACL can contain rule
     * statements that you define explicitly and rule statements that reference rule groups and
     * managed rule groups. You can associate a web ACL with one or more AWS resources to protect.
     * The resources can be an Amazon CloudFront distribution, an Amazon API Gateway REST API, an
     * Application Load Balancer , an AWS AppSync GraphQL API , an Amazon Cognito user pool, an AWS
     * App Runner service, or an AWS Verified Access instance.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html)
     */
    public inline fun cfnWebACL(
        scope: Construct,
        id: String,
        block: CfnWebACLDsl.() -> Unit = {},
    ): CfnWebACL {
        val builder = CfnWebACLDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for your use of the account takeover prevention managed rule group,
     * `AWSManagedRulesATPRuleSet` .
     *
     * This configuration is used in `ManagedRuleGroupConfig` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * AWSManagedRulesATPRuleSetProperty aWSManagedRulesATPRuleSetProperty =
     * AWSManagedRulesATPRuleSetProperty.builder()
     * .loginPath("loginPath")
     * // the properties below are optional
     * .requestInspection(RequestInspectionProperty.builder()
     * .passwordField(FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build())
     * .payloadType("payloadType")
     * .usernameField(FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build())
     * .build())
     * .responseInspection(ResponseInspectionProperty.builder()
     * .bodyContains(ResponseInspectionBodyContainsProperty.builder()
     * .failureStrings(List.of("failureStrings"))
     * .successStrings(List.of("successStrings"))
     * .build())
     * .header(ResponseInspectionHeaderProperty.builder()
     * .failureValues(List.of("failureValues"))
     * .name("name")
     * .successValues(List.of("successValues"))
     * .build())
     * .json(ResponseInspectionJsonProperty.builder()
     * .failureValues(List.of("failureValues"))
     * .identifier("identifier")
     * .successValues(List.of("successValues"))
     * .build())
     * .statusCode(ResponseInspectionStatusCodeProperty.builder()
     * .failureCodes(List.of(123))
     * .successCodes(List.of(123))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesatpruleset.html)
     */
    public inline fun cfnWebACLAWSManagedRulesATPRuleSetProperty(
        block: CfnWebACLAWSManagedRulesATPRuleSetPropertyDsl.() -> Unit = {}
    ): CfnWebACL.AWSManagedRulesATPRuleSetProperty {
        val builder = CfnWebACLAWSManagedRulesATPRuleSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details for your use of the Bot Control managed rule group, used in `ManagedRuleGroupConfig`
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * AWSManagedRulesBotControlRuleSetProperty aWSManagedRulesBotControlRuleSetProperty =
     * AWSManagedRulesBotControlRuleSetProperty.builder()
     * .inspectionLevel("inspectionLevel")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesbotcontrolruleset.html)
     */
    public inline fun cfnWebACLAWSManagedRulesBotControlRuleSetProperty(
        block: CfnWebACLAWSManagedRulesBotControlRuleSetPropertyDsl.() -> Unit = {}
    ): CfnWebACL.AWSManagedRulesBotControlRuleSetProperty {
        val builder = CfnWebACLAWSManagedRulesBotControlRuleSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies that AWS WAF should allow the request and optionally defines additional custom
     * handling for the request.
     *
     * This is used in the context of other settings, for example to specify values for a rule
     * action or a web ACL default action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * AllowActionProperty allowActionProperty = AllowActionProperty.builder()
     * .customRequestHandling(CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-allowaction.html)
     */
    public inline fun cfnWebACLAllowActionProperty(
        block: CfnWebACLAllowActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.AllowActionProperty {
        val builder = CfnWebACLAllowActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logical rule statement used to combine other rule statements with AND logic.
     *
     * You provide more than one `Statement` within the `AndStatement` .
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-andstatement.html)
     */
    public inline fun cfnWebACLAndStatementProperty(
        block: CfnWebACLAndStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.AndStatementProperty {
        val builder = CfnWebACLAndStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This is the latest version of *AWS WAF* , named AWS WAF V2, released in November, 2019.
     *
     * For information, including how to migrate your AWS WAF resources from the prior release, see
     * the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Use a web ACL association to define an association between a web ACL and a regional
     * application resource, to protect the resource. A regional application can be an Application
     * Load Balancer (ALB), an Amazon API Gateway REST API, an AWS AppSync GraphQL API, an Amazon
     * Cognito user pool, an AWS App Runner service, or an AWS Verified Access instance.
     *
     * For Amazon CloudFront , don't use this resource. Instead, use your CloudFront distribution
     * configuration. To associate a web ACL with a distribution, provide the Amazon Resource Name
     * (ARN) of the `WebACL` to your CloudFront distribution configuration. To disassociate a web
     * ACL, provide an empty ARN. For information, see
     * [AWS::CloudFront::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
     * .
     *
     * When you create a web ACL or make changes to a web ACL or web ACL components, like rules and
     * rule groups, AWS WAF propagates the changes everywhere that the web ACL and its components
     * are stored and used. Your changes are applied within seconds, but there might be a brief
     * period of inconsistency when the changes have arrived in some places and not in others. So,
     * for example, if you change a rule action setting, the action might be the old action in one
     * area and the new action in another area. Or if you add an IP address to an IP set used in a
     * blocking rule, the new address might briefly be blocked in one area while still allowed in
     * another. This temporary inconsistency can occur when you first associate a web ACL with an
     * AWS resource and when you change a web ACL that is already associated with a resource.
     * Generally, any inconsistencies of this type last only a few seconds.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CfnWebACLAssociation cfnWebACLAssociation = CfnWebACLAssociation.Builder.create(this,
     * "MyCfnWebACLAssociation")
     * .resourceArn("resourceArn")
     * .webAclArn("webAclArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html)
     */
    public inline fun cfnWebACLAssociation(
        scope: Construct,
        id: String,
        block: CfnWebACLAssociationDsl.() -> Unit = {},
    ): CfnWebACLAssociation {
        val builder = CfnWebACLAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies custom configurations for the associations between the web ACL and protected
     * resources.
     *
     * Use this to customize the maximum size of the request body that your protected CloudFront
     * distributions forward to AWS WAF for inspection. The default is 16 KB (16,384 kilobytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * AssociationConfigProperty associationConfigProperty = AssociationConfigProperty.builder()
     * .requestBody(Map.of(
     * "requestBodyKey", RequestBodyAssociatedResourceTypeConfigProperty.builder()
     * .defaultSizeInspectionLimit("defaultSizeInspectionLimit")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-associationconfig.html)
     */
    public inline fun cfnWebACLAssociationConfigProperty(
        block: CfnWebACLAssociationConfigPropertyDsl.() -> Unit = {}
    ): CfnWebACL.AssociationConfigProperty {
        val builder = CfnWebACLAssociationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWebACLAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CfnWebACLAssociationProps cfnWebACLAssociationProps = CfnWebACLAssociationProps.builder()
     * .resourceArn("resourceArn")
     * .webAclArn("webAclArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webaclassociation.html)
     */
    public inline fun cfnWebACLAssociationProps(
        block: CfnWebACLAssociationPropsDsl.() -> Unit = {}
    ): CfnWebACLAssociationProps {
        val builder = CfnWebACLAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies that AWS WAF should block the request and optionally defines additional custom
     * handling for the response to the web request.
     *
     * This is used in the context of other settings, for example to specify values for a rule
     * action or a web ACL default action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * BlockActionProperty blockActionProperty = BlockActionProperty.builder()
     * .customResponse(CustomResponseProperty.builder()
     * .responseCode(123)
     * // the properties below are optional
     * .customResponseBodyKey("customResponseBodyKey")
     * .responseHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-blockaction.html)
     */
    public inline fun cfnWebACLBlockActionProperty(
        block: CfnWebACLBlockActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.BlockActionProperty {
        val builder = CfnWebACLBlockActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect the body of the web request. The body immediately follows the request headers.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * BodyProperty bodyProperty = BodyProperty.builder()
     * .oversizeHandling("oversizeHandling")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-body.html)
     */
    public inline fun cfnWebACLBodyProperty(
        block: CfnWebACLBodyPropertyDsl.() -> Unit = {}
    ): CfnWebACL.BodyProperty {
        val builder = CfnWebACLBodyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests.
     *
     * The byte match statement provides the bytes to search for, the location in requests that you
     * want AWS WAF to search, and other settings. The bytes to search for are typically a string
     * that corresponds with ASCII characters. In the AWS WAF console and the developer guide, this
     * is called a string match statement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * ByteMatchStatementProperty byteMatchStatementProperty = ByteMatchStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html)
     */
    public inline fun cfnWebACLByteMatchStatementProperty(
        block: CfnWebACLByteMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ByteMatchStatementProperty {
        val builder = CfnWebACLByteMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies that AWS WAF should run a `CAPTCHA` check against the request:.
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
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CaptchaActionProperty captchaActionProperty = CaptchaActionProperty.builder()
     * .customRequestHandling(CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-captchaaction.html)
     */
    public inline fun cfnWebACLCaptchaActionProperty(
        block: CfnWebACLCaptchaActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.CaptchaActionProperty {
        val builder = CfnWebACLCaptchaActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how AWS WAF should handle `CAPTCHA` evaluations for rules that don't have their own
     * `CaptchaConfig` settings.
     *
     * If you don't specify this, AWS WAF uses its default settings for `CaptchaConfig` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CaptchaConfigProperty captchaConfigProperty = CaptchaConfigProperty.builder()
     * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
     * .immunityTime(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-captchaconfig.html)
     */
    public inline fun cfnWebACLCaptchaConfigProperty(
        block: CfnWebACLCaptchaConfigPropertyDsl.() -> Unit = {}
    ): CfnWebACL.CaptchaConfigProperty {
        val builder = CfnWebACLCaptchaConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies that AWS WAF should run a `Challenge` check against the request to verify that the
     * request is coming from a legitimate client session: - If the request includes a valid,
     * unexpired challenge token, AWS WAF applies any custom request handling and labels that you've
     * configured and then allows the web request inspection to proceed to the next rule, similar to
     * a `CountAction` .
     * * If the request doesn't include a valid, unexpired challenge token, AWS WAF discontinues the
     *   web ACL evaluation of the request and blocks it from going to its intended destination.
     *
     * AWS WAF then generates a challenge response that it sends back to the client, which includes
     * the following:
     * * The header `x-amzn-waf-action` with a value of `challenge` .
     * * The HTTP status code `202 Request Accepted` .
     * * If the request contains an `Accept` header with a value of `text/html` , the response
     *   includes a JavaScript page interstitial with a challenge script.
     *
     * Challenges run silent browser interrogations in the background, and don't generally affect
     * the end user experience.
     *
     * A challenge enforces token acquisition using an interstitial JavaScript challenge that
     * inspects the client session for legitimate behavior. The challenge blocks bots or at least
     * increases the cost of operating sophisticated bots.
     *
     * After the client session successfully responds to the challenge, it receives a new token from
     * AWS WAF , which the challenge script uses to resubmit the original request.
     *
     * You can configure the expiration time in the `ChallengeConfig` `ImmunityTimeProperty` setting
     * at the rule and web ACL level. The rule setting overrides the web ACL setting.
     *
     * This action option is available for rules. It isn't available for web ACL default actions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ChallengeActionProperty challengeActionProperty = ChallengeActionProperty.builder()
     * .customRequestHandling(CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-challengeaction.html)
     */
    public inline fun cfnWebACLChallengeActionProperty(
        block: CfnWebACLChallengeActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ChallengeActionProperty {
        val builder = CfnWebACLChallengeActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies how AWS WAF should handle `Challenge` evaluations.
     *
     * This is available at the web ACL level and in each rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ChallengeConfigProperty challengeConfigProperty = ChallengeConfigProperty.builder()
     * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
     * .immunityTime(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-challengeconfig.html)
     */
    public inline fun cfnWebACLChallengeConfigProperty(
        block: CfnWebACLChallengeConfigPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ChallengeConfigProperty {
        val builder = CfnWebACLChallengeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The filter to use to identify the subset of cookies to inspect in a web request.
     *
     * You must specify exactly one setting: either `All` , `IncludedCookies` , or `ExcludedCookies`
     * .
     *
     * Example JSON: `"MatchPattern": { "IncludedCookies": [ "session-id-time", "session-id" ] }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * CookieMatchPatternProperty cookieMatchPatternProperty = CookieMatchPatternProperty.builder()
     * .all(all)
     * .excludedCookies(List.of("excludedCookies"))
     * .includedCookies(List.of("includedCookies"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookiematchpattern.html)
     */
    public inline fun cfnWebACLCookieMatchPatternProperty(
        block: CfnWebACLCookieMatchPatternPropertyDsl.() -> Unit = {}
    ): CfnWebACL.CookieMatchPatternProperty {
        val builder = CfnWebACLCookieMatchPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect the cookies in the web request.
     *
     * You can specify the parts of the cookies to inspect and you can narrow the set of cookies to
     * inspect by including or excluding specific keys.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example JSON: `"Cookies": { "MatchPattern": { "All": {} }, "MatchScope": "KEY",
     * "OversizeHandling": "MATCH" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * CookiesProperty cookiesProperty = CookiesProperty.builder()
     * .matchPattern(CookieMatchPatternProperty.builder()
     * .all(all)
     * .excludedCookies(List.of("excludedCookies"))
     * .includedCookies(List.of("includedCookies"))
     * .build())
     * .matchScope("matchScope")
     * .oversizeHandling("oversizeHandling")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-cookies.html)
     */
    public inline fun cfnWebACLCookiesProperty(
        block: CfnWebACLCookiesPropertyDsl.() -> Unit = {}
    ): CfnWebACL.CookiesProperty {
        val builder = CfnWebACLCookiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies that AWS WAF should count the request. Optionally defines additional custom
     * handling for the request.
     *
     * This is used in the context of other settings, for example to specify values for a rule
     * action or a web ACL default action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CountActionProperty countActionProperty = CountActionProperty.builder()
     * .customRequestHandling(CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-countaction.html)
     */
    public inline fun cfnWebACLCountActionProperty(
        block: CfnWebACLCountActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.CountActionProperty {
        val builder = CfnWebACLCountActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom header for custom request and response handling.
     *
     * This is used in `CustomResponse` and `CustomRequestHandling` .
     *
     * Example:
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customhttpheader.html)
     */
    public inline fun cfnWebACLCustomHTTPHeaderProperty(
        block: CfnWebACLCustomHTTPHeaderPropertyDsl.() -> Unit = {}
    ): CfnWebACL.CustomHTTPHeaderProperty {
        val builder = CfnWebACLCustomHTTPHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Custom request handling behavior that inserts custom headers into a web request.
     *
     * You can add custom request handling for AWS WAF to use when the rule action doesn't block the
     * request. For example, `CaptchaAction` for requests with valid t okens, and `AllowAction` .
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the *AWS WAF Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CustomRequestHandlingProperty customRequestHandlingProperty =
     * CustomRequestHandlingProperty.builder()
     * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customrequesthandling.html)
     */
    public inline fun cfnWebACLCustomRequestHandlingProperty(
        block: CfnWebACLCustomRequestHandlingPropertyDsl.() -> Unit = {}
    ): CfnWebACL.CustomRequestHandlingProperty {
        val builder = CfnWebACLCustomRequestHandlingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The response body to use in a custom response to a web request.
     *
     * This is referenced by key from `CustomResponse` `CustomResponseBodyKey` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * CustomResponseBodyProperty customResponseBodyProperty = CustomResponseBodyProperty.builder()
     * .content("content")
     * .contentType("contentType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponsebody.html)
     */
    public inline fun cfnWebACLCustomResponseBodyProperty(
        block: CfnWebACLCustomResponseBodyPropertyDsl.() -> Unit = {}
    ): CfnWebACL.CustomResponseBodyProperty {
        val builder = CfnWebACLCustomResponseBodyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom response to send to the client.
     *
     * You can define a custom response for rule actions and default web ACL actions that are set to
     * the block action.
     *
     * For information about customizing web requests and responses, see
     * [Customizing web requests and responses in AWS WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html)
     * in the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Example:
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customresponse.html)
     */
    public inline fun cfnWebACLCustomResponseProperty(
        block: CfnWebACLCustomResponsePropertyDsl.() -> Unit = {}
    ): CfnWebACL.CustomResponseProperty {
        val builder = CfnWebACLCustomResponsePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * In a `WebACL` , this is the action that you want AWS WAF to perform when a web request
     * doesn't match any of the rules in the `WebACL` .
     *
     * The default action must be a terminating action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * DefaultActionProperty defaultActionProperty = DefaultActionProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-defaultaction.html)
     */
    public inline fun cfnWebACLDefaultActionProperty(
        block: CfnWebACLDefaultActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.DefaultActionProperty {
        val builder = CfnWebACLDefaultActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a single rule in a rule group whose action you want to override to `Count` .
     *
     * Instead of this option, use `RuleActionOverrides` . It accepts any valid action setting,
     * including `Count` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ExcludedRuleProperty excludedRuleProperty = ExcludedRuleProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-excludedrule.html)
     */
    public inline fun cfnWebACLExcludedRuleProperty(
        block: CfnWebACLExcludedRulePropertyDsl.() -> Unit = {}
    ): CfnWebACL.ExcludedRuleProperty {
        val builder = CfnWebACLExcludedRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The identifier of the username or password field, used in the `ManagedRuleGroupConfig`
     * settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * FieldIdentifierProperty fieldIdentifierProperty = FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldidentifier.html)
     */
    public inline fun cfnWebACLFieldIdentifierProperty(
        block: CfnWebACLFieldIdentifierPropertyDsl.() -> Unit = {}
    ): CfnWebACL.FieldIdentifierProperty {
        val builder = CfnWebACLFieldIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The part of the web request that you want AWS WAF to inspect.
     *
     * Include the single `FieldToMatch` type that you want to inspect, with additional
     * specifications as needed, according to the type. You specify a single request component in
     * `FieldToMatch` for each rule statement that requires it. To inspect more than one component
     * of the web request, create a separate rule statement for each component.
     *
     * Example JSON for a `QueryString` field to match:
     *
     * `"FieldToMatch": { "QueryString": {} }`
     *
     * Example JSON for a `Method` field to match specification:
     *
     * `"FieldToMatch": { "Method": { "Name": "DELETE" } }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html)
     */
    public inline fun cfnWebACLFieldToMatchProperty(
        block: CfnWebACLFieldToMatchPropertyDsl.() -> Unit = {}
    ): CfnWebACL.FieldToMatchProperty {
        val builder = CfnWebACLFieldToMatchPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of
     * using the IP address that's reported by the web request origin.
     *
     * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     * This configuration is used for `GeoMatchStatement` and `RateBasedStatement` . For
     * `IPSetReferenceStatement` , use `IPSetForwardedIPConfig` instead.
     *
     * AWS WAF only evaluates the first IP address found in the specified HTTP header.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ForwardedIPConfigurationProperty forwardedIPConfigurationProperty =
     * ForwardedIPConfigurationProperty.builder()
     * .fallbackBehavior("fallbackBehavior")
     * .headerName("headerName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-forwardedipconfiguration.html)
     */
    public inline fun cfnWebACLForwardedIPConfigurationProperty(
        block: CfnWebACLForwardedIPConfigurationPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ForwardedIPConfigurationProperty {
        val builder = CfnWebACLForwardedIPConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that labels web requests by country and region and that matches against web
     * requests based on country code.
     *
     * A geo match rule labels every request that it inspects regardless of whether it finds a
     * match.
     * * To manage requests only by country, you can use this statement by itself and specify the
     *   countries that you want to match against in the `CountryCodes` array.
     * * Otherwise, configure your geo match rule with Count action so that it only labels requests.
     *   Then, add one or more label match rules to run after the geo match rule and configure them
     *   to match against the geographic labels and handle the requests as needed.
     *
     * AWS WAF labels requests using the alpha-2 country and region codes from the International
     * Organization for Standardization (ISO) 3166 standard. AWS WAF determines the codes using
     * either the IP address in the web request origin or, if you specify it, the address in the geo
     * match `ForwardedIPConfig` .
     *
     * If you use the web request origin, the label formats are `awswaf:clientip:geo:region:&lt;ISO
     * country code&gt;-&lt;ISO region code&gt;` and `awswaf:clientip:geo:country:&lt;ISO country
     * code&gt;` .
     *
     * If you use a forwarded IP address, the label formats are
     * `awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;` and
     * `awswaf:forwardedip:geo:country:&lt;ISO country code&gt;` .
     *
     * For additional details, see
     * [Geographic match rule statement](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html)
     * in the
     * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * GeoMatchStatementProperty geoMatchStatementProperty = GeoMatchStatementProperty.builder()
     * .countryCodes(List.of("countryCodes"))
     * .forwardedIpConfig(ForwardedIPConfigurationProperty.builder()
     * .fallbackBehavior("fallbackBehavior")
     * .headerName("headerName")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-geomatchstatement.html)
     */
    public inline fun cfnWebACLGeoMatchStatementProperty(
        block: CfnWebACLGeoMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.GeoMatchStatementProperty {
        val builder = CfnWebACLGeoMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The filter to use to identify the subset of headers to inspect in a web request.
     *
     * You must specify exactly one setting: either `All` , `IncludedHeaders` , or `ExcludedHeaders`
     * .
     *
     * Example JSON: `"MatchPattern": { "ExcludedHeaders": [ "KeyToExclude1", "KeyToExclude2" ] }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * HeaderMatchPatternProperty headerMatchPatternProperty = HeaderMatchPatternProperty.builder()
     * .all(all)
     * .excludedHeaders(List.of("excludedHeaders"))
     * .includedHeaders(List.of("includedHeaders"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headermatchpattern.html)
     */
    public inline fun cfnWebACLHeaderMatchPatternProperty(
        block: CfnWebACLHeaderMatchPatternPropertyDsl.() -> Unit = {}
    ): CfnWebACL.HeaderMatchPatternProperty {
        val builder = CfnWebACLHeaderMatchPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect all headers in the web request.
     *
     * You can specify the parts of the headers to inspect and you can narrow the set of headers to
     * inspect by including or excluding specific keys.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * If you want to inspect just the value of a single header, use the `SingleHeader`
     * `FieldToMatch` setting instead.
     *
     * Example JSON: `"Headers": { "MatchPattern": { "All": {} }, "MatchScope": "KEY",
     * "OversizeHandling": "MATCH" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * HeadersProperty headersProperty = HeadersProperty.builder()
     * .matchPattern(HeaderMatchPatternProperty.builder()
     * .all(all)
     * .excludedHeaders(List.of("excludedHeaders"))
     * .includedHeaders(List.of("includedHeaders"))
     * .build())
     * .matchScope("matchScope")
     * .oversizeHandling("oversizeHandling")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-headers.html)
     */
    public inline fun cfnWebACLHeadersProperty(
        block: CfnWebACLHeadersPropertyDsl.() -> Unit = {}
    ): CfnWebACL.HeadersProperty {
        val builder = CfnWebACLHeadersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of
     * using the IP address that's reported by the web request origin.
     *
     * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     * This configuration is used only for `IPSetReferenceStatement` . For `GeoMatchStatement` and
     * `RateBasedStatement` , use `ForwardedIPConfig` instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * IPSetForwardedIPConfigurationProperty iPSetForwardedIPConfigurationProperty = Map.of(
     * "fallbackBehavior", "fallbackBehavior",
     * "headerName", "headerName",
     * "position", "position");
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetforwardedipconfiguration.html)
     */
    public inline fun cfnWebACLIPSetForwardedIPConfigurationProperty(
        block: CfnWebACLIPSetForwardedIPConfigurationPropertyDsl.() -> Unit = {}
    ): CfnWebACL.IPSetForwardedIPConfigurationProperty {
        val builder = CfnWebACLIPSetForwardedIPConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address
     * ranges.
     *
     * To use this, create an `IPSet` that specifies the addresses you want to detect, then use the
     * ARN of that set in this statement.
     *
     * Each IP set rule statement references an IP set. You create and maintain the set independent
     * of your rules. This allows you to use the single set in multiple rules. When you update the
     * referenced set, AWS WAF automatically updates all rules that reference it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * IPSetReferenceStatementProperty iPSetReferenceStatementProperty = Map.of(
     * "arn", "arn",
     * // the properties below are optional
     * "ipSetForwardedIpConfig", Map.of(
     * "fallbackBehavior", "fallbackBehavior",
     * "headerName", "headerName",
     * "position", "position"));
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ipsetreferencestatement.html)
     */
    public inline fun cfnWebACLIPSetReferenceStatementProperty(
        block: CfnWebACLIPSetReferenceStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.IPSetReferenceStatementProperty {
        val builder = CfnWebACLIPSetReferenceStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Used for CAPTCHA and challenge token settings.
     *
     * Determines how long a `CAPTCHA` or challenge timestamp remains valid after AWS WAF updates it
     * for a successful `CAPTCHA` or challenge response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ImmunityTimePropertyProperty immunityTimePropertyProperty =
     * ImmunityTimePropertyProperty.builder()
     * .immunityTime(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-immunitytimeproperty.html)
     */
    public inline fun cfnWebACLImmunityTimePropertyProperty(
        block: CfnWebACLImmunityTimePropertyPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ImmunityTimePropertyProperty {
        val builder = CfnWebACLImmunityTimePropertyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect the body of the web request as JSON. The body immediately follows the request
     * headers.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Use the specifications in this object to indicate which parts of the JSON body to inspect
     * using the rule's inspection criteria. AWS WAF inspects only the parts of the JSON that result
     * from the matches that you indicate.
     *
     * Example JSON: `"JsonBody": { "MatchPattern": { "All": {} }, "MatchScope": "ALL" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * JsonBodyProperty jsonBodyProperty = JsonBodyProperty.builder()
     * .matchPattern(JsonMatchPatternProperty.builder()
     * .all(all)
     * .includedPaths(List.of("includedPaths"))
     * .build())
     * .matchScope("matchScope")
     * // the properties below are optional
     * .invalidFallbackBehavior("invalidFallbackBehavior")
     * .oversizeHandling("oversizeHandling")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonbody.html)
     */
    public inline fun cfnWebACLJsonBodyProperty(
        block: CfnWebACLJsonBodyPropertyDsl.() -> Unit = {}
    ): CfnWebACL.JsonBodyProperty {
        val builder = CfnWebACLJsonBodyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The patterns to look for in the JSON body.
     *
     * AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
     * This is used with the `FieldToMatch` option `JsonBody` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * JsonMatchPatternProperty jsonMatchPatternProperty = JsonMatchPatternProperty.builder()
     * .all(all)
     * .includedPaths(List.of("includedPaths"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-jsonmatchpattern.html)
     */
    public inline fun cfnWebACLJsonMatchPatternProperty(
        block: CfnWebACLJsonMatchPatternPropertyDsl.() -> Unit = {}
    ): CfnWebACL.JsonMatchPatternProperty {
        val builder = CfnWebACLJsonMatchPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement to match against labels that have been added to the web request by rules
     * that have already run in the web ACL.
     *
     * The label match statement provides the label or namespace string to search for. The label
     * string can represent a part or all of the fully qualified label name that had been added to
     * the web request. Fully qualified labels have a prefix, optional namespaces, and label name.
     * The prefix identifies the rule group or web ACL context of the rule that added the label. If
     * you do not provide the fully qualified name in your label match string, AWS WAF performs the
     * search for labels that were added in the same context as the label match statement.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * LabelMatchStatementProperty labelMatchStatementProperty = LabelMatchStatementProperty.builder()
     * .key("key")
     * .scope("scope")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-labelmatchstatement.html)
     */
    public inline fun cfnWebACLLabelMatchStatementProperty(
        block: CfnWebACLLabelMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.LabelMatchStatementProperty {
        val builder = CfnWebACLLabelMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single label container.
     *
     * This is used as an element of a label array in `RuleLabels` inside a rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * LabelProperty labelProperty = LabelProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-label.html)
     */
    public inline fun cfnWebACLLabelProperty(
        block: CfnWebACLLabelPropertyDsl.() -> Unit = {}
    ): CfnWebACL.LabelProperty {
        val builder = CfnWebACLLabelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional information that's used by a managed rule group. Many managed rule groups don't
     * require this.
     *
     * Use the `AWSManagedRulesBotControlRuleSet` configuration object to configure the protection
     * level that you want the Bot Control rule group to use.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ManagedRuleGroupConfigProperty managedRuleGroupConfigProperty =
     * ManagedRuleGroupConfigProperty.builder()
     * .awsManagedRulesAtpRuleSet(AWSManagedRulesATPRuleSetProperty.builder()
     * .loginPath("loginPath")
     * // the properties below are optional
     * .requestInspection(RequestInspectionProperty.builder()
     * .passwordField(FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build())
     * .payloadType("payloadType")
     * .usernameField(FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build())
     * .build())
     * .responseInspection(ResponseInspectionProperty.builder()
     * .bodyContains(ResponseInspectionBodyContainsProperty.builder()
     * .failureStrings(List.of("failureStrings"))
     * .successStrings(List.of("successStrings"))
     * .build())
     * .header(ResponseInspectionHeaderProperty.builder()
     * .failureValues(List.of("failureValues"))
     * .name("name")
     * .successValues(List.of("successValues"))
     * .build())
     * .json(ResponseInspectionJsonProperty.builder()
     * .failureValues(List.of("failureValues"))
     * .identifier("identifier")
     * .successValues(List.of("successValues"))
     * .build())
     * .statusCode(ResponseInspectionStatusCodeProperty.builder()
     * .failureCodes(List.of(123))
     * .successCodes(List.of(123))
     * .build())
     * .build())
     * .build())
     * .awsManagedRulesBotControlRuleSet(AWSManagedRulesBotControlRuleSetProperty.builder()
     * .inspectionLevel("inspectionLevel")
     * .build())
     * .loginPath("loginPath")
     * .passwordField(FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build())
     * .payloadType("payloadType")
     * .usernameField(FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupconfig.html)
     */
    public inline fun cfnWebACLManagedRuleGroupConfigProperty(
        block: CfnWebACLManagedRuleGroupConfigPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ManagedRuleGroupConfigProperty {
        val builder = CfnWebACLManagedRuleGroupConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement used to run the rules that are defined in a managed rule group.
     *
     * To use this, provide the vendor name and the name of the rule group in this statement.
     *
     * You cannot nest a `ManagedRuleGroupStatement` , for example for use inside a `NotStatement`
     * or `OrStatement` . It can only be referenced as a top-level statement within a rule.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-managedrulegroupstatement.html)
     */
    public inline fun cfnWebACLManagedRuleGroupStatementProperty(
        block: CfnWebACLManagedRuleGroupStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ManagedRuleGroupStatementProperty {
        val builder = CfnWebACLManagedRuleGroupStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logical rule statement used to negate the results of another rule statement.
     *
     * You provide one `Statement` within the `NotStatement` .
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-notstatement.html)
     */
    public inline fun cfnWebACLNotStatementProperty(
        block: CfnWebACLNotStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.NotStatementProperty {
        val builder = CfnWebACLNotStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic.
     *
     * You provide more than one `Statement` within the `OrStatement` .
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-orstatement.html)
     */
    public inline fun cfnWebACLOrStatementProperty(
        block: CfnWebACLOrStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.OrStatementProperty {
        val builder = CfnWebACLOrStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The action to use in the place of the action that results from the rule group evaluation.
     *
     * Set the override action to none to leave the result of the rule group alone. Set it to count
     * to override the result to count only.
     *
     * You can only use this for rule statements that reference a rule group, like
     * `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
     *
     * This option is usually set to none. It does not affect how the rules in the rule group are
     * evaluated. If you want the rules in the rule group to only count matches, do not use this and
     * instead use the rule action override option, with `Count` action, in your rule group
     * reference statement settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object count;
     * Object none;
     * OverrideActionProperty overrideActionProperty = OverrideActionProperty.builder()
     * .count(count)
     * .none(none)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-overrideaction.html)
     */
    public inline fun cfnWebACLOverrideActionProperty(
        block: CfnWebACLOverrideActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.OverrideActionProperty {
        val builder = CfnWebACLOverrideActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnWebACL`.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafv2-webacl.html)
     */
    public inline fun cfnWebACLProps(block: CfnWebACLPropsDsl.() -> Unit = {}): CfnWebACLProps {
        val builder = CfnWebACLPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rate-based rule tracks the rate of requests for each originating IP address, and triggers
     * the rule action when the rate exceeds a limit that you specify on the number of requests in
     * any 5-minute time span.
     *
     * You can use this to put a temporary block on requests from an IP address that is sending
     * excessive requests.
     *
     * AWS WAF tracks and manages web requests separately for each instance of a rate-based rule
     * that you use. For example, if you provide the same rate-based rule settings in two web ACLs,
     * each of the two rule statements represents a separate instance of the rate-based rule and
     * gets its own tracking and management by AWS WAF . If you define a rate-based rule inside a
     * rule group, and then use that rule group in multiple places, each use creates a separate
     * instance of the rate-based rule that gets its own tracking and management by AWS WAF .
     *
     * When the rule action triggers, AWS WAF blocks additional requests from the IP address until
     * the request rate falls below the limit.
     *
     * You can optionally nest another statement inside the rate-based statement, to narrow the
     * scope of the rule so that it only counts requests that match the nested statement. For
     * example, based on recent requests that you have seen from an attacker, you might create a
     * rate-based rule with a nested AND rule statement that contains the following nested
     * statements:
     * * An IP match statement with an IP set that specifies the address 192.0.2.44.
     * * A string match statement that searches in the User-Agent header for the string BadBot.
     *
     * In this rate-based rule, you also define a rate limit. For this example, the rate limit is
     * 1,000. Requests that meet the criteria of both of the nested statements are counted. If the
     * count exceeds 1,000 requests per five minutes, the rule action triggers. Requests that do not
     * meet the criteria of both of the nested statements are not counted towards the rate limit and
     * are not affected by this rule.
     *
     * You cannot nest a `RateBasedStatement` inside another statement, for example inside a
     * `NotStatement` or `OrStatement` . You can define a `RateBasedStatement` inside a web ACL and
     * inside a rule group.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratebasedstatement.html)
     */
    public inline fun cfnWebACLRateBasedStatementProperty(
        block: CfnWebACLRateBasedStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.RateBasedStatementProperty {
        val builder = CfnWebACLRateBasedStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement used to search web request components for a match against a single regular
     * expression.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * RegexMatchStatementProperty regexMatchStatementProperty = RegexMatchStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexmatchstatement.html)
     */
    public inline fun cfnWebACLRegexMatchStatementProperty(
        block: CfnWebACLRegexMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.RegexMatchStatementProperty {
        val builder = CfnWebACLRegexMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions.
     *
     * To use this, create a `RegexPatternSet` that specifies the expressions that you want to
     * detect, then use that set in this statement. A web request matches the pattern set rule
     * statement if the request component matches any of the patterns in the set.
     *
     * Each regex pattern set rule statement references a regex pattern set. You create and maintain
     * the set independent of your rules. This allows you to use the single set in multiple rules.
     * When you update the referenced set, AWS WAF automatically updates all rules that reference
     * it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * RegexPatternSetReferenceStatementProperty regexPatternSetReferenceStatementProperty =
     * RegexPatternSetReferenceStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html)
     */
    public inline fun cfnWebACLRegexPatternSetReferenceStatementProperty(
        block: CfnWebACLRegexPatternSetReferenceStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.RegexPatternSetReferenceStatementProperty {
        val builder = CfnWebACLRegexPatternSetReferenceStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Customizes the maximum size of the request body that your protected CloudFront distributions
     * forward to AWS WAF for inspection.
     *
     * The default size is 16 KB (16,384 kilobytes).
     *
     * You are charged additional fees when your protected resources forward body sizes that are
     * larger than the default. For more information, see
     * [AWS WAF Pricing](https://docs.aws.amazon.com/waf/pricing/) .
     *
     * This is used in the `AssociationConfig` of the web ACL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * RequestBodyAssociatedResourceTypeConfigProperty requestBodyAssociatedResourceTypeConfigProperty
     * = RequestBodyAssociatedResourceTypeConfigProperty.builder()
     * .defaultSizeInspectionLimit("defaultSizeInspectionLimit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestbodyassociatedresourcetypeconfig.html)
     */
    public inline fun cfnWebACLRequestBodyAssociatedResourceTypeConfigProperty(
        block: CfnWebACLRequestBodyAssociatedResourceTypeConfigPropertyDsl.() -> Unit = {}
    ): CfnWebACL.RequestBodyAssociatedResourceTypeConfigProperty {
        val builder = CfnWebACLRequestBodyAssociatedResourceTypeConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria for inspecting login requests, used by the ATP rule group to validate
     * credentials usage.
     *
     * This is part of the `AWSManagedRulesATPRuleSet` configuration in `ManagedRuleGroupConfig` .
     *
     * In these settings, you specify how your application accepts login attempts by providing the
     * request payload type and the names of the fields within the request body where the username
     * and password are provided.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * RequestInspectionProperty requestInspectionProperty = RequestInspectionProperty.builder()
     * .passwordField(FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build())
     * .payloadType("payloadType")
     * .usernameField(FieldIdentifierProperty.builder()
     * .identifier("identifier")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-requestinspection.html)
     */
    public inline fun cfnWebACLRequestInspectionProperty(
        block: CfnWebACLRequestInspectionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.RequestInspectionProperty {
        val builder = CfnWebACLRequestInspectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures inspection of the response body.
     *
     * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response body. This is part of the
     * `ResponseInspection` configuration for `AWSManagedRulesATPRuleSet` .
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ResponseInspectionBodyContainsProperty responseInspectionBodyContainsProperty =
     * ResponseInspectionBodyContainsProperty.builder()
     * .failureStrings(List.of("failureStrings"))
     * .successStrings(List.of("successStrings"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionbodycontains.html)
     */
    public inline fun cfnWebACLResponseInspectionBodyContainsProperty(
        block: CfnWebACLResponseInspectionBodyContainsPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ResponseInspectionBodyContainsProperty {
        val builder = CfnWebACLResponseInspectionBodyContainsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures inspection of the response header. This is part of the `ResponseInspection`
     * configuration for `AWSManagedRulesATPRuleSet` .
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ResponseInspectionHeaderProperty responseInspectionHeaderProperty =
     * ResponseInspectionHeaderProperty.builder()
     * .failureValues(List.of("failureValues"))
     * .name("name")
     * .successValues(List.of("successValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionheader.html)
     */
    public inline fun cfnWebACLResponseInspectionHeaderProperty(
        block: CfnWebACLResponseInspectionHeaderPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ResponseInspectionHeaderProperty {
        val builder = CfnWebACLResponseInspectionHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures inspection of the response JSON.
     *
     * AWS WAF can inspect the first 65,536 bytes (64 KB) of the response JSON. This is part of the
     * `ResponseInspection` configuration for `AWSManagedRulesATPRuleSet` .
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ResponseInspectionJsonProperty responseInspectionJsonProperty =
     * ResponseInspectionJsonProperty.builder()
     * .failureValues(List.of("failureValues"))
     * .identifier("identifier")
     * .successValues(List.of("successValues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionjson.html)
     */
    public inline fun cfnWebACLResponseInspectionJsonProperty(
        block: CfnWebACLResponseInspectionJsonPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ResponseInspectionJsonProperty {
        val builder = CfnWebACLResponseInspectionJsonPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The criteria for inspecting responses to login requests, used by the ATP rule group to track
     * login failure rates.
     *
     * The ATP rule group evaluates the responses that your protected resources send back to client
     * login attempts, keeping count of successful and failed attempts from each IP address and
     * client session. Using this information, the rule group labels and mitigates requests from
     * client sessions and IP addresses that submit too many failed login attempts in a short amount
     * of time.
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     * This is part of the `AWSManagedRulesATPRuleSet` configuration in `ManagedRuleGroupConfig` .
     *
     * Enable login response inspection by configuring exactly one component of the response to
     * inspect. You can't configure more than one. If you don't configure any of the response
     * inspection options, response inspection is disabled.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ResponseInspectionProperty responseInspectionProperty = ResponseInspectionProperty.builder()
     * .bodyContains(ResponseInspectionBodyContainsProperty.builder()
     * .failureStrings(List.of("failureStrings"))
     * .successStrings(List.of("successStrings"))
     * .build())
     * .header(ResponseInspectionHeaderProperty.builder()
     * .failureValues(List.of("failureValues"))
     * .name("name")
     * .successValues(List.of("successValues"))
     * .build())
     * .json(ResponseInspectionJsonProperty.builder()
     * .failureValues(List.of("failureValues"))
     * .identifier("identifier")
     * .successValues(List.of("successValues"))
     * .build())
     * .statusCode(ResponseInspectionStatusCodeProperty.builder()
     * .failureCodes(List.of(123))
     * .successCodes(List.of(123))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspection.html)
     */
    public inline fun cfnWebACLResponseInspectionProperty(
        block: CfnWebACLResponseInspectionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.ResponseInspectionProperty {
        val builder = CfnWebACLResponseInspectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures inspection of the response status code. This is part of the `ResponseInspection`
     * configuration for `AWSManagedRulesATPRuleSet` .
     *
     * Response inspection is available only in web ACLs that protect Amazon CloudFront
     * distributions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * ResponseInspectionStatusCodeProperty responseInspectionStatusCodeProperty =
     * ResponseInspectionStatusCodeProperty.builder()
     * .failureCodes(List.of(123))
     * .successCodes(List.of(123))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-responseinspectionstatuscode.html)
     */
    public inline fun cfnWebACLResponseInspectionStatusCodeProperty(
        block: CfnWebACLResponseInspectionStatusCodePropertyDsl.() -> Unit = {}
    ): CfnWebACL.ResponseInspectionStatusCodeProperty {
        val builder = CfnWebACLResponseInspectionStatusCodePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Action setting to use in the place of a rule action that is configured inside the rule group.
     *
     * You specify one override for each rule whose action you want to change.
     *
     * You can use overrides for testing, for example you can override all of rule actions to
     * `Count` and then monitor the resulting count metrics to understand how the rule group would
     * handle your web traffic. You can also permanently override some or all actions, to modify how
     * the rule group manages your web traffic.
     *
     * Example:
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
    public inline fun cfnWebACLRuleActionOverrideProperty(
        block: CfnWebACLRuleActionOverridePropertyDsl.() -> Unit = {}
    ): CfnWebACL.RuleActionOverrideProperty {
        val builder = CfnWebACLRuleActionOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnWebACLRuleActionProperty(
        block: CfnWebACLRuleActionPropertyDsl.() -> Unit = {}
    ): CfnWebACL.RuleActionProperty {
        val builder = CfnWebACLRuleActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement used to run the rules that are defined in a `RuleGroup` .
     *
     * To use this, create a rule group with your rules, then provide the ARN of the rule group in
     * this statement.
     *
     * You cannot nest a `RuleGroupReferenceStatement` , for example for use inside a `NotStatement`
     * or `OrStatement` . You can only use a rule group reference statement at the top level inside
     * a web ACL.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * RuleGroupReferenceStatementProperty ruleGroupReferenceStatementProperty =
     * RuleGroupReferenceStatementProperty.builder()
     * .arn("arn")
     * // the properties below are optional
     * .excludedRules(List.of(ExcludedRuleProperty.builder()
     * .name("name")
     * .build()))
     * .ruleActionOverrides(List.of(RuleActionOverrideProperty.builder()
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
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html)
     */
    public inline fun cfnWebACLRuleGroupReferenceStatementProperty(
        block: CfnWebACLRuleGroupReferenceStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.RuleGroupReferenceStatementProperty {
        val builder = CfnWebACLRuleGroupReferenceStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single rule, which you can use in a `WebACL` or `RuleGroup` to identify web requests that
     * you want to allow, block, or count.
     *
     * Each rule includes one top-level `Statement` that AWS WAF uses to identify matching web
     * requests, and parameters that govern how AWS WAF handles them.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rule.html)
     */
    public inline fun cfnWebACLRuleProperty(
        block: CfnWebACLRulePropertyDsl.() -> Unit = {}
    ): CfnWebACL.RuleProperty {
        val builder = CfnWebACLRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect one of the headers in the web request, identified by name, for example, `User-Agent`
     * or `Referer` .
     *
     * The name isn't case sensitive.
     *
     * You can filter and inspect all headers with the `FieldToMatch` setting `Headers` .
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example JSON: `"SingleHeader": { "Name": "haystack" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * SingleHeaderProperty singleHeaderProperty = SingleHeaderProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-singleheader.html)
     */
    public inline fun cfnWebACLSingleHeaderProperty(
        block: CfnWebACLSingleHeaderPropertyDsl.() -> Unit = {}
    ): CfnWebACL.SingleHeaderProperty {
        val builder = CfnWebACLSingleHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Inspect one query argument in the web request, identified by name, for example *UserName* or
     * *SalesRegion* .
     *
     * The name isn't case sensitive.
     *
     * This is used to indicate the web request component to inspect, in the `FieldToMatch`
     * specification.
     *
     * Example JSON: `"SingleQueryArgument": { "Name": "myArgument" }`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * SingleQueryArgumentProperty singleQueryArgumentProperty = SingleQueryArgumentProperty.builder()
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-singlequeryargument.html)
     */
    public inline fun cfnWebACLSingleQueryArgumentProperty(
        block: CfnWebACLSingleQueryArgumentPropertyDsl.() -> Unit = {}
    ): CfnWebACL.SingleQueryArgumentProperty {
        val builder = CfnWebACLSingleQueryArgumentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component,
     * using a comparison operator, such as greater than (&gt;) or less than (&lt;).
     *
     * For example, you can use a size constraint statement to look for query strings that are
     * longer than 100 bytes.
     *
     * If you configure AWS WAF to inspect the request body, AWS WAF inspects only the number of
     * bytes of the body up to the limit for the web ACL. By default, for regional web ACLs, this
     * limit is 8 KB (8,192 kilobytes) and for CloudFront web ACLs, this limit is 16 KB (16,384
     * kilobytes). For CloudFront web ACLs, you can increase the limit in the web ACL
     * `AssociationConfig` , for additional fees. If you know that the request body for your web
     * requests should never exceed the inspection limit, you could use a size constraint statement
     * to block requests that have a larger request body size.
     *
     * If you choose URI for the value of Part of the request to filter on, the slash (/) in the URI
     * counts as one character. For example, the URI `/logo.jpg` is nine characters long.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * SizeConstraintStatementProperty sizeConstraintStatementProperty =
     * SizeConstraintStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html)
     */
    public inline fun cfnWebACLSizeConstraintStatementProperty(
        block: CfnWebACLSizeConstraintStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.SizeConstraintStatementProperty {
        val builder = CfnWebACLSizeConstraintStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that inspects for malicious SQL code.
     *
     * Attackers insert malicious SQL code into web requests to do things like modify your database
     * or extract data from it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * SqliMatchStatementProperty sqliMatchStatementProperty = SqliMatchStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sqlimatchstatement.html)
     */
    public inline fun cfnWebACLSqliMatchStatementProperty(
        block: CfnWebACLSqliMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.SqliMatchStatementProperty {
        val builder = CfnWebACLSqliMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The processing guidance for a rule, used by AWS WAF to determine whether a web request
     * matches the rule.
     *
     * Example:
     * ```
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-statement.html)
     */
    public inline fun cfnWebACLStatementProperty(
        block: CfnWebACLStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.StatementProperty {
        val builder = CfnWebACLStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web
     * requests in an effort to bypass detection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * TextTransformationProperty textTransformationProperty = TextTransformationProperty.builder()
     * .priority(123)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-texttransformation.html)
     */
    public inline fun cfnWebACLTextTransformationProperty(
        block: CfnWebACLTextTransformationPropertyDsl.() -> Unit = {}
    ): CfnWebACL.TextTransformationProperty {
        val builder = CfnWebACLTextTransformationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * VisibilityConfigProperty visibilityConfigProperty = VisibilityConfigProperty.builder()
     * .cloudWatchMetricsEnabled(false)
     * .metricName("metricName")
     * .sampledRequestsEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-visibilityconfig.html)
     */
    public inline fun cfnWebACLVisibilityConfigProperty(
        block: CfnWebACLVisibilityConfigPropertyDsl.() -> Unit = {}
    ): CfnWebACL.VisibilityConfigProperty {
        val builder = CfnWebACLVisibilityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A rule statement that inspects for cross-site scripting (XSS) attacks.
     *
     * In XSS attacks, the attacker uses vulnerabilities in a benign website as a vehicle to inject
     * malicious client-site scripts into other legitimate web browsers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.wafv2.*;
     * Object all;
     * Object allQueryArguments;
     * Object method;
     * Object queryString;
     * Object singleHeader;
     * Object singleQueryArgument;
     * Object uriPath;
     * XssMatchStatementProperty xssMatchStatementProperty = XssMatchStatementProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html)
     */
    public inline fun cfnWebACLXssMatchStatementProperty(
        block: CfnWebACLXssMatchStatementPropertyDsl.() -> Unit = {}
    ): CfnWebACL.XssMatchStatementProperty {
        val builder = CfnWebACLXssMatchStatementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
