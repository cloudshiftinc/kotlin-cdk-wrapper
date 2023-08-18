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
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of
 * using the IP address that's reported by the web request origin.
 *
 * Commonly, this is the X-Forwarded-For (XFF) header, but you can specify any header name.
 *
 * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the web
 * request at all.
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
@CdkDslMarker
public class CfnRuleGroupForwardedIPConfigurationPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.ForwardedIPConfigurationProperty.Builder =
        CfnRuleGroup.ForwardedIPConfigurationProperty.builder()

    /**
     * @param fallbackBehavior The match status to assign to the web request if the request doesn't
     *   have a valid IP address in the specified position.
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     *
     * You can specify the following fallback behaviors:
     * * `MATCH` - Treat the web request as matching the rule statement. AWS WAF applies the rule
     *   action to the request.
     * * `NO_MATCH` - Treat the web request as not matching the rule statement.
     */
    public fun fallbackBehavior(fallbackBehavior: String) {
        cdkBuilder.fallbackBehavior(fallbackBehavior)
    }

    /**
     * @param headerName The name of the HTTP header to use for the IP address. For example, to use
     *   the X-Forwarded-For (XFF) header, set this to `X-Forwarded-For` .
     *
     * If the specified header isn't present in the request, AWS WAF doesn't apply the rule to the
     * web request at all.
     */
    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    public fun build(): CfnRuleGroup.ForwardedIPConfigurationProperty = cdkBuilder.build()
}
