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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Specifies a condition for a listener rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * RuleConditionProperty ruleConditionProperty = RuleConditionProperty.builder()
 * .field("field")
 * .hostHeaderConfig(HostHeaderConfigProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .httpHeaderConfig(HttpHeaderConfigProperty.builder()
 * .httpHeaderName("httpHeaderName")
 * .values(List.of("values"))
 * .build())
 * .httpRequestMethodConfig(HttpRequestMethodConfigProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .pathPatternConfig(PathPatternConfigProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .queryStringConfig(QueryStringConfigProperty.builder()
 * .values(List.of(QueryStringKeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .sourceIpConfig(SourceIpConfigProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-rulecondition.html)
 */
@CdkDslMarker
public class CfnListenerRuleRuleConditionPropertyDsl {
    private val cdkBuilder: CfnListenerRule.RuleConditionProperty.Builder =
        CfnListenerRule.RuleConditionProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param field The field in the HTTP request. The following are the possible values:.
     * * `http-header`
     * * `http-request-method`
     * * `host-header`
     * * `path-pattern`
     * * `query-string`
     * * `source-ip`
     */
    public fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
    }

    /**
     * @param hostHeaderConfig Information for a host header condition. Specify only when `Field` is
     *   `host-header` .
     */
    public fun hostHeaderConfig(hostHeaderConfig: IResolvable) {
        cdkBuilder.hostHeaderConfig(hostHeaderConfig)
    }

    /**
     * @param hostHeaderConfig Information for a host header condition. Specify only when `Field` is
     *   `host-header` .
     */
    public fun hostHeaderConfig(hostHeaderConfig: CfnListenerRule.HostHeaderConfigProperty) {
        cdkBuilder.hostHeaderConfig(hostHeaderConfig)
    }

    /**
     * @param httpHeaderConfig Information for an HTTP header condition. Specify only when `Field`
     *   is `http-header` .
     */
    public fun httpHeaderConfig(httpHeaderConfig: IResolvable) {
        cdkBuilder.httpHeaderConfig(httpHeaderConfig)
    }

    /**
     * @param httpHeaderConfig Information for an HTTP header condition. Specify only when `Field`
     *   is `http-header` .
     */
    public fun httpHeaderConfig(httpHeaderConfig: CfnListenerRule.HttpHeaderConfigProperty) {
        cdkBuilder.httpHeaderConfig(httpHeaderConfig)
    }

    /**
     * @param httpRequestMethodConfig Information for an HTTP method condition. Specify only when
     *   `Field` is `http-request-method` .
     */
    public fun httpRequestMethodConfig(httpRequestMethodConfig: IResolvable) {
        cdkBuilder.httpRequestMethodConfig(httpRequestMethodConfig)
    }

    /**
     * @param httpRequestMethodConfig Information for an HTTP method condition. Specify only when
     *   `Field` is `http-request-method` .
     */
    public fun httpRequestMethodConfig(
        httpRequestMethodConfig: CfnListenerRule.HttpRequestMethodConfigProperty
    ) {
        cdkBuilder.httpRequestMethodConfig(httpRequestMethodConfig)
    }

    /**
     * @param pathPatternConfig Information for a path pattern condition. Specify only when `Field`
     *   is `path-pattern` .
     */
    public fun pathPatternConfig(pathPatternConfig: IResolvable) {
        cdkBuilder.pathPatternConfig(pathPatternConfig)
    }

    /**
     * @param pathPatternConfig Information for a path pattern condition. Specify only when `Field`
     *   is `path-pattern` .
     */
    public fun pathPatternConfig(pathPatternConfig: CfnListenerRule.PathPatternConfigProperty) {
        cdkBuilder.pathPatternConfig(pathPatternConfig)
    }

    /**
     * @param queryStringConfig Information for a query string condition. Specify only when `Field`
     *   is `query-string` .
     */
    public fun queryStringConfig(queryStringConfig: IResolvable) {
        cdkBuilder.queryStringConfig(queryStringConfig)
    }

    /**
     * @param queryStringConfig Information for a query string condition. Specify only when `Field`
     *   is `query-string` .
     */
    public fun queryStringConfig(queryStringConfig: CfnListenerRule.QueryStringConfigProperty) {
        cdkBuilder.queryStringConfig(queryStringConfig)
    }

    /**
     * @param sourceIpConfig Information for a source IP condition. Specify only when `Field` is
     *   `source-ip` .
     */
    public fun sourceIpConfig(sourceIpConfig: IResolvable) {
        cdkBuilder.sourceIpConfig(sourceIpConfig)
    }

    /**
     * @param sourceIpConfig Information for a source IP condition. Specify only when `Field` is
     *   `source-ip` .
     */
    public fun sourceIpConfig(sourceIpConfig: CfnListenerRule.SourceIpConfigProperty) {
        cdkBuilder.sourceIpConfig(sourceIpConfig)
    }

    /**
     * @param values The condition value. Specify only when `Field` is `host-header` or
     *   `path-pattern` . Alternatively, to specify multiple host names or multiple path patterns,
     *   use `HostHeaderConfig` or `PathPatternConfig` .
     *
     * If `Field` is `host-header` and you're not using `HostHeaderConfig` , you can specify a
     * single host name (for example, my.example.com). A host name is case insensitive, can be up to
     * 128 characters in length, and can contain any of the following characters.
     * * A-Z, a-z, 0-9 *
     * * . *
     * * (matches 0 or more characters)
     * * ? (matches exactly 1 character)
     *
     * If `Field` is `path-pattern` and you're not using `PathPatternConfig` , you can specify a
     * single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to
     * 128 characters in length, and can contain any of the following characters.
     * * A-Z, a-z, 0-9
     * * _ - . $ / ~ " ' &#64; : +
     * * &amp; (using &amp;) *
     * * (matches 0 or more characters)
     * * ? (matches exactly 1 character)
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The condition value. Specify only when `Field` is `host-header` or
     *   `path-pattern` . Alternatively, to specify multiple host names or multiple path patterns,
     *   use `HostHeaderConfig` or `PathPatternConfig` .
     *
     * If `Field` is `host-header` and you're not using `HostHeaderConfig` , you can specify a
     * single host name (for example, my.example.com). A host name is case insensitive, can be up to
     * 128 characters in length, and can contain any of the following characters.
     * * A-Z, a-z, 0-9 *
     * * . *
     * * (matches 0 or more characters)
     * * ? (matches exactly 1 character)
     *
     * If `Field` is `path-pattern` and you're not using `PathPatternConfig` , you can specify a
     * single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to
     * 128 characters in length, and can contain any of the following characters.
     * * A-Z, a-z, 0-9
     * * _ - . $ / ~ " ' &#64; : +
     * * &amp; (using &amp;) *
     * * (matches 0 or more characters)
     * * ? (matches exactly 1 character)
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnListenerRule.RuleConditionProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
