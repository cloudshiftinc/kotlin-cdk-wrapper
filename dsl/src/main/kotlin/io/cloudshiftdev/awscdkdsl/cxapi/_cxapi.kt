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

package io.cloudshiftdev.awscdkdsl.cxapi

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
    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * AssemblyBuildOptions assemblyBuildOptions = AssemblyBuildOptions.builder().build();
     * ```
     */
    public inline fun assemblyBuildOptions(
        block: AssemblyBuildOptionsDsl.() -> Unit = {}
    ): AssemblyBuildOptions {
        val builder = AssemblyBuildOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Asset manifest is a description of a set of assets which need to be built and published.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * import software.amazon.awscdk.cxapi.*;
     * CloudAssembly cloudAssembly;
     * AssetManifestArtifact assetManifestArtifact =
     * AssetManifestArtifact.Builder.create(cloudAssembly, "name")
     * .type(ArtifactType.NONE)
     * // the properties below are optional
     * .dependencies(List.of("dependencies"))
     * .displayName("displayName")
     * .environment("environment")
     * .metadata(Map.of(
     * "metadataKey", List.of(MetadataEntry.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .trace(List.of("trace"))
     * .build())))
     * .properties(AwsCloudFormationStackProperties.builder()
     * .templateFile("templateFile")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
     * .lookupRole(BootstrapRole.builder()
     * .arn("arn")
     * // the properties below are optional
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .requiresBootstrapStackVersion(123)
     * .build())
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .requiresBootstrapStackVersion(123)
     * .stackName("stackName")
     * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .terminationProtection(false)
     * .validateOnSynth(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun assetManifestArtifact(
        assembly: CloudAssembly,
        name: String,
        block: AssetManifestArtifactDsl.() -> Unit = {},
    ): AssetManifestArtifact {
        val builder = AssetManifestArtifactDsl(assembly, name)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Artifact properties for CloudFormation stacks.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * AwsCloudFormationStackProperties awsCloudFormationStackProperties =
     * AwsCloudFormationStackProperties.builder()
     * .templateFile("templateFile")
     * // the properties below are optional
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .stackName("stackName")
     * .terminationProtection(false)
     * .build();
     * ```
     */
    public inline fun awsCloudFormationStackProperties(
        block: AwsCloudFormationStackPropertiesDsl.() -> Unit = {}
    ): AwsCloudFormationStackProperties {
        val builder = AwsCloudFormationStackPropertiesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a deployable cloud application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * CloudAssembly cloudAssembly = CloudAssembly.Builder.create("directory")
     * .skipEnumCheck(false)
     * .skipVersionCheck(false)
     * .topoSort(false)
     * .build();
     * ```
     */
    public inline fun cloudAssembly(
        directory: String,
        block: CloudAssemblyDsl.() -> Unit = {}
    ): CloudAssembly {
        val builder = CloudAssemblyDsl(directory)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Can be used to build a cloud assembly.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * CloudAssemblyBuilder cloudAssemblyBuilder_;
     * CloudAssemblyBuilder cloudAssemblyBuilder = CloudAssemblyBuilder.Builder.create("outdir")
     * .assetOutdir("assetOutdir")
     * .parentBuilder(cloudAssemblyBuilder_)
     * .build();
     * ```
     */
    public inline fun cloudAssemblyBuilder(
        outdir: String,
        block: CloudAssemblyBuilderDsl.() -> Unit = {}
    ): CloudAssemblyBuilder {
        val builder = CloudAssemblyBuilderDsl(outdir)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for CloudAssemblyBuilder.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * CloudAssemblyBuilder cloudAssemblyBuilder;
     * CloudAssemblyBuilderProps cloudAssemblyBuilderProps = CloudAssemblyBuilderProps.builder()
     * .assetOutdir("assetOutdir")
     * .parentBuilder(cloudAssemblyBuilder)
     * .build();
     * ```
     */
    public inline fun cloudAssemblyBuilderProps(
        block: CloudAssemblyBuilderPropsDsl.() -> Unit = {}
    ): CloudAssemblyBuilderProps {
        val builder = CloudAssemblyBuilderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * import software.amazon.awscdk.cxapi.*;
     * CloudAssembly cloudAssembly;
     * CloudFormationStackArtifact cloudFormationStackArtifact =
     * CloudFormationStackArtifact.Builder.create(cloudAssembly, "artifactId")
     * .type(ArtifactType.NONE)
     * // the properties below are optional
     * .dependencies(List.of("dependencies"))
     * .displayName("displayName")
     * .environment("environment")
     * .metadata(Map.of(
     * "metadataKey", List.of(MetadataEntry.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .trace(List.of("trace"))
     * .build())))
     * .properties(AwsCloudFormationStackProperties.builder()
     * .templateFile("templateFile")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
     * .lookupRole(BootstrapRole.builder()
     * .arn("arn")
     * // the properties below are optional
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .requiresBootstrapStackVersion(123)
     * .build())
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .requiresBootstrapStackVersion(123)
     * .stackName("stackName")
     * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .terminationProtection(false)
     * .validateOnSynth(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun cloudFormationStackArtifact(
        assembly: CloudAssembly,
        artifactId: String,
        block: CloudFormationStackArtifactDsl.() -> Unit = {},
    ): CloudFormationStackArtifact {
        val builder = CloudFormationStackArtifactDsl(assembly, artifactId)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query to hosted zone context provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * EndpointServiceAvailabilityZonesContextQuery endpointServiceAvailabilityZonesContextQuery =
     * EndpointServiceAvailabilityZonesContextQuery.builder()
     * .account("account")
     * .region("region")
     * .serviceName("serviceName")
     * .build();
     * ```
     */
    public inline fun endpointServiceAvailabilityZonesContextQuery(
        block: EndpointServiceAvailabilityZonesContextQueryDsl.() -> Unit = {}
    ): EndpointServiceAvailabilityZonesContextQuery {
        val builder = EndpointServiceAvailabilityZonesContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Models an AWS execution environment, for use within the CDK toolkit.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * Environment environment = Environment.builder()
     * .account("account")
     * .name("name")
     * .region("region")
     * .build();
     * ```
     */
    public inline fun environment(block: EnvironmentDsl.() -> Unit = {}): Environment {
        val builder = EnvironmentDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Return the appropriate values for the environment placeholders.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * EnvironmentPlaceholderValues environmentPlaceholderValues =
     * EnvironmentPlaceholderValues.builder()
     * .accountId("accountId")
     * .partition("partition")
     * .region("region")
     * .build();
     * ```
     */
    public inline fun environmentPlaceholderValues(
        block: EnvironmentPlaceholderValuesDsl.() -> Unit = {}
    ): EnvironmentPlaceholderValues {
        val builder = EnvironmentPlaceholderValuesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a discovered key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * KeyContextResponse keyContextResponse = KeyContextResponse.builder()
     * .keyId("keyId")
     * .build();
     * ```
     */
    public inline fun keyContextResponse(
        block: KeyContextResponseDsl.() -> Unit = {}
    ): KeyContextResponse {
        val builder = KeyContextResponseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a discovered load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * LoadBalancerContextResponse loadBalancerContextResponse = LoadBalancerContextResponse.builder()
     * .ipAddressType(LoadBalancerIpAddressType.IPV4)
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerCanonicalHostedZoneId("loadBalancerCanonicalHostedZoneId")
     * .loadBalancerDnsName("loadBalancerDnsName")
     * .securityGroupIds(List.of("securityGroupIds"))
     * .vpcId("vpcId")
     * .build();
     * ```
     */
    public inline fun loadBalancerContextResponse(
        block: LoadBalancerContextResponseDsl.() -> Unit = {}
    ): LoadBalancerContextResponse {
        val builder = LoadBalancerContextResponseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a discovered load balancer listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * LoadBalancerListenerContextResponse loadBalancerListenerContextResponse =
     * LoadBalancerListenerContextResponse.builder()
     * .listenerArn("listenerArn")
     * .listenerPort(123)
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build();
     * ```
     */
    public inline fun loadBalancerListenerContextResponse(
        block: LoadBalancerListenerContextResponseDsl.() -> Unit = {}
    ): LoadBalancerListenerContextResponse {
        val builder = LoadBalancerListenerContextResponseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * MetadataEntryResult metadataEntryResult = MetadataEntryResult.builder()
     * .path("path")
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .trace(List.of("trace"))
     * .build();
     * ```
     */
    public inline fun metadataEntryResult(
        block: MetadataEntryResultDsl.() -> Unit = {}
    ): MetadataEntryResult {
        val builder = MetadataEntryResultDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Asset manifest is a description of a set of assets which need to be built and published.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * import software.amazon.awscdk.cxapi.*;
     * CloudAssembly cloudAssembly;
     * NestedCloudAssemblyArtifact nestedCloudAssemblyArtifact =
     * NestedCloudAssemblyArtifact.Builder.create(cloudAssembly, "name")
     * .type(ArtifactType.NONE)
     * // the properties below are optional
     * .dependencies(List.of("dependencies"))
     * .displayName("displayName")
     * .environment("environment")
     * .metadata(Map.of(
     * "metadataKey", List.of(MetadataEntry.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .trace(List.of("trace"))
     * .build())))
     * .properties(AwsCloudFormationStackProperties.builder()
     * .templateFile("templateFile")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
     * .lookupRole(BootstrapRole.builder()
     * .arn("arn")
     * // the properties below are optional
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .requiresBootstrapStackVersion(123)
     * .build())
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .requiresBootstrapStackVersion(123)
     * .stackName("stackName")
     * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .terminationProtection(false)
     * .validateOnSynth(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun nestedCloudAssemblyArtifact(
        assembly: CloudAssembly,
        name: String,
        block: NestedCloudAssemblyArtifactDsl.() -> Unit = {},
    ): NestedCloudAssemblyArtifact {
        val builder = NestedCloudAssemblyArtifactDsl(assembly, name)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a discovered SecurityGroup.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * SecurityGroupContextResponse securityGroupContextResponse =
     * SecurityGroupContextResponse.builder()
     * .allowAllOutbound(false)
     * .securityGroupId("securityGroupId")
     * .build();
     * ```
     */
    public inline fun securityGroupContextResponse(
        block: SecurityGroupContextResponseDsl.() -> Unit = {}
    ): SecurityGroupContextResponse {
        val builder = SecurityGroupContextResponseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * SynthesisMessage synthesisMessage = SynthesisMessage.builder()
     * .entry(MetadataEntry.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .trace(List.of("trace"))
     * .build())
     * .id("id")
     * .level(SynthesisMessageLevel.INFO)
     * .build();
     * ```
     */
    public inline fun synthesisMessage(
        block: SynthesisMessageDsl.() -> Unit = {}
    ): SynthesisMessage {
        val builder = SynthesisMessageDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * import software.amazon.awscdk.cxapi.*;
     * CloudAssembly cloudAssembly;
     * TreeCloudArtifact treeCloudArtifact = TreeCloudArtifact.Builder.create(cloudAssembly, "name")
     * .type(ArtifactType.NONE)
     * // the properties below are optional
     * .dependencies(List.of("dependencies"))
     * .displayName("displayName")
     * .environment("environment")
     * .metadata(Map.of(
     * "metadataKey", List.of(MetadataEntry.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .trace(List.of("trace"))
     * .build())))
     * .properties(AwsCloudFormationStackProperties.builder()
     * .templateFile("templateFile")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
     * .lookupRole(BootstrapRole.builder()
     * .arn("arn")
     * // the properties below are optional
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .requiresBootstrapStackVersion(123)
     * .build())
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .requiresBootstrapStackVersion(123)
     * .stackName("stackName")
     * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .terminationProtection(false)
     * .validateOnSynth(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun treeCloudArtifact(
        assembly: CloudAssembly,
        name: String,
        block: TreeCloudArtifactDsl.() -> Unit = {},
    ): TreeCloudArtifact {
        val builder = TreeCloudArtifactDsl(assembly, name)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a discovered VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * VpcContextResponse vpcContextResponse = VpcContextResponse.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .isolatedSubnetIds(List.of("isolatedSubnetIds"))
     * .isolatedSubnetNames(List.of("isolatedSubnetNames"))
     * .isolatedSubnetRouteTableIds(List.of("isolatedSubnetRouteTableIds"))
     * .ownerAccountId("ownerAccountId")
     * .privateSubnetIds(List.of("privateSubnetIds"))
     * .privateSubnetNames(List.of("privateSubnetNames"))
     * .privateSubnetRouteTableIds(List.of("privateSubnetRouteTableIds"))
     * .publicSubnetIds(List.of("publicSubnetIds"))
     * .publicSubnetNames(List.of("publicSubnetNames"))
     * .publicSubnetRouteTableIds(List.of("publicSubnetRouteTableIds"))
     * .region("region")
     * .subnetGroups(List.of(VpcSubnetGroup.builder()
     * .name("name")
     * .subnets(List.of(VpcSubnet.builder()
     * .availabilityZone("availabilityZone")
     * .routeTableId("routeTableId")
     * .subnetId("subnetId")
     * // the properties below are optional
     * .cidr("cidr")
     * .build()))
     * .type(VpcSubnetGroupType.PUBLIC)
     * .build()))
     * .vpcCidrBlock("vpcCidrBlock")
     * .vpnGatewayId("vpnGatewayId")
     * .build();
     * ```
     */
    public inline fun vpcContextResponse(
        block: VpcContextResponseDsl.() -> Unit = {}
    ): VpcContextResponse {
        val builder = VpcContextResponseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A subnet representation that the VPC provider uses.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * VpcSubnet vpcSubnet = VpcSubnet.builder()
     * .availabilityZone("availabilityZone")
     * .routeTableId("routeTableId")
     * .subnetId("subnetId")
     * // the properties below are optional
     * .cidr("cidr")
     * .build();
     * ```
     */
    public inline fun vpcSubnet(block: VpcSubnetDsl.() -> Unit = {}): VpcSubnet {
        val builder = VpcSubnetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A group of subnets returned by the VPC provider.
     *
     * The included subnets do NOT have to be symmetric!
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cxapi.*;
     * VpcSubnetGroup vpcSubnetGroup = VpcSubnetGroup.builder()
     * .name("name")
     * .subnets(List.of(VpcSubnet.builder()
     * .availabilityZone("availabilityZone")
     * .routeTableId("routeTableId")
     * .subnetId("subnetId")
     * // the properties below are optional
     * .cidr("cidr")
     * .build()))
     * .type(VpcSubnetGroupType.PUBLIC)
     * .build();
     * ```
     */
    public inline fun vpcSubnetGroup(block: VpcSubnetGroupDsl.() -> Unit = {}): VpcSubnetGroup {
        val builder = VpcSubnetGroupDsl()
        builder.apply(block)
        return builder.build()
    }
}
