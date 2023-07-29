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

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps

/**
 * Properties for defining a `CfnSafetyRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoverycontrol.*;
 * CfnSafetyRuleProps cfnSafetyRuleProps = CfnSafetyRuleProps.builder()
 * .controlPanelArn("controlPanelArn")
 * .name("name")
 * .ruleConfig(RuleConfigProperty.builder()
 * .inverted(false)
 * .threshold(123)
 * .type("type")
 * .build())
 * // the properties below are optional
 * .assertionRule(AssertionRuleProperty.builder()
 * .assertedControls(List.of("assertedControls"))
 * .waitPeriodMs(123)
 * .build())
 * .gatingRule(GatingRuleProperty.builder()
 * .gatingControls(List.of("gatingControls"))
 * .targetControls(List.of("targetControls"))
 * .waitPeriodMs(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-safetyrule.html)
 */
@CdkDslMarker
public class CfnSafetyRulePropsDsl {
    private val cdkBuilder: CfnSafetyRuleProps.Builder = CfnSafetyRuleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     *   state, that the criteria that you set in the rule configuration is met. Otherwise, the
     *   change to the routing control is not accepted. For example, the criteria might be that at
     *   least one routing control state is `On` after the transaction so that traffic continues to
     *   flow to at least one cell for the application. This ensures that you avoid a fail-open
     *   scenario.
     */
    public fun assertionRule(assertionRule: IResolvable) {
        cdkBuilder.assertionRule(assertionRule)
    }

    /**
     * @param assertionRule An assertion rule enforces that, when you change a routing control
     *   state, that the criteria that you set in the rule configuration is met. Otherwise, the
     *   change to the routing control is not accepted. For example, the criteria might be that at
     *   least one routing control state is `On` after the transaction so that traffic continues to
     *   flow to at least one cell for the application. This ensures that you avoid a fail-open
     *   scenario.
     */
    public fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty) {
        cdkBuilder.assertionRule(assertionRule)
    }

    /** @param controlPanelArn The Amazon Resource Name (ARN) for the control panel. */
    public fun controlPanelArn(controlPanelArn: String) {
        cdkBuilder.controlPanelArn(controlPanelArn)
    }

    /**
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     *   routing controls, evaluates as true, based on a rule configuration that you specify, which
     *   allows a set of routing control state changes to complete. For example, if you specify one
     *   gating routing control and you set the `Type` in the rule configuration to `OR` , that
     *   indicates that you must set the gating routing control to `On` for the rule to evaluate as
     *   true; that is, for the gating control switch to be On. When you do that, then you can
     *   update the routing control states for the target routing controls that you specify in the
     *   gating rule.
     */
    public fun gatingRule(gatingRule: IResolvable) {
        cdkBuilder.gatingRule(gatingRule)
    }

    /**
     * @param gatingRule A gating rule verifies that a gating routing control or set of gating
     *   routing controls, evaluates as true, based on a rule configuration that you specify, which
     *   allows a set of routing control state changes to complete. For example, if you specify one
     *   gating routing control and you set the `Type` in the rule configuration to `OR` , that
     *   indicates that you must set the gating routing control to `On` for the rule to evaluate as
     *   true; that is, for the gating control switch to be On. When you do that, then you can
     *   update the routing control states for the target routing controls that you specify in the
     *   gating rule.
     */
    public fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty) {
        cdkBuilder.gatingRule(gatingRule)
    }

    /**
     * @param name The name of the assertion rule. The name must be unique within a control panel.
     *   You can use any non-white space character in the name except the following: &amp; &gt; &lt;
     *   ' (single quote) " (double quote) ; (semicolon)
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     *   controls) that designate how many control states must be `ON` as the result of a
     *   transaction. For example, if you have three assertion controls, you might specify `ATLEAST
     *   2` for your rule configuration. This means that at least two assertion controls must be
     *   `ON` , so that at least two AWS Regions have traffic flowing to them.
     */
    public fun ruleConfig(ruleConfig: IResolvable) {
        cdkBuilder.ruleConfig(ruleConfig)
    }

    /**
     * @param ruleConfig The criteria that you set for specific assertion controls (routing
     *   controls) that designate how many control states must be `ON` as the result of a
     *   transaction. For example, if you have three assertion controls, you might specify `ATLEAST
     *   2` for your rule configuration. This means that at least two assertion controls must be
     *   `ON` , so that at least two AWS Regions have traffic flowing to them.
     */
    public fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty) {
        cdkBuilder.ruleConfig(ruleConfig)
    }

    /** @param tags The value for a tag. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The value for a tag. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSafetyRuleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
