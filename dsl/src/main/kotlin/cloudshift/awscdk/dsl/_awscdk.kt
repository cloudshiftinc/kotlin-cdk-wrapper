@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.App
import software.amazon.awscdk.AppProps
import software.amazon.awscdk.ArnComponents
import software.amazon.awscdk.AssetManifestDockerImageDestination
import software.amazon.awscdk.AssetManifestFileDestination
import software.amazon.awscdk.AssetOptions
import software.amazon.awscdk.AssetStaging
import software.amazon.awscdk.AssetStagingProps
import software.amazon.awscdk.BootstraplessSynthesizer
import software.amazon.awscdk.BootstraplessSynthesizerProps
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.CfnAutoScalingReplacingUpdate
import software.amazon.awscdk.CfnAutoScalingRollingUpdate
import software.amazon.awscdk.CfnAutoScalingScheduledAction
import software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplication
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget
import software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes
import software.amazon.awscdk.CfnCodeDeployBlueGreenHook
import software.amazon.awscdk.CfnCodeDeployBlueGreenHookProps
import software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks
import software.amazon.awscdk.CfnCodeDeployLambdaAliasUpdate
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.CfnConditionProps
import software.amazon.awscdk.CfnCreationPolicy
import software.amazon.awscdk.CfnCustomResource
import software.amazon.awscdk.CfnCustomResourceProps
import software.amazon.awscdk.CfnDynamicReferenceProps
import software.amazon.awscdk.CfnHook
import software.amazon.awscdk.CfnHookDefaultVersion
import software.amazon.awscdk.CfnHookDefaultVersionProps
import software.amazon.awscdk.CfnHookProps
import software.amazon.awscdk.CfnHookTypeConfig
import software.amazon.awscdk.CfnHookTypeConfigProps
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.CfnHookVersionProps
import software.amazon.awscdk.CfnJson
import software.amazon.awscdk.CfnJsonProps
import software.amazon.awscdk.CfnMacro
import software.amazon.awscdk.CfnMacroProps
import software.amazon.awscdk.CfnMapping
import software.amazon.awscdk.CfnMappingProps
import software.amazon.awscdk.CfnModuleDefaultVersion
import software.amazon.awscdk.CfnModuleDefaultVersionProps
import software.amazon.awscdk.CfnModuleVersion
import software.amazon.awscdk.CfnModuleVersionProps
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.CfnOutputProps
import software.amazon.awscdk.CfnParameter
import software.amazon.awscdk.CfnParameterProps
import software.amazon.awscdk.CfnPublicTypeVersion
import software.amazon.awscdk.CfnPublicTypeVersionProps
import software.amazon.awscdk.CfnPublisher
import software.amazon.awscdk.CfnPublisherProps
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.CfnResourceAutoScalingCreationPolicy
import software.amazon.awscdk.CfnResourceDefaultVersion
import software.amazon.awscdk.CfnResourceDefaultVersionProps
import software.amazon.awscdk.CfnResourceProps
import software.amazon.awscdk.CfnResourceSignal
import software.amazon.awscdk.CfnResourceVersion
import software.amazon.awscdk.CfnResourceVersionProps
import software.amazon.awscdk.CfnRule
import software.amazon.awscdk.CfnRuleAssertion
import software.amazon.awscdk.CfnRuleProps
import software.amazon.awscdk.CfnStack
import software.amazon.awscdk.CfnStackProps
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.CfnStackSetProps
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.CfnTrafficRoute
import software.amazon.awscdk.CfnTrafficRouting
import software.amazon.awscdk.CfnTrafficRoutingConfig
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary
import software.amazon.awscdk.CfnTrafficRoutingTimeBasedLinear
import software.amazon.awscdk.CfnTypeActivation
import software.amazon.awscdk.CfnTypeActivationProps
import software.amazon.awscdk.CfnUpdatePolicy
import software.amazon.awscdk.CfnWaitCondition
import software.amazon.awscdk.CfnWaitConditionProps
import software.amazon.awscdk.CliCredentialsStackSynthesizer
import software.amazon.awscdk.CliCredentialsStackSynthesizerProps
import software.amazon.awscdk.CopyOptions
import software.amazon.awscdk.CustomResource
import software.amazon.awscdk.CustomResourceProps
import software.amazon.awscdk.CustomResourceProviderProps
import software.amazon.awscdk.DefaultStackSynthesizer
import software.amazon.awscdk.DefaultStackSynthesizerProps
import software.amazon.awscdk.DockerBuildOptions
import software.amazon.awscdk.DockerCacheOption
import software.amazon.awscdk.DockerImageAssetLocation
import software.amazon.awscdk.DockerImageAssetSource
import software.amazon.awscdk.DockerRunOptions
import software.amazon.awscdk.DockerVolume
import software.amazon.awscdk.EncodingOptions
import software.amazon.awscdk.Environment
import software.amazon.awscdk.ExportValueOptions
import software.amazon.awscdk.FileAssetLocation
import software.amazon.awscdk.FileAssetSource
import software.amazon.awscdk.FileCopyOptions
import software.amazon.awscdk.FileFingerprintOptions
import software.amazon.awscdk.FingerprintOptions
import software.amazon.awscdk.GetContextKeyOptions
import software.amazon.awscdk.GetContextKeyResult
import software.amazon.awscdk.GetContextValueOptions
import software.amazon.awscdk.GetContextValueResult
import software.amazon.awscdk.Intrinsic
import software.amazon.awscdk.IntrinsicProps
import software.amazon.awscdk.LazyAnyValueOptions
import software.amazon.awscdk.LazyListValueOptions
import software.amazon.awscdk.LazyStringValueOptions
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.NestedStackProps
import software.amazon.awscdk.PermissionsBoundaryBindOptions
import software.amazon.awscdk.PolicyValidationPluginReportBeta1
import software.amazon.awscdk.PolicyViolatingResourceBeta1
import software.amazon.awscdk.PolicyViolationBeta1
import software.amazon.awscdk.RemovalPolicyOptions
import software.amazon.awscdk.RemoveTag
import software.amazon.awscdk.ResolveChangeContextOptions
import software.amazon.awscdk.ResolveOptions
import software.amazon.awscdk.ResourceEnvironment
import software.amazon.awscdk.ResourceProps
import software.amazon.awscdk.ReverseOptions
import software.amazon.awscdk.RoleOptions
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.SecretsManagerSecretOptions
import software.amazon.awscdk.SizeConversionOptions
import software.amazon.awscdk.Stack
import software.amazon.awscdk.StackProps
import software.amazon.awscdk.Stage
import software.amazon.awscdk.StageProps
import software.amazon.awscdk.StageSynthesisOptions
import software.amazon.awscdk.SynthesizeStackArtifactOptions
import software.amazon.awscdk.Tag
import software.amazon.awscdk.TagManager
import software.amazon.awscdk.TagManagerOptions
import software.amazon.awscdk.TagProps
import software.amazon.awscdk.TagType
import software.amazon.awscdk.TimeConversionOptions
import software.amazon.awscdk.UniqueResourceNameOptions
import software.constructs.Construct

public object awscdk {
  public inline fun app(block: AppDsl.() -> Unit = {}): App {
    val builder = AppDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun appProps(block: AppPropsDsl.() -> Unit = {}): AppProps {
    val builder = AppPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun arnComponents(block: ArnComponentsDsl.() -> Unit = {}): ArnComponents {
    val builder = ArnComponentsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun assetManifestDockerImageDestination(block: AssetManifestDockerImageDestinationDsl.() -> Unit
      = {}): AssetManifestDockerImageDestination {
    val builder = AssetManifestDockerImageDestinationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetManifestFileDestination(block: AssetManifestFileDestinationDsl.() -> Unit =
      {}): AssetManifestFileDestination {
    val builder = AssetManifestFileDestinationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetOptions(block: AssetOptionsDsl.() -> Unit = {}): AssetOptions {
    val builder = AssetOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetStaging(
    scope: Construct,
    id: String,
    block: AssetStagingDsl.() -> Unit = {},
  ): AssetStaging {
    val builder = AssetStagingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetStagingProps(block: AssetStagingPropsDsl.() -> Unit = {}):
      AssetStagingProps {
    val builder = AssetStagingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bootstraplessSynthesizer(block: BootstraplessSynthesizerDsl.() -> Unit = {}):
      BootstraplessSynthesizer {
    val builder = BootstraplessSynthesizerDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bootstraplessSynthesizerProps(block: BootstraplessSynthesizerPropsDsl.() -> Unit
      = {}): BootstraplessSynthesizerProps {
    val builder = BootstraplessSynthesizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bundlingOptions(block: BundlingOptionsDsl.() -> Unit = {}): BundlingOptions {
    val builder = BundlingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAutoScalingReplacingUpdate(block: CfnAutoScalingReplacingUpdateDsl.() -> Unit
      = {}): CfnAutoScalingReplacingUpdate {
    val builder = CfnAutoScalingReplacingUpdateDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAutoScalingRollingUpdate(block: CfnAutoScalingRollingUpdateDsl.() -> Unit =
      {}): CfnAutoScalingRollingUpdate {
    val builder = CfnAutoScalingRollingUpdateDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAutoScalingScheduledAction(block: CfnAutoScalingScheduledActionDsl.() -> Unit
      = {}): CfnAutoScalingScheduledAction {
    val builder = CfnAutoScalingScheduledActionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeDeployBlueGreenAdditionalOptions(block: CfnCodeDeployBlueGreenAdditionalOptionsDsl.() -> Unit
      = {}): CfnCodeDeployBlueGreenAdditionalOptions {
    val builder = CfnCodeDeployBlueGreenAdditionalOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeDeployBlueGreenApplication(block: CfnCodeDeployBlueGreenApplicationDsl.() -> Unit =
      {}): CfnCodeDeployBlueGreenApplication {
    val builder = CfnCodeDeployBlueGreenApplicationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeDeployBlueGreenApplicationTarget(block: CfnCodeDeployBlueGreenApplicationTargetDsl.() -> Unit
      = {}): CfnCodeDeployBlueGreenApplicationTarget {
    val builder = CfnCodeDeployBlueGreenApplicationTargetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeDeployBlueGreenEcsAttributes(block: CfnCodeDeployBlueGreenEcsAttributesDsl.() -> Unit
      = {}): CfnCodeDeployBlueGreenEcsAttributes {
    val builder = CfnCodeDeployBlueGreenEcsAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCodeDeployBlueGreenHook(
    scope: Construct,
    id: String,
    block: CfnCodeDeployBlueGreenHookDsl.() -> Unit = {},
  ): CfnCodeDeployBlueGreenHook {
    val builder = CfnCodeDeployBlueGreenHookDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeDeployBlueGreenHookProps(block: CfnCodeDeployBlueGreenHookPropsDsl.() -> Unit =
      {}): CfnCodeDeployBlueGreenHookProps {
    val builder = CfnCodeDeployBlueGreenHookPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeDeployBlueGreenLifecycleEventHooks(block: CfnCodeDeployBlueGreenLifecycleEventHooksDsl.() -> Unit
      = {}): CfnCodeDeployBlueGreenLifecycleEventHooks {
    val builder = CfnCodeDeployBlueGreenLifecycleEventHooksDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeDeployLambdaAliasUpdate(block: CfnCodeDeployLambdaAliasUpdateDsl.() -> Unit = {}):
      CfnCodeDeployLambdaAliasUpdate {
    val builder = CfnCodeDeployLambdaAliasUpdateDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCondition(
    scope: Construct,
    id: String,
    block: CfnConditionDsl.() -> Unit = {},
  ): CfnCondition {
    val builder = CfnConditionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConditionProps(block: CfnConditionPropsDsl.() -> Unit = {}):
      CfnConditionProps {
    val builder = CfnConditionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCreationPolicy(block: CfnCreationPolicyDsl.() -> Unit = {}):
      CfnCreationPolicy {
    val builder = CfnCreationPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCustomResource(
    scope: Construct,
    id: String,
    block: CfnCustomResourceDsl.() -> Unit = {},
  ): CfnCustomResource {
    val builder = CfnCustomResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCustomResourceProps(block: CfnCustomResourcePropsDsl.() -> Unit = {}):
      CfnCustomResourceProps {
    val builder = CfnCustomResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDynamicReferenceProps(block: CfnDynamicReferencePropsDsl.() -> Unit = {}):
      CfnDynamicReferenceProps {
    val builder = CfnDynamicReferencePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHook(
    scope: Construct,
    id: String,
    block: CfnHookDsl.() -> Unit = {},
  ): CfnHook {
    val builder = CfnHookDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnHookDefaultVersionDsl.() -> Unit = {},
  ): CfnHookDefaultVersion {
    val builder = CfnHookDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookDefaultVersionProps(block: CfnHookDefaultVersionPropsDsl.() -> Unit =
      {}): CfnHookDefaultVersionProps {
    val builder = CfnHookDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookProps(block: CfnHookPropsDsl.() -> Unit = {}): CfnHookProps {
    val builder = CfnHookPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookTypeConfig(
    scope: Construct,
    id: String,
    block: CfnHookTypeConfigDsl.() -> Unit = {},
  ): CfnHookTypeConfig {
    val builder = CfnHookTypeConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookTypeConfigProps(block: CfnHookTypeConfigPropsDsl.() -> Unit = {}):
      CfnHookTypeConfigProps {
    val builder = CfnHookTypeConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookVersion(
    scope: Construct,
    id: String,
    block: CfnHookVersionDsl.() -> Unit = {},
  ): CfnHookVersion {
    val builder = CfnHookVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnHookVersionLoggingConfigProperty(block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnHookVersion.LoggingConfigProperty {
    val builder = CfnHookVersionLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnHookVersionProps(block: CfnHookVersionPropsDsl.() -> Unit = {}):
      CfnHookVersionProps {
    val builder = CfnHookVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnJson(
    scope: Construct,
    id: String,
    block: CfnJsonDsl.() -> Unit = {},
  ): CfnJson {
    val builder = CfnJsonDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnJsonProps(block: CfnJsonPropsDsl.() -> Unit = {}): CfnJsonProps {
    val builder = CfnJsonPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMacro(
    scope: Construct,
    id: String,
    block: CfnMacroDsl.() -> Unit = {},
  ): CfnMacro {
    val builder = CfnMacroDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMacroProps(block: CfnMacroPropsDsl.() -> Unit = {}): CfnMacroProps {
    val builder = CfnMacroPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMapping(
    scope: Construct,
    id: String,
    block: CfnMappingDsl.() -> Unit = {},
  ): CfnMapping {
    val builder = CfnMappingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMappingProps(block: CfnMappingPropsDsl.() -> Unit = {}): CfnMappingProps {
    val builder = CfnMappingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModuleDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnModuleDefaultVersionDsl.() -> Unit = {},
  ): CfnModuleDefaultVersion {
    val builder = CfnModuleDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModuleDefaultVersionProps(block: CfnModuleDefaultVersionPropsDsl.() -> Unit =
      {}): CfnModuleDefaultVersionProps {
    val builder = CfnModuleDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModuleVersion(
    scope: Construct,
    id: String,
    block: CfnModuleVersionDsl.() -> Unit = {},
  ): CfnModuleVersion {
    val builder = CfnModuleVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnModuleVersionProps(block: CfnModuleVersionPropsDsl.() -> Unit = {}):
      CfnModuleVersionProps {
    val builder = CfnModuleVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOutput(
    scope: Construct,
    id: String,
    block: CfnOutputDsl.() -> Unit = {},
  ): CfnOutput {
    val builder = CfnOutputDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOutputProps(block: CfnOutputPropsDsl.() -> Unit = {}): CfnOutputProps {
    val builder = CfnOutputPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParameter(
    scope: Construct,
    id: String,
    block: CfnParameterDsl.() -> Unit = {},
  ): CfnParameter {
    val builder = CfnParameterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParameterProps(block: CfnParameterPropsDsl.() -> Unit = {}):
      CfnParameterProps {
    val builder = CfnParameterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublicTypeVersion(
    scope: Construct,
    id: String,
    block: CfnPublicTypeVersionDsl.() -> Unit = {},
  ): CfnPublicTypeVersion {
    val builder = CfnPublicTypeVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublicTypeVersionProps(block: CfnPublicTypeVersionPropsDsl.() -> Unit = {}):
      CfnPublicTypeVersionProps {
    val builder = CfnPublicTypeVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublisher(
    scope: Construct,
    id: String,
    block: CfnPublisherDsl.() -> Unit = {},
  ): CfnPublisher {
    val builder = CfnPublisherDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublisherProps(block: CfnPublisherPropsDsl.() -> Unit = {}):
      CfnPublisherProps {
    val builder = CfnPublisherPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResource(
    scope: Construct,
    id: String,
    block: CfnResourceDsl.() -> Unit = {},
  ): CfnResource {
    val builder = CfnResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceAutoScalingCreationPolicy(block: CfnResourceAutoScalingCreationPolicyDsl.() -> Unit
      = {}): CfnResourceAutoScalingCreationPolicy {
    val builder = CfnResourceAutoScalingCreationPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceDefaultVersion(
    scope: Construct,
    id: String,
    block: CfnResourceDefaultVersionDsl.() -> Unit = {},
  ): CfnResourceDefaultVersion {
    val builder = CfnResourceDefaultVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceDefaultVersionProps(block: CfnResourceDefaultVersionPropsDsl.() -> Unit = {}):
      CfnResourceDefaultVersionProps {
    val builder = CfnResourceDefaultVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceProps(block: CfnResourcePropsDsl.() -> Unit = {}): CfnResourceProps {
    val builder = CfnResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceSignal(block: CfnResourceSignalDsl.() -> Unit = {}):
      CfnResourceSignal {
    val builder = CfnResourceSignalDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceVersion(
    scope: Construct,
    id: String,
    block: CfnResourceVersionDsl.() -> Unit = {},
  ): CfnResourceVersion {
    val builder = CfnResourceVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceVersionLoggingConfigProperty(block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnResourceVersion.LoggingConfigProperty {
    val builder = CfnResourceVersionLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceVersionProps(block: CfnResourceVersionPropsDsl.() -> Unit = {}):
      CfnResourceVersionProps {
    val builder = CfnResourceVersionPropsDsl()
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

  public inline fun cfnRuleAssertion(block: CfnRuleAssertionDsl.() -> Unit = {}): CfnRuleAssertion {
    val builder = CfnRuleAssertionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
    val builder = CfnRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStack(
    scope: Construct,
    id: String,
    block: CfnStackDsl.() -> Unit = {},
  ): CfnStack {
    val builder = CfnStackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStackProps(block: CfnStackPropsDsl.() -> Unit = {}): CfnStackProps {
    val builder = CfnStackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStackSet(
    scope: Construct,
    id: String,
    block: CfnStackSetDsl.() -> Unit = {},
  ): CfnStackSet {
    val builder = CfnStackSetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetAutoDeploymentProperty(block: CfnStackSetAutoDeploymentPropertyDsl.() -> Unit =
      {}): CfnStackSet.AutoDeploymentProperty {
    val builder = CfnStackSetAutoDeploymentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetDeploymentTargetsProperty(block: CfnStackSetDeploymentTargetsPropertyDsl.() -> Unit
      = {}): CfnStackSet.DeploymentTargetsProperty {
    val builder = CfnStackSetDeploymentTargetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetManagedExecutionProperty(block: CfnStackSetManagedExecutionPropertyDsl.() -> Unit
      = {}): CfnStackSet.ManagedExecutionProperty {
    val builder = CfnStackSetManagedExecutionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetOperationPreferencesProperty(block: CfnStackSetOperationPreferencesPropertyDsl.() -> Unit
      = {}): CfnStackSet.OperationPreferencesProperty {
    val builder = CfnStackSetOperationPreferencesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStackSetParameterProperty(block: CfnStackSetParameterPropertyDsl.() -> Unit =
      {}): CfnStackSet.ParameterProperty {
    val builder = CfnStackSetParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStackSetProps(block: CfnStackSetPropsDsl.() -> Unit = {}): CfnStackSetProps {
    val builder = CfnStackSetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStackSetStackInstancesProperty(block: CfnStackSetStackInstancesPropertyDsl.() -> Unit =
      {}): CfnStackSet.StackInstancesProperty {
    val builder = CfnStackSetStackInstancesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTag(block: CfnTagDsl.() -> Unit = {}): CfnTag {
    val builder = CfnTagDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficRoute(block: CfnTrafficRouteDsl.() -> Unit = {}): CfnTrafficRoute {
    val builder = CfnTrafficRouteDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficRouting(block: CfnTrafficRoutingDsl.() -> Unit = {}):
      CfnTrafficRouting {
    val builder = CfnTrafficRoutingDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTrafficRoutingConfig(block: CfnTrafficRoutingConfigDsl.() -> Unit = {}):
      CfnTrafficRoutingConfig {
    val builder = CfnTrafficRoutingConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTrafficRoutingTimeBasedCanary(block: CfnTrafficRoutingTimeBasedCanaryDsl.() -> Unit =
      {}): CfnTrafficRoutingTimeBasedCanary {
    val builder = CfnTrafficRoutingTimeBasedCanaryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTrafficRoutingTimeBasedLinear(block: CfnTrafficRoutingTimeBasedLinearDsl.() -> Unit =
      {}): CfnTrafficRoutingTimeBasedLinear {
    val builder = CfnTrafficRoutingTimeBasedLinearDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTypeActivation(
    scope: Construct,
    id: String,
    block: CfnTypeActivationDsl.() -> Unit = {},
  ): CfnTypeActivation {
    val builder = CfnTypeActivationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTypeActivationLoggingConfigProperty(block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit
      = {}): CfnTypeActivation.LoggingConfigProperty {
    val builder = CfnTypeActivationLoggingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTypeActivationProps(block: CfnTypeActivationPropsDsl.() -> Unit = {}):
      CfnTypeActivationProps {
    val builder = CfnTypeActivationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUpdatePolicy(block: CfnUpdatePolicyDsl.() -> Unit = {}): CfnUpdatePolicy {
    val builder = CfnUpdatePolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWaitCondition(
    scope: Construct,
    id: String,
    block: CfnWaitConditionDsl.() -> Unit = {},
  ): CfnWaitCondition {
    val builder = CfnWaitConditionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWaitConditionProps(block: CfnWaitConditionPropsDsl.() -> Unit = {}):
      CfnWaitConditionProps {
    val builder = CfnWaitConditionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cliCredentialsStackSynthesizer(block: CliCredentialsStackSynthesizerDsl.() -> Unit = {}):
      CliCredentialsStackSynthesizer {
    val builder = CliCredentialsStackSynthesizerDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cliCredentialsStackSynthesizerProps(block: CliCredentialsStackSynthesizerPropsDsl.() -> Unit
      = {}): CliCredentialsStackSynthesizerProps {
    val builder = CliCredentialsStackSynthesizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun copyOptions(block: CopyOptionsDsl.() -> Unit = {}): CopyOptions {
    val builder = CopyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customResource(
    scope: Construct,
    id: String,
    block: CustomResourceDsl.() -> Unit = {},
  ): CustomResource {
    val builder = CustomResourceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun customResourceProps(block: CustomResourcePropsDsl.() -> Unit = {}):
      CustomResourceProps {
    val builder = CustomResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customResourceProviderProps(block: CustomResourceProviderPropsDsl.() -> Unit =
      {}): CustomResourceProviderProps {
    val builder = CustomResourceProviderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun defaultStackSynthesizer(block: DefaultStackSynthesizerDsl.() -> Unit = {}):
      DefaultStackSynthesizer {
    val builder = DefaultStackSynthesizerDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun defaultStackSynthesizerProps(block: DefaultStackSynthesizerPropsDsl.() -> Unit =
      {}): DefaultStackSynthesizerProps {
    val builder = DefaultStackSynthesizerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerBuildOptions(block: DockerBuildOptionsDsl.() -> Unit = {}):
      DockerBuildOptions {
    val builder = DockerBuildOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerCacheOption(block: DockerCacheOptionDsl.() -> Unit = {}):
      DockerCacheOption {
    val builder = DockerCacheOptionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerImageAssetLocation(block: DockerImageAssetLocationDsl.() -> Unit = {}):
      DockerImageAssetLocation {
    val builder = DockerImageAssetLocationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerImageAssetSource(block: DockerImageAssetSourceDsl.() -> Unit = {}):
      DockerImageAssetSource {
    val builder = DockerImageAssetSourceDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerRunOptions(block: DockerRunOptionsDsl.() -> Unit = {}): DockerRunOptions {
    val builder = DockerRunOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerVolume(block: DockerVolumeDsl.() -> Unit = {}): DockerVolume {
    val builder = DockerVolumeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun encodingOptions(block: EncodingOptionsDsl.() -> Unit = {}): EncodingOptions {
    val builder = EncodingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun environment(block: EnvironmentDsl.() -> Unit = {}): Environment {
    val builder = EnvironmentDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun exportValueOptions(block: ExportValueOptionsDsl.() -> Unit = {}):
      ExportValueOptions {
    val builder = ExportValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileAssetLocation(block: FileAssetLocationDsl.() -> Unit = {}):
      FileAssetLocation {
    val builder = FileAssetLocationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileAssetSource(block: FileAssetSourceDsl.() -> Unit = {}): FileAssetSource {
    val builder = FileAssetSourceDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileCopyOptions(block: FileCopyOptionsDsl.() -> Unit = {}): FileCopyOptions {
    val builder = FileCopyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileFingerprintOptions(block: FileFingerprintOptionsDsl.() -> Unit = {}):
      FileFingerprintOptions {
    val builder = FileFingerprintOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fingerprintOptions(block: FingerprintOptionsDsl.() -> Unit = {}):
      FingerprintOptions {
    val builder = FingerprintOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun getContextKeyOptions(block: GetContextKeyOptionsDsl.() -> Unit = {}):
      GetContextKeyOptions {
    val builder = GetContextKeyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun getContextKeyResult(block: GetContextKeyResultDsl.() -> Unit = {}):
      GetContextKeyResult {
    val builder = GetContextKeyResultDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun getContextValueOptions(block: GetContextValueOptionsDsl.() -> Unit = {}):
      GetContextValueOptions {
    val builder = GetContextValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun getContextValueResult(block: GetContextValueResultDsl.() -> Unit = {}):
      GetContextValueResult {
    val builder = GetContextValueResultDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun intrinsic(arg0: Any, block: IntrinsicDsl.() -> Unit = {}): Intrinsic {
    val builder = IntrinsicDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun intrinsicProps(block: IntrinsicPropsDsl.() -> Unit = {}): IntrinsicProps {
    val builder = IntrinsicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lazyAnyValueOptions(block: LazyAnyValueOptionsDsl.() -> Unit = {}):
      LazyAnyValueOptions {
    val builder = LazyAnyValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lazyListValueOptions(block: LazyListValueOptionsDsl.() -> Unit = {}):
      LazyListValueOptions {
    val builder = LazyListValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lazyStringValueOptions(block: LazyStringValueOptionsDsl.() -> Unit = {}):
      LazyStringValueOptions {
    val builder = LazyStringValueOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun nestedStack(
    scope: Construct,
    id: String,
    block: NestedStackDsl.() -> Unit = {},
  ): NestedStack {
    val builder = NestedStackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun nestedStackProps(block: NestedStackPropsDsl.() -> Unit = {}): NestedStackProps {
    val builder = NestedStackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun permissionsBoundaryBindOptions(block: PermissionsBoundaryBindOptionsDsl.() -> Unit = {}):
      PermissionsBoundaryBindOptions {
    val builder = PermissionsBoundaryBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun policyValidationPluginReportBeta1(block: PolicyValidationPluginReportBeta1Dsl.() -> Unit =
      {}): PolicyValidationPluginReportBeta1 {
    val builder = PolicyValidationPluginReportBeta1Dsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun policyViolatingResourceBeta1(block: PolicyViolatingResourceBeta1Dsl.() -> Unit =
      {}): PolicyViolatingResourceBeta1 {
    val builder = PolicyViolatingResourceBeta1Dsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun policyViolationBeta1(block: PolicyViolationBeta1Dsl.() -> Unit = {}):
      PolicyViolationBeta1 {
    val builder = PolicyViolationBeta1Dsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun removalPolicyOptions(block: RemovalPolicyOptionsDsl.() -> Unit = {}):
      RemovalPolicyOptions {
    val builder = RemovalPolicyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun removeTag(arg0: String, block: RemoveTagDsl.() -> Unit = {}): RemoveTag {
    val builder = RemoveTagDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun resolveChangeContextOptions(block: ResolveChangeContextOptionsDsl.() -> Unit =
      {}): ResolveChangeContextOptions {
    val builder = ResolveChangeContextOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resolveOptions(block: ResolveOptionsDsl.() -> Unit = {}): ResolveOptions {
    val builder = ResolveOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resourceEnvironment(block: ResourceEnvironmentDsl.() -> Unit = {}):
      ResourceEnvironment {
    val builder = ResourceEnvironmentDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resourceProps(block: ResourcePropsDsl.() -> Unit = {}): ResourceProps {
    val builder = ResourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun reverseOptions(block: ReverseOptionsDsl.() -> Unit = {}): ReverseOptions {
    val builder = ReverseOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun roleOptions(block: RoleOptionsDsl.() -> Unit = {}): RoleOptions {
    val builder = RoleOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun secretValue(arg0: Any, block: SecretValueDsl.() -> Unit = {}): SecretValue {
    val builder = SecretValueDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun secretsManagerSecretOptions(block: SecretsManagerSecretOptionsDsl.() -> Unit =
      {}): SecretsManagerSecretOptions {
    val builder = SecretsManagerSecretOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sizeConversionOptions(block: SizeConversionOptionsDsl.() -> Unit = {}):
      SizeConversionOptions {
    val builder = SizeConversionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stack(
    scope: Construct,
    id: String,
    block: StackDsl.() -> Unit = {},
  ): Stack {
    val builder = StackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun stackProps(block: StackPropsDsl.() -> Unit = {}): StackProps {
    val builder = StackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stage(
    scope: Construct,
    id: String,
    block: StageDsl.() -> Unit = {},
  ): Stage {
    val builder = StageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun stageProps(block: StagePropsDsl.() -> Unit = {}): StageProps {
    val builder = StagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stageSynthesisOptions(block: StageSynthesisOptionsDsl.() -> Unit = {}):
      StageSynthesisOptions {
    val builder = StageSynthesisOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun synthesizeStackArtifactOptions(block: SynthesizeStackArtifactOptionsDsl.() -> Unit = {}):
      SynthesizeStackArtifactOptions {
    val builder = SynthesizeStackArtifactOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tag(
    arg0: String,
    arg1: String,
    block: TagDsl.() -> Unit = {},
  ): Tag {
    val builder = TagDsl(arg0, arg1)
    builder.apply(block)
    return builder.build()
  }

  public inline fun tagManager(
    arg0: TagType,
    arg1: String,
    arg2: Any,
    block: TagManagerDsl.() -> Unit = {},
  ): TagManager {
    val builder = TagManagerDsl(arg0, arg1, arg2)
    builder.apply(block)
    return builder.build()
  }

  public inline fun tagManagerOptions(block: TagManagerOptionsDsl.() -> Unit = {}):
      TagManagerOptions {
    val builder = TagManagerOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tagProps(block: TagPropsDsl.() -> Unit = {}): TagProps {
    val builder = TagPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun timeConversionOptions(block: TimeConversionOptionsDsl.() -> Unit = {}):
      TimeConversionOptions {
    val builder = TimeConversionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun uniqueResourceNameOptions(block: UniqueResourceNameOptionsDsl.() -> Unit = {}):
      UniqueResourceNameOptions {
    val builder = UniqueResourceNameOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
