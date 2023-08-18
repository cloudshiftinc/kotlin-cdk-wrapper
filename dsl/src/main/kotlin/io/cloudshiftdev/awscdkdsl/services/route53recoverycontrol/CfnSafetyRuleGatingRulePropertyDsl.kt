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

package io.cloudshiftdev.awscdkdsl.services.route53recoverycontrol

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

/**
 * A gating rule verifies that a gating routing control or set of gating routing controls, evaluates
 * as true, based on a rule configuration that you specify, which allows a set of routing control
 * state changes to complete.
 *
 * For example, if you specify one gating routing control and you set the `Type` in the rule
 * configuration to `OR` , that indicates that you must set the gating routing control to `On` for
 * the rule to evaluate as true; that is, for the gating control switch to be On. When you do that,
 * then you can update the routing control states for the target routing controls that you specify
 * in the gating rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoverycontrol.*;
 * GatingRuleProperty gatingRuleProperty = GatingRuleProperty.builder()
 * .gatingControls(List.of("gatingControls"))
 * .targetControls(List.of("targetControls"))
 * .waitPeriodMs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-gatingrule.html)
 */
@CdkDslMarker
public class CfnSafetyRuleGatingRulePropertyDsl {
    private val cdkBuilder: CfnSafetyRule.GatingRuleProperty.Builder =
        CfnSafetyRule.GatingRuleProperty.builder()

    private val _gatingControls: MutableList<String> = mutableListOf()

    private val _targetControls: MutableList<String> = mutableListOf()

    /**
     * @param gatingControls An array of gating routing control Amazon Resource Names (ARNs). For a
     *   simple on-off switch, specify the ARN for one routing control. The gating routing controls
     *   are evaluated by the rule configuration that you specify to determine if the target routing
     *   control states can be changed.
     */
    public fun gatingControls(vararg gatingControls: String) {
        _gatingControls.addAll(listOf(*gatingControls))
    }

    /**
     * @param gatingControls An array of gating routing control Amazon Resource Names (ARNs). For a
     *   simple on-off switch, specify the ARN for one routing control. The gating routing controls
     *   are evaluated by the rule configuration that you specify to determine if the target routing
     *   control states can be changed.
     */
    public fun gatingControls(gatingControls: Collection<String>) {
        _gatingControls.addAll(gatingControls)
    }

    /**
     * @param targetControls An array of target routing control Amazon Resource Names (ARNs) for
     *   which the states can only be updated if the rule configuration that you specify evaluates
     *   to true for the gating routing control. As a simple example, if you have a single gating
     *   control, it acts as an overall on-off switch for a set of target routing controls. You can
     *   use this to manually override automated failover, for example.
     */
    public fun targetControls(vararg targetControls: String) {
        _targetControls.addAll(listOf(*targetControls))
    }

    /**
     * @param targetControls An array of target routing control Amazon Resource Names (ARNs) for
     *   which the states can only be updated if the rule configuration that you specify evaluates
     *   to true for the gating routing control. As a simple example, if you have a single gating
     *   control, it acts as an overall on-off switch for a set of target routing controls. You can
     *   use this to manually override automated failover, for example.
     */
    public fun targetControls(targetControls: Collection<String>) {
        _targetControls.addAll(targetControls)
    }

    /**
     * @param waitPeriodMs An evaluation period, in milliseconds (ms), during which any request
     *   against the target routing controls will fail. This helps prevent flapping of state. The
     *   wait period is 5000 ms by default, but you can choose a custom value.
     */
    public fun waitPeriodMs(waitPeriodMs: Number) {
        cdkBuilder.waitPeriodMs(waitPeriodMs)
    }

    public fun build(): CfnSafetyRule.GatingRuleProperty {
        if (_gatingControls.isNotEmpty()) cdkBuilder.gatingControls(_gatingControls)
        if (_targetControls.isNotEmpty()) cdkBuilder.targetControls(_targetControls)
        return cdkBuilder.build()
    }
}
