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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnCluster
import software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControlProps
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps
import software.constructs.Construct

public object route53recoverycontrol {
    /**
     * Creates a cluster in Amazon Route 53 Application Recovery Controller.
     *
     * A cluster is a set of redundant Regional endpoints that you can run Route 53 ARC API calls
     * against to update or get the state of one or more routing controls.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
     * .name("name")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html)
     */
    public inline fun cfnCluster(
        scope: Construct,
        id: String,
        block: CfnClusterDsl.() -> Unit = {},
    ): CfnCluster {
        val builder = CfnClusterDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A cluster endpoint.
     *
     * You specify one of the five cluster endpoints, which consists of an endpoint URL and an AWS
     * Region, when you want to get or update a routing control state in the cluster.
     *
     * For more information, see
     * [Code examples](https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples.html)
     * in the Amazon Route 53 Application Recovery Controller Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * ClusterEndpointProperty clusterEndpointProperty = ClusterEndpointProperty.builder()
     * .endpoint("endpoint")
     * .region("region")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-cluster-clusterendpoint.html)
     */
    public inline fun cfnClusterClusterEndpointProperty(
        block: CfnClusterClusterEndpointPropertyDsl.() -> Unit = {}
    ): CfnCluster.ClusterEndpointProperty {
        val builder = CfnClusterClusterEndpointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCluster`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
     * .name("name")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html)
     */
    public inline fun cfnClusterProps(block: CfnClusterPropsDsl.() -> Unit = {}): CfnClusterProps {
        val builder = CfnClusterPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new control panel in Amazon Route 53 Application Recovery Controller.
     *
     * A control panel represents a group of routing controls that can be changed together in a
     * single transaction. You can use a control panel to centrally view the operational status of
     * applications across your organization, and trigger multi-app failovers in a single
     * transaction, for example, to fail over from one AWS Region (cell) to another.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * CfnControlPanel cfnControlPanel = CfnControlPanel.Builder.create(this, "MyCfnControlPanel")
     * .name("name")
     * // the properties below are optional
     * .clusterArn("clusterArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html)
     */
    public inline fun cfnControlPanel(
        scope: Construct,
        id: String,
        block: CfnControlPanelDsl.() -> Unit = {},
    ): CfnControlPanel {
        val builder = CfnControlPanelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnControlPanel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * CfnControlPanelProps cfnControlPanelProps = CfnControlPanelProps.builder()
     * .name("name")
     * // the properties below are optional
     * .clusterArn("clusterArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html)
     */
    public inline fun cfnControlPanelProps(
        block: CfnControlPanelPropsDsl.() -> Unit = {}
    ): CfnControlPanelProps {
        val builder = CfnControlPanelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a routing control in Amazon Route 53 Application Recovery Controller.
     *
     * Routing control states are maintained on the highly reliable cluster data plane.
     *
     * To get or update the state of the routing control, you must specify a cluster endpoint, which
     * is an endpoint URL and an AWS Region. For more information, see
     * [Code examples](https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples.html)
     * in the Amazon Route 53 Application Recovery Controller Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * CfnRoutingControl cfnRoutingControl = CfnRoutingControl.Builder.create(this,
     * "MyCfnRoutingControl")
     * .name("name")
     * // the properties below are optional
     * .clusterArn("clusterArn")
     * .controlPanelArn("controlPanelArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html)
     */
    public inline fun cfnRoutingControl(
        scope: Construct,
        id: String,
        block: CfnRoutingControlDsl.() -> Unit = {},
    ): CfnRoutingControl {
        val builder = CfnRoutingControlDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRoutingControl`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * CfnRoutingControlProps cfnRoutingControlProps = CfnRoutingControlProps.builder()
     * .name("name")
     * // the properties below are optional
     * .clusterArn("clusterArn")
     * .controlPanelArn("controlPanelArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-routingcontrol.html)
     */
    public inline fun cfnRoutingControlProps(
        block: CfnRoutingControlPropsDsl.() -> Unit = {}
    ): CfnRoutingControlProps {
        val builder = CfnRoutingControlPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a safety rule in a control panel in Amazon Route 53 Application Recovery Controller.
     *
     * Safety rules in Amazon Route 53 Application Recovery Controller let you add safeguards around
     * changing routing control states, and enabling and disabling routing controls, to help prevent
     * unwanted outcomes. Note that the name of a safety rule must be unique within a control panel.
     *
     * There are two types of safety rules in Route 53 ARC: assertion rules and gating rules.
     *
     * Assertion rule: An assertion rule enforces that, when you change a routing control state,
     * certain criteria are met. For example, the criteria might be that at least one routing
     * control state is `On` after the transaction completes so that traffic continues to be
     * directed to at least one cell for the application. This prevents a fail-open scenario.
     *
     * Gating rule: A gating rule lets you configure a gating routing control as an overall on-off
     * switch for a group of routing controls. Or, you can configure more complex gating scenarios,
     * for example, by configuring multiple gating routing controls.
     *
     * For more information, see
     * [Safety rules](https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.safety-rules.html)
     * in the Amazon Route 53 Application Recovery Controller Developer Guide.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * CfnSafetyRule cfnSafetyRule = CfnSafetyRule.Builder.create(this, "MyCfnSafetyRule")
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
    public inline fun cfnSafetyRule(
        scope: Construct,
        id: String,
        block: CfnSafetyRuleDsl.() -> Unit = {},
    ): CfnSafetyRule {
        val builder = CfnSafetyRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An assertion rule enforces that, when you change a routing control state, that the criteria
     * that you set in the rule configuration is met.
     *
     * Otherwise, the change to the routing control is not accepted. For example, the criteria might
     * be that at least one routing control state is `On` after the transaction so that traffic
     * continues to flow to at least one cell for the application. This ensures that you avoid a
     * fail-open scenario.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * AssertionRuleProperty assertionRuleProperty = AssertionRuleProperty.builder()
     * .assertedControls(List.of("assertedControls"))
     * .waitPeriodMs(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-assertionrule.html)
     */
    public inline fun cfnSafetyRuleAssertionRuleProperty(
        block: CfnSafetyRuleAssertionRulePropertyDsl.() -> Unit = {}
    ): CfnSafetyRule.AssertionRuleProperty {
        val builder = CfnSafetyRuleAssertionRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A gating rule verifies that a gating routing control or set of gating routing controls,
     * evaluates as true, based on a rule configuration that you specify, which allows a set of
     * routing control state changes to complete.
     *
     * For example, if you specify one gating routing control and you set the `Type` in the rule
     * configuration to `OR` , that indicates that you must set the gating routing control to `On`
     * for the rule to evaluate as true; that is, for the gating control switch to be On. When you
     * do that, then you can update the routing control states for the target routing controls that
     * you specify in the gating rule.
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
    public inline fun cfnSafetyRuleGatingRuleProperty(
        block: CfnSafetyRuleGatingRulePropertyDsl.() -> Unit = {}
    ): CfnSafetyRule.GatingRuleProperty {
        val builder = CfnSafetyRuleGatingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnSafetyRuleProps(
        block: CfnSafetyRulePropsDsl.() -> Unit = {}
    ): CfnSafetyRuleProps {
        val builder = CfnSafetyRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The rule configuration for an assertion rule.
     *
     * That is, the criteria that you set for specific assertion controls (routing controls) that
     * specify how many controls must be enabled after a transaction completes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.route53recoverycontrol.*;
     * RuleConfigProperty ruleConfigProperty = RuleConfigProperty.builder()
     * .inverted(false)
     * .threshold(123)
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-ruleconfig.html)
     */
    public inline fun cfnSafetyRuleRuleConfigProperty(
        block: CfnSafetyRuleRuleConfigPropertyDsl.() -> Unit = {}
    ): CfnSafetyRule.RuleConfigProperty {
        val builder = CfnSafetyRuleRuleConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
