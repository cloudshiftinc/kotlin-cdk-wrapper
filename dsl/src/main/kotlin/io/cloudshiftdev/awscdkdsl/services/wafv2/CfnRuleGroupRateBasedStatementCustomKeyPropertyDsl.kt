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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * Specifies a single custom aggregate key for a rate-base rule.
 *
 * Web requests that are missing any of the components specified in the aggregation keys are omitted
 * from the rate-based rule evaluation and handling.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object forwardedIp;
 * Object httpMethod;
 * Object ip;
 * RateBasedStatementCustomKeyProperty rateBasedStatementCustomKeyProperty =
 * RateBasedStatementCustomKeyProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-ratebasedstatementcustomkey.html)
 */
@CdkDslMarker
public class CfnRuleGroupRateBasedStatementCustomKeyPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RateBasedStatementCustomKeyProperty.Builder =
        CfnRuleGroup.RateBasedStatementCustomKeyProperty.builder()

    /**
     * @param cookie Use the value of a cookie in the request as an aggregate key. Each distinct
     *   value in the cookie contributes to the aggregation instance. If you use a single cookie as
     *   your custom key, then each value fully defines an aggregation instance.
     */
    public fun cookie(cookie: IResolvable) {
        cdkBuilder.cookie(cookie)
    }

    /**
     * @param cookie Use the value of a cookie in the request as an aggregate key. Each distinct
     *   value in the cookie contributes to the aggregation instance. If you use a single cookie as
     *   your custom key, then each value fully defines an aggregation instance.
     */
    public fun cookie(cookie: CfnRuleGroup.RateLimitCookieProperty) {
        cdkBuilder.cookie(cookie)
    }

    /**
     * @param forwardedIp Use the first IP address in an HTTP header as an aggregate key. Each
     *   distinct forwarded IP address contributes to the aggregation instance.
     *
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
     * least one other key to use. You can aggregate on only the forwarded IP address by specifying
     * `FORWARDED_IP` in your rate-based statement's `AggregateKeyType` .
     *
     * With this option, you must specify the header to use in the rate-based rule's
     * `ForwardedIPConfig` property.
     */
    public fun forwardedIp(forwardedIp: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(forwardedIp)
        cdkBuilder.forwardedIp(builder.map)
    }

    /**
     * @param forwardedIp Use the first IP address in an HTTP header as an aggregate key. Each
     *   distinct forwarded IP address contributes to the aggregation instance.
     *
     * When you specify an IP or forwarded IP in the custom key settings, you must also specify at
     * least one other key to use. You can aggregate on only the forwarded IP address by specifying
     * `FORWARDED_IP` in your rate-based statement's `AggregateKeyType` .
     *
     * With this option, you must specify the header to use in the rate-based rule's
     * `ForwardedIPConfig` property.
     */
    public fun forwardedIp(forwardedIp: Any) {
        cdkBuilder.forwardedIp(forwardedIp)
    }

    /**
     * @param header Use the value of a header in the request as an aggregate key. Each distinct
     *   value in the header contributes to the aggregation instance. If you use a single header as
     *   your custom key, then each value fully defines an aggregation instance.
     */
    public fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`)
    }

    /**
     * @param header Use the value of a header in the request as an aggregate key. Each distinct
     *   value in the header contributes to the aggregation instance. If you use a single header as
     *   your custom key, then each value fully defines an aggregation instance.
     */
    public fun `header`(`header`: CfnRuleGroup.RateLimitHeaderProperty) {
        cdkBuilder.`header`(`header`)
    }

    /**
     * @param httpMethod Use the request's HTTP method as an aggregate key. Each distinct HTTP
     *   method contributes to the aggregation instance. If you use just the HTTP method as your
     *   custom key, then each method fully defines an aggregation instance.
     */
    public fun httpMethod(httpMethod: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(httpMethod)
        cdkBuilder.httpMethod(builder.map)
    }

    /**
     * @param httpMethod Use the request's HTTP method as an aggregate key. Each distinct HTTP
     *   method contributes to the aggregation instance. If you use just the HTTP method as your
     *   custom key, then each method fully defines an aggregation instance.
     */
    public fun httpMethod(httpMethod: Any) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param ip Use the request's originating IP address as an aggregate key. Each distinct IP
     *   address contributes to the aggregation instance. When you specify an IP or forwarded IP in
     *   the custom key settings, you must also specify at least one other key to use. You can
     *   aggregate on only the IP address by specifying `IP` in your rate-based statement's
     *   `AggregateKeyType` .
     */
    public fun ip(ip: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(ip)
        cdkBuilder.ip(builder.map)
    }

    /**
     * @param ip Use the request's originating IP address as an aggregate key. Each distinct IP
     *   address contributes to the aggregation instance. When you specify an IP or forwarded IP in
     *   the custom key settings, you must also specify at least one other key to use. You can
     *   aggregate on only the IP address by specifying `IP` in your rate-based statement's
     *   `AggregateKeyType` .
     */
    public fun ip(ip: Any) {
        cdkBuilder.ip(ip)
    }

    /**
     * @param labelNamespace Use the specified label namespace as an aggregate key. Each distinct
     *   fully qualified label name that has the specified label namespace contributes to the
     *   aggregation instance. If you use just one label namespace as your custom key, then each
     *   label name fully defines an aggregation instance.
     *
     * This uses only labels that have been added to the request by rules that are evaluated before
     * this rate-based rule in the web ACL.
     *
     * For information about label namespaces and names, see
     * [Label syntax and naming requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
     * in the *AWS WAF Developer Guide* .
     */
    public fun labelNamespace(labelNamespace: IResolvable) {
        cdkBuilder.labelNamespace(labelNamespace)
    }

    /**
     * @param labelNamespace Use the specified label namespace as an aggregate key. Each distinct
     *   fully qualified label name that has the specified label namespace contributes to the
     *   aggregation instance. If you use just one label namespace as your custom key, then each
     *   label name fully defines an aggregation instance.
     *
     * This uses only labels that have been added to the request by rules that are evaluated before
     * this rate-based rule in the web ACL.
     *
     * For information about label namespaces and names, see
     * [Label syntax and naming requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
     * in the *AWS WAF Developer Guide* .
     */
    public fun labelNamespace(labelNamespace: CfnRuleGroup.RateLimitLabelNamespaceProperty) {
        cdkBuilder.labelNamespace(labelNamespace)
    }

    /**
     * @param queryArgument Use the specified query argument as an aggregate key. Each distinct
     *   value for the named query argument contributes to the aggregation instance. If you use a
     *   single query argument as your custom key, then each value fully defines an aggregation
     *   instance.
     */
    public fun queryArgument(queryArgument: IResolvable) {
        cdkBuilder.queryArgument(queryArgument)
    }

    /**
     * @param queryArgument Use the specified query argument as an aggregate key. Each distinct
     *   value for the named query argument contributes to the aggregation instance. If you use a
     *   single query argument as your custom key, then each value fully defines an aggregation
     *   instance.
     */
    public fun queryArgument(queryArgument: CfnRuleGroup.RateLimitQueryArgumentProperty) {
        cdkBuilder.queryArgument(queryArgument)
    }

    /**
     * @param queryString Use the request's query string as an aggregate key. Each distinct string
     *   contributes to the aggregation instance. If you use just the query string as your custom
     *   key, then each string fully defines an aggregation instance.
     */
    public fun queryString(queryString: IResolvable) {
        cdkBuilder.queryString(queryString)
    }

    /**
     * @param queryString Use the request's query string as an aggregate key. Each distinct string
     *   contributes to the aggregation instance. If you use just the query string as your custom
     *   key, then each string fully defines an aggregation instance.
     */
    public fun queryString(queryString: CfnRuleGroup.RateLimitQueryStringProperty) {
        cdkBuilder.queryString(queryString)
    }

    /**
     * @param uriPath Use the request's URI path as an aggregate key. Each distinct URI path
     *   contributes to the aggregation instance. If you use just the URI path as your custom key,
     *   then each URI path fully defines an aggregation instance.
     */
    public fun uriPath(uriPath: IResolvable) {
        cdkBuilder.uriPath(uriPath)
    }

    /**
     * @param uriPath Use the request's URI path as an aggregate key. Each distinct URI path
     *   contributes to the aggregation instance. If you use just the URI path as your custom key,
     *   then each URI path fully defines an aggregation instance.
     */
    public fun uriPath(uriPath: CfnRuleGroup.RateLimitUriPathProperty) {
        cdkBuilder.uriPath(uriPath)
    }

    public fun build(): CfnRuleGroup.RateBasedStatementCustomKeyProperty = cdkBuilder.build()
}
