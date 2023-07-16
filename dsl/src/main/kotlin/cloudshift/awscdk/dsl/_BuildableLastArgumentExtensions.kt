@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.dsl.cloudassembly.schema.AssetManifestOptionsDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.DockerImageDestinationDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.FileDestinationDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.MissingContextDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.App
import software.amazon.awscdk.AssetManifestBuilder
import software.amazon.awscdk.BootstraplessSynthesizer
import software.amazon.awscdk.CfnCodeDeployBlueGreenHook
import software.amazon.awscdk.CfnCustomResource
import software.amazon.awscdk.CfnHookDefaultVersion
import software.amazon.awscdk.CfnHookTypeConfig
import software.amazon.awscdk.CfnHookVersion
import software.amazon.awscdk.CfnMacro
import software.amazon.awscdk.CfnModuleDefaultVersion
import software.amazon.awscdk.CfnModuleVersion
import software.amazon.awscdk.CfnPublicTypeVersion
import software.amazon.awscdk.CfnPublisher
import software.amazon.awscdk.CfnResource
import software.amazon.awscdk.CfnResourceDefaultVersion
import software.amazon.awscdk.CfnResourceVersion
import software.amazon.awscdk.CfnStack
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.CfnTypeActivation
import software.amazon.awscdk.CfnWaitCondition
import software.amazon.awscdk.CfnWaitConditionHandle
import software.amazon.awscdk.CliCredentialsStackSynthesizer
import software.amazon.awscdk.DefaultStackSynthesizer
import software.amazon.awscdk.DockerImage
import software.amazon.awscdk.DockerImageAssetLocation
import software.amazon.awscdk.DockerImageAssetSource
import software.amazon.awscdk.Duration
import software.amazon.awscdk.FileAssetLocation
import software.amazon.awscdk.FileAssetSource
import software.amazon.awscdk.ISynthesisSession
import software.amazon.awscdk.LegacyStackSynthesizer
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.NestedStackSynthesizer
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.Size
import software.amazon.awscdk.Stack
import software.amazon.awscdk.Stage
import software.amazon.awscdk.Tags
import software.amazon.awscdk.cloudassembly.schema.DockerImageDestination
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource
import software.amazon.awscdk.cloudassembly.schema.FileDestination
import software.amazon.awscdk.cloudassembly.schema.FileSource
import software.amazon.awscdk.cxapi.CloudAssembly

public inline fun App.synth(block: StageSynthesisOptionsDsl.() -> Unit = {}): CloudAssembly {
  val builder = StageSynthesisOptionsDsl()
  builder.apply(block)
  return synth(builder.build())
}

public inline fun AssetManifestBuilder.addDockerImageAsset(
  arg0: Stack,
  arg1: String,
  arg2: DockerImageSource,
  block: DockerImageDestinationDsl.() -> Unit = {},
): DockerImageDestination {
  val builder = DockerImageDestinationDsl()
  builder.apply(block)
  return addDockerImageAsset(arg0,arg1,arg2,builder.build())
}

public inline fun AssetManifestBuilder.addFileAsset(
  arg0: Stack,
  arg1: String,
  arg2: FileSource,
  block: FileDestinationDsl.() -> Unit = {},
): FileDestination {
  val builder = FileDestinationDsl()
  builder.apply(block)
  return addFileAsset(arg0,arg1,arg2,builder.build())
}

public inline fun AssetManifestBuilder.defaultAddDockerImageAsset(
  arg0: Stack,
  arg1: DockerImageAssetSource,
  block: AssetManifestDockerImageDestinationDsl.() -> Unit = {},
): DockerImageDestination {
  val builder = AssetManifestDockerImageDestinationDsl()
  builder.apply(block)
  return defaultAddDockerImageAsset(arg0,arg1,builder.build())
}

public inline fun AssetManifestBuilder.defaultAddFileAsset(
  arg0: Stack,
  arg1: FileAssetSource,
  block: AssetManifestFileDestinationDsl.() -> Unit = {},
): FileDestination {
  val builder = AssetManifestFileDestinationDsl()
  builder.apply(block)
  return defaultAddFileAsset(arg0,arg1,builder.build())
}

public inline fun AssetManifestBuilder.emitManifest(
  arg0: Stack,
  arg1: ISynthesisSession,
  block: AssetManifestOptionsDsl.() -> Unit = {},
): String {
  val builder = AssetManifestOptionsDsl()
  builder.apply(block)
  return emitManifest(arg0,arg1,builder.build())
}

public inline
    fun BootstraplessSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

public inline fun BootstraplessSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

public inline
    fun CfnCodeDeployBlueGreenHook.setAdditionalOptions(block: CfnCodeDeployBlueGreenAdditionalOptionsDsl.() -> Unit
    = {}) {
  val builder = CfnCodeDeployBlueGreenAdditionalOptionsDsl()
  builder.apply(block)
  return setAdditionalOptions(builder.build())
}

public inline
    fun CfnCodeDeployBlueGreenHook.setLifecycleEventHooks(block: CfnCodeDeployBlueGreenLifecycleEventHooksDsl.() -> Unit
    = {}) {
  val builder = CfnCodeDeployBlueGreenLifecycleEventHooksDsl()
  builder.apply(block)
  return setLifecycleEventHooks(builder.build())
}

public inline
    fun CfnCodeDeployBlueGreenHook.setTrafficRoutingConfig(block: CfnTrafficRoutingConfigDsl.() -> Unit
    = {}) {
  val builder = CfnTrafficRoutingConfigDsl()
  builder.apply(block)
  return setTrafficRoutingConfig(builder.build())
}

public inline fun CfnCustomResource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnHookDefaultVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnHookTypeConfig.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnHookVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnHookVersion.setLoggingConfig(block: CfnHookVersionLoggingConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnHookVersionLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

public inline fun CfnMacro.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnModuleDefaultVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnModuleVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPublicTypeVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPublisher.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResource.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResourceDefaultVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResourceVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnResourceVersion.setLoggingConfig(block: CfnResourceVersionLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResourceVersionLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

public inline fun CfnStack.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnStackSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnStackSet.setAutoDeployment(block: CfnStackSetAutoDeploymentPropertyDsl.() -> Unit = {}) {
  val builder = CfnStackSetAutoDeploymentPropertyDsl()
  builder.apply(block)
  return setAutoDeployment(builder.build())
}

public inline
    fun CfnStackSet.setOperationPreferences(block: CfnStackSetOperationPreferencesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStackSetOperationPreferencesPropertyDsl()
  builder.apply(block)
  return setOperationPreferences(builder.build())
}

public inline fun CfnTypeActivation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTypeActivation.setLoggingConfig(block: CfnTypeActivationLoggingConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTypeActivationLoggingConfigPropertyDsl()
  builder.apply(block)
  return setLoggingConfig(builder.build())
}

public inline fun CfnWaitCondition.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnWaitConditionHandle.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CliCredentialsStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit
    = {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

public inline fun CliCredentialsStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit =
    {}): FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

public inline
    fun DefaultStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

public inline fun DefaultStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

public inline fun DockerImage.run(block: DockerRunOptionsDsl.() -> Unit = {}) {
  val builder = DockerRunOptionsDsl()
  builder.apply(block)
  return run(builder.build())
}

public inline fun Duration.toDays(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toDays(builder.build())
}

public inline fun Duration.toHours(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toHours(builder.build())
}

public inline fun Duration.toMilliseconds(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toMilliseconds(builder.build())
}

public inline fun Duration.toMinutes(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toMinutes(builder.build())
}

public inline fun Duration.toSeconds(block: TimeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = TimeConversionOptionsDsl()
  builder.apply(block)
  return toSeconds(builder.build())
}

public inline
    fun LegacyStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

public inline fun LegacyStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

public inline fun NestedStack.exportStringListValue(arg0: Any,
    block: ExportValueOptionsDsl.() -> Unit = {}): List<String> {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportStringListValue(arg0,builder.build())
}

public inline fun NestedStack.exportValue(arg0: Any, block: ExportValueOptionsDsl.() -> Unit = {}):
    String {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportValue(arg0,builder.build())
}

public inline fun NestedStack.formatArn(block: ArnComponentsDsl.() -> Unit = {}): String {
  val builder = ArnComponentsDsl()
  builder.apply(block)
  return formatArn(builder.build())
}

public inline fun NestedStack.reportMissingContextKey(block: MissingContextDsl.() -> Unit = {}) {
  val builder = MissingContextDsl()
  builder.apply(block)
  return reportMissingContextKey(builder.build())
}

public inline
    fun NestedStackSynthesizer.addDockerImageAsset(block: DockerImageAssetSourceDsl.() -> Unit =
    {}): DockerImageAssetLocation {
  val builder = DockerImageAssetSourceDsl()
  builder.apply(block)
  return addDockerImageAsset(builder.build())
}

public inline fun NestedStackSynthesizer.addFileAsset(block: FileAssetSourceDsl.() -> Unit = {}):
    FileAssetLocation {
  val builder = FileAssetSourceDsl()
  builder.apply(block)
  return addFileAsset(builder.build())
}

public inline fun Size.toBytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toBytes(builder.build())
}

public inline fun Size.toGibibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toGibibytes(builder.build())
}

public inline fun Size.toKibibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toKibibytes(builder.build())
}

public inline fun Size.toMebibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toMebibytes(builder.build())
}

public inline fun Size.toPebibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toPebibytes(builder.build())
}

public inline fun Size.toTebibytes(block: SizeConversionOptionsDsl.() -> Unit = {}): Number {
  val builder = SizeConversionOptionsDsl()
  builder.apply(block)
  return toTebibytes(builder.build())
}

public inline fun Stack.exportStringListValue(arg0: Any, block: ExportValueOptionsDsl.() -> Unit =
    {}): List<String> {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportStringListValue(arg0,builder.build())
}

public inline fun Stack.exportValue(arg0: Any, block: ExportValueOptionsDsl.() -> Unit = {}):
    String {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportValue(arg0,builder.build())
}

public inline fun Stack.formatArn(block: ArnComponentsDsl.() -> Unit = {}): String {
  val builder = ArnComponentsDsl()
  builder.apply(block)
  return formatArn(builder.build())
}

public inline fun Stack.reportMissingContextKey(block: MissingContextDsl.() -> Unit = {}) {
  val builder = MissingContextDsl()
  builder.apply(block)
  return reportMissingContextKey(builder.build())
}

public inline fun Stage.synth(block: StageSynthesisOptionsDsl.() -> Unit = {}): CloudAssembly {
  val builder = StageSynthesisOptionsDsl()
  builder.apply(block)
  return synth(builder.build())
}

public inline fun Tags.add(
  arg0: String,
  arg1: String,
  block: TagPropsDsl.() -> Unit = {},
) {
  val builder = TagPropsDsl()
  builder.apply(block)
  return add(arg0,arg1,builder.build())
}

public inline fun Tags.remove(arg0: String, block: TagPropsDsl.() -> Unit = {}) {
  val builder = TagPropsDsl()
  builder.apply(block)
  return remove(arg0,builder.build())
}
