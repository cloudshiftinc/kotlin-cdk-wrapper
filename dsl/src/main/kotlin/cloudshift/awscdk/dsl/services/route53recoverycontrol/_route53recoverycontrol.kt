@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import software.amazon.awscdk.services.route53recoverycontrol.CfnCluster
import software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object route53recoverycontrol {
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterClusterEndpointProperty(
        block: CfnClusterClusterEndpointPropertyDsl.() -> Unit =
            {},
    ): CfnCluster.ClusterEndpointProperty {
        val builder = CfnClusterClusterEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnControlPanel(
        scope: Construct,
        id: String,
        block: CfnControlPanelDsl.() -> Unit = {},
    ): CfnControlPanel {
        val builder = CfnControlPanelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnControlPanelProps(block: CfnControlPanelPropsDsl.() -> Unit = {}): CfnControlPanelProps {
        val builder = CfnControlPanelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRoutingControl(
        scope: Construct,
        id: String,
        block: CfnRoutingControlDsl.() -> Unit = {},
    ): CfnRoutingControl {
        val builder = CfnRoutingControlDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRoutingControlProps(block: CfnRoutingControlPropsDsl.() -> Unit = {}): CfnRoutingControlProps {
        val builder = CfnRoutingControlPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSafetyRule(
        scope: Construct,
        id: String,
        block: CfnSafetyRuleDsl.() -> Unit = {},
    ): CfnSafetyRule {
        val builder = CfnSafetyRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSafetyRuleAssertionRuleProperty(
        block: CfnSafetyRuleAssertionRulePropertyDsl.() -> Unit =
            {},
    ): CfnSafetyRule.AssertionRuleProperty {
        val builder = CfnSafetyRuleAssertionRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSafetyRuleGatingRuleProperty(
        block: CfnSafetyRuleGatingRulePropertyDsl.() -> Unit =
            {},
    ): CfnSafetyRule.GatingRuleProperty {
        val builder = CfnSafetyRuleGatingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSafetyRuleProps(block: CfnSafetyRulePropsDsl.() -> Unit = {}): CfnSafetyRuleProps {
        val builder = CfnSafetyRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnSafetyRuleRuleConfigProperty(
        block: CfnSafetyRuleRuleConfigPropertyDsl.() -> Unit =
            {},
    ): CfnSafetyRule.RuleConfigProperty {
        val builder = CfnSafetyRuleRuleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
