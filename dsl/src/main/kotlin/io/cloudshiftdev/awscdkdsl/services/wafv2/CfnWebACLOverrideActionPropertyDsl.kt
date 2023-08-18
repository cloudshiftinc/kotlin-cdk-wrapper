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
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * The action to use in the place of the action that results from the rule group evaluation.
 *
 * Set the override action to none to leave the result of the rule group alone. Set it to count to
 * override the result to count only.
 *
 * You can only use this for rule statements that reference a rule group, like
 * `RuleGroupReferenceStatement` and `ManagedRuleGroupStatement` .
 *
 * This option is usually set to none. It does not affect how the rules in the rule group are
 * evaluated. If you want the rules in the rule group to only count matches, do not use this and
 * instead use the rule action override option, with `Count` action, in your rule group reference
 * statement settings.
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
@CdkDslMarker
public class CfnWebACLOverrideActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.OverrideActionProperty.Builder =
        CfnWebACL.OverrideActionProperty.builder()

    /**
     * @param count Override the rule group evaluation result to count only.
     *
     * This option is usually set to none. It does not affect how the rules in the rule group are
     * evaluated. If you want the rules in the rule group to only count matches, do not use this and
     * instead use the rule action override option, with `Count` action, in your rule group
     * reference statement settings.
     */
    public fun count(count: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(count)
        cdkBuilder.count(builder.map)
    }

    /**
     * @param count Override the rule group evaluation result to count only.
     *
     * This option is usually set to none. It does not affect how the rules in the rule group are
     * evaluated. If you want the rules in the rule group to only count matches, do not use this and
     * instead use the rule action override option, with `Count` action, in your rule group
     * reference statement settings.
     */
    public fun count(count: Any) {
        cdkBuilder.count(count)
    }

    /**
     * @param none Don't override the rule group evaluation result. This is the most common setting.
     */
    public fun none(none: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(none)
        cdkBuilder.none(builder.map)
    }

    /**
     * @param none Don't override the rule group evaluation result. This is the most common setting.
     */
    public fun none(none: Any) {
        cdkBuilder.none(none)
    }

    public fun build(): CfnWebACL.OverrideActionProperty = cdkBuilder.build()
}
