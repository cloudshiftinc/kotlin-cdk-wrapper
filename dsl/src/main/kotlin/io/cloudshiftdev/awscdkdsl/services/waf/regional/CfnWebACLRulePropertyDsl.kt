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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnWebACL

/**
 * A combination of `ByteMatchSet` , `IPSet` , and/or `SqlInjectionMatchSet` objects that identify
 * the web requests that you want to allow, block, or count.
 *
 * For example, you might create a `Rule` that includes the following predicates:
 * * An `IPSet` that causes AWS WAF to search for web requests that originate from the IP address
 *   `192.0.2.44`
 * * A `ByteMatchSet` that causes AWS WAF to search for web requests for which the value of the
 *   `User-Agent` header is `BadBot` .
 *
 * To match the settings in this `Rule` , a request must originate from `192.0.2.44` AND include a
 * `User-Agent` header for which the value is `BadBot` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * RuleProperty ruleProperty = RuleProperty.builder()
 * .action(ActionProperty.builder()
 * .type("type")
 * .build())
 * .priority(123)
 * .ruleId("ruleId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-webacl-rule.html)
 */
@CdkDslMarker
public class CfnWebACLRulePropertyDsl {
    private val cdkBuilder: CfnWebACL.RuleProperty.Builder = CfnWebACL.RuleProperty.builder()

    /**
     * @param action The action that AWS WAF takes when a web request matches all conditions in the
     *   rule, such as allow, block, or count the request.
     */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /**
     * @param action The action that AWS WAF takes when a web request matches all conditions in the
     *   rule, such as allow, block, or count the request.
     */
    public fun action(action: CfnWebACL.ActionProperty) {
        cdkBuilder.action(action)
    }

    /**
     * @param priority The order in which AWS WAF evaluates the rules in a web ACL. AWS WAF
     *   evaluates rules with a lower value before rules with a higher value. The value must be a
     *   unique integer. If you have multiple rules in a web ACL, the priority numbers do not need
     *   to be consecutive.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param ruleId The ID of an AWS WAF Regional rule to associate with a web ACL. */
    public fun ruleId(ruleId: String) {
        cdkBuilder.ruleId(ruleId)
    }

    public fun build(): CfnWebACL.RuleProperty = cdkBuilder.build()
}
