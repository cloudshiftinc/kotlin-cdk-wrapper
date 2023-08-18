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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.RedirectProtocol
import software.amazon.awscdk.services.s3.ReplaceKey
import software.amazon.awscdk.services.s3.RoutingRule
import software.amazon.awscdk.services.s3.RoutingRuleCondition

/**
 * Rule that define when a redirect is applied and the redirect behavior.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ReplaceKey replaceKey;
 * RoutingRule routingRule = RoutingRule.builder()
 * .condition(RoutingRuleCondition.builder()
 * .httpErrorCodeReturnedEquals("httpErrorCodeReturnedEquals")
 * .keyPrefixEquals("keyPrefixEquals")
 * .build())
 * .hostName("hostName")
 * .httpRedirectCode("httpRedirectCode")
 * .protocol(RedirectProtocol.HTTP)
 * .replaceKey(replaceKey)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html)
 */
@CdkDslMarker
public class RoutingRuleDsl {
    private val cdkBuilder: RoutingRule.Builder = RoutingRule.builder()

    /**
     * @param condition Specifies a condition that must be met for the specified redirect to apply.
     */
    public fun condition(condition: RoutingRuleConditionDsl.() -> Unit = {}) {
        val builder = RoutingRuleConditionDsl()
        builder.apply(condition)
        cdkBuilder.condition(builder.build())
    }

    /**
     * @param condition Specifies a condition that must be met for the specified redirect to apply.
     */
    public fun condition(condition: RoutingRuleCondition) {
        cdkBuilder.condition(condition)
    }

    /** @param hostName The host name to use in the redirect request. */
    public fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
    }

    /** @param httpRedirectCode The HTTP redirect code to use on the response. */
    public fun httpRedirectCode(httpRedirectCode: String) {
        cdkBuilder.httpRedirectCode(httpRedirectCode)
    }

    /** @param protocol Protocol to use when redirecting requests. */
    public fun protocol(protocol: RedirectProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /** @param replaceKey Specifies the object key prefix to use in the redirect request. */
    public fun replaceKey(replaceKey: ReplaceKey) {
        cdkBuilder.replaceKey(replaceKey)
    }

    public fun build(): RoutingRule = cdkBuilder.build()
}
