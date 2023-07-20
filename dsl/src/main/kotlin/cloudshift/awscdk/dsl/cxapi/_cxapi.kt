@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.AssemblyBuildOptions
import software.amazon.awscdk.cxapi.AssetManifestArtifact
import software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder
import software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps
import software.amazon.awscdk.cxapi.CloudFormationStackArtifact
import software.amazon.awscdk.cxapi.EndpointServiceAvailabilityZonesContextQuery
import software.amazon.awscdk.cxapi.Environment
import software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues
import software.amazon.awscdk.cxapi.KeyContextResponse
import software.amazon.awscdk.cxapi.LoadBalancerContextResponse
import software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse
import software.amazon.awscdk.cxapi.MetadataEntryResult
import software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact
import software.amazon.awscdk.cxapi.SecurityGroupContextResponse
import software.amazon.awscdk.cxapi.SynthesisMessage
import software.amazon.awscdk.cxapi.TreeCloudArtifact
import software.amazon.awscdk.cxapi.VpcContextResponse
import software.amazon.awscdk.cxapi.VpcSubnet
import software.amazon.awscdk.cxapi.VpcSubnetGroup

public object cxapi {
  public inline fun assemblyBuildOptions(block: AssemblyBuildOptionsDsl.() -> Unit = {}):
      AssemblyBuildOptions {
    val builder = AssemblyBuildOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun assetManifestArtifact(
    assembly: CloudAssembly,
    name: String,
    block: AssetManifestArtifactDsl.() -> Unit = {},
  ): AssetManifestArtifact {
    val builder = AssetManifestArtifactDsl(assembly, name)
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

  public inline fun cloudAssembly(directory: String, block: CloudAssemblyDsl.() -> Unit = {}):
      CloudAssembly {
    val builder = CloudAssemblyDsl(directory)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudAssemblyBuilder(outdir: String, block: CloudAssemblyBuilderDsl.() -> Unit =
      {}): CloudAssemblyBuilder {
    val builder = CloudAssemblyBuilderDsl(outdir)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudAssemblyBuilderProps(block: CloudAssemblyBuilderPropsDsl.() -> Unit = {}):
      CloudAssemblyBuilderProps {
    val builder = CloudAssemblyBuilderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudFormationStackArtifact(
    assembly: CloudAssembly,
    artifactId: String,
    block: CloudFormationStackArtifactDsl.() -> Unit = {},
  ): CloudFormationStackArtifact {
    val builder = CloudFormationStackArtifactDsl(assembly, artifactId)
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

  public inline fun environment(block: EnvironmentDsl.() -> Unit = {}): Environment {
    val builder = EnvironmentDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun environmentPlaceholderValues(block: EnvironmentPlaceholderValuesDsl.() -> Unit =
      {}): EnvironmentPlaceholderValues {
    val builder = EnvironmentPlaceholderValuesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun keyContextResponse(block: KeyContextResponseDsl.() -> Unit = {}):
      KeyContextResponse {
    val builder = KeyContextResponseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancerContextResponse(block: LoadBalancerContextResponseDsl.() -> Unit =
      {}): LoadBalancerContextResponse {
    val builder = LoadBalancerContextResponseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun loadBalancerListenerContextResponse(block: LoadBalancerListenerContextResponseDsl.() -> Unit
      = {}): LoadBalancerListenerContextResponse {
    val builder = LoadBalancerListenerContextResponseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metadataEntryResult(block: MetadataEntryResultDsl.() -> Unit = {}):
      MetadataEntryResult {
    val builder = MetadataEntryResultDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun nestedCloudAssemblyArtifact(
    assembly: CloudAssembly,
    name: String,
    block: NestedCloudAssemblyArtifactDsl.() -> Unit = {},
  ): NestedCloudAssemblyArtifact {
    val builder = NestedCloudAssemblyArtifactDsl(assembly, name)
    builder.apply(block)
    return builder.build()
  }

  public inline fun securityGroupContextResponse(block: SecurityGroupContextResponseDsl.() -> Unit =
      {}): SecurityGroupContextResponse {
    val builder = SecurityGroupContextResponseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun synthesisMessage(block: SynthesisMessageDsl.() -> Unit = {}): SynthesisMessage {
    val builder = SynthesisMessageDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun treeCloudArtifact(
    assembly: CloudAssembly,
    name: String,
    block: TreeCloudArtifactDsl.() -> Unit = {},
  ): TreeCloudArtifact {
    val builder = TreeCloudArtifactDsl(assembly, name)
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcContextResponse(block: VpcContextResponseDsl.() -> Unit = {}):
      VpcContextResponse {
    val builder = VpcContextResponseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcSubnet(block: VpcSubnetDsl.() -> Unit = {}): VpcSubnet {
    val builder = VpcSubnetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun vpcSubnetGroup(block: VpcSubnetGroupDsl.() -> Unit = {}): VpcSubnetGroup {
    val builder = VpcSubnetGroupDsl()
    builder.apply(block)
    return builder.build()
  }
}
