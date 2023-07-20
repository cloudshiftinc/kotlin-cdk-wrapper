@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.AmiContextQuery
import software.amazon.awscdk.cloudassembly.schema.ArtifactManifest
import software.amazon.awscdk.cloudassembly.schema.AssemblyManifest
import software.amazon.awscdk.cloudassembly.schema.AssetManifest
import software.amazon.awscdk.cloudassembly.schema.AssetManifestOptions
import software.amazon.awscdk.cloudassembly.schema.AssetManifestProperties
import software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery
import software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import software.amazon.awscdk.cloudassembly.schema.AwsDestination
import software.amazon.awscdk.cloudassembly.schema.BootstrapRole
import software.amazon.awscdk.cloudassembly.schema.CdkCommand
import software.amazon.awscdk.cloudassembly.schema.CdkCommands
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetCacheOption
import software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions
import software.amazon.awscdk.cloudassembly.schema.DeployCommand
import software.amazon.awscdk.cloudassembly.schema.DeployOptions
import software.amazon.awscdk.cloudassembly.schema.DestroyCommand
import software.amazon.awscdk.cloudassembly.schema.DestroyOptions
import software.amazon.awscdk.cloudassembly.schema.DockerCacheOption
import software.amazon.awscdk.cloudassembly.schema.DockerImageAsset
import software.amazon.awscdk.cloudassembly.schema.DockerImageDestination
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource
import software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery
import software.amazon.awscdk.cloudassembly.schema.FileAsset
import software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry
import software.amazon.awscdk.cloudassembly.schema.FileDestination
import software.amazon.awscdk.cloudassembly.schema.FileSource
import software.amazon.awscdk.cloudassembly.schema.Hooks
import software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery
import software.amazon.awscdk.cloudassembly.schema.IntegManifest
import software.amazon.awscdk.cloudassembly.schema.KeyContextQuery
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerFilter
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery
import software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions
import software.amazon.awscdk.cloudassembly.schema.MetadataEntry
import software.amazon.awscdk.cloudassembly.schema.MissingContext
import software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
import software.amazon.awscdk.cloudassembly.schema.PluginContextQuery
import software.amazon.awscdk.cloudassembly.schema.RuntimeInfo
import software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery
import software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery
import software.amazon.awscdk.cloudassembly.schema.Tag
import software.amazon.awscdk.cloudassembly.schema.TestCase
import software.amazon.awscdk.cloudassembly.schema.TestOptions
import software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties
import software.amazon.awscdk.cloudassembly.schema.VpcContextQuery

public object schema {
  public inline fun amiContextQuery(block: AmiContextQueryDsl.() -> Unit = {}): AmiContextQuery {
    val builder = AmiContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun artifactManifest(block: ArtifactManifestDsl.() -> Unit = {}): ArtifactManifest {
    val builder = ArtifactManifestDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assemblyManifest(block: AssemblyManifestDsl.() -> Unit = {}): AssemblyManifest {
    val builder = AssemblyManifestDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetManifest(block: AssetManifestDsl.() -> Unit = {}): AssetManifest {
    val builder = AssetManifestDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetManifestOptions(block: AssetManifestOptionsDsl.() -> Unit = {}):
      AssetManifestOptions {
    val builder = AssetManifestOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetManifestProperties(block: AssetManifestPropertiesDsl.() -> Unit = {}):
      AssetManifestProperties {
    val builder = AssetManifestPropertiesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun availabilityZonesContextQuery(block: AvailabilityZonesContextQueryDsl.() -> Unit
      = {}): AvailabilityZonesContextQuery {
    val builder = AvailabilityZonesContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun awsCloudFormationStackProperties(block: AwsCloudFormationStackPropertiesDsl.() -> Unit =
      {}): AwsCloudFormationStackProperties {
    val builder = AwsCloudFormationStackPropertiesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun awsDestination(block: AwsDestinationDsl.() -> Unit = {}): AwsDestination {
    val builder = AwsDestinationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bootstrapRole(block: BootstrapRoleDsl.() -> Unit = {}): BootstrapRole {
    val builder = BootstrapRoleDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cdkCommand(block: CdkCommandDsl.() -> Unit = {}): CdkCommand {
    val builder = CdkCommandDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cdkCommands(block: CdkCommandsDsl.() -> Unit = {}): CdkCommands {
    val builder = CdkCommandsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun containerImageAssetCacheOption(block: ContainerImageAssetCacheOptionDsl.() -> Unit = {}):
      ContainerImageAssetCacheOption {
    val builder = ContainerImageAssetCacheOptionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun containerImageAssetMetadataEntry(block: ContainerImageAssetMetadataEntryDsl.() -> Unit =
      {}): ContainerImageAssetMetadataEntry {
    val builder = ContainerImageAssetMetadataEntryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun defaultCdkOptions(block: DefaultCdkOptionsDsl.() -> Unit = {}):
      DefaultCdkOptions {
    val builder = DefaultCdkOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun deployCommand(block: DeployCommandDsl.() -> Unit = {}): DeployCommand {
    val builder = DeployCommandDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun deployOptions(block: DeployOptionsDsl.() -> Unit = {}): DeployOptions {
    val builder = DeployOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun destroyCommand(block: DestroyCommandDsl.() -> Unit = {}): DestroyCommand {
    val builder = DestroyCommandDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun destroyOptions(block: DestroyOptionsDsl.() -> Unit = {}): DestroyOptions {
    val builder = DestroyOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerCacheOption(block: DockerCacheOptionDsl.() -> Unit = {}):
      DockerCacheOption {
    val builder = DockerCacheOptionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerImageAsset(block: DockerImageAssetDsl.() -> Unit = {}): DockerImageAsset {
    val builder = DockerImageAssetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerImageDestination(block: DockerImageDestinationDsl.() -> Unit = {}):
      DockerImageDestination {
    val builder = DockerImageDestinationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dockerImageSource(block: DockerImageSourceDsl.() -> Unit = {}):
      DockerImageSource {
    val builder = DockerImageSourceDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun endpointServiceAvailabilityZonesContextQuery(block: EndpointServiceAvailabilityZonesContextQueryDsl.() -> Unit
      = {}): EndpointServiceAvailabilityZonesContextQuery {
    val builder = EndpointServiceAvailabilityZonesContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileAsset(block: FileAssetDsl.() -> Unit = {}): FileAsset {
    val builder = FileAssetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileAssetMetadataEntry(block: FileAssetMetadataEntryDsl.() -> Unit = {}):
      FileAssetMetadataEntry {
    val builder = FileAssetMetadataEntryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileDestination(block: FileDestinationDsl.() -> Unit = {}): FileDestination {
    val builder = FileDestinationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileSource(block: FileSourceDsl.() -> Unit = {}): FileSource {
    val builder = FileSourceDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun hooks(block: HooksDsl.() -> Unit = {}): Hooks {
    val builder = HooksDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun hostedZoneContextQuery(block: HostedZoneContextQueryDsl.() -> Unit = {}):
      HostedZoneContextQuery {
    val builder = HostedZoneContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun integManifest(block: IntegManifestDsl.() -> Unit = {}): IntegManifest {
    val builder = IntegManifestDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun keyContextQuery(block: KeyContextQueryDsl.() -> Unit = {}): KeyContextQuery {
    val builder = KeyContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancerContextQuery(block: LoadBalancerContextQueryDsl.() -> Unit = {}):
      LoadBalancerContextQuery {
    val builder = LoadBalancerContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancerFilter(block: LoadBalancerFilterDsl.() -> Unit = {}):
      LoadBalancerFilter {
    val builder = LoadBalancerFilterDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun loadBalancerListenerContextQuery(block: LoadBalancerListenerContextQueryDsl.() -> Unit =
      {}): LoadBalancerListenerContextQuery {
    val builder = LoadBalancerListenerContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadManifestOptions(block: LoadManifestOptionsDsl.() -> Unit = {}):
      LoadManifestOptions {
    val builder = LoadManifestOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metadataEntry(block: MetadataEntryDsl.() -> Unit = {}): MetadataEntry {
    val builder = MetadataEntryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun missingContext(block: MissingContextDsl.() -> Unit = {}): MissingContext {
    val builder = MissingContextDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun nestedCloudAssemblyProperties(block: NestedCloudAssemblyPropertiesDsl.() -> Unit
      = {}): NestedCloudAssemblyProperties {
    val builder = NestedCloudAssemblyPropertiesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun pluginContextQuery(block: PluginContextQueryDsl.() -> Unit = {}):
      PluginContextQuery {
    val builder = PluginContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun runtimeInfo(block: RuntimeInfoDsl.() -> Unit = {}): RuntimeInfo {
    val builder = RuntimeInfoDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sSMParameterContextQuery(block: SSMParameterContextQueryDsl.() -> Unit = {}):
      SSMParameterContextQuery {
    val builder = SSMParameterContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun securityGroupContextQuery(block: SecurityGroupContextQueryDsl.() -> Unit = {}):
      SecurityGroupContextQuery {
    val builder = SecurityGroupContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tag(block: TagDsl.() -> Unit = {}): Tag {
    val builder = TagDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun testCase(block: TestCaseDsl.() -> Unit = {}): TestCase {
    val builder = TestCaseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun testOptions(block: TestOptionsDsl.() -> Unit = {}): TestOptions {
    val builder = TestOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun treeArtifactProperties(block: TreeArtifactPropertiesDsl.() -> Unit = {}):
      TreeArtifactProperties {
    val builder = TreeArtifactPropertiesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcContextQuery(block: VpcContextQueryDsl.() -> Unit = {}): VpcContextQuery {
    val builder = VpcContextQueryDsl()
    builder.apply(block)
    return builder.build()
  }
}
