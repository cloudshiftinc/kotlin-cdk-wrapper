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
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Specifies a label namespace to use as an aggregate key for a rate-based rule.
 *
 * Each distinct fully qualified label name that has the specified label namespace contributes to
 * the aggregation instance. If you use just one label namespace as your custom key, then each label
 * name fully defines an aggregation instance.
 *
 * This uses only labels that have been added to the request by rules that are evaluated before this
 * rate-based rule in the web ACL.
 *
 * For information about label namespaces and names, see
 * [Label syntax and naming requirements](https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html)
 * in the *AWS WAF Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * RateLimitLabelNamespaceProperty rateLimitLabelNamespaceProperty =
 * RateLimitLabelNamespaceProperty.builder()
 * .namespace("namespace")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-ratelimitlabelnamespace.html)
 */
@CdkDslMarker
public class CfnWebACLRateLimitLabelNamespacePropertyDsl {
    private val cdkBuilder: CfnWebACL.RateLimitLabelNamespaceProperty.Builder =
        CfnWebACL.RateLimitLabelNamespaceProperty.builder()

    /** @param namespace The namespace to use for aggregation. */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnWebACL.RateLimitLabelNamespaceProperty = cdkBuilder.build()
}
