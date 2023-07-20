@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.ApiDestination
import software.amazon.awscdk.services.events.ApiDestinationProps
import software.amazon.awscdk.services.events.Archive
import software.amazon.awscdk.services.events.ArchiveProps
import software.amazon.awscdk.services.events.BaseArchiveProps
import software.amazon.awscdk.services.events.CfnApiDestination
import software.amazon.awscdk.services.events.CfnApiDestinationProps
import software.amazon.awscdk.services.events.CfnArchive
import software.amazon.awscdk.services.events.CfnArchiveProps
import software.amazon.awscdk.services.events.CfnConnection
import software.amazon.awscdk.services.events.CfnConnectionProps
import software.amazon.awscdk.services.events.CfnEndpoint
import software.amazon.awscdk.services.events.CfnEndpointProps
import software.amazon.awscdk.services.events.CfnEventBus
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.amazon.awscdk.services.events.CfnEventBusPolicyProps
import software.amazon.awscdk.services.events.CfnEventBusProps
import software.amazon.awscdk.services.events.CfnRule
import software.amazon.awscdk.services.events.CfnRuleProps
import software.amazon.awscdk.services.events.Connection
import software.amazon.awscdk.services.events.ConnectionAttributes
import software.amazon.awscdk.services.events.ConnectionProps
import software.amazon.awscdk.services.events.CronOptions
import software.amazon.awscdk.services.events.EventBus
import software.amazon.awscdk.services.events.EventBusAttributes
import software.amazon.awscdk.services.events.EventBusPolicy
import software.amazon.awscdk.services.events.EventBusPolicyProps
import software.amazon.awscdk.services.events.EventBusProps
import software.amazon.awscdk.services.events.EventCommonOptions
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.OAuthAuthorizationProps
import software.amazon.awscdk.services.events.OnEventOptions
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.events.RuleProps
import software.amazon.awscdk.services.events.RuleTargetConfig
import software.amazon.awscdk.services.events.RuleTargetInputProperties
import software.constructs.Construct

public object events {
  public inline fun apiDestination(
    scope: Construct,
    id: String,
    block: ApiDestinationDsl.() -> Unit = {},
  ): ApiDestination {
    val builder = ApiDestinationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun apiDestinationProps(block: ApiDestinationPropsDsl.() -> Unit = {}):
      ApiDestinationProps {
    val builder = ApiDestinationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun archive(
    scope: Construct,
    id: String,
    block: ArchiveDsl.() -> Unit = {},
  ): Archive {
    val builder = ArchiveDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun archiveProps(block: ArchivePropsDsl.() -> Unit = {}): ArchiveProps {
    val builder = ArchivePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseArchiveProps(block: BaseArchivePropsDsl.() -> Unit = {}): BaseArchiveProps {
    val builder = BaseArchivePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiDestination(
    scope: Construct,
    id: String,
    block: CfnApiDestinationDsl.() -> Unit = {},
  ): CfnApiDestination {
    val builder = CfnApiDestinationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnApiDestinationProps(block: CfnApiDestinationPropsDsl.() -> Unit = {}):
      CfnApiDestinationProps {
    val builder = CfnApiDestinationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnArchive(
    scope: Construct,
    id: String,
    block: CfnArchiveDsl.() -> Unit = {},
  ): CfnArchive {
    val builder = CfnArchiveDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnArchiveProps(block: CfnArchivePropsDsl.() -> Unit = {}): CfnArchiveProps {
    val builder = CfnArchivePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnection(
    scope: Construct,
    id: String,
    block: CfnConnectionDsl.() -> Unit = {},
  ): CfnConnection {
    val builder = CfnConnectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectionApiKeyAuthParametersProperty(block: CfnConnectionApiKeyAuthParametersPropertyDsl.() -> Unit
      = {}): CfnConnection.ApiKeyAuthParametersProperty {
    val builder = CfnConnectionApiKeyAuthParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectionAuthParametersProperty(block: CfnConnectionAuthParametersPropertyDsl.() -> Unit
      = {}): CfnConnection.AuthParametersProperty {
    val builder = CfnConnectionAuthParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectionBasicAuthParametersProperty(block: CfnConnectionBasicAuthParametersPropertyDsl.() -> Unit
      = {}): CfnConnection.BasicAuthParametersProperty {
    val builder = CfnConnectionBasicAuthParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectionClientParametersProperty(block: CfnConnectionClientParametersPropertyDsl.() -> Unit
      = {}): CfnConnection.ClientParametersProperty {
    val builder = CfnConnectionClientParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectionConnectionHttpParametersProperty(block: CfnConnectionConnectionHttpParametersPropertyDsl.() -> Unit
      = {}): CfnConnection.ConnectionHttpParametersProperty {
    val builder = CfnConnectionConnectionHttpParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectionOAuthParametersProperty(block: CfnConnectionOAuthParametersPropertyDsl.() -> Unit
      = {}): CfnConnection.OAuthParametersProperty {
    val builder = CfnConnectionOAuthParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConnectionParameterProperty(block: CfnConnectionParameterPropertyDsl.() -> Unit = {}):
      CfnConnection.ParameterProperty {
    val builder = CfnConnectionParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConnectionProps(block: CfnConnectionPropsDsl.() -> Unit = {}):
      CfnConnectionProps {
    val builder = CfnConnectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpoint(
    scope: Construct,
    id: String,
    block: CfnEndpointDsl.() -> Unit = {},
  ): CfnEndpoint {
    val builder = CfnEndpointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointEndpointEventBusProperty(block: CfnEndpointEndpointEventBusPropertyDsl.() -> Unit
      = {}): CfnEndpoint.EndpointEventBusProperty {
    val builder = CfnEndpointEndpointEventBusPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointFailoverConfigProperty(block: CfnEndpointFailoverConfigPropertyDsl.() -> Unit =
      {}): CfnEndpoint.FailoverConfigProperty {
    val builder = CfnEndpointFailoverConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointPrimaryProperty(block: CfnEndpointPrimaryPropertyDsl.() -> Unit =
      {}): CfnEndpoint.PrimaryProperty {
    val builder = CfnEndpointPrimaryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointProps(block: CfnEndpointPropsDsl.() -> Unit = {}): CfnEndpointProps {
    val builder = CfnEndpointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointReplicationConfigProperty(block: CfnEndpointReplicationConfigPropertyDsl.() -> Unit
      = {}): CfnEndpoint.ReplicationConfigProperty {
    val builder = CfnEndpointReplicationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEndpointRoutingConfigProperty(block: CfnEndpointRoutingConfigPropertyDsl.() -> Unit =
      {}): CfnEndpoint.RoutingConfigProperty {
    val builder = CfnEndpointRoutingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEndpointSecondaryProperty(block: CfnEndpointSecondaryPropertyDsl.() -> Unit =
      {}): CfnEndpoint.SecondaryProperty {
    val builder = CfnEndpointSecondaryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventBus(
    scope: Construct,
    id: String,
    block: CfnEventBusDsl.() -> Unit = {},
  ): CfnEventBus {
    val builder = CfnEventBusDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventBusPolicy(
    scope: Construct,
    id: String,
    block: CfnEventBusPolicyDsl.() -> Unit = {},
  ): CfnEventBusPolicy {
    val builder = CfnEventBusPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventBusPolicyConditionProperty(block: CfnEventBusPolicyConditionPropertyDsl.() -> Unit
      = {}): CfnEventBusPolicy.ConditionProperty {
    val builder = CfnEventBusPolicyConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventBusPolicyProps(block: CfnEventBusPolicyPropsDsl.() -> Unit = {}):
      CfnEventBusPolicyProps {
    val builder = CfnEventBusPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventBusProps(block: CfnEventBusPropsDsl.() -> Unit = {}): CfnEventBusProps {
    val builder = CfnEventBusPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventBusTagEntryProperty(block: CfnEventBusTagEntryPropertyDsl.() -> Unit =
      {}): CfnEventBus.TagEntryProperty {
    val builder = CfnEventBusTagEntryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRule(
    scope: Construct,
    id: String,
    block: CfnRuleDsl.() -> Unit = {},
  ): CfnRule {
    val builder = CfnRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleAwsVpcConfigurationProperty(block: CfnRuleAwsVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnRule.AwsVpcConfigurationProperty {
    val builder = CfnRuleAwsVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleBatchArrayPropertiesProperty(block: CfnRuleBatchArrayPropertiesPropertyDsl.() -> Unit
      = {}): CfnRule.BatchArrayPropertiesProperty {
    val builder = CfnRuleBatchArrayPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleBatchParametersProperty(block: CfnRuleBatchParametersPropertyDsl.() -> Unit = {}):
      CfnRule.BatchParametersProperty {
    val builder = CfnRuleBatchParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleBatchRetryStrategyProperty(block: CfnRuleBatchRetryStrategyPropertyDsl.() -> Unit =
      {}): CfnRule.BatchRetryStrategyProperty {
    val builder = CfnRuleBatchRetryStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleCapacityProviderStrategyItemProperty(block: CfnRuleCapacityProviderStrategyItemPropertyDsl.() -> Unit
      = {}): CfnRule.CapacityProviderStrategyItemProperty {
    val builder = CfnRuleCapacityProviderStrategyItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleDeadLetterConfigProperty(block: CfnRuleDeadLetterConfigPropertyDsl.() -> Unit =
      {}): CfnRule.DeadLetterConfigProperty {
    val builder = CfnRuleDeadLetterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleEcsParametersProperty(block: CfnRuleEcsParametersPropertyDsl.() -> Unit =
      {}): CfnRule.EcsParametersProperty {
    val builder = CfnRuleEcsParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleHttpParametersProperty(block: CfnRuleHttpParametersPropertyDsl.() -> Unit
      = {}): CfnRule.HttpParametersProperty {
    val builder = CfnRuleHttpParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleInputTransformerProperty(block: CfnRuleInputTransformerPropertyDsl.() -> Unit =
      {}): CfnRule.InputTransformerProperty {
    val builder = CfnRuleInputTransformerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleKinesisParametersProperty(block: CfnRuleKinesisParametersPropertyDsl.() -> Unit =
      {}): CfnRule.KinesisParametersProperty {
    val builder = CfnRuleKinesisParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleNetworkConfigurationProperty(block: CfnRuleNetworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnRule.NetworkConfigurationProperty {
    val builder = CfnRuleNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRulePlacementConstraintProperty(block: CfnRulePlacementConstraintPropertyDsl.() -> Unit
      = {}): CfnRule.PlacementConstraintProperty {
    val builder = CfnRulePlacementConstraintPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRulePlacementStrategyProperty(block: CfnRulePlacementStrategyPropertyDsl.() -> Unit =
      {}): CfnRule.PlacementStrategyProperty {
    val builder = CfnRulePlacementStrategyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
    val builder = CfnRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleRedshiftDataParametersProperty(block: CfnRuleRedshiftDataParametersPropertyDsl.() -> Unit
      = {}): CfnRule.RedshiftDataParametersProperty {
    val builder = CfnRuleRedshiftDataParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleRetryPolicyProperty(block: CfnRuleRetryPolicyPropertyDsl.() -> Unit =
      {}): CfnRule.RetryPolicyProperty {
    val builder = CfnRuleRetryPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleRunCommandParametersProperty(block: CfnRuleRunCommandParametersPropertyDsl.() -> Unit
      = {}): CfnRule.RunCommandParametersProperty {
    val builder = CfnRuleRunCommandParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleRunCommandTargetProperty(block: CfnRuleRunCommandTargetPropertyDsl.() -> Unit =
      {}): CfnRule.RunCommandTargetProperty {
    val builder = CfnRuleRunCommandTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleSageMakerPipelineParameterProperty(block: CfnRuleSageMakerPipelineParameterPropertyDsl.() -> Unit
      = {}): CfnRule.SageMakerPipelineParameterProperty {
    val builder = CfnRuleSageMakerPipelineParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleSageMakerPipelineParametersProperty(block: CfnRuleSageMakerPipelineParametersPropertyDsl.() -> Unit
      = {}): CfnRule.SageMakerPipelineParametersProperty {
    val builder = CfnRuleSageMakerPipelineParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleSqsParametersProperty(block: CfnRuleSqsParametersPropertyDsl.() -> Unit =
      {}): CfnRule.SqsParametersProperty {
    val builder = CfnRuleSqsParametersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleTagProperty(block: CfnRuleTagPropertyDsl.() -> Unit = {}):
      CfnRule.TagProperty {
    val builder = CfnRuleTagPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleTargetProperty(block: CfnRuleTargetPropertyDsl.() -> Unit = {}):
      CfnRule.TargetProperty {
    val builder = CfnRuleTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun connection(
    scope: Construct,
    id: String,
    block: ConnectionDsl.() -> Unit = {},
  ): Connection {
    val builder = ConnectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun connectionAttributes(block: ConnectionAttributesDsl.() -> Unit = {}):
      ConnectionAttributes {
    val builder = ConnectionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun connectionProps(block: ConnectionPropsDsl.() -> Unit = {}): ConnectionProps {
    val builder = ConnectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cronOptions(block: CronOptionsDsl.() -> Unit = {}): CronOptions {
    val builder = CronOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBus(
    scope: Construct,
    id: String,
    block: EventBusDsl.() -> Unit = {},
  ): EventBus {
    val builder = EventBusDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBusAttributes(block: EventBusAttributesDsl.() -> Unit = {}):
      EventBusAttributes {
    val builder = EventBusAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBusPolicy(
    scope: Construct,
    id: String,
    block: EventBusPolicyDsl.() -> Unit = {},
  ): EventBusPolicy {
    val builder = EventBusPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBusPolicyProps(block: EventBusPolicyPropsDsl.() -> Unit = {}):
      EventBusPolicyProps {
    val builder = EventBusPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventBusProps(block: EventBusPropsDsl.() -> Unit = {}): EventBusProps {
    val builder = EventBusPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventCommonOptions(block: EventCommonOptionsDsl.() -> Unit = {}):
      EventCommonOptions {
    val builder = EventCommonOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventPattern(block: EventPatternDsl.() -> Unit = {}): EventPattern {
    val builder = EventPatternDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun oAuthAuthorizationProps(block: OAuthAuthorizationPropsDsl.() -> Unit = {}):
      OAuthAuthorizationProps {
    val builder = OAuthAuthorizationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun onEventOptions(block: OnEventOptionsDsl.() -> Unit = {}): OnEventOptions {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun rule(
    scope: Construct,
    id: String,
    block: RuleDsl.() -> Unit = {},
  ): Rule {
    val builder = RuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun ruleProps(block: RulePropsDsl.() -> Unit = {}): RuleProps {
    val builder = RulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ruleTargetConfig(block: RuleTargetConfigDsl.() -> Unit = {}): RuleTargetConfig {
    val builder = RuleTargetConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ruleTargetInputProperties(block: RuleTargetInputPropertiesDsl.() -> Unit = {}):
      RuleTargetInputProperties {
    val builder = RuleTargetInputPropertiesDsl()
    builder.apply(block)
    return builder.build()
  }
}
