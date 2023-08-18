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

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewall
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps
import software.amazon.awscdk.services.networkfirewall.CfnFirewallProps
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps
import software.constructs.Construct

public object networkfirewall {
    /**
     * Use the `Firewall` to provide stateful, managed, network firewall and intrusion detection and
     * prevention filtering for your VPCs in Amazon VPC .
     *
     * The firewall defines the configuration settings for an AWS Network Firewall firewall. The
     * settings include the firewall policy, the subnets in your VPC to use for the firewall
     * endpoints, and any tags that are attached to the firewall AWS resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CfnFirewall cfnFirewall = CfnFirewall.Builder.create(this, "MyCfnFirewall")
     * .firewallName("firewallName")
     * .firewallPolicyArn("firewallPolicyArn")
     * .subnetMappings(List.of(SubnetMappingProperty.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .ipAddressType("ipAddressType")
     * .build()))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .deleteProtection(false)
     * .description("description")
     * .firewallPolicyChangeProtection(false)
     * .subnetChangeProtection(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html)
     */
    public inline fun cfnFirewall(
        scope: Construct,
        id: String,
        block: CfnFirewallDsl.() -> Unit = {},
    ): CfnFirewall {
        val builder = CfnFirewallDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `FirewallPolicy` to define the stateless and stateful network traffic filtering
     * behavior for your `Firewall` .
     *
     * You can use one firewall policy for multiple firewalls.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CfnFirewallPolicy cfnFirewallPolicy = CfnFirewallPolicy.Builder.create(this,
     * "MyCfnFirewallPolicy")
     * .firewallPolicy(FirewallPolicyProperty.builder()
     * .statelessDefaultActions(List.of("statelessDefaultActions"))
     * .statelessFragmentDefaultActions(List.of("statelessFragmentDefaultActions"))
     * // the properties below are optional
     * .policyVariables(PolicyVariablesProperty.builder()
     * .ruleVariables(Map.of(
     * "ruleVariablesKey", Map.of(
     * "definition", List.of("definition"))))
     * .build())
     * .statefulDefaultActions(List.of("statefulDefaultActions"))
     * .statefulEngineOptions(StatefulEngineOptionsProperty.builder()
     * .ruleOrder("ruleOrder")
     * .streamExceptionPolicy("streamExceptionPolicy")
     * .build())
     * .statefulRuleGroupReferences(List.of(StatefulRuleGroupReferenceProperty.builder()
     * .resourceArn("resourceArn")
     * // the properties below are optional
     * .override(StatefulRuleGroupOverrideProperty.builder()
     * .action("action")
     * .build())
     * .priority(123)
     * .build()))
     * .statelessCustomActions(List.of(CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build()))
     * .statelessRuleGroupReferences(List.of(StatelessRuleGroupReferenceProperty.builder()
     * .priority(123)
     * .resourceArn("resourceArn")
     * .build()))
     * .build())
     * .firewallPolicyName("firewallPolicyName")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html)
     */
    public inline fun cfnFirewallPolicy(
        scope: Construct,
        id: String,
        block: CfnFirewallPolicyDsl.() -> Unit = {},
    ): CfnFirewallPolicy {
        val builder = CfnFirewallPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom action to use in stateless rule actions settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * ActionDefinitionProperty actionDefinitionProperty = ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-actiondefinition.html)
     */
    public inline fun cfnFirewallPolicyActionDefinitionProperty(
        block: CfnFirewallPolicyActionDefinitionPropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.ActionDefinitionProperty {
        val builder = CfnFirewallPolicyActionDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An optional, non-standard action to use for stateless packet handling.
     *
     * You can define this in addition to the standard action that you must specify.
     *
     * You define and name the custom actions that you want to be able to use, and then you
     * reference them by name in your actions settings.
     *
     * You can use custom actions in the following places:
     * * In an `RuleGroup.StatelessRulesAndCustomActions` . The custom actions are available for use
     *   by name inside the `StatelessRulesAndCustomActions` where you define them. You can use them
     *   for your stateless rule actions to specify what to do with a packet that matches the rule's
     *   match attributes.
     * * In an `FirewallPolicy` specification, in `StatelessCustomActions` . The custom actions are
     *   available for use inside the policy where you define them. You can use them for the
     *   policy's default stateless actions settings to specify what to do with packets that don't
     *   match any of the policy's stateless rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CustomActionProperty customActionProperty = CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-customaction.html)
     */
    public inline fun cfnFirewallPolicyCustomActionProperty(
        block: CfnFirewallPolicyCustomActionPropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.CustomActionProperty {
        val builder = CfnFirewallPolicyCustomActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value to use in an Amazon CloudWatch custom metric dimension.
     *
     * This is used in the `PublishMetrics` custom action. A CloudWatch custom metric dimension is a
     * name/value pair that's part of the identity of a metric.
     *
     * AWS Network Firewall sets the dimension name to `CustomAction` and you provide the dimension
     * value.
     *
     * For more information about CloudWatch custom metric dimensions, see
     * [Publishing Custom Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#usingDimensions)
     * in the
     * [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * DimensionProperty dimensionProperty = DimensionProperty.builder()
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-dimension.html)
     */
    public inline fun cfnFirewallPolicyDimensionProperty(
        block: CfnFirewallPolicyDimensionPropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.DimensionProperty {
        val builder = CfnFirewallPolicyDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
     * stateful rule groups and other settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * FirewallPolicyProperty firewallPolicyProperty = FirewallPolicyProperty.builder()
     * .statelessDefaultActions(List.of("statelessDefaultActions"))
     * .statelessFragmentDefaultActions(List.of("statelessFragmentDefaultActions"))
     * // the properties below are optional
     * .policyVariables(PolicyVariablesProperty.builder()
     * .ruleVariables(Map.of(
     * "ruleVariablesKey", Map.of(
     * "definition", List.of("definition"))))
     * .build())
     * .statefulDefaultActions(List.of("statefulDefaultActions"))
     * .statefulEngineOptions(StatefulEngineOptionsProperty.builder()
     * .ruleOrder("ruleOrder")
     * .streamExceptionPolicy("streamExceptionPolicy")
     * .build())
     * .statefulRuleGroupReferences(List.of(StatefulRuleGroupReferenceProperty.builder()
     * .resourceArn("resourceArn")
     * // the properties below are optional
     * .override(StatefulRuleGroupOverrideProperty.builder()
     * .action("action")
     * .build())
     * .priority(123)
     * .build()))
     * .statelessCustomActions(List.of(CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build()))
     * .statelessRuleGroupReferences(List.of(StatelessRuleGroupReferenceProperty.builder()
     * .priority(123)
     * .resourceArn("resourceArn")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html)
     */
    public inline fun cfnFirewallPolicyFirewallPolicyProperty(
        block: CfnFirewallPolicyFirewallPolicyPropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.FirewallPolicyProperty {
        val builder = CfnFirewallPolicyFirewallPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of IP addresses and address ranges, in CIDR notation.
     *
     * This is part of a `RuleVariables` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * IPSetProperty iPSetProperty = Map.of(
     * "definition", List.of("definition"));
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-ipset.html)
     */
    public inline fun cfnFirewallPolicyIPSetProperty(
        block: CfnFirewallPolicyIPSetPropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.IPSetProperty {
        val builder = CfnFirewallPolicyIPSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains variables that you can use to override default Suricata settings in your firewall
     * policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * PolicyVariablesProperty policyVariablesProperty = PolicyVariablesProperty.builder()
     * .ruleVariables(Map.of(
     * "ruleVariablesKey", Map.of(
     * "definition", List.of("definition"))))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-policyvariables.html)
     */
    public inline fun cfnFirewallPolicyPolicyVariablesProperty(
        block: CfnFirewallPolicyPolicyVariablesPropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.PolicyVariablesProperty {
        val builder = CfnFirewallPolicyPolicyVariablesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFirewallPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CfnFirewallPolicyProps cfnFirewallPolicyProps = CfnFirewallPolicyProps.builder()
     * .firewallPolicy(FirewallPolicyProperty.builder()
     * .statelessDefaultActions(List.of("statelessDefaultActions"))
     * .statelessFragmentDefaultActions(List.of("statelessFragmentDefaultActions"))
     * // the properties below are optional
     * .policyVariables(PolicyVariablesProperty.builder()
     * .ruleVariables(Map.of(
     * "ruleVariablesKey", Map.of(
     * "definition", List.of("definition"))))
     * .build())
     * .statefulDefaultActions(List.of("statefulDefaultActions"))
     * .statefulEngineOptions(StatefulEngineOptionsProperty.builder()
     * .ruleOrder("ruleOrder")
     * .streamExceptionPolicy("streamExceptionPolicy")
     * .build())
     * .statefulRuleGroupReferences(List.of(StatefulRuleGroupReferenceProperty.builder()
     * .resourceArn("resourceArn")
     * // the properties below are optional
     * .override(StatefulRuleGroupOverrideProperty.builder()
     * .action("action")
     * .build())
     * .priority(123)
     * .build()))
     * .statelessCustomActions(List.of(CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build()))
     * .statelessRuleGroupReferences(List.of(StatelessRuleGroupReferenceProperty.builder()
     * .priority(123)
     * .resourceArn("resourceArn")
     * .build()))
     * .build())
     * .firewallPolicyName("firewallPolicyName")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewallpolicy.html)
     */
    public inline fun cfnFirewallPolicyProps(
        block: CfnFirewallPolicyPropsDsl.() -> Unit = {}
    ): CfnFirewallPolicyProps {
        val builder = CfnFirewallPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for
     * the matching packet.
     *
     * This setting defines a CloudWatch dimension value to be published.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * PublishMetricActionProperty publishMetricActionProperty = PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-publishmetricaction.html)
     */
    public inline fun cfnFirewallPolicyPublishMetricActionProperty(
        block: CfnFirewallPolicyPublishMetricActionPropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.PublishMetricActionProperty {
        val builder = CfnFirewallPolicyPublishMetricActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration settings for the handling of the stateful rule groups in a firewall policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * StatefulEngineOptionsProperty statefulEngineOptionsProperty =
     * StatefulEngineOptionsProperty.builder()
     * .ruleOrder("ruleOrder")
     * .streamExceptionPolicy("streamExceptionPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulengineoptions.html)
     */
    public inline fun cfnFirewallPolicyStatefulEngineOptionsProperty(
        block: CfnFirewallPolicyStatefulEngineOptionsPropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.StatefulEngineOptionsProperty {
        val builder = CfnFirewallPolicyStatefulEngineOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The setting that allows the policy owner to change the behavior of the rule group within a
     * policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * StatefulRuleGroupOverrideProperty statefulRuleGroupOverrideProperty =
     * StatefulRuleGroupOverrideProperty.builder()
     * .action("action")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupoverride.html)
     */
    public inline fun cfnFirewallPolicyStatefulRuleGroupOverrideProperty(
        block: CfnFirewallPolicyStatefulRuleGroupOverridePropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.StatefulRuleGroupOverrideProperty {
        val builder = CfnFirewallPolicyStatefulRuleGroupOverridePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifier for a single stateful rule group, used in a firewall policy to refer to a rule
     * group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * StatefulRuleGroupReferenceProperty statefulRuleGroupReferenceProperty =
     * StatefulRuleGroupReferenceProperty.builder()
     * .resourceArn("resourceArn")
     * // the properties below are optional
     * .override(StatefulRuleGroupOverrideProperty.builder()
     * .action("action")
     * .build())
     * .priority(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html)
     */
    public inline fun cfnFirewallPolicyStatefulRuleGroupReferenceProperty(
        block: CfnFirewallPolicyStatefulRuleGroupReferencePropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.StatefulRuleGroupReferenceProperty {
        val builder = CfnFirewallPolicyStatefulRuleGroupReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Identifier for a single stateless rule group, used in a firewall policy to refer to the rule
     * group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * StatelessRuleGroupReferenceProperty statelessRuleGroupReferenceProperty =
     * StatelessRuleGroupReferenceProperty.builder()
     * .priority(123)
     * .resourceArn("resourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statelessrulegroupreference.html)
     */
    public inline fun cfnFirewallPolicyStatelessRuleGroupReferenceProperty(
        block: CfnFirewallPolicyStatelessRuleGroupReferencePropertyDsl.() -> Unit = {}
    ): CfnFirewallPolicy.StatelessRuleGroupReferenceProperty {
        val builder = CfnFirewallPolicyStatelessRuleGroupReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFirewall`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CfnFirewallProps cfnFirewallProps = CfnFirewallProps.builder()
     * .firewallName("firewallName")
     * .firewallPolicyArn("firewallPolicyArn")
     * .subnetMappings(List.of(SubnetMappingProperty.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .ipAddressType("ipAddressType")
     * .build()))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .deleteProtection(false)
     * .description("description")
     * .firewallPolicyChangeProtection(false)
     * .subnetChangeProtection(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-firewall.html)
     */
    public inline fun cfnFirewallProps(
        block: CfnFirewallPropsDsl.() -> Unit = {}
    ): CfnFirewallProps {
        val builder = CfnFirewallPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The ID for a subnet that you want to associate with the firewall.
     *
     * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
     * specify, to filter traffic in the subnet's Availability Zone.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * SubnetMappingProperty subnetMappingProperty = SubnetMappingProperty.builder()
     * .subnetId("subnetId")
     * // the properties below are optional
     * .ipAddressType("ipAddressType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewall-subnetmapping.html)
     */
    public inline fun cfnFirewallSubnetMappingProperty(
        block: CfnFirewallSubnetMappingPropertyDsl.() -> Unit = {}
    ): CfnFirewall.SubnetMappingProperty {
        val builder = CfnFirewallSubnetMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `LoggingConfiguration` to define the destinations and logging options for an
     * `Firewall` .
     *
     * You must change the logging configuration by changing one `LogDestinationConfig` setting at a
     * time in your `LogDestinationConfigs` .
     *
     * You can make only one of the following changes to your `LoggingConfiguration` resource:
     * * Create a new log destination object by adding a single `LogDestinationConfig` array element
     *   to `LogDestinationConfigs` .
     * * Delete a log destination object by removing a single `LogDestinationConfig` array element
     *   from `LogDestinationConfigs` .
     * * Change the `LogDestination` setting in a single `LogDestinationConfig` array element.
     *
     * You can't change the `LogDestinationType` or `LogType` in a `LogDestinationConfig` . To
     * change these settings, delete the existing `LogDestinationConfig` object and create a new
     * one, in two separate modifications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CfnLoggingConfiguration cfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this,
     * "MyCfnLoggingConfiguration")
     * .firewallArn("firewallArn")
     * .loggingConfiguration(LoggingConfigurationProperty.builder()
     * .logDestinationConfigs(List.of(LogDestinationConfigProperty.builder()
     * .logDestination(Map.of(
     * "logDestinationKey", "logDestination"))
     * .logDestinationType("logDestinationType")
     * .logType("logType")
     * .build()))
     * .build())
     * // the properties below are optional
     * .firewallName("firewallName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html)
     */
    public inline fun cfnLoggingConfiguration(
        scope: Construct,
        id: String,
        block: CfnLoggingConfigurationDsl.() -> Unit = {},
    ): CfnLoggingConfiguration {
        val builder = CfnLoggingConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines where AWS Network Firewall sends logs for the firewall for one log type.
     *
     * This is used in `LoggingConfiguration` . You can send each type of log to an Amazon S3
     * bucket, a CloudWatch log group, or a Kinesis Data Firehose delivery stream.
     *
     * Network Firewall generates logs for stateful rule groups. You can save alert and flow log
     * types. The stateful rules engine records flow logs for all network traffic that it receives.
     * It records alert logs for traffic that matches stateful rules that have the rule action set
     * to `DROP` or `ALERT` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * LogDestinationConfigProperty logDestinationConfigProperty =
     * LogDestinationConfigProperty.builder()
     * .logDestination(Map.of(
     * "logDestinationKey", "logDestination"))
     * .logDestinationType("logDestinationType")
     * .logType("logType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-logdestinationconfig.html)
     */
    public inline fun cfnLoggingConfigurationLogDestinationConfigProperty(
        block: CfnLoggingConfigurationLogDestinationConfigPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.LogDestinationConfigProperty {
        val builder = CfnLoggingConfigurationLogDestinationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines how AWS Network Firewall performs logging for a `Firewall` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * LoggingConfigurationProperty loggingConfigurationProperty =
     * LoggingConfigurationProperty.builder()
     * .logDestinationConfigs(List.of(LogDestinationConfigProperty.builder()
     * .logDestination(Map.of(
     * "logDestinationKey", "logDestination"))
     * .logDestinationType("logDestinationType")
     * .logType("logType")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-loggingconfiguration-loggingconfiguration.html)
     */
    public inline fun cfnLoggingConfigurationLoggingConfigurationProperty(
        block: CfnLoggingConfigurationLoggingConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLoggingConfiguration.LoggingConfigurationProperty {
        val builder = CfnLoggingConfigurationLoggingConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLoggingConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CfnLoggingConfigurationProps cfnLoggingConfigurationProps =
     * CfnLoggingConfigurationProps.builder()
     * .firewallArn("firewallArn")
     * .loggingConfiguration(LoggingConfigurationProperty.builder()
     * .logDestinationConfigs(List.of(LogDestinationConfigProperty.builder()
     * .logDestination(Map.of(
     * "logDestinationKey", "logDestination"))
     * .logDestinationType("logDestinationType")
     * .logType("logType")
     * .build()))
     * .build())
     * // the properties below are optional
     * .firewallName("firewallName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-loggingconfiguration.html)
     */
    public inline fun cfnLoggingConfigurationProps(
        block: CfnLoggingConfigurationPropsDsl.() -> Unit = {}
    ): CfnLoggingConfigurationProps {
        val builder = CfnLoggingConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the `RuleGroup` to define a reusable collection of stateless or stateful network traffic
     * filtering rules.
     *
     * You use rule groups in an `FirewallPolicy` to specify the filtering behavior of an `Firewall`
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CfnRuleGroup cfnRuleGroup = CfnRuleGroup.Builder.create(this, "MyCfnRuleGroup")
     * .capacity(123)
     * .ruleGroupName("ruleGroupName")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .ruleGroup(RuleGroupProperty.builder()
     * .rulesSource(RulesSourceProperty.builder()
     * .rulesSourceList(RulesSourceListProperty.builder()
     * .generatedRulesType("generatedRulesType")
     * .targets(List.of("targets"))
     * .targetTypes(List.of("targetTypes"))
     * .build())
     * .rulesString("rulesString")
     * .statefulRules(List.of(StatefulRuleProperty.builder()
     * .action("action")
     * .header(HeaderProperty.builder()
     * .destination("destination")
     * .destinationPort("destinationPort")
     * .direction("direction")
     * .protocol("protocol")
     * .source("source")
     * .sourcePort("sourcePort")
     * .build())
     * .ruleOptions(List.of(RuleOptionProperty.builder()
     * .keyword("keyword")
     * // the properties below are optional
     * .settings(List.of("settings"))
     * .build()))
     * .build()))
     * .statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty.builder()
     * .statelessRules(List.of(StatelessRuleProperty.builder()
     * .priority(123)
     * .ruleDefinition(RuleDefinitionProperty.builder()
     * .actions(List.of("actions"))
     * .matchAttributes(MatchAttributesProperty.builder()
     * .destinationPorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .destinations(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .protocols(List.of(123))
     * .sourcePorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .sources(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build()))
     * .build())
     * .build())
     * .build()))
     * // the properties below are optional
     * .customActions(List.of(CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .referenceSets(ReferenceSetsProperty.builder()
     * .ipSetReferences(Map.of(
     * "ipSetReferencesKey", Map.of(
     * "referenceArn", "referenceArn")))
     * .build())
     * .ruleVariables(RuleVariablesProperty.builder()
     * .ipSets(Map.of(
     * "ipSetsKey", Map.of(
     * "definition", List.of("definition"))))
     * .portSets(Map.of(
     * "portSetsKey", PortSetProperty.builder()
     * .definition(List.of("definition"))
     * .build()))
     * .build())
     * .statefulRuleOptions(StatefulRuleOptionsProperty.builder()
     * .ruleOrder("ruleOrder")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html)
     */
    public inline fun cfnRuleGroup(
        scope: Construct,
        id: String,
        block: CfnRuleGroupDsl.() -> Unit = {},
    ): CfnRuleGroup {
        val builder = CfnRuleGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom action to use in stateless rule actions settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * ActionDefinitionProperty actionDefinitionProperty = ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-actiondefinition.html)
     */
    public inline fun cfnRuleGroupActionDefinitionProperty(
        block: CfnRuleGroupActionDefinitionPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.ActionDefinitionProperty {
        val builder = CfnRuleGroupActionDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single IP address specification.
     *
     * This is used in the `RuleGroup.MatchAttributes` source and destination specifications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * AddressProperty addressProperty = AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-address.html)
     */
    public inline fun cfnRuleGroupAddressProperty(
        block: CfnRuleGroupAddressPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.AddressProperty {
        val builder = CfnRuleGroupAddressPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An optional, non-standard action to use for stateless packet handling.
     *
     * You can define this in addition to the standard action that you must specify.
     *
     * You define and name the custom actions that you want to be able to use, and then you
     * reference them by name in your actions settings.
     *
     * You can use custom actions in the following places:
     * * In an `RuleGroup.StatelessRulesAndCustomActions` . The custom actions are available for use
     *   by name inside the `StatelessRulesAndCustomActions` where you define them. You can use them
     *   for your stateless rule actions to specify what to do with a packet that matches the rule's
     *   match attributes.
     * * In an `FirewallPolicy` specification, in `StatelessCustomActions` . The custom actions are
     *   available for use inside the policy where you define them. You can use them for the
     *   policy's default stateless actions settings to specify what to do with packets that don't
     *   match any of the policy's stateless rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CustomActionProperty customActionProperty = CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-customaction.html)
     */
    public inline fun cfnRuleGroupCustomActionProperty(
        block: CfnRuleGroupCustomActionPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.CustomActionProperty {
        val builder = CfnRuleGroupCustomActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The value to use in an Amazon CloudWatch custom metric dimension.
     *
     * This is used in the `PublishMetrics` custom action. A CloudWatch custom metric dimension is a
     * name/value pair that's part of the identity of a metric.
     *
     * AWS Network Firewall sets the dimension name to `CustomAction` and you provide the dimension
     * value.
     *
     * For more information about CloudWatch custom metric dimensions, see
     * [Publishing Custom Metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html#usingDimensions)
     * in the
     * [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * DimensionProperty dimensionProperty = DimensionProperty.builder()
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-dimension.html)
     */
    public inline fun cfnRuleGroupDimensionProperty(
        block: CfnRuleGroupDimensionPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.DimensionProperty {
        val builder = CfnRuleGroupDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The 5-tuple criteria for AWS Network Firewall to use to inspect packet headers in stateful
     * traffic flow inspection.
     *
     * Traffic flows that match the criteria are a match for the corresponding stateful rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * HeaderProperty headerProperty = HeaderProperty.builder()
     * .destination("destination")
     * .destinationPort("destinationPort")
     * .direction("direction")
     * .protocol("protocol")
     * .source("source")
     * .sourcePort("sourcePort")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-header.html)
     */
    public inline fun cfnRuleGroupHeaderProperty(
        block: CfnRuleGroupHeaderPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.HeaderProperty {
        val builder = CfnRuleGroupHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of IP addresses and address ranges, in CIDR notation.
     *
     * This is part of a `RuleGroup.RuleVariables` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * IPSetProperty iPSetProperty = Map.of(
     * "definition", List.of("definition"));
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipset.html)
     */
    public inline fun cfnRuleGroupIPSetProperty(
        block: CfnRuleGroupIPSetPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.IPSetProperty {
        val builder = CfnRuleGroupIPSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures one or more `IPSetReferences` for a Suricata-compatible rule group.
     *
     * An IP set reference is a rule variable that references a resource that you create and manage
     * in another AWS service, such as an Amazon VPC prefix list. Network Firewall IP set references
     * enable you to dynamically update the contents of your rules. When you create, update, or
     * delete the IP set you are referencing in your rule, Network Firewall automatically updates
     * the rule's content with the changes. For more information about IP set references in Network
     * Firewall , see
     * [Using IP set references](https://docs.aws.amazon.com/network-firewall/latest/developerguide/rule-groups-ip-set-references.html)
     * in the *Network Firewall Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * IPSetReferenceProperty iPSetReferenceProperty = Map.of(
     * "referenceArn", "referenceArn");
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ipsetreference.html)
     */
    public inline fun cfnRuleGroupIPSetReferenceProperty(
        block: CfnRuleGroupIPSetReferencePropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.IPSetReferenceProperty {
        val builder = CfnRuleGroupIPSetReferencePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Criteria for Network Firewall to use to inspect an individual packet in stateless rule
     * inspection.
     *
     * Each match attributes set can include one or more items such as IP address, CIDR range, port
     * number, protocol, and TCP flags.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * MatchAttributesProperty matchAttributesProperty = MatchAttributesProperty.builder()
     * .destinationPorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .destinations(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .protocols(List.of(123))
     * .sourcePorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .sources(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html)
     */
    public inline fun cfnRuleGroupMatchAttributesProperty(
        block: CfnRuleGroupMatchAttributesPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.MatchAttributesProperty {
        val builder = CfnRuleGroupMatchAttributesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single port range specification.
     *
     * This is used for source and destination port ranges in the stateless
     * `RuleGroup.MatchAttributes` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portrange.html)
     */
    public inline fun cfnRuleGroupPortRangeProperty(
        block: CfnRuleGroupPortRangePropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.PortRangeProperty {
        val builder = CfnRuleGroupPortRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A set of port ranges for use in the rules in a rule group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * PortSetProperty portSetProperty = PortSetProperty.builder()
     * .definition(List.of("definition"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-portset.html)
     */
    public inline fun cfnRuleGroupPortSetProperty(
        block: CfnRuleGroupPortSetPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.PortSetProperty {
        val builder = CfnRuleGroupPortSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRuleGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * CfnRuleGroupProps cfnRuleGroupProps = CfnRuleGroupProps.builder()
     * .capacity(123)
     * .ruleGroupName("ruleGroupName")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .ruleGroup(RuleGroupProperty.builder()
     * .rulesSource(RulesSourceProperty.builder()
     * .rulesSourceList(RulesSourceListProperty.builder()
     * .generatedRulesType("generatedRulesType")
     * .targets(List.of("targets"))
     * .targetTypes(List.of("targetTypes"))
     * .build())
     * .rulesString("rulesString")
     * .statefulRules(List.of(StatefulRuleProperty.builder()
     * .action("action")
     * .header(HeaderProperty.builder()
     * .destination("destination")
     * .destinationPort("destinationPort")
     * .direction("direction")
     * .protocol("protocol")
     * .source("source")
     * .sourcePort("sourcePort")
     * .build())
     * .ruleOptions(List.of(RuleOptionProperty.builder()
     * .keyword("keyword")
     * // the properties below are optional
     * .settings(List.of("settings"))
     * .build()))
     * .build()))
     * .statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty.builder()
     * .statelessRules(List.of(StatelessRuleProperty.builder()
     * .priority(123)
     * .ruleDefinition(RuleDefinitionProperty.builder()
     * .actions(List.of("actions"))
     * .matchAttributes(MatchAttributesProperty.builder()
     * .destinationPorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .destinations(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .protocols(List.of(123))
     * .sourcePorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .sources(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build()))
     * .build())
     * .build())
     * .build()))
     * // the properties below are optional
     * .customActions(List.of(CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .referenceSets(ReferenceSetsProperty.builder()
     * .ipSetReferences(Map.of(
     * "ipSetReferencesKey", Map.of(
     * "referenceArn", "referenceArn")))
     * .build())
     * .ruleVariables(RuleVariablesProperty.builder()
     * .ipSets(Map.of(
     * "ipSetsKey", Map.of(
     * "definition", List.of("definition"))))
     * .portSets(Map.of(
     * "portSetsKey", PortSetProperty.builder()
     * .definition(List.of("definition"))
     * .build()))
     * .build())
     * .statefulRuleOptions(StatefulRuleOptionsProperty.builder()
     * .ruleOrder("ruleOrder")
     * .build())
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html)
     */
    public inline fun cfnRuleGroupProps(
        block: CfnRuleGroupPropsDsl.() -> Unit = {}
    ): CfnRuleGroupProps {
        val builder = CfnRuleGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for
     * the matching packet.
     *
     * This setting defines a CloudWatch dimension value to be published.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * PublishMetricActionProperty publishMetricActionProperty = PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-publishmetricaction.html)
     */
    public inline fun cfnRuleGroupPublishMetricActionProperty(
        block: CfnRuleGroupPublishMetricActionPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.PublishMetricActionProperty {
        val builder = CfnRuleGroupPublishMetricActionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures the `ReferenceSets` for a stateful rule group.
     *
     * For more information, see the
     * [Using IP set references in Suricata compatible rule groups](https://docs.aws.amazon.com/network-firewall/latest/developerguide/rule-groups-ip-set-references.html)
     * in the *Network Firewall User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * ReferenceSetsProperty referenceSetsProperty = ReferenceSetsProperty.builder()
     * .ipSetReferences(Map.of(
     * "ipSetReferencesKey", Map.of(
     * "referenceArn", "referenceArn")))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-referencesets.html)
     */
    public inline fun cfnRuleGroupReferenceSetsProperty(
        block: CfnRuleGroupReferenceSetsPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.ReferenceSetsProperty {
        val builder = CfnRuleGroupReferenceSetsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The inspection criteria and action for a single stateless rule.
     *
     * AWS Network Firewall inspects each packet for the specified matching criteria. When a packet
     * matches the criteria, Network Firewall performs the rule's actions on the packet.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * RuleDefinitionProperty ruleDefinitionProperty = RuleDefinitionProperty.builder()
     * .actions(List.of("actions"))
     * .matchAttributes(MatchAttributesProperty.builder()
     * .destinationPorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .destinations(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .protocols(List.of(123))
     * .sourcePorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .sources(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruledefinition.html)
     */
    public inline fun cfnRuleGroupRuleDefinitionProperty(
        block: CfnRuleGroupRuleDefinitionPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RuleDefinitionProperty {
        val builder = CfnRuleGroupRuleDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The object that defines the rules in a rule group.
     *
     * AWS Network Firewall uses a rule group to inspect and control network traffic. You define
     * stateless rule groups to inspect individual packets and you define stateful rule groups to
     * inspect packets in the context of their traffic flow.
     *
     * To use a rule group, you include it by reference in an Network Firewall firewall policy, then
     * you use the policy in a firewall. You can reference a rule group from more than one firewall
     * policy, and you can use a firewall policy in more than one firewall.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * RuleGroupProperty ruleGroupProperty = RuleGroupProperty.builder()
     * .rulesSource(RulesSourceProperty.builder()
     * .rulesSourceList(RulesSourceListProperty.builder()
     * .generatedRulesType("generatedRulesType")
     * .targets(List.of("targets"))
     * .targetTypes(List.of("targetTypes"))
     * .build())
     * .rulesString("rulesString")
     * .statefulRules(List.of(StatefulRuleProperty.builder()
     * .action("action")
     * .header(HeaderProperty.builder()
     * .destination("destination")
     * .destinationPort("destinationPort")
     * .direction("direction")
     * .protocol("protocol")
     * .source("source")
     * .sourcePort("sourcePort")
     * .build())
     * .ruleOptions(List.of(RuleOptionProperty.builder()
     * .keyword("keyword")
     * // the properties below are optional
     * .settings(List.of("settings"))
     * .build()))
     * .build()))
     * .statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty.builder()
     * .statelessRules(List.of(StatelessRuleProperty.builder()
     * .priority(123)
     * .ruleDefinition(RuleDefinitionProperty.builder()
     * .actions(List.of("actions"))
     * .matchAttributes(MatchAttributesProperty.builder()
     * .destinationPorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .destinations(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .protocols(List.of(123))
     * .sourcePorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .sources(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build()))
     * .build())
     * .build())
     * .build()))
     * // the properties below are optional
     * .customActions(List.of(CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build()))
     * .build())
     * .build())
     * // the properties below are optional
     * .referenceSets(ReferenceSetsProperty.builder()
     * .ipSetReferences(Map.of(
     * "ipSetReferencesKey", Map.of(
     * "referenceArn", "referenceArn")))
     * .build())
     * .ruleVariables(RuleVariablesProperty.builder()
     * .ipSets(Map.of(
     * "ipSetsKey", Map.of(
     * "definition", List.of("definition"))))
     * .portSets(Map.of(
     * "portSetsKey", PortSetProperty.builder()
     * .definition(List.of("definition"))
     * .build()))
     * .build())
     * .statefulRuleOptions(StatefulRuleOptionsProperty.builder()
     * .ruleOrder("ruleOrder")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html)
     */
    public inline fun cfnRuleGroupRuleGroupProperty(
        block: CfnRuleGroupRuleGroupPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RuleGroupProperty {
        val builder = CfnRuleGroupRuleGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional settings for a stateful rule.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * RuleOptionProperty ruleOptionProperty = RuleOptionProperty.builder()
     * .keyword("keyword")
     * // the properties below are optional
     * .settings(List.of("settings"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruleoption.html)
     */
    public inline fun cfnRuleGroupRuleOptionProperty(
        block: CfnRuleGroupRuleOptionPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RuleOptionProperty {
        val builder = CfnRuleGroupRuleOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings that are available for use in the rules in the `RuleGroup` where this is defined.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * RuleVariablesProperty ruleVariablesProperty = RuleVariablesProperty.builder()
     * .ipSets(Map.of(
     * "ipSetsKey", Map.of(
     * "definition", List.of("definition"))))
     * .portSets(Map.of(
     * "portSetsKey", PortSetProperty.builder()
     * .definition(List.of("definition"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulevariables.html)
     */
    public inline fun cfnRuleGroupRuleVariablesProperty(
        block: CfnRuleGroupRuleVariablesPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RuleVariablesProperty {
        val builder = CfnRuleGroupRuleVariablesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Stateful inspection criteria for a domain list rule group.
     *
     * For HTTPS traffic, domain filtering is SNI-based. It uses the server name indicator extension
     * of the TLS handshake.
     *
     * By default, Network Firewall domain list inspection only includes traffic coming from the VPC
     * where you deploy the firewall. To inspect traffic from IP addresses outside of the deployment
     * VPC, you set the `HOME_NET` rule variable to include the CIDR range of the deployment VPC
     * plus the other CIDR ranges. For more information, see `RuleGroup.RuleVariables` in this guide
     * and
     * [Stateful domain list rule groups in AWS Network Firewall](https://docs.aws.amazon.com/network-firewall/latest/developerguide/stateful-rule-groups-domain-names.html)
     * in the *Network Firewall Developer Guide*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * RulesSourceListProperty rulesSourceListProperty = RulesSourceListProperty.builder()
     * .generatedRulesType("generatedRulesType")
     * .targets(List.of("targets"))
     * .targetTypes(List.of("targetTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessourcelist.html)
     */
    public inline fun cfnRuleGroupRulesSourceListProperty(
        block: CfnRuleGroupRulesSourceListPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RulesSourceListProperty {
        val builder = CfnRuleGroupRulesSourceListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The stateless or stateful rules definitions for use in a single rule group.
     *
     * Each rule group requires a single `RulesSource` . You can use an instance of this for either
     * stateless rules or stateful rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * RulesSourceProperty rulesSourceProperty = RulesSourceProperty.builder()
     * .rulesSourceList(RulesSourceListProperty.builder()
     * .generatedRulesType("generatedRulesType")
     * .targets(List.of("targets"))
     * .targetTypes(List.of("targetTypes"))
     * .build())
     * .rulesString("rulesString")
     * .statefulRules(List.of(StatefulRuleProperty.builder()
     * .action("action")
     * .header(HeaderProperty.builder()
     * .destination("destination")
     * .destinationPort("destinationPort")
     * .direction("direction")
     * .protocol("protocol")
     * .source("source")
     * .sourcePort("sourcePort")
     * .build())
     * .ruleOptions(List.of(RuleOptionProperty.builder()
     * .keyword("keyword")
     * // the properties below are optional
     * .settings(List.of("settings"))
     * .build()))
     * .build()))
     * .statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty.builder()
     * .statelessRules(List.of(StatelessRuleProperty.builder()
     * .priority(123)
     * .ruleDefinition(RuleDefinitionProperty.builder()
     * .actions(List.of("actions"))
     * .matchAttributes(MatchAttributesProperty.builder()
     * .destinationPorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .destinations(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .protocols(List.of(123))
     * .sourcePorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .sources(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build()))
     * .build())
     * .build())
     * .build()))
     * // the properties below are optional
     * .customActions(List.of(CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html)
     */
    public inline fun cfnRuleGroupRulesSourceProperty(
        block: CfnRuleGroupRulesSourcePropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.RulesSourceProperty {
        val builder = CfnRuleGroupRulesSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Additional options governing how Network Firewall handles the rule group.
     *
     * You can only use these for stateful rule groups.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * StatefulRuleOptionsProperty statefulRuleOptionsProperty = StatefulRuleOptionsProperty.builder()
     * .ruleOrder("ruleOrder")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulruleoptions.html)
     */
    public inline fun cfnRuleGroupStatefulRuleOptionsProperty(
        block: CfnRuleGroupStatefulRuleOptionsPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.StatefulRuleOptionsProperty {
        val builder = CfnRuleGroupStatefulRuleOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single Suricata rules specification, for use in a stateful rule group.
     *
     * Use this option to specify a simple Suricata rule with protocol, source and destination,
     * ports, direction, and rule options. For information about the Suricata `Rules` format, see
     * [Rules Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * StatefulRuleProperty statefulRuleProperty = StatefulRuleProperty.builder()
     * .action("action")
     * .header(HeaderProperty.builder()
     * .destination("destination")
     * .destinationPort("destinationPort")
     * .direction("direction")
     * .protocol("protocol")
     * .source("source")
     * .sourcePort("sourcePort")
     * .build())
     * .ruleOptions(List.of(RuleOptionProperty.builder()
     * .keyword("keyword")
     * // the properties below are optional
     * .settings(List.of("settings"))
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statefulrule.html)
     */
    public inline fun cfnRuleGroupStatefulRuleProperty(
        block: CfnRuleGroupStatefulRulePropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.StatefulRuleProperty {
        val builder = CfnRuleGroupStatefulRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A single stateless rule.
     *
     * This is used in `RuleGroup.StatelessRulesAndCustomActions` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * StatelessRuleProperty statelessRuleProperty = StatelessRuleProperty.builder()
     * .priority(123)
     * .ruleDefinition(RuleDefinitionProperty.builder()
     * .actions(List.of("actions"))
     * .matchAttributes(MatchAttributesProperty.builder()
     * .destinationPorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .destinations(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .protocols(List.of(123))
     * .sourcePorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .sources(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build()))
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrule.html)
     */
    public inline fun cfnRuleGroupStatelessRuleProperty(
        block: CfnRuleGroupStatelessRulePropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.StatelessRuleProperty {
        val builder = CfnRuleGroupStatelessRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Stateless inspection criteria.
     *
     * Each stateless rule group uses exactly one of these data types to define its stateless rules.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * StatelessRulesAndCustomActionsProperty statelessRulesAndCustomActionsProperty =
     * StatelessRulesAndCustomActionsProperty.builder()
     * .statelessRules(List.of(StatelessRuleProperty.builder()
     * .priority(123)
     * .ruleDefinition(RuleDefinitionProperty.builder()
     * .actions(List.of("actions"))
     * .matchAttributes(MatchAttributesProperty.builder()
     * .destinationPorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .destinations(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .protocols(List.of(123))
     * .sourcePorts(List.of(PortRangeProperty.builder()
     * .fromPort(123)
     * .toPort(123)
     * .build()))
     * .sources(List.of(AddressProperty.builder()
     * .addressDefinition("addressDefinition")
     * .build()))
     * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build()))
     * .build())
     * .build())
     * .build()))
     * // the properties below are optional
     * .customActions(List.of(CustomActionProperty.builder()
     * .actionDefinition(ActionDefinitionProperty.builder()
     * .publishMetricAction(PublishMetricActionProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .value("value")
     * .build()))
     * .build())
     * .build())
     * .actionName("actionName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrulesandcustomactions.html)
     */
    public inline fun cfnRuleGroupStatelessRulesAndCustomActionsProperty(
        block: CfnRuleGroupStatelessRulesAndCustomActionsPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.StatelessRulesAndCustomActionsProperty {
        val builder = CfnRuleGroupStatelessRulesAndCustomActionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * TCP flags and masks to inspect packets for. This is used in the `RuleGroup.MatchAttributes`
     * specification.
     *
     * For example:
     *
     * `"TCPFlags": [ { "Flags": [ "ECE", "SYN" ], "Masks": [ "SYN", "ECE" ] } ]`
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.networkfirewall.*;
     * TCPFlagFieldProperty tCPFlagFieldProperty = TCPFlagFieldProperty.builder()
     * .flags(List.of("flags"))
     * // the properties below are optional
     * .masks(List.of("masks"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-tcpflagfield.html)
     */
    public inline fun cfnRuleGroupTCPFlagFieldProperty(
        block: CfnRuleGroupTCPFlagFieldPropertyDsl.() -> Unit = {}
    ): CfnRuleGroup.TCPFlagFieldProperty {
        val builder = CfnRuleGroupTCPFlagFieldPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
