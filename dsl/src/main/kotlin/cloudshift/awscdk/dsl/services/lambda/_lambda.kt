@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.lambda.AdotInstrumentationConfig
import software.amazon.awscdk.services.lambda.Alias
import software.amazon.awscdk.services.lambda.AliasAttributes
import software.amazon.awscdk.services.lambda.AliasOptions
import software.amazon.awscdk.services.lambda.AliasProps
import software.amazon.awscdk.services.lambda.AssetCode
import software.amazon.awscdk.services.lambda.AssetImageCode
import software.amazon.awscdk.services.lambda.AssetImageCodeProps
import software.amazon.awscdk.services.lambda.AutoScalingOptions
import software.amazon.awscdk.services.lambda.CfnAlias
import software.amazon.awscdk.services.lambda.CfnAliasProps
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfig
import software.amazon.awscdk.services.lambda.CfnCodeSigningConfigProps
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfig
import software.amazon.awscdk.services.lambda.CfnEventInvokeConfigProps
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
import software.amazon.awscdk.services.lambda.CfnFunction
import software.amazon.awscdk.services.lambda.CfnFunctionProps
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps
import software.amazon.awscdk.services.lambda.CfnLayerVersionProps
import software.amazon.awscdk.services.lambda.CfnParametersCode
import software.amazon.awscdk.services.lambda.CfnParametersCodeProps
import software.amazon.awscdk.services.lambda.CfnPermission
import software.amazon.awscdk.services.lambda.CfnPermissionProps
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnUrlProps
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.CfnVersionProps
import software.amazon.awscdk.services.lambda.CodeConfig
import software.amazon.awscdk.services.lambda.CodeImageConfig
import software.amazon.awscdk.services.lambda.CodeSigningConfig
import software.amazon.awscdk.services.lambda.CodeSigningConfigProps
import software.amazon.awscdk.services.lambda.DestinationConfig
import software.amazon.awscdk.services.lambda.DestinationOptions
import software.amazon.awscdk.services.lambda.DlqDestinationConfig
import software.amazon.awscdk.services.lambda.DockerBuildAssetOptions
import software.amazon.awscdk.services.lambda.DockerImageFunction
import software.amazon.awscdk.services.lambda.DockerImageFunctionProps
import software.amazon.awscdk.services.lambda.EcrImageCode
import software.amazon.awscdk.services.lambda.EcrImageCodeProps
import software.amazon.awscdk.services.lambda.EnvironmentOptions
import software.amazon.awscdk.services.lambda.EventInvokeConfig
import software.amazon.awscdk.services.lambda.EventInvokeConfigOptions
import software.amazon.awscdk.services.lambda.EventInvokeConfigProps
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.EventSourceMappingOptions
import software.amazon.awscdk.services.lambda.EventSourceMappingProps
import software.amazon.awscdk.services.lambda.FileSystemConfig
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionAttributes
import software.amazon.awscdk.services.lambda.FunctionOptions
import software.amazon.awscdk.services.lambda.FunctionProps
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions
import software.amazon.awscdk.services.lambda.FunctionUrlOptions
import software.amazon.awscdk.services.lambda.FunctionUrlProps
import software.amazon.awscdk.services.lambda.LambdaRuntimeProps
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.LayerVersionAttributes
import software.amazon.awscdk.services.lambda.LayerVersionOptions
import software.amazon.awscdk.services.lambda.LayerVersionPermission
import software.amazon.awscdk.services.lambda.LayerVersionProps
import software.amazon.awscdk.services.lambda.LogRetentionRetryOptions
import software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions
import software.amazon.awscdk.services.lambda.Permission
import software.amazon.awscdk.services.lambda.ResourceBindOptions
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.lambda.RuntimeFamily
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.SingletonFunctionProps
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration
import software.amazon.awscdk.services.lambda.UtilizationScalingOptions
import software.amazon.awscdk.services.lambda.Version
import software.amazon.awscdk.services.lambda.VersionAttributes
import software.amazon.awscdk.services.lambda.VersionOptions
import software.amazon.awscdk.services.lambda.VersionProps
import software.amazon.awscdk.services.lambda.VersionWeight
import software.constructs.Construct

public object lambda {
  public inline fun adotInstrumentationConfig(block: AdotInstrumentationConfigDsl.() -> Unit = {}):
      AdotInstrumentationConfig {
    val builder = AdotInstrumentationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun alias(
    scope: Construct,
    id: String,
    block: AliasDsl.() -> Unit = {},
  ): Alias {
    val builder = AliasDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun aliasAttributes(block: AliasAttributesDsl.() -> Unit = {}): AliasAttributes {
    val builder = AliasAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun aliasOptions(block: AliasOptionsDsl.() -> Unit = {}): AliasOptions {
    val builder = AliasOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun aliasProps(block: AliasPropsDsl.() -> Unit = {}): AliasProps {
    val builder = AliasPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetCode(arg0: String, block: AssetCodeDsl.() -> Unit = {}): AssetCode {
    val builder = AssetCodeDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetImageCode(arg0: String, block: AssetImageCodeDsl.() -> Unit = {}):
      AssetImageCode {
    val builder = AssetImageCodeDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetImageCodeProps(block: AssetImageCodePropsDsl.() -> Unit = {}):
      AssetImageCodeProps {
    val builder = AssetImageCodePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun autoScalingOptions(block: AutoScalingOptionsDsl.() -> Unit = {}):
      AutoScalingOptions {
    val builder = AutoScalingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlias(
    scope: Construct,
    id: String,
    block: CfnAliasDsl.() -> Unit = {},
  ): CfnAlias {
    val builder = CfnAliasDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAliasAliasRoutingConfigurationProperty(block: CfnAliasAliasRoutingConfigurationPropertyDsl.() -> Unit
      = {}): CfnAlias.AliasRoutingConfigurationProperty {
    val builder = CfnAliasAliasRoutingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAliasProps(block: CfnAliasPropsDsl.() -> Unit = {}): CfnAliasProps {
    val builder = CfnAliasPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAliasProvisionedConcurrencyConfigurationProperty(block: CfnAliasProvisionedConcurrencyConfigurationPropertyDsl.() -> Unit
      = {}): CfnAlias.ProvisionedConcurrencyConfigurationProperty {
    val builder = CfnAliasProvisionedConcurrencyConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAliasVersionWeightProperty(block: CfnAliasVersionWeightPropertyDsl.() -> Unit
      = {}): CfnAlias.VersionWeightProperty {
    val builder = CfnAliasVersionWeightPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCodeSigningConfig(
    scope: Construct,
    id: String,
    block: CfnCodeSigningConfigDsl.() -> Unit = {},
  ): CfnCodeSigningConfig {
    val builder = CfnCodeSigningConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeSigningConfigAllowedPublishersProperty(block: CfnCodeSigningConfigAllowedPublishersPropertyDsl.() -> Unit
      = {}): CfnCodeSigningConfig.AllowedPublishersProperty {
    val builder = CfnCodeSigningConfigAllowedPublishersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCodeSigningConfigCodeSigningPoliciesProperty(block: CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl.() -> Unit
      = {}): CfnCodeSigningConfig.CodeSigningPoliciesProperty {
    val builder = CfnCodeSigningConfigCodeSigningPoliciesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCodeSigningConfigProps(block: CfnCodeSigningConfigPropsDsl.() -> Unit = {}):
      CfnCodeSigningConfigProps {
    val builder = CfnCodeSigningConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventInvokeConfig(
    scope: Construct,
    id: String,
    block: CfnEventInvokeConfigDsl.() -> Unit = {},
  ): CfnEventInvokeConfig {
    val builder = CfnEventInvokeConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventInvokeConfigDestinationConfigProperty(block: CfnEventInvokeConfigDestinationConfigPropertyDsl.() -> Unit
      = {}): CfnEventInvokeConfig.DestinationConfigProperty {
    val builder = CfnEventInvokeConfigDestinationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventInvokeConfigOnFailureProperty(block: CfnEventInvokeConfigOnFailurePropertyDsl.() -> Unit
      = {}): CfnEventInvokeConfig.OnFailureProperty {
    val builder = CfnEventInvokeConfigOnFailurePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventInvokeConfigOnSuccessProperty(block: CfnEventInvokeConfigOnSuccessPropertyDsl.() -> Unit
      = {}): CfnEventInvokeConfig.OnSuccessProperty {
    val builder = CfnEventInvokeConfigOnSuccessPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventInvokeConfigProps(block: CfnEventInvokeConfigPropsDsl.() -> Unit = {}):
      CfnEventInvokeConfigProps {
    val builder = CfnEventInvokeConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventSourceMapping(
    scope: Construct,
    id: String,
    block: CfnEventSourceMappingDsl.() -> Unit = {},
  ): CfnEventSourceMapping {
    val builder = CfnEventSourceMappingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingAmazonManagedKafkaEventSourceConfigProperty(block: CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty {
    val builder = CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingDestinationConfigProperty(block: CfnEventSourceMappingDestinationConfigPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.DestinationConfigProperty {
    val builder = CfnEventSourceMappingDestinationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingDocumentDBEventSourceConfigProperty(block: CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.DocumentDBEventSourceConfigProperty {
    val builder = CfnEventSourceMappingDocumentDBEventSourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingEndpointsProperty(block: CfnEventSourceMappingEndpointsPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.EndpointsProperty {
    val builder = CfnEventSourceMappingEndpointsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingFilterCriteriaProperty(block: CfnEventSourceMappingFilterCriteriaPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.FilterCriteriaProperty {
    val builder = CfnEventSourceMappingFilterCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingFilterProperty(block: CfnEventSourceMappingFilterPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.FilterProperty {
    val builder = CfnEventSourceMappingFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingOnFailureProperty(block: CfnEventSourceMappingOnFailurePropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.OnFailureProperty {
    val builder = CfnEventSourceMappingOnFailurePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnEventSourceMappingProps(block: CfnEventSourceMappingPropsDsl.() -> Unit =
      {}): CfnEventSourceMappingProps {
    val builder = CfnEventSourceMappingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingScalingConfigProperty(block: CfnEventSourceMappingScalingConfigPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.ScalingConfigProperty {
    val builder = CfnEventSourceMappingScalingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingSelfManagedEventSourceProperty(block: CfnEventSourceMappingSelfManagedEventSourcePropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.SelfManagedEventSourceProperty {
    val builder = CfnEventSourceMappingSelfManagedEventSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingSelfManagedKafkaEventSourceConfigProperty(block: CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty {
    val builder = CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnEventSourceMappingSourceAccessConfigurationProperty(block: CfnEventSourceMappingSourceAccessConfigurationPropertyDsl.() -> Unit
      = {}): CfnEventSourceMapping.SourceAccessConfigurationProperty {
    val builder = CfnEventSourceMappingSourceAccessConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunction(
    scope: Construct,
    id: String,
    block: CfnFunctionDsl.() -> Unit = {},
  ): CfnFunction {
    val builder = CfnFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionCodeProperty(block: CfnFunctionCodePropertyDsl.() -> Unit = {}):
      CfnFunction.CodeProperty {
    val builder = CfnFunctionCodePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionDeadLetterConfigProperty(block: CfnFunctionDeadLetterConfigPropertyDsl.() -> Unit
      = {}): CfnFunction.DeadLetterConfigProperty {
    val builder = CfnFunctionDeadLetterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionEnvironmentProperty(block: CfnFunctionEnvironmentPropertyDsl.() -> Unit = {}):
      CfnFunction.EnvironmentProperty {
    val builder = CfnFunctionEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionEphemeralStorageProperty(block: CfnFunctionEphemeralStoragePropertyDsl.() -> Unit
      = {}): CfnFunction.EphemeralStorageProperty {
    val builder = CfnFunctionEphemeralStoragePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionFileSystemConfigProperty(block: CfnFunctionFileSystemConfigPropertyDsl.() -> Unit
      = {}): CfnFunction.FileSystemConfigProperty {
    val builder = CfnFunctionFileSystemConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionImageConfigProperty(block: CfnFunctionImageConfigPropertyDsl.() -> Unit = {}):
      CfnFunction.ImageConfigProperty {
    val builder = CfnFunctionImageConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionProps(block: CfnFunctionPropsDsl.() -> Unit = {}): CfnFunctionProps {
    val builder = CfnFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionRuntimeManagementConfigProperty(block: CfnFunctionRuntimeManagementConfigPropertyDsl.() -> Unit
      = {}): CfnFunction.RuntimeManagementConfigProperty {
    val builder = CfnFunctionRuntimeManagementConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionSnapStartProperty(block: CfnFunctionSnapStartPropertyDsl.() -> Unit =
      {}): CfnFunction.SnapStartProperty {
    val builder = CfnFunctionSnapStartPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionSnapStartResponseProperty(block: CfnFunctionSnapStartResponsePropertyDsl.() -> Unit
      = {}): CfnFunction.SnapStartResponseProperty {
    val builder = CfnFunctionSnapStartResponsePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionTracingConfigProperty(block: CfnFunctionTracingConfigPropertyDsl.() -> Unit =
      {}): CfnFunction.TracingConfigProperty {
    val builder = CfnFunctionTracingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionVpcConfigProperty(block: CfnFunctionVpcConfigPropertyDsl.() -> Unit =
      {}): CfnFunction.VpcConfigProperty {
    val builder = CfnFunctionVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLayerVersion(
    scope: Construct,
    id: String,
    block: CfnLayerVersionDsl.() -> Unit = {},
  ): CfnLayerVersion {
    val builder = CfnLayerVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLayerVersionContentProperty(block: CfnLayerVersionContentPropertyDsl.() -> Unit = {}):
      CfnLayerVersion.ContentProperty {
    val builder = CfnLayerVersionContentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLayerVersionPermission(
    scope: Construct,
    id: String,
    block: CfnLayerVersionPermissionDsl.() -> Unit = {},
  ): CfnLayerVersionPermission {
    val builder = CfnLayerVersionPermissionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLayerVersionPermissionProps(block: CfnLayerVersionPermissionPropsDsl.() -> Unit = {}):
      CfnLayerVersionPermissionProps {
    val builder = CfnLayerVersionPermissionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLayerVersionProps(block: CfnLayerVersionPropsDsl.() -> Unit = {}):
      CfnLayerVersionProps {
    val builder = CfnLayerVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParametersCode(block: CfnParametersCodeDsl.() -> Unit = {}):
      CfnParametersCode {
    val builder = CfnParametersCodeDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParametersCodeProps(block: CfnParametersCodePropsDsl.() -> Unit = {}):
      CfnParametersCodeProps {
    val builder = CfnParametersCodePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPermission(
    scope: Construct,
    id: String,
    block: CfnPermissionDsl.() -> Unit = {},
  ): CfnPermission {
    val builder = CfnPermissionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPermissionProps(block: CfnPermissionPropsDsl.() -> Unit = {}):
      CfnPermissionProps {
    val builder = CfnPermissionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUrl(
    scope: Construct,
    id: String,
    block: CfnUrlDsl.() -> Unit = {},
  ): CfnUrl {
    val builder = CfnUrlDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUrlCorsProperty(block: CfnUrlCorsPropertyDsl.() -> Unit = {}):
      CfnUrl.CorsProperty {
    val builder = CfnUrlCorsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUrlProps(block: CfnUrlPropsDsl.() -> Unit = {}): CfnUrlProps {
    val builder = CfnUrlPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVersion(
    scope: Construct,
    id: String,
    block: CfnVersionDsl.() -> Unit = {},
  ): CfnVersion {
    val builder = CfnVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVersionProps(block: CfnVersionPropsDsl.() -> Unit = {}): CfnVersionProps {
    val builder = CfnVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVersionProvisionedConcurrencyConfigurationProperty(block: CfnVersionProvisionedConcurrencyConfigurationPropertyDsl.() -> Unit
      = {}): CfnVersion.ProvisionedConcurrencyConfigurationProperty {
    val builder = CfnVersionProvisionedConcurrencyConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeConfig(block: CodeConfigDsl.() -> Unit = {}): CodeConfig {
    val builder = CodeConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeImageConfig(block: CodeImageConfigDsl.() -> Unit = {}): CodeImageConfig {
    val builder = CodeImageConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeSigningConfig(
    scope: Construct,
    id: String,
    block: CodeSigningConfigDsl.() -> Unit = {},
  ): CodeSigningConfig {
    val builder = CodeSigningConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun codeSigningConfigProps(block: CodeSigningConfigPropsDsl.() -> Unit = {}):
      CodeSigningConfigProps {
    val builder = CodeSigningConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun destinationConfig(block: DestinationConfigDsl.() -> Unit = {}):
      DestinationConfig {
    val builder = DestinationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun destinationOptions(block: DestinationOptionsDsl.() -> Unit = {}):
      DestinationOptions {
    val builder = DestinationOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dlqDestinationConfig(block: DlqDestinationConfigDsl.() -> Unit = {}):
      DlqDestinationConfig {
    val builder = DlqDestinationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerBuildAssetOptions(block: DockerBuildAssetOptionsDsl.() -> Unit = {}):
      DockerBuildAssetOptions {
    val builder = DockerBuildAssetOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerImageFunction(
    scope: Construct,
    id: String,
    block: DockerImageFunctionDsl.() -> Unit = {},
  ): DockerImageFunction {
    val builder = DockerImageFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerImageFunctionProps(block: DockerImageFunctionPropsDsl.() -> Unit = {}):
      DockerImageFunctionProps {
    val builder = DockerImageFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ecrImageCode(arg0: IRepository, block: EcrImageCodeDsl.() -> Unit = {}):
      EcrImageCode {
    val builder = EcrImageCodeDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun ecrImageCodeProps(block: EcrImageCodePropsDsl.() -> Unit = {}):
      EcrImageCodeProps {
    val builder = EcrImageCodePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun environmentOptions(block: EnvironmentOptionsDsl.() -> Unit = {}):
      EnvironmentOptions {
    val builder = EnvironmentOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventInvokeConfig(
    scope: Construct,
    id: String,
    block: EventInvokeConfigDsl.() -> Unit = {},
  ): EventInvokeConfig {
    val builder = EventInvokeConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventInvokeConfigOptions(block: EventInvokeConfigOptionsDsl.() -> Unit = {}):
      EventInvokeConfigOptions {
    val builder = EventInvokeConfigOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventInvokeConfigProps(block: EventInvokeConfigPropsDsl.() -> Unit = {}):
      EventInvokeConfigProps {
    val builder = EventInvokeConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventSourceMapping(
    scope: Construct,
    id: String,
    block: EventSourceMappingDsl.() -> Unit = {},
  ): EventSourceMapping {
    val builder = EventSourceMappingDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventSourceMappingOptions(block: EventSourceMappingOptionsDsl.() -> Unit = {}):
      EventSourceMappingOptions {
    val builder = EventSourceMappingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun eventSourceMappingProps(block: EventSourceMappingPropsDsl.() -> Unit = {}):
      EventSourceMappingProps {
    val builder = EventSourceMappingPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileSystemConfig(block: FileSystemConfigDsl.() -> Unit = {}): FileSystemConfig {
    val builder = FileSystemConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun function(
    scope: Construct,
    id: String,
    block: FunctionDsl.() -> Unit = {},
  ): Function {
    val builder = FunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionAttributes(block: FunctionAttributesDsl.() -> Unit = {}):
      FunctionAttributes {
    val builder = FunctionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionOptions(block: FunctionOptionsDsl.() -> Unit = {}): FunctionOptions {
    val builder = FunctionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionProps(block: FunctionPropsDsl.() -> Unit = {}): FunctionProps {
    val builder = FunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionUrl(
    scope: Construct,
    id: String,
    block: FunctionUrlDsl.() -> Unit = {},
  ): FunctionUrl {
    val builder = FunctionUrlDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionUrlCorsOptions(block: FunctionUrlCorsOptionsDsl.() -> Unit = {}):
      FunctionUrlCorsOptions {
    val builder = FunctionUrlCorsOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionUrlOptions(block: FunctionUrlOptionsDsl.() -> Unit = {}):
      FunctionUrlOptions {
    val builder = FunctionUrlOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionUrlProps(block: FunctionUrlPropsDsl.() -> Unit = {}): FunctionUrlProps {
    val builder = FunctionUrlPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaRuntimeProps(block: LambdaRuntimePropsDsl.() -> Unit = {}):
      LambdaRuntimeProps {
    val builder = LambdaRuntimePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun layerVersion(
    scope: Construct,
    id: String,
    block: LayerVersionDsl.() -> Unit = {},
  ): LayerVersion {
    val builder = LayerVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun layerVersionAttributes(block: LayerVersionAttributesDsl.() -> Unit = {}):
      LayerVersionAttributes {
    val builder = LayerVersionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun layerVersionOptions(block: LayerVersionOptionsDsl.() -> Unit = {}):
      LayerVersionOptions {
    val builder = LayerVersionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun layerVersionPermission(block: LayerVersionPermissionDsl.() -> Unit = {}):
      LayerVersionPermission {
    val builder = LayerVersionPermissionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun layerVersionProps(block: LayerVersionPropsDsl.() -> Unit = {}):
      LayerVersionProps {
    val builder = LayerVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun logRetentionRetryOptions(block: LogRetentionRetryOptionsDsl.() -> Unit = {}):
      LogRetentionRetryOptions {
    val builder = LogRetentionRetryOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun paramsAndSecretsOptions(block: ParamsAndSecretsOptionsDsl.() -> Unit = {}):
      ParamsAndSecretsOptions {
    val builder = ParamsAndSecretsOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun permission(block: PermissionDsl.() -> Unit = {}): Permission {
    val builder = PermissionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun resourceBindOptions(block: ResourceBindOptionsDsl.() -> Unit = {}):
      ResourceBindOptions {
    val builder = ResourceBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun runtime(
    arg0: String,
    arg1: RuntimeFamily,
    block: RuntimeDsl.() -> Unit = {},
  ): Runtime {
    val builder = RuntimeDsl(arg0, arg1)
    builder.apply(block)
    return builder.build()
  }

  public inline fun singletonFunction(
    scope: Construct,
    id: String,
    block: SingletonFunctionDsl.() -> Unit = {},
  ): SingletonFunction {
    val builder = SingletonFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun singletonFunctionProps(block: SingletonFunctionPropsDsl.() -> Unit = {}):
      SingletonFunctionProps {
    val builder = SingletonFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sourceAccessConfiguration(block: SourceAccessConfigurationDsl.() -> Unit = {}):
      SourceAccessConfiguration {
    val builder = SourceAccessConfigurationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun utilizationScalingOptions(block: UtilizationScalingOptionsDsl.() -> Unit = {}):
      UtilizationScalingOptions {
    val builder = UtilizationScalingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun version(
    scope: Construct,
    id: String,
    block: VersionDsl.() -> Unit = {},
  ): Version {
    val builder = VersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun versionAttributes(block: VersionAttributesDsl.() -> Unit = {}):
      VersionAttributes {
    val builder = VersionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun versionOptions(block: VersionOptionsDsl.() -> Unit = {}): VersionOptions {
    val builder = VersionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun versionProps(block: VersionPropsDsl.() -> Unit = {}): VersionProps {
    val builder = VersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun versionWeight(block: VersionWeightDsl.() -> Unit = {}): VersionWeight {
    val builder = VersionWeightDsl()
    builder.apply(block)
    return builder.build()
  }
}
