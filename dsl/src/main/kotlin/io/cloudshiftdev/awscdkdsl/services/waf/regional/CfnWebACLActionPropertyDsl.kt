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

package io.cloudshiftdev.awscdkdsl.services.waf.regional

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnWebACL

/**
 * Specifies the action AWS WAF takes when a web request matches or doesn't match all rule
 * conditions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-action.html)
 */
@CdkDslMarker
public class CfnWebACLActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.ActionProperty.Builder = CfnWebACL.ActionProperty.builder()

    /**
     * @param type For actions that are associated with a rule, the action that AWS WAF takes when a
     *   web request matches all conditions in a rule. For the default action of a web access
     *   control list (ACL), the action that AWS WAF takes when a web request doesn't match all
     *   conditions in any rule.
     *
     * Valid settings include the following:
     * * `ALLOW` : AWS WAF allows requests
     * * `BLOCK` : AWS WAF blocks requests
     * * `COUNT` : AWS WAF increments a counter of the requests that match all of the conditions in
     *   the rule. AWS WAF then continues to inspect the web request based on the remaining rules in
     *   the web ACL. You can't specify `COUNT` for the default action for a WebACL.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnWebACL.ActionProperty = cdkBuilder.build()
}
