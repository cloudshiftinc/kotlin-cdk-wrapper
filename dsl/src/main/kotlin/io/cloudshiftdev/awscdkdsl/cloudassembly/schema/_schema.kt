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

package io.cloudshiftdev.awscdkdsl.cloudassembly.schema

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
    /**
     * Query to AMI context provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * AmiContextQuery amiContextQuery = AmiContextQuery.builder()
     * .account("account")
     * .filters(Map.of(
     * "filtersKey", List.of("filters")))
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .owners(List.of("owners"))
     * .build();
     * ```
     */
    public inline fun amiContextQuery(block: AmiContextQueryDsl.() -> Unit = {}): AmiContextQuery {
        val builder = AmiContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A manifest for a single artifact within the cloud assembly.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * ArtifactManifest artifactManifest = ArtifactManifest.builder()
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
    public inline fun artifactManifest(
        block: ArtifactManifestDsl.() -> Unit = {}
    ): ArtifactManifest {
        val builder = ArtifactManifestDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A manifest which describes the cloud assembly.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * AssemblyManifest assemblyManifest = AssemblyManifest.builder()
     * .version("version")
     * // the properties below are optional
     * .artifacts(Map.of(
     * "artifactsKey", ArtifactManifest.builder()
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
     * .build()))
     * .missing(List.of(MissingContext.builder()
     * .key("key")
     * .props(AmiContextQuery.builder()
     * .account("account")
     * .filters(Map.of(
     * "filtersKey", List.of("filters")))
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .owners(List.of("owners"))
     * .build())
     * .provider(ContextProvider.AMI_PROVIDER)
     * .build()))
     * .runtime(RuntimeInfo.builder()
     * .libraries(Map.of(
     * "librariesKey", "libraries"))
     * .build())
     * .build();
     * ```
     */
    public inline fun assemblyManifest(
        block: AssemblyManifestDsl.() -> Unit = {}
    ): AssemblyManifest {
        val builder = AssemblyManifestDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Definitions for the asset manifest.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * AssetManifest assetManifest = AssetManifest.builder()
     * .version("version")
     * // the properties below are optional
     * .dockerImages(Map.of(
     * "dockerImagesKey", DockerImageAsset.builder()
     * .destinations(Map.of(
     * "destinationsKey", DockerImageDestination.builder()
     * .imageTag("imageTag")
     * .repositoryName("repositoryName")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .region("region")
     * .build()))
     * .source(DockerImageSource.builder()
     * .cacheDisabled(false)
     * .cacheFrom(List.of(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build()))
     * .cacheTo(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build())
     * .directory("directory")
     * .dockerBuildArgs(Map.of(
     * "dockerBuildArgsKey", "dockerBuildArgs"))
     * .dockerBuildSecrets(Map.of(
     * "dockerBuildSecretsKey", "dockerBuildSecrets"))
     * .dockerBuildSsh("dockerBuildSsh")
     * .dockerBuildTarget("dockerBuildTarget")
     * .dockerFile("dockerFile")
     * .dockerOutputs(List.of("dockerOutputs"))
     * .executable(List.of("executable"))
     * .networkMode("networkMode")
     * .platform("platform")
     * .build())
     * .build()))
     * .files(Map.of(
     * "filesKey", FileAsset.builder()
     * .destinations(Map.of(
     * "destinationsKey", FileDestination.builder()
     * .bucketName("bucketName")
     * .objectKey("objectKey")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .region("region")
     * .build()))
     * .source(FileSource.builder()
     * .executable(List.of("executable"))
     * .packaging(FileAssetPackaging.FILE)
     * .path("path")
     * .build())
     * .build()))
     * .build();
     * ```
     */
    public inline fun assetManifest(block: AssetManifestDsl.() -> Unit = {}): AssetManifest {
        val builder = AssetManifestDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for the Asset Manifest.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * AssetManifestOptions assetManifestOptions = AssetManifestOptions.builder()
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .requiresBootstrapStackVersion(123)
     * .build();
     * ```
     */
    public inline fun assetManifestOptions(
        block: AssetManifestOptionsDsl.() -> Unit = {}
    ): AssetManifestOptions {
        val builder = AssetManifestOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Artifact properties for the Asset Manifest.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * AssetManifestProperties assetManifestProperties = AssetManifestProperties.builder()
     * .file("file")
     * // the properties below are optional
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .requiresBootstrapStackVersion(123)
     * .build();
     * ```
     */
    public inline fun assetManifestProperties(
        block: AssetManifestPropertiesDsl.() -> Unit = {}
    ): AssetManifestProperties {
        val builder = AssetManifestPropertiesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query to availability zone context provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * AvailabilityZonesContextQuery availabilityZonesContextQuery =
     * AvailabilityZonesContextQuery.builder()
     * .account("account")
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .build();
     * ```
     */
    public inline fun availabilityZonesContextQuery(
        block: AvailabilityZonesContextQueryDsl.() -> Unit = {}
    ): AvailabilityZonesContextQuery {
        val builder = AvailabilityZonesContextQueryDsl()
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
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * AwsCloudFormationStackProperties awsCloudFormationStackProperties =
     * AwsCloudFormationStackProperties.builder()
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
     * Destination for assets that need to be uploaded to AWS.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * AwsDestination awsDestination = AwsDestination.builder()
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .region("region")
     * .build();
     * ```
     */
    public inline fun awsDestination(block: AwsDestinationDsl.() -> Unit = {}): AwsDestination {
        val builder = AwsDestinationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information needed to access an IAM role created as part of the bootstrap process.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * BootstrapRole bootstrapRole = BootstrapRole.builder()
     * .arn("arn")
     * // the properties below are optional
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
     * .requiresBootstrapStackVersion(123)
     * .build();
     * ```
     */
    public inline fun bootstrapRole(block: BootstrapRoleDsl.() -> Unit = {}): BootstrapRole {
        val builder = BootstrapRoleDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a cdk command i.e. `synth`, `deploy`, &amp; `destroy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * CdkCommand cdkCommand = CdkCommand.builder()
     * .enabled(false)
     * .expectedMessage("expectedMessage")
     * .expectError(false)
     * .build();
     * ```
     */
    public inline fun cdkCommand(block: CdkCommandDsl.() -> Unit = {}): CdkCommand {
        val builder = CdkCommandDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for specific cdk commands that are run as part of the integration test workflow.
     *
     * Example:
     * ```
     * App app = new App();
     * Stack stackUnderTest = new Stack(app, "StackUnderTest");
     * Stack stack = new Stack(app, "stack");
     * IntegTest testCase = IntegTest.Builder.create(app, "CustomizedDeploymentWorkflow")
     * .testCases(List.of(stackUnderTest))
     * .diffAssets(true)
     * .stackUpdateWorkflow(true)
     * .cdkCommandOptions(CdkCommands.builder()
     * .deploy(DeployCommand.builder()
     * .args(DeployOptions.builder()
     * .requireApproval(RequireApproval.NEVER)
     * .json(true)
     * .build())
     * .build())
     * .destroy(DestroyCommand.builder()
     * .args(DestroyOptions.builder()
     * .force(true)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun cdkCommands(block: CdkCommandsDsl.() -> Unit = {}): CdkCommands {
        val builder = CdkCommandsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring the Docker cache backend.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * ContainerImageAssetCacheOption containerImageAssetCacheOption =
     * ContainerImageAssetCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build();
     * ```
     */
    public inline fun containerImageAssetCacheOption(
        block: ContainerImageAssetCacheOptionDsl.() -> Unit = {}
    ): ContainerImageAssetCacheOption {
        val builder = ContainerImageAssetCacheOptionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata Entry spec for container images.
     *
     * Example:
     * ```
     * Map&lt;String, String&gt; entry = Map.of(
     * "packaging", "container-image",
     * "repositoryName", "repository-name",
     * "imageTag", "tag");
     * ```
     */
    public inline fun containerImageAssetMetadataEntry(
        block: ContainerImageAssetMetadataEntryDsl.() -> Unit = {}
    ): ContainerImageAssetMetadataEntry {
        val builder = ContainerImageAssetMetadataEntryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Default CDK CLI options that apply to all commands.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * DefaultCdkOptions defaultCdkOptions = DefaultCdkOptions.builder()
     * .all(false)
     * .app("app")
     * .assetMetadata(false)
     * .caBundlePath("caBundlePath")
     * .color(false)
     * .context(Map.of(
     * "contextKey", "context"))
     * .debug(false)
     * .ec2Creds(false)
     * .ignoreErrors(false)
     * .json(false)
     * .lookups(false)
     * .notices(false)
     * .output("output")
     * .pathMetadata(false)
     * .profile("profile")
     * .proxy("proxy")
     * .roleArn("roleArn")
     * .stacks(List.of("stacks"))
     * .staging(false)
     * .strict(false)
     * .trace(false)
     * .verbose(false)
     * .versionReporting(false)
     * .build();
     * ```
     */
    public inline fun defaultCdkOptions(
        block: DefaultCdkOptionsDsl.() -> Unit = {}
    ): DefaultCdkOptions {
        val builder = DefaultCdkOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a cdk deploy command.
     *
     * Example:
     * ```
     * App app = new App();
     * Stack stackUnderTest = new Stack(app, "StackUnderTest");
     * Stack stack = new Stack(app, "stack");
     * IntegTest testCase = IntegTest.Builder.create(app, "CustomizedDeploymentWorkflow")
     * .testCases(List.of(stackUnderTest))
     * .diffAssets(true)
     * .stackUpdateWorkflow(true)
     * .cdkCommandOptions(CdkCommands.builder()
     * .deploy(DeployCommand.builder()
     * .args(DeployOptions.builder()
     * .requireApproval(RequireApproval.NEVER)
     * .json(true)
     * .build())
     * .build())
     * .destroy(DestroyCommand.builder()
     * .args(DestroyOptions.builder()
     * .force(true)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun deployCommand(block: DeployCommandDsl.() -> Unit = {}): DeployCommand {
        val builder = DeployCommandDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to use with cdk deploy.
     *
     * Example:
     * ```
     * App app = new App();
     * Stack stackUnderTest = new Stack(app, "StackUnderTest");
     * Stack stack = new Stack(app, "stack");
     * IntegTest testCase = IntegTest.Builder.create(app, "CustomizedDeploymentWorkflow")
     * .testCases(List.of(stackUnderTest))
     * .diffAssets(true)
     * .stackUpdateWorkflow(true)
     * .cdkCommandOptions(CdkCommands.builder()
     * .deploy(DeployCommand.builder()
     * .args(DeployOptions.builder()
     * .requireApproval(RequireApproval.NEVER)
     * .json(true)
     * .build())
     * .build())
     * .destroy(DestroyCommand.builder()
     * .args(DestroyOptions.builder()
     * .force(true)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun deployOptions(block: DeployOptionsDsl.() -> Unit = {}): DeployOptions {
        val builder = DeployOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a cdk destroy command.
     *
     * Example:
     * ```
     * App app = new App();
     * Stack stackUnderTest = new Stack(app, "StackUnderTest");
     * Stack stack = new Stack(app, "stack");
     * IntegTest testCase = IntegTest.Builder.create(app, "CustomizedDeploymentWorkflow")
     * .testCases(List.of(stackUnderTest))
     * .diffAssets(true)
     * .stackUpdateWorkflow(true)
     * .cdkCommandOptions(CdkCommands.builder()
     * .deploy(DeployCommand.builder()
     * .args(DeployOptions.builder()
     * .requireApproval(RequireApproval.NEVER)
     * .json(true)
     * .build())
     * .build())
     * .destroy(DestroyCommand.builder()
     * .args(DestroyOptions.builder()
     * .force(true)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun destroyCommand(block: DestroyCommandDsl.() -> Unit = {}): DestroyCommand {
        val builder = DestroyCommandDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to use with cdk destroy.
     *
     * Example:
     * ```
     * App app = new App();
     * Stack stackUnderTest = new Stack(app, "StackUnderTest");
     * Stack stack = new Stack(app, "stack");
     * IntegTest testCase = IntegTest.Builder.create(app, "CustomizedDeploymentWorkflow")
     * .testCases(List.of(stackUnderTest))
     * .diffAssets(true)
     * .stackUpdateWorkflow(true)
     * .cdkCommandOptions(CdkCommands.builder()
     * .deploy(DeployCommand.builder()
     * .args(DeployOptions.builder()
     * .requireApproval(RequireApproval.NEVER)
     * .json(true)
     * .build())
     * .build())
     * .destroy(DestroyCommand.builder()
     * .args(DestroyOptions.builder()
     * .force(true)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun destroyOptions(block: DestroyOptionsDsl.() -> Unit = {}): DestroyOptions {
        val builder = DestroyOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring the Docker cache backend.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * DockerCacheOption dockerCacheOption = DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build();
     * ```
     */
    public inline fun dockerCacheOption(
        block: DockerCacheOptionDsl.() -> Unit = {}
    ): DockerCacheOption {
        val builder = DockerCacheOptionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A file asset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * DockerImageAsset dockerImageAsset = DockerImageAsset.builder()
     * .destinations(Map.of(
     * "destinationsKey", DockerImageDestination.builder()
     * .imageTag("imageTag")
     * .repositoryName("repositoryName")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .region("region")
     * .build()))
     * .source(DockerImageSource.builder()
     * .cacheDisabled(false)
     * .cacheFrom(List.of(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build()))
     * .cacheTo(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build())
     * .directory("directory")
     * .dockerBuildArgs(Map.of(
     * "dockerBuildArgsKey", "dockerBuildArgs"))
     * .dockerBuildSecrets(Map.of(
     * "dockerBuildSecretsKey", "dockerBuildSecrets"))
     * .dockerBuildSsh("dockerBuildSsh")
     * .dockerBuildTarget("dockerBuildTarget")
     * .dockerFile("dockerFile")
     * .dockerOutputs(List.of("dockerOutputs"))
     * .executable(List.of("executable"))
     * .networkMode("networkMode")
     * .platform("platform")
     * .build())
     * .build();
     * ```
     */
    public inline fun dockerImageAsset(
        block: DockerImageAssetDsl.() -> Unit = {}
    ): DockerImageAsset {
        val builder = DockerImageAssetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Where to publish docker images.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * DockerImageDestination dockerImageDestination = DockerImageDestination.builder()
     * .imageTag("imageTag")
     * .repositoryName("repositoryName")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .region("region")
     * .build();
     * ```
     */
    public inline fun dockerImageDestination(
        block: DockerImageDestinationDsl.() -> Unit = {}
    ): DockerImageDestination {
        val builder = DockerImageDestinationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for how to produce a Docker image from a source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * DockerImageSource dockerImageSource = DockerImageSource.builder()
     * .cacheDisabled(false)
     * .cacheFrom(List.of(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build()))
     * .cacheTo(DockerCacheOption.builder()
     * .type("type")
     * // the properties below are optional
     * .params(Map.of(
     * "paramsKey", "params"))
     * .build())
     * .directory("directory")
     * .dockerBuildArgs(Map.of(
     * "dockerBuildArgsKey", "dockerBuildArgs"))
     * .dockerBuildSecrets(Map.of(
     * "dockerBuildSecretsKey", "dockerBuildSecrets"))
     * .dockerBuildSsh("dockerBuildSsh")
     * .dockerBuildTarget("dockerBuildTarget")
     * .dockerFile("dockerFile")
     * .dockerOutputs(List.of("dockerOutputs"))
     * .executable(List.of("executable"))
     * .networkMode("networkMode")
     * .platform("platform")
     * .build();
     * ```
     */
    public inline fun dockerImageSource(
        block: DockerImageSourceDsl.() -> Unit = {}
    ): DockerImageSource {
        val builder = DockerImageSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query to endpoint service context provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * EndpointServiceAvailabilityZonesContextQuery endpointServiceAvailabilityZonesContextQuery =
     * EndpointServiceAvailabilityZonesContextQuery.builder()
     * .account("account")
     * .region("region")
     * .serviceName("serviceName")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
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
     * A file asset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * FileAsset fileAsset = FileAsset.builder()
     * .destinations(Map.of(
     * "destinationsKey", FileDestination.builder()
     * .bucketName("bucketName")
     * .objectKey("objectKey")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .region("region")
     * .build()))
     * .source(FileSource.builder()
     * .executable(List.of("executable"))
     * .packaging(FileAssetPackaging.FILE)
     * .path("path")
     * .build())
     * .build();
     * ```
     */
    public inline fun fileAsset(block: FileAssetDsl.() -> Unit = {}): FileAsset {
        val builder = FileAssetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata Entry spec for files.
     *
     * Example:
     * ```
     * Map&lt;String, String&gt; entry = Map.of(
     * "packaging", "file",
     * "s3BucketParameter", "bucket-parameter",
     * "s3KeyParamenter", "key-parameter",
     * "artifactHashParameter", "hash-parameter");
     * ```
     */
    public inline fun fileAssetMetadataEntry(
        block: FileAssetMetadataEntryDsl.() -> Unit = {}
    ): FileAssetMetadataEntry {
        val builder = FileAssetMetadataEntryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Where in S3 a file asset needs to be published.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * FileDestination fileDestination = FileDestination.builder()
     * .bucketName("bucketName")
     * .objectKey("objectKey")
     * // the properties below are optional
     * .assumeRoleArn("assumeRoleArn")
     * .assumeRoleExternalId("assumeRoleExternalId")
     * .region("region")
     * .build();
     * ```
     */
    public inline fun fileDestination(block: FileDestinationDsl.() -> Unit = {}): FileDestination {
        val builder = FileDestinationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describe the source of a file asset.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * FileSource fileSource = FileSource.builder()
     * .executable(List.of("executable"))
     * .packaging(FileAssetPackaging.FILE)
     * .path("path")
     * .build();
     * ```
     */
    public inline fun fileSource(block: FileSourceDsl.() -> Unit = {}): FileSource {
        val builder = FileSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Commands to run at predefined points during the integration test workflow.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * Hooks hooks = Hooks.builder()
     * .postDeploy(List.of("postDeploy"))
     * .postDestroy(List.of("postDestroy"))
     * .preDeploy(List.of("preDeploy"))
     * .preDestroy(List.of("preDestroy"))
     * .build();
     * ```
     */
    public inline fun hooks(block: HooksDsl.() -> Unit = {}): Hooks {
        val builder = HooksDsl()
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
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * HostedZoneContextQuery hostedZoneContextQuery = HostedZoneContextQuery.builder()
     * .account("account")
     * .domainName("domainName")
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .privateZone(false)
     * .vpcId("vpcId")
     * .build();
     * ```
     */
    public inline fun hostedZoneContextQuery(
        block: HostedZoneContextQueryDsl.() -> Unit = {}
    ): HostedZoneContextQuery {
        val builder = HostedZoneContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Definitions for the integration testing manifest.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * IntegManifest integManifest = IntegManifest.builder()
     * .testCases(Map.of(
     * "testCasesKey", TestCase.builder()
     * .stacks(List.of("stacks"))
     * // the properties below are optional
     * .allowDestroy(List.of("allowDestroy"))
     * .assertionStack("assertionStack")
     * .assertionStackName("assertionStackName")
     * .cdkCommandOptions(CdkCommands.builder()
     * .deploy(DeployCommand.builder()
     * .args(DeployOptions.builder()
     * .all(false)
     * .app("app")
     * .assetMetadata(false)
     * .caBundlePath("caBundlePath")
     * .changeSetName("changeSetName")
     * .ci(false)
     * .color(false)
     * .concurrency(123)
     * .context(Map.of(
     * "contextKey", "context"))
     * .debug(false)
     * .ec2Creds(false)
     * .exclusively(false)
     * .execute(false)
     * .force(false)
     * .ignoreErrors(false)
     * .json(false)
     * .lookups(false)
     * .notices(false)
     * .notificationArns(List.of("notificationArns"))
     * .output("output")
     * .outputsFile("outputsFile")
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .pathMetadata(false)
     * .profile("profile")
     * .proxy("proxy")
     * .requireApproval(RequireApproval.NEVER)
     * .reuseAssets(List.of("reuseAssets"))
     * .roleArn("roleArn")
     * .rollback(false)
     * .stacks(List.of("stacks"))
     * .staging(false)
     * .strict(false)
     * .toolkitStackName("toolkitStackName")
     * .trace(false)
     * .usePreviousParameters(false)
     * .verbose(false)
     * .versionReporting(false)
     * .build())
     * .enabled(false)
     * .expectedMessage("expectedMessage")
     * .expectError(false)
     * .build())
     * .destroy(DestroyCommand.builder()
     * .args(DestroyOptions.builder()
     * .all(false)
     * .app("app")
     * .assetMetadata(false)
     * .caBundlePath("caBundlePath")
     * .color(false)
     * .context(Map.of(
     * "contextKey", "context"))
     * .debug(false)
     * .ec2Creds(false)
     * .exclusively(false)
     * .force(false)
     * .ignoreErrors(false)
     * .json(false)
     * .lookups(false)
     * .notices(false)
     * .output("output")
     * .pathMetadata(false)
     * .profile("profile")
     * .proxy("proxy")
     * .roleArn("roleArn")
     * .stacks(List.of("stacks"))
     * .staging(false)
     * .strict(false)
     * .trace(false)
     * .verbose(false)
     * .versionReporting(false)
     * .build())
     * .enabled(false)
     * .expectedMessage("expectedMessage")
     * .expectError(false)
     * .build())
     * .build())
     * .diffAssets(false)
     * .hooks(Hooks.builder()
     * .postDeploy(List.of("postDeploy"))
     * .postDestroy(List.of("postDestroy"))
     * .preDeploy(List.of("preDeploy"))
     * .preDestroy(List.of("preDestroy"))
     * .build())
     * .regions(List.of("regions"))
     * .stackUpdateWorkflow(false)
     * .build()))
     * .version("version")
     * // the properties below are optional
     * .enableLookups(false)
     * .synthContext(Map.of(
     * "synthContextKey", "synthContext"))
     * .build();
     * ```
     */
    public inline fun integManifest(block: IntegManifestDsl.() -> Unit = {}): IntegManifest {
        val builder = IntegManifestDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query input for looking up a KMS Key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * KeyContextQuery keyContextQuery = KeyContextQuery.builder()
     * .account("account")
     * .aliasName("aliasName")
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .build();
     * ```
     */
    public inline fun keyContextQuery(block: KeyContextQueryDsl.() -> Unit = {}): KeyContextQuery {
        val builder = KeyContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query input for looking up a load balancer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * LoadBalancerContextQuery loadBalancerContextQuery = LoadBalancerContextQuery.builder()
     * .account("account")
     * .loadBalancerType(LoadBalancerType.NETWORK)
     * .region("region")
     * // the properties below are optional
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerTags(List.of(Tag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .lookupRoleArn("lookupRoleArn")
     * .build();
     * ```
     */
    public inline fun loadBalancerContextQuery(
        block: LoadBalancerContextQueryDsl.() -> Unit = {}
    ): LoadBalancerContextQuery {
        val builder = LoadBalancerContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Filters for selecting load balancers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * LoadBalancerFilter loadBalancerFilter = LoadBalancerFilter.builder()
     * .loadBalancerType(LoadBalancerType.NETWORK)
     * // the properties below are optional
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerTags(List.of(Tag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     */
    public inline fun loadBalancerFilter(
        block: LoadBalancerFilterDsl.() -> Unit = {}
    ): LoadBalancerFilter {
        val builder = LoadBalancerFilterDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query input for looking up a load balancer listener.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * LoadBalancerListenerContextQuery loadBalancerListenerContextQuery =
     * LoadBalancerListenerContextQuery.builder()
     * .account("account")
     * .loadBalancerType(LoadBalancerType.NETWORK)
     * .region("region")
     * // the properties below are optional
     * .listenerArn("listenerArn")
     * .listenerPort(123)
     * .listenerProtocol(LoadBalancerListenerProtocol.HTTP)
     * .loadBalancerArn("loadBalancerArn")
     * .loadBalancerTags(List.of(Tag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .lookupRoleArn("lookupRoleArn")
     * .build();
     * ```
     */
    public inline fun loadBalancerListenerContextQuery(
        block: LoadBalancerListenerContextQueryDsl.() -> Unit = {}
    ): LoadBalancerListenerContextQuery {
        val builder = LoadBalancerListenerContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the loadManifest operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * LoadManifestOptions loadManifestOptions = LoadManifestOptions.builder()
     * .skipEnumCheck(false)
     * .skipVersionCheck(false)
     * .topoSort(false)
     * .build();
     * ```
     */
    public inline fun loadManifestOptions(
        block: LoadManifestOptionsDsl.() -> Unit = {}
    ): LoadManifestOptions {
        val builder = LoadManifestOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A metadata entry in a cloud assembly artifact.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * MetadataEntry metadataEntry = MetadataEntry.builder()
     * .type("type")
     * // the properties below are optional
     * .data("data")
     * .trace(List.of("trace"))
     * .build();
     * ```
     */
    public inline fun metadataEntry(block: MetadataEntryDsl.() -> Unit = {}): MetadataEntry {
        val builder = MetadataEntryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a missing piece of context.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * MissingContext missingContext = MissingContext.builder()
     * .key("key")
     * .props(AmiContextQuery.builder()
     * .account("account")
     * .filters(Map.of(
     * "filtersKey", List.of("filters")))
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .owners(List.of("owners"))
     * .build())
     * .provider(ContextProvider.AMI_PROVIDER)
     * .build();
     * ```
     */
    public inline fun missingContext(block: MissingContextDsl.() -> Unit = {}): MissingContext {
        val builder = MissingContextDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Artifact properties for nested cloud assemblies.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * NestedCloudAssemblyProperties nestedCloudAssemblyProperties =
     * NestedCloudAssemblyProperties.builder()
     * .directoryName("directoryName")
     * // the properties below are optional
     * .displayName("displayName")
     * .build();
     * ```
     */
    public inline fun nestedCloudAssemblyProperties(
        block: NestedCloudAssemblyPropertiesDsl.() -> Unit = {}
    ): NestedCloudAssemblyProperties {
        val builder = NestedCloudAssemblyPropertiesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query input for plugins.
     *
     * This alternate branch is necessary because it needs to be able to escape all type checking we
     * do on on the cloud assembly -- we cannot know the properties that will be used a priori.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * PluginContextQuery pluginContextQuery = PluginContextQuery.builder()
     * .pluginName("pluginName")
     * .build();
     * ```
     */
    public inline fun pluginContextQuery(
        block: PluginContextQueryDsl.() -> Unit = {}
    ): PluginContextQuery {
        val builder = PluginContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the application's runtime components.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * RuntimeInfo runtimeInfo = RuntimeInfo.builder()
     * .libraries(Map.of(
     * "librariesKey", "libraries"))
     * .build();
     * ```
     */
    public inline fun runtimeInfo(block: RuntimeInfoDsl.() -> Unit = {}): RuntimeInfo {
        val builder = RuntimeInfoDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query to SSM Parameter Context Provider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * SSMParameterContextQuery sSMParameterContextQuery = SSMParameterContextQuery.builder()
     * .account("account")
     * .parameterName("parameterName")
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .build();
     * ```
     */
    public inline fun sSMParameterContextQuery(
        block: SSMParameterContextQueryDsl.() -> Unit = {}
    ): SSMParameterContextQuery {
        val builder = SSMParameterContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query input for looking up a security group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * SecurityGroupContextQuery securityGroupContextQuery = SecurityGroupContextQuery.builder()
     * .account("account")
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .securityGroupId("securityGroupId")
     * .securityGroupName("securityGroupName")
     * .vpcId("vpcId")
     * .build();
     * ```
     */
    public inline fun securityGroupContextQuery(
        block: SecurityGroupContextQueryDsl.() -> Unit = {}
    ): SecurityGroupContextQuery {
        val builder = SecurityGroupContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metadata Entry spec for stack tag.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * Tag tag = Tag.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     */
    public inline fun tag(block: TagDsl.() -> Unit = {}): Tag {
        val builder = TagDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents an integration test case.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * TestCase testCase = TestCase.builder()
     * .stacks(List.of("stacks"))
     * // the properties below are optional
     * .allowDestroy(List.of("allowDestroy"))
     * .assertionStack("assertionStack")
     * .assertionStackName("assertionStackName")
     * .cdkCommandOptions(CdkCommands.builder()
     * .deploy(DeployCommand.builder()
     * .args(DeployOptions.builder()
     * .all(false)
     * .app("app")
     * .assetMetadata(false)
     * .caBundlePath("caBundlePath")
     * .changeSetName("changeSetName")
     * .ci(false)
     * .color(false)
     * .concurrency(123)
     * .context(Map.of(
     * "contextKey", "context"))
     * .debug(false)
     * .ec2Creds(false)
     * .exclusively(false)
     * .execute(false)
     * .force(false)
     * .ignoreErrors(false)
     * .json(false)
     * .lookups(false)
     * .notices(false)
     * .notificationArns(List.of("notificationArns"))
     * .output("output")
     * .outputsFile("outputsFile")
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .pathMetadata(false)
     * .profile("profile")
     * .proxy("proxy")
     * .requireApproval(RequireApproval.NEVER)
     * .reuseAssets(List.of("reuseAssets"))
     * .roleArn("roleArn")
     * .rollback(false)
     * .stacks(List.of("stacks"))
     * .staging(false)
     * .strict(false)
     * .toolkitStackName("toolkitStackName")
     * .trace(false)
     * .usePreviousParameters(false)
     * .verbose(false)
     * .versionReporting(false)
     * .build())
     * .enabled(false)
     * .expectedMessage("expectedMessage")
     * .expectError(false)
     * .build())
     * .destroy(DestroyCommand.builder()
     * .args(DestroyOptions.builder()
     * .all(false)
     * .app("app")
     * .assetMetadata(false)
     * .caBundlePath("caBundlePath")
     * .color(false)
     * .context(Map.of(
     * "contextKey", "context"))
     * .debug(false)
     * .ec2Creds(false)
     * .exclusively(false)
     * .force(false)
     * .ignoreErrors(false)
     * .json(false)
     * .lookups(false)
     * .notices(false)
     * .output("output")
     * .pathMetadata(false)
     * .profile("profile")
     * .proxy("proxy")
     * .roleArn("roleArn")
     * .stacks(List.of("stacks"))
     * .staging(false)
     * .strict(false)
     * .trace(false)
     * .verbose(false)
     * .versionReporting(false)
     * .build())
     * .enabled(false)
     * .expectedMessage("expectedMessage")
     * .expectError(false)
     * .build())
     * .build())
     * .diffAssets(false)
     * .hooks(Hooks.builder()
     * .postDeploy(List.of("postDeploy"))
     * .postDestroy(List.of("postDestroy"))
     * .preDeploy(List.of("preDeploy"))
     * .preDestroy(List.of("preDestroy"))
     * .build())
     * .regions(List.of("regions"))
     * .stackUpdateWorkflow(false)
     * .build();
     * ```
     */
    public inline fun testCase(block: TestCaseDsl.() -> Unit = {}): TestCase {
        val builder = TestCaseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The set of options to control the workflow of the test runner.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * TestOptions testOptions = TestOptions.builder()
     * .allowDestroy(List.of("allowDestroy"))
     * .cdkCommandOptions(CdkCommands.builder()
     * .deploy(DeployCommand.builder()
     * .args(DeployOptions.builder()
     * .all(false)
     * .app("app")
     * .assetMetadata(false)
     * .caBundlePath("caBundlePath")
     * .changeSetName("changeSetName")
     * .ci(false)
     * .color(false)
     * .concurrency(123)
     * .context(Map.of(
     * "contextKey", "context"))
     * .debug(false)
     * .ec2Creds(false)
     * .exclusively(false)
     * .execute(false)
     * .force(false)
     * .ignoreErrors(false)
     * .json(false)
     * .lookups(false)
     * .notices(false)
     * .notificationArns(List.of("notificationArns"))
     * .output("output")
     * .outputsFile("outputsFile")
     * .parameters(Map.of(
     * "parametersKey", "parameters"))
     * .pathMetadata(false)
     * .profile("profile")
     * .proxy("proxy")
     * .requireApproval(RequireApproval.NEVER)
     * .reuseAssets(List.of("reuseAssets"))
     * .roleArn("roleArn")
     * .rollback(false)
     * .stacks(List.of("stacks"))
     * .staging(false)
     * .strict(false)
     * .toolkitStackName("toolkitStackName")
     * .trace(false)
     * .usePreviousParameters(false)
     * .verbose(false)
     * .versionReporting(false)
     * .build())
     * .enabled(false)
     * .expectedMessage("expectedMessage")
     * .expectError(false)
     * .build())
     * .destroy(DestroyCommand.builder()
     * .args(DestroyOptions.builder()
     * .all(false)
     * .app("app")
     * .assetMetadata(false)
     * .caBundlePath("caBundlePath")
     * .color(false)
     * .context(Map.of(
     * "contextKey", "context"))
     * .debug(false)
     * .ec2Creds(false)
     * .exclusively(false)
     * .force(false)
     * .ignoreErrors(false)
     * .json(false)
     * .lookups(false)
     * .notices(false)
     * .output("output")
     * .pathMetadata(false)
     * .profile("profile")
     * .proxy("proxy")
     * .roleArn("roleArn")
     * .stacks(List.of("stacks"))
     * .staging(false)
     * .strict(false)
     * .trace(false)
     * .verbose(false)
     * .versionReporting(false)
     * .build())
     * .enabled(false)
     * .expectedMessage("expectedMessage")
     * .expectError(false)
     * .build())
     * .build())
     * .diffAssets(false)
     * .hooks(Hooks.builder()
     * .postDeploy(List.of("postDeploy"))
     * .postDestroy(List.of("postDestroy"))
     * .preDeploy(List.of("preDeploy"))
     * .preDestroy(List.of("preDestroy"))
     * .build())
     * .regions(List.of("regions"))
     * .stackUpdateWorkflow(false)
     * .build();
     * ```
     */
    public inline fun testOptions(block: TestOptionsDsl.() -> Unit = {}): TestOptions {
        val builder = TestOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Artifact properties for the Construct Tree Artifact.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * TreeArtifactProperties treeArtifactProperties = TreeArtifactProperties.builder()
     * .file("file")
     * .build();
     * ```
     */
    public inline fun treeArtifactProperties(
        block: TreeArtifactPropertiesDsl.() -> Unit = {}
    ): TreeArtifactProperties {
        val builder = TreeArtifactPropertiesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Query input for looking up a VPC.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.cloudassembly.schema.*;
     * VpcContextQuery vpcContextQuery = VpcContextQuery.builder()
     * .account("account")
     * .filter(Map.of(
     * "filterKey", "filter"))
     * .region("region")
     * // the properties below are optional
     * .lookupRoleArn("lookupRoleArn")
     * .returnAsymmetricSubnets(false)
     * .returnVpnGateways(false)
     * .subnetGroupNameTag("subnetGroupNameTag")
     * .build();
     * ```
     */
    public inline fun vpcContextQuery(block: VpcContextQueryDsl.() -> Unit = {}): VpcContextQuery {
        val builder = VpcContextQueryDsl()
        builder.apply(block)
        return builder.build()
    }
}
