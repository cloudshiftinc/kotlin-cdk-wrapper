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

package io.cloudshiftdev.awscdkdsl.pipelines

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.Stage
import software.amazon.awscdk.pipelines.AddStageOpts
import software.amazon.awscdk.pipelines.CodeBuildOptions
import software.amazon.awscdk.pipelines.CodeBuildStep
import software.amazon.awscdk.pipelines.CodeBuildStepProps
import software.amazon.awscdk.pipelines.CodeCommitSourceOptions
import software.amazon.awscdk.pipelines.CodePipeline
import software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult
import software.amazon.awscdk.pipelines.CodePipelineProps
import software.amazon.awscdk.pipelines.ConfirmPermissionsBroadening
import software.amazon.awscdk.pipelines.ConnectionSourceOptions
import software.amazon.awscdk.pipelines.ECRSourceOptions
import software.amazon.awscdk.pipelines.EcrDockerCredentialOptions
import software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions
import software.amazon.awscdk.pipelines.FileSetLocation
import software.amazon.awscdk.pipelines.GitHubSourceOptions
import software.amazon.awscdk.pipelines.ManualApprovalStep
import software.amazon.awscdk.pipelines.ManualApprovalStepProps
import software.amazon.awscdk.pipelines.PermissionsBroadeningCheckProps
import software.amazon.awscdk.pipelines.PipelineBaseProps
import software.amazon.awscdk.pipelines.ProduceActionOptions
import software.amazon.awscdk.pipelines.S3SourceOptions
import software.amazon.awscdk.pipelines.ShellStep
import software.amazon.awscdk.pipelines.ShellStepProps
import software.amazon.awscdk.pipelines.StackAsset
import software.amazon.awscdk.pipelines.StackDeploymentProps
import software.amazon.awscdk.pipelines.StackSteps
import software.amazon.awscdk.pipelines.StageDeploymentProps
import software.amazon.awscdk.pipelines.Wave
import software.amazon.awscdk.pipelines.WaveOptions
import software.amazon.awscdk.pipelines.WaveProps
import software.amazon.awscdk.services.codecommit.IRepository as CodecommitIRepository
import software.amazon.awscdk.services.ecr.IRepository as EcrIRepository
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct

public object pipelines {
    /**
     * Options to pass to `addStage`.
     *
     * Example:
     * ```
     * CodePipeline pipeline;
     * MyApplicationStage preprod = new MyApplicationStage(this, "PreProd");
     * MyApplicationStage prod = new MyApplicationStage(this, "Prod");
     * pipeline.addStage(preprod, AddStageOpts.builder()
     * .post(List.of(
     * ShellStep.Builder.create("Validate Endpoint")
     * .commands(List.of("curl -Ssf https://my.webservice.com/"))
     * .build()))
     * .build());
     * pipeline.addStage(prod, AddStageOpts.builder()
     * .pre(List.of(
     * new ManualApprovalStep("PromoteToProd")))
     * .build());
     * ```
     */
    public inline fun addStageOpts(block: AddStageOptsDsl.() -> Unit = {}): AddStageOpts {
        val builder = AddStageOptsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for customizing a single CodeBuild project.
     *
     * Example:
     * ```
     * IFileSetProducer source; // the repository source
     * String[] synthCommands; // Commands to synthesize your app
     * String[] installCommands;
     * // Commands to install your toolchain
     * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
     * // Standard CodePipeline properties...
     * .synth(ShellStep.Builder.create("Synth")
     * .input(source)
     * .commands(synthCommands)
     * .build())
     * // Configure CodeBuild to use a drop-in Docker replacement.
     * .codeBuildDefaults(CodeBuildOptions.builder()
     * .partialBuildSpec(BuildSpec.fromObject(Map.of(
     * "phases", Map.of(
     * "install", Map.of(
     * // Add the shell commands to install your drop-in Docker
     * // replacement to the CodeBuild enviromment.
     * "commands", installCommands)))))
     * .buildEnvironment(BuildEnvironment.builder()
     * .environmentVariables(Map.of(
     * // Instruct the AWS CDK to use `drop-in-replacement` instead of
     * // `docker` when building / publishing docker images.
     * // e.g., `drop-in-replacement build . -f path/to/Dockerfile`
     * "CDK_DOCKER", BuildEnvironmentVariable.builder().value("drop-in-replacement").build()))
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun codeBuildOptions(
        block: CodeBuildOptionsDsl.() -> Unit = {}
    ): CodeBuildOptions {
        val builder = CodeBuildOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Run a script as a CodeBuild Project.
     *
     * The BuildSpec must be available inline--it cannot reference a file on disk. If your current
     * build instructions are in a file like `buildspec.yml` in your repository, extract them to a
     * script (say, `build.sh`) and invoke that script as part of the build:
     * ```
     * CodeBuildStep.Builder.create("Synth")
     * .commands(List.of("./build.sh"))
     * .build();
     * ```
     *
     * Example:
     * ```
     * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
     * .synth(ShellStep.Builder.create("Synth")
     * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
     * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
     * .build()))
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .build())
     * // Turn this on because the pipeline uses Docker image assets
     * .dockerEnabledForSelfMutation(true)
     * .build();
     * pipeline.addWave("MyWave", WaveOptions.builder()
     * .post(List.of(
     * CodeBuildStep.Builder.create("RunApproval")
     * .commands(List.of("command-from-image"))
     * .buildEnvironment(BuildEnvironment.builder()
     * // The user of a Docker image asset in the pipeline requires turning on
     * // 'dockerEnabledForSelfMutation'.
     * .buildImage(LinuxBuildImage.fromAsset(this, "Image", DockerImageAssetProps.builder()
     * .directory("./docker-image")
     * .build()))
     * .build())
     * .build()))
     * .build());
     * ```
     */
    public inline fun codeBuildStep(
        id: String,
        block: CodeBuildStepDsl.() -> Unit = {}
    ): CodeBuildStep {
        val builder = CodeBuildStepDsl(id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction props for a CodeBuildStep.
     *
     * Example:
     * ```
     * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
     * .synth(ShellStep.Builder.create("Synth")
     * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
     * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
     * .build()))
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .build())
     * // Turn this on because the pipeline uses Docker image assets
     * .dockerEnabledForSelfMutation(true)
     * .build();
     * pipeline.addWave("MyWave", WaveOptions.builder()
     * .post(List.of(
     * CodeBuildStep.Builder.create("RunApproval")
     * .commands(List.of("command-from-image"))
     * .buildEnvironment(BuildEnvironment.builder()
     * // The user of a Docker image asset in the pipeline requires turning on
     * // 'dockerEnabledForSelfMutation'.
     * .buildImage(LinuxBuildImage.fromAsset(this, "Image", DockerImageAssetProps.builder()
     * .directory("./docker-image")
     * .build()))
     * .build())
     * .build()))
     * .build());
     * ```
     */
    public inline fun codeBuildStepProps(
        block: CodeBuildStepPropsDsl.() -> Unit = {}
    ): CodeBuildStepProps {
        val builder = CodeBuildStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for a CodeCommit source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.pipelines.*;
     * Role role;
     * CodeCommitSourceOptions codeCommitSourceOptions = CodeCommitSourceOptions.builder()
     * .actionName("actionName")
     * .codeBuildCloneOutput(false)
     * .eventRole(role)
     * .trigger(CodeCommitTrigger.NONE)
     * .build();
     * ```
     */
    public inline fun codeCommitSourceOptions(
        block: CodeCommitSourceOptionsDsl.() -> Unit = {}
    ): CodeCommitSourceOptions {
        val builder = CodeCommitSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CDK Pipeline that uses CodePipeline to deploy CDK apps.
     *
     * This is a `Pipeline` with its `engine` property set to `CodePipelineEngine`, and exists for
     * nicer ergonomics for users that don't need to switch out engines.
     *
     * Example:
     * ```
     * // Modern API
     * CodePipeline modernPipeline = CodePipeline.Builder.create(this, "Pipeline")
     * .selfMutation(false)
     * .synth(ShellStep.Builder.create("Synth")
     * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
     * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
     * .build()))
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .build())
     * .build();
     * // Original API
     * Artifact cloudAssemblyArtifact = new Artifact();
     * CdkPipeline originalPipeline = new CdkPipeline(this, "Pipeline", new CdkPipelineProps()
     * .selfMutating(false)
     * .cloudAssemblyArtifact(cloudAssemblyArtifact)
     * );
     * ```
     */
    public inline fun codePipeline(
        scope: Construct,
        id: String,
        block: CodePipelineDsl.() -> Unit = {},
    ): CodePipeline {
        val builder = CodePipelineDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The result of adding actions to the pipeline.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codebuild.*;
     * import software.amazon.awscdk.pipelines.*;
     * Project project;
     * CodePipelineActionFactoryResult codePipelineActionFactoryResult =
     * CodePipelineActionFactoryResult.builder()
     * .runOrdersConsumed(123)
     * // the properties below are optional
     * .project(project)
     * .build();
     * ```
     */
    public inline fun codePipelineActionFactoryResult(
        block: CodePipelineActionFactoryResultDsl.() -> Unit = {}
    ): CodePipelineActionFactoryResult {
        val builder = CodePipelineActionFactoryResultDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a `CodePipeline`.
     *
     * Example:
     * ```
     * // Modern API
     * CodePipeline modernPipeline = CodePipeline.Builder.create(this, "Pipeline")
     * .selfMutation(false)
     * .synth(ShellStep.Builder.create("Synth")
     * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
     * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
     * .build()))
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .build())
     * .build();
     * // Original API
     * Artifact cloudAssemblyArtifact = new Artifact();
     * CdkPipeline originalPipeline = new CdkPipeline(this, "Pipeline", new CdkPipelineProps()
     * .selfMutating(false)
     * .cloudAssemblyArtifact(cloudAssemblyArtifact)
     * );
     * ```
     */
    public inline fun codePipelineProps(
        block: CodePipelinePropsDsl.() -> Unit = {}
    ): CodePipelineProps {
        val builder = CodePipelinePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Pause the pipeline if a deployment would add IAM permissions or Security Group rules.
     *
     * This step is only supported in CodePipeline pipelines.
     *
     * Example:
     * ```
     * CodePipeline pipeline;
     * MyApplicationStage stage = new MyApplicationStage(this, "MyApplication");
     * pipeline.addStage(stage, AddStageOpts.builder()
     * .pre(List.of(
     * ConfirmPermissionsBroadening.Builder.create("Check").stage(stage).build()))
     * .build());
     * ```
     */
    public inline fun confirmPermissionsBroadening(
        id: String,
        block: ConfirmPermissionsBroadeningDsl.() -> Unit = {}
    ): ConfirmPermissionsBroadening {
        val builder = ConfirmPermissionsBroadeningDsl(id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration options for CodeStar source.
     *
     * Example:
     * ```
     * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
     * .synth(ShellStep.Builder.create("Synth")
     * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
     * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
     * .build()))
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .build())
     * // Turn this on because the pipeline uses Docker image assets
     * .dockerEnabledForSelfMutation(true)
     * .build();
     * pipeline.addWave("MyWave", WaveOptions.builder()
     * .post(List.of(
     * CodeBuildStep.Builder.create("RunApproval")
     * .commands(List.of("command-from-image"))
     * .buildEnvironment(BuildEnvironment.builder()
     * // The user of a Docker image asset in the pipeline requires turning on
     * // 'dockerEnabledForSelfMutation'.
     * .buildImage(LinuxBuildImage.fromAsset(this, "Image", DockerImageAssetProps.builder()
     * .directory("./docker-image")
     * .build()))
     * .build())
     * .build()))
     * .build());
     * ```
     */
    public inline fun connectionSourceOptions(
        block: ConnectionSourceOptionsDsl.() -> Unit = {}
    ): ConnectionSourceOptions {
        val builder = ConnectionSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for ECR sources.
     *
     * Example:
     * ```
     * IRepository repository;
     * CodePipelineSource.ecr(repository, ECRSourceOptions.builder()
     * .imageTag("latest")
     * .build());
     * ```
     */
    public inline fun eCRSourceOptions(
        block: ECRSourceOptionsDsl.() -> Unit = {}
    ): ECRSourceOptions {
        val builder = ECRSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for defining access for a Docker Credential composed of ECR repos.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.pipelines.*;
     * Role role;
     * EcrDockerCredentialOptions ecrDockerCredentialOptions = EcrDockerCredentialOptions.builder()
     * .assumeRole(role)
     * .usages(List.of(DockerCredentialUsage.SYNTH))
     * .build();
     * ```
     */
    public inline fun ecrDockerCredentialOptions(
        block: EcrDockerCredentialOptionsDsl.() -> Unit = {}
    ): EcrDockerCredentialOptions {
        val builder = EcrDockerCredentialOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for defining credentials for a Docker Credential.
     *
     * Example:
     * ```
     * ISecret dockerHubSecret = Secret.fromSecretCompleteArn(this, "DHSecret", "arn:aws:...");
     * // Only the image asset publishing actions will be granted read access to the secret.
     * DockerCredential creds = DockerCredential.dockerHub(dockerHubSecret,
     * ExternalDockerCredentialOptions.builder().usages(List.of(DockerCredentialUsage.ASSET_PUBLISHING)).build());
     * ```
     */
    public inline fun externalDockerCredentialOptions(
        block: ExternalDockerCredentialOptionsDsl.() -> Unit = {}
    ): ExternalDockerCredentialOptions {
        val builder = ExternalDockerCredentialOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Location of a FileSet consumed or produced by a ShellStep.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.pipelines.*;
     * FileSet fileSet;
     * FileSetLocation fileSetLocation = FileSetLocation.builder()
     * .directory("directory")
     * .fileSet(fileSet)
     * .build();
     * ```
     */
    public inline fun fileSetLocation(block: FileSetLocationDsl.() -> Unit = {}): FileSetLocation {
        val builder = FileSetLocationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for GitHub sources.
     *
     * Example:
     * ```
     * CodePipelineSource.gitHub("org/repo", "branch", GitHubSourceOptions.builder()
     * // This is optional
     * .authentication(SecretValue.secretsManager("my-token"))
     * .build());
     * ```
     */
    public inline fun gitHubSourceOptions(
        block: GitHubSourceOptionsDsl.() -> Unit = {}
    ): GitHubSourceOptions {
        val builder = GitHubSourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A manual approval step.
     *
     * If this step is added to a Pipeline, the Pipeline will be paused waiting for a human to
     * resume it
     *
     * Only engines that support pausing the deployment will support this step type.
     *
     * Example:
     * ```
     * CodePipeline pipeline;
     * MyApplicationStage preprod = new MyApplicationStage(this, "PreProd");
     * MyApplicationStage prod = new MyApplicationStage(this, "Prod");
     * pipeline.addStage(preprod, AddStageOpts.builder()
     * .post(List.of(
     * ShellStep.Builder.create("Validate Endpoint")
     * .commands(List.of("curl -Ssf https://my.webservice.com/"))
     * .build()))
     * .build());
     * pipeline.addStage(prod, AddStageOpts.builder()
     * .pre(List.of(
     * new ManualApprovalStep("PromoteToProd")))
     * .build());
     * ```
     */
    public inline fun manualApprovalStep(
        id: String,
        block: ManualApprovalStepDsl.() -> Unit = {}
    ): ManualApprovalStep {
        val builder = ManualApprovalStepDsl(id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a `ManualApprovalStep`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.pipelines.*;
     * ManualApprovalStepProps manualApprovalStepProps = ManualApprovalStepProps.builder()
     * .comment("comment")
     * .build();
     * ```
     */
    public inline fun manualApprovalStepProps(
        block: ManualApprovalStepPropsDsl.() -> Unit = {}
    ): ManualApprovalStepProps {
        val builder = ManualApprovalStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a `PermissionsBroadeningCheck`.
     *
     * Example:
     * ```
     * CodePipeline pipeline;
     * MyApplicationStage stage = new MyApplicationStage(this, "MyApplication");
     * pipeline.addStage(stage, AddStageOpts.builder()
     * .pre(List.of(
     * ConfirmPermissionsBroadening.Builder.create("Check").stage(stage).build()))
     * .build());
     * ```
     */
    public inline fun permissionsBroadeningCheckProps(
        block: PermissionsBroadeningCheckPropsDsl.() -> Unit = {}
    ): PermissionsBroadeningCheckProps {
        val builder = PermissionsBroadeningCheckPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a `Pipeline`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.pipelines.*;
     * IFileSetProducer fileSetProducer;
     * PipelineBaseProps pipelineBaseProps = PipelineBaseProps.builder()
     * .synth(fileSetProducer)
     * .build();
     * ```
     */
    public inline fun pipelineBaseProps(
        block: PipelineBasePropsDsl.() -> Unit = {}
    ): PipelineBaseProps {
        val builder = PipelineBasePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for the `CodePipelineActionFactory.produce()` method.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.codebuild.*;
     * import software.amazon.awscdk.services.codepipeline.*;
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.services.logs.*;
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.pipelines.*;
     * import software.constructs.*;
     * Artifact artifact;
     * ArtifactMap artifactMap;
     * Bucket bucket;
     * IBuildImage buildImage;
     * BuildSpec buildSpec;
     * Cache cache;
     * CodePipeline codePipeline;
     * Construct construct;
     * IFileSystemLocation fileSystemLocation;
     * LogGroup logGroup;
     * PolicyStatement policyStatement;
     * SecurityGroup securityGroup;
     * StackOutputsMap stackOutputsMap;
     * Subnet subnet;
     * SubnetFilter subnetFilter;
     * Object value;
     * Vpc vpc;
     * ProduceActionOptions produceActionOptions = ProduceActionOptions.builder()
     * .actionName("actionName")
     * .artifacts(artifactMap)
     * .pipeline(codePipeline)
     * .runOrder(123)
     * .scope(construct)
     * .stackOutputsMap(stackOutputsMap)
     * // the properties below are optional
     * .beforeSelfMutation(false)
     * .codeBuildDefaults(CodeBuildOptions.builder()
     * .buildEnvironment(BuildEnvironment.builder()
     * .buildImage(buildImage)
     * .certificate(BuildEnvironmentCertificate.builder()
     * .bucket(bucket)
     * .objectKey("objectKey")
     * .build())
     * .computeType(ComputeType.SMALL)
     * .environmentVariables(Map.of(
     * "environmentVariablesKey", BuildEnvironmentVariable.builder()
     * .value(value)
     * // the properties below are optional
     * .type(BuildEnvironmentVariableType.PLAINTEXT)
     * .build()))
     * .privileged(false)
     * .build())
     * .cache(cache)
     * .fileSystemLocations(List.of(fileSystemLocation))
     * .logging(LoggingOptions.builder()
     * .cloudWatch(CloudWatchLoggingOptions.builder()
     * .enabled(false)
     * .logGroup(logGroup)
     * .prefix("prefix")
     * .build())
     * .s3(S3LoggingOptions.builder()
     * .bucket(bucket)
     * // the properties below are optional
     * .enabled(false)
     * .encrypted(false)
     * .prefix("prefix")
     * .build())
     * .build())
     * .partialBuildSpec(buildSpec)
     * .rolePolicy(List.of(policyStatement))
     * .securityGroups(List.of(securityGroup))
     * .subnetSelection(SubnetSelection.builder()
     * .availabilityZones(List.of("availabilityZones"))
     * .onePerAz(false)
     * .subnetFilters(List.of(subnetFilter))
     * .subnetGroupName("subnetGroupName")
     * .subnets(List.of(subnet))
     * .subnetType(SubnetType.PRIVATE_ISOLATED)
     * .build())
     * .timeout(Duration.minutes(30))
     * .vpc(vpc)
     * .build())
     * .fallbackArtifact(artifact)
     * .variablesNamespace("variablesNamespace")
     * .build();
     * ```
     */
    public inline fun produceActionOptions(
        block: ProduceActionOptionsDsl.() -> Unit = {}
    ): ProduceActionOptions {
        val builder = ProduceActionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for S3 sources.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codepipeline.actions.*;
     * import software.amazon.awscdk.services.iam.*;
     * import software.amazon.awscdk.pipelines.*;
     * Role role;
     * S3SourceOptions s3SourceOptions = S3SourceOptions.builder()
     * .actionName("actionName")
     * .role(role)
     * .trigger(S3Trigger.NONE)
     * .build();
     * ```
     */
    public inline fun s3SourceOptions(block: S3SourceOptionsDsl.() -> Unit = {}): S3SourceOptions {
        val builder = S3SourceOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Run shell script commands in the pipeline.
     *
     * This is a generic step designed to be deployment engine agnostic.
     *
     * Example:
     * ```
     * // Modern API
     * CodePipeline modernPipeline = CodePipeline.Builder.create(this, "Pipeline")
     * .selfMutation(false)
     * .synth(ShellStep.Builder.create("Synth")
     * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
     * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
     * .build()))
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .build())
     * .build();
     * // Original API
     * Artifact cloudAssemblyArtifact = new Artifact();
     * CdkPipeline originalPipeline = new CdkPipeline(this, "Pipeline", new CdkPipelineProps()
     * .selfMutating(false)
     * .cloudAssemblyArtifact(cloudAssemblyArtifact)
     * );
     * ```
     */
    public inline fun shellStep(id: String, block: ShellStepDsl.() -> Unit = {}): ShellStep {
        val builder = ShellStepDsl(id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a `ShellStep`.
     *
     * Example:
     * ```
     * // Modern API
     * CodePipeline modernPipeline = CodePipeline.Builder.create(this, "Pipeline")
     * .selfMutation(false)
     * .synth(ShellStep.Builder.create("Synth")
     * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
     * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
     * .build()))
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .build())
     * .build();
     * // Original API
     * Artifact cloudAssemblyArtifact = new Artifact();
     * CdkPipeline originalPipeline = new CdkPipeline(this, "Pipeline", new CdkPipelineProps()
     * .selfMutating(false)
     * .cloudAssemblyArtifact(cloudAssemblyArtifact)
     * );
     * ```
     */
    public inline fun shellStepProps(block: ShellStepPropsDsl.() -> Unit = {}): ShellStepProps {
        val builder = ShellStepPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An asset used by a Stack.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.pipelines.*;
     * StackAsset stackAsset = StackAsset.builder()
     * .assetId("assetId")
     * .assetManifestPath("assetManifestPath")
     * .assetSelector("assetSelector")
     * .assetType(AssetType.FILE)
     * .isTemplate(false)
     * // the properties below are optional
     * .assetPublishingRoleArn("assetPublishingRoleArn")
     * .build();
     * ```
     */
    public inline fun stackAsset(block: StackAssetDsl.() -> Unit = {}): StackAsset {
        val builder = StackAssetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a `StackDeployment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.pipelines.*;
     * StackDeploymentProps stackDeploymentProps = StackDeploymentProps.builder()
     * .absoluteTemplatePath("absoluteTemplatePath")
     * .constructPath("constructPath")
     * .stackArtifactId("stackArtifactId")
     * .stackName("stackName")
     * // the properties below are optional
     * .account("account")
     * .assets(List.of(StackAsset.builder()
     * .assetId("assetId")
     * .assetManifestPath("assetManifestPath")
     * .assetSelector("assetSelector")
     * .assetType(AssetType.FILE)
     * .isTemplate(false)
     * // the properties below are optional
     * .assetPublishingRoleArn("assetPublishingRoleArn")
     * .build()))
     * .assumeRoleArn("assumeRoleArn")
     * .executionRoleArn("executionRoleArn")
     * .region("region")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .templateS3Uri("templateS3Uri")
     * .build();
     * ```
     */
    public inline fun stackDeploymentProps(
        block: StackDeploymentPropsDsl.() -> Unit = {}
    ): StackDeploymentProps {
        val builder = StackDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Instructions for additional steps that are run at stack level.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.pipelines.*;
     * Stack stack;
     * Step step;
     * StackSteps stackSteps = StackSteps.builder()
     * .stack(stack)
     * // the properties below are optional
     * .changeSet(List.of(step))
     * .post(List.of(step))
     * .pre(List.of(step))
     * .build();
     * ```
     */
    public inline fun stackSteps(block: StackStepsDsl.() -> Unit = {}): StackSteps {
        val builder = StackStepsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a `StageDeployment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.pipelines.*;
     * Stack stack;
     * Step step;
     * StageDeploymentProps stageDeploymentProps = StageDeploymentProps.builder()
     * .post(List.of(step))
     * .pre(List.of(step))
     * .stackSteps(List.of(StackSteps.builder()
     * .stack(stack)
     * // the properties below are optional
     * .changeSet(List.of(step))
     * .post(List.of(step))
     * .pre(List.of(step))
     * .build()))
     * .stageName("stageName")
     * .build();
     * ```
     */
    public inline fun stageDeploymentProps(
        block: StageDeploymentPropsDsl.() -> Unit = {}
    ): StageDeploymentProps {
        val builder = StageDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Multiple stages that are deployed in parallel.
     *
     * Example:
     * ```
     * CodePipeline pipeline;
     * Wave europeWave = pipeline.addWave("Europe");
     * europeWave.addStage(MyApplicationStage.Builder.create(this, "Ireland")
     * .env(Environment.builder().region("eu-west-1").build())
     * .build());
     * europeWave.addStage(MyApplicationStage.Builder.create(this, "Germany")
     * .env(Environment.builder().region("eu-central-1").build())
     * .build());
     * ```
     */
    public inline fun wave(id: String, block: WaveDsl.() -> Unit = {}): Wave {
        val builder = WaveDsl(id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to pass to `addWave`.
     *
     * Example:
     * ```
     * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
     * .synth(ShellStep.Builder.create("Synth")
     * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
     * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
     * .build()))
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .build())
     * // Turn this on because the pipeline uses Docker image assets
     * .dockerEnabledForSelfMutation(true)
     * .build();
     * pipeline.addWave("MyWave", WaveOptions.builder()
     * .post(List.of(
     * CodeBuildStep.Builder.create("RunApproval")
     * .commands(List.of("command-from-image"))
     * .buildEnvironment(BuildEnvironment.builder()
     * // The user of a Docker image asset in the pipeline requires turning on
     * // 'dockerEnabledForSelfMutation'.
     * .buildImage(LinuxBuildImage.fromAsset(this, "Image", DockerImageAssetProps.builder()
     * .directory("./docker-image")
     * .build()))
     * .build())
     * .build()))
     * .build());
     * ```
     */
    public inline fun waveOptions(block: WaveOptionsDsl.() -> Unit = {}): WaveOptions {
        val builder = WaveOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for a `Wave`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.pipelines.*;
     * Step step;
     * WaveProps waveProps = WaveProps.builder()
     * .post(List.of(step))
     * .pre(List.of(step))
     * .build();
     * ```
     */
    public inline fun waveProps(block: WavePropsDsl.() -> Unit = {}): WaveProps {
        val builder = WavePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public object CodePipelineSource {
        public fun codeCommit(
            repository: CodecommitIRepository,
            branch: String,
            block: CodeCommitSourceOptionsDsl.() -> Unit = {},
        ): software.amazon.awscdk.pipelines.CodePipelineSource {
            val builder = CodeCommitSourceOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.CodePipelineSource.codeCommit(
                repository,
                branch,
                builder.build()
            )
        }

        public fun connection(
            repoString: String,
            branch: String,
            block: ConnectionSourceOptionsDsl.() -> Unit = {},
        ): software.amazon.awscdk.pipelines.CodePipelineSource {
            val builder = ConnectionSourceOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.CodePipelineSource.connection(
                repoString,
                branch,
                builder.build()
            )
        }

        public fun ecr(
            repository: EcrIRepository,
            block: ECRSourceOptionsDsl.() -> Unit = {}
        ): software.amazon.awscdk.pipelines.CodePipelineSource {
            val builder = ECRSourceOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.CodePipelineSource.ecr(
                repository,
                builder.build()
            )
        }

        public fun gitHub(
            repoString: String,
            branch: String,
            block: GitHubSourceOptionsDsl.() -> Unit = {},
        ): software.amazon.awscdk.pipelines.CodePipelineSource {
            val builder = GitHubSourceOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.CodePipelineSource.gitHub(
                repoString,
                branch,
                builder.build()
            )
        }

        public fun s3(
            bucket: IBucket,
            objectKey: String,
            block: S3SourceOptionsDsl.() -> Unit = {},
        ): software.amazon.awscdk.pipelines.CodePipelineSource {
            val builder = S3SourceOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.CodePipelineSource.s3(
                bucket,
                objectKey,
                builder.build()
            )
        }
    }

    public object DockerCredential {
        public fun customRegistry(
            registryDomain: String,
            secret: ISecret,
            block: ExternalDockerCredentialOptionsDsl.() -> Unit = {},
        ): software.amazon.awscdk.pipelines.DockerCredential {
            val builder = ExternalDockerCredentialOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.DockerCredential.customRegistry(
                registryDomain,
                secret,
                builder.build()
            )
        }

        public fun dockerHub(
            secret: ISecret,
            block: ExternalDockerCredentialOptionsDsl.() -> Unit = {}
        ): software.amazon.awscdk.pipelines.DockerCredential {
            val builder = ExternalDockerCredentialOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.DockerCredential.dockerHub(
                secret,
                builder.build()
            )
        }

        public fun ecr(
            repositories: List<EcrIRepository>,
            block: EcrDockerCredentialOptionsDsl.() -> Unit = {}
        ): software.amazon.awscdk.pipelines.DockerCredential {
            val builder = EcrDockerCredentialOptionsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.DockerCredential.ecr(
                repositories,
                builder.build()
            )
        }
    }

    public object StageDeployment {
        public fun fromStage(
            stage: Stage,
            block: StageDeploymentPropsDsl.() -> Unit = {}
        ): software.amazon.awscdk.pipelines.StageDeployment {
            val builder = StageDeploymentPropsDsl()
            builder.apply(block)
            return software.amazon.awscdk.pipelines.StageDeployment.fromStage(
                stage,
                builder.build()
            )
        }
    }
}
