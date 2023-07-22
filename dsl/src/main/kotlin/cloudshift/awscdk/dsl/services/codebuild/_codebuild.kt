@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ArtifactsConfig
import software.amazon.awscdk.services.codebuild.ArtifactsProps
import software.amazon.awscdk.services.codebuild.BatchBuildConfig
import software.amazon.awscdk.services.codebuild.BindToCodePipelineOptions
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.BitBucketSourceProps
import software.amazon.awscdk.services.codebuild.BucketCacheOptions
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.BuildImageBindOptions
import software.amazon.awscdk.services.codebuild.BuildImageConfig
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.CfnProjectProps
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.CfnReportGroupProps
import software.amazon.awscdk.services.codebuild.CfnSourceCredential
import software.amazon.awscdk.services.codebuild.CfnSourceCredentialProps
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions
import software.amazon.awscdk.services.codebuild.CodeCommitSourceProps
import software.amazon.awscdk.services.codebuild.CommonProjectProps
import software.amazon.awscdk.services.codebuild.DockerImageOptions
import software.amazon.awscdk.services.codebuild.EfsFileSystemLocationProps
import software.amazon.awscdk.services.codebuild.FileSystemConfig
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps
import software.amazon.awscdk.services.codebuild.GitHubSourceProps
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.PipelineProjectProps
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.codebuild.ProjectNotifyOnOptions
import software.amazon.awscdk.services.codebuild.ProjectProps
import software.amazon.awscdk.services.codebuild.ReportGroup
import software.amazon.awscdk.services.codebuild.ReportGroupProps
import software.amazon.awscdk.services.codebuild.S3ArtifactsProps
import software.amazon.awscdk.services.codebuild.S3LoggingOptions
import software.amazon.awscdk.services.codebuild.S3SourceProps
import software.amazon.awscdk.services.codebuild.SourceConfig
import software.amazon.awscdk.services.codebuild.SourceProps
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
import software.constructs.Construct

public object codebuild {
  /**
   * The type returned from `IArtifacts#bind`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ArtifactsConfig artifactsConfig = ArtifactsConfig.builder()
   * .artifactsProperty(ArtifactsProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .artifactIdentifier("artifactIdentifier")
   * .encryptionDisabled(false)
   * .location("location")
   * .name("name")
   * .namespaceType("namespaceType")
   * .overrideArtifactName(false)
   * .packaging("packaging")
   * .path("path")
   * .build())
   * .build();
   * ```
   */
  public inline fun artifactsConfig(block: ArtifactsConfigDsl.() -> Unit = {}): ArtifactsConfig {
    val builder = ArtifactsConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties common to all Artifacts classes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ArtifactsProps artifactsProps = ArtifactsProps.builder()
   * .identifier("identifier")
   * .build();
   * ```
   */
  public inline fun artifactsProps(block: ArtifactsPropsDsl.() -> Unit = {}): ArtifactsProps {
    val builder = ArtifactsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The type returned from `IProject#enableBatchBuilds`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * import software.amazon.awscdk.services.iam.*;
   * Role role;
   * BatchBuildConfig batchBuildConfig = BatchBuildConfig.builder()
   * .role(role)
   * .build();
   * ```
   */
  public inline fun batchBuildConfig(block: BatchBuildConfigDsl.() -> Unit = {}): BatchBuildConfig {
    val builder = BatchBuildConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The extra options passed to the `IProject.bindToCodePipeline` method.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * import software.amazon.awscdk.services.s3.*;
   * Bucket bucket;
   * BindToCodePipelineOptions bindToCodePipelineOptions = BindToCodePipelineOptions.builder()
   * .artifactBucket(bucket)
   * .build();
   * ```
   */
  public inline fun bindToCodePipelineOptions(block: BindToCodePipelineOptionsDsl.() -> Unit = {}):
      BindToCodePipelineOptions {
    val builder = BindToCodePipelineOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The source credentials used when contacting the BitBucket API.
   *
   * **Note**: CodeBuild only allows a single credential for BitBucket
   * to be saved in a given AWS account in a given region -
   * any attempt to add more than one will result in an error.
   *
   * Example:
   *
   * ```
   * BitBucketSourceCredentials.Builder.create(this, "CodeBuildBitBucketCreds")
   * .username(SecretValue.secretsManager("my-bitbucket-creds",
   * SecretsManagerSecretOptions.builder().jsonField("username").build()))
   * .password(SecretValue.secretsManager("my-bitbucket-creds",
   * SecretsManagerSecretOptions.builder().jsonField("password").build()))
   * .build();
   * ```
   */
  public inline fun bitBucketSourceCredentials(
    scope: Construct,
    id: String,
    block: BitBucketSourceCredentialsDsl.() -> Unit = {},
  ): BitBucketSourceCredentials {
    val builder = BitBucketSourceCredentialsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties of `BitBucketSourceCredentials`.
   *
   * Example:
   *
   * ```
   * BitBucketSourceCredentials.Builder.create(this, "CodeBuildBitBucketCreds")
   * .username(SecretValue.secretsManager("my-bitbucket-creds",
   * SecretsManagerSecretOptions.builder().jsonField("username").build()))
   * .password(SecretValue.secretsManager("my-bitbucket-creds",
   * SecretsManagerSecretOptions.builder().jsonField("password").build()))
   * .build();
   * ```
   */
  public inline
      fun bitBucketSourceCredentialsProps(block: BitBucketSourceCredentialsPropsDsl.() -> Unit =
      {}): BitBucketSourceCredentialsProps {
    val builder = BitBucketSourceCredentialsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `BitBucketSource`.
   *
   * Example:
   *
   * ```
   * ISource bbSource = Source.bitBucket(BitBucketSourceProps.builder()
   * .owner("owner")
   * .repo("repo")
   * .build());
   * ```
   */
  public inline fun bitBucketSourceProps(block: BitBucketSourcePropsDsl.() -> Unit = {}):
      BitBucketSourceProps {
    val builder = BitBucketSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * BucketCacheOptions bucketCacheOptions = BucketCacheOptions.builder()
   * .prefix("prefix")
   * .build();
   * ```
   */
  public inline fun bucketCacheOptions(block: BucketCacheOptionsDsl.() -> Unit = {}):
      BucketCacheOptions {
    val builder = BucketCacheOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * Vpc vpc;
   * SecurityGroup mySecurityGroup;
   * CodeBuildStep.Builder.create("Synth")
   * // ...standard ShellStep props...
   * .commands(List.of())
   * .env(Map.of())
   * // If you are using a CodeBuildStep explicitly, set the 'cdk.out' directory
   * // to be the synth step's output.
   * .primaryOutputDirectory("cdk.out")
   * // Control the name of the project
   * .projectName("MyProject")
   * // Control parts of the BuildSpec other than the regular 'build' and 'install' commands
   * .partialBuildSpec(BuildSpec.fromObject(Map.of(
   * "version", "0.2")))
   * // Control the build environment
   * .buildEnvironment(BuildEnvironment.builder()
   * .computeType(ComputeType.LARGE)
   * .privileged(true)
   * .build())
   * .timeout(Duration.minutes(90))
   * .fileSystemLocations(List.of(FileSystemLocation.efs(EfsFileSystemLocationProps.builder()
   * .identifier("myidentifier2")
   * .location("myclodation.mydnsroot.com:/loc")
   * .mountPoint("/media")
   * .mountOptions("opts")
   * .build())))
   * // Control Elastic Network Interface creation
   * .vpc(vpc)
   * .subnetSelection(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_WITH_EGRESS).build())
   * .securityGroups(List.of(mySecurityGroup))
   * // Control caching
   * .cache(Cache.bucket(new Bucket(this, "Cache")))
   * // Additional policy statements for the execution role
   * .rolePolicyStatements(List.of(
   * PolicyStatement.Builder.create().build()))
   * .build();
   * ```
   */
  public inline fun buildEnvironment(block: BuildEnvironmentDsl.() -> Unit = {}): BuildEnvironment {
    val builder = BuildEnvironmentDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Location of a PEM certificate on S3.
   *
   * Example:
   *
   * ```
   * Repository ecrRepository;
   * Project.Builder.create(this, "Project")
   * .environment(BuildEnvironment.builder()
   * .buildImage(WindowsBuildImage.fromEcrRepository(ecrRepository, "v1.0",
   * WindowsImageType.SERVER_2019))
   * // optional certificate to include in the build image
   * .certificate(BuildEnvironmentCertificate.builder()
   * .bucket(Bucket.fromBucketName(this, "Bucket", "my-bucket"))
   * .objectKey("path/to/cert.pem")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun buildEnvironmentCertificate(block: BuildEnvironmentCertificateDsl.() -> Unit =
      {}): BuildEnvironmentCertificate {
    val builder = BuildEnvironmentCertificateDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // later:
   * PipelineProject project;
   * Artifact sourceOutput = new Artifact();
   * CodeBuildAction buildAction = CodeBuildAction.Builder.create()
   * .actionName("Build1")
   * .input(sourceOutput)
   * .project(PipelineProject.Builder.create(this, "Project")
   * .buildSpec(BuildSpec.fromObject(Map.of(
   * "version", "0.2",
   * "env", Map.of(
   * "exported-variables", List.of("MY_VAR")),
   * "phases", Map.of(
   * "build", Map.of(
   * "commands", "export MY_VAR=\"some value\"")))))
   * .build())
   * .variablesNamespace("MyNamespace")
   * .build();
   * CodeBuildAction.Builder.create()
   * .actionName("CodeBuild")
   * .project(project)
   * .input(sourceOutput)
   * .environmentVariables(Map.of(
   * "MyVar", BuildEnvironmentVariable.builder()
   * .value(buildAction.variable("MY_VAR"))
   * .build()))
   * .build();
   * ```
   */
  public inline fun buildEnvironmentVariable(block: BuildEnvironmentVariableDsl.() -> Unit = {}):
      BuildEnvironmentVariable {
    val builder = BuildEnvironmentVariableDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Optional arguments to `IBuildImage.binder` - currently empty.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * BuildImageBindOptions buildImageBindOptions = BuildImageBindOptions.builder().build();
   * ```
   */
  public inline fun buildImageBindOptions(block: BuildImageBindOptionsDsl.() -> Unit = {}):
      BuildImageBindOptions {
    val builder = BuildImageBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The return type from `IBuildImage.binder` - currently empty.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * BuildImageConfig buildImageConfig = BuildImageConfig.builder().build();
   * ```
   */
  public inline fun buildImageConfig(block: BuildImageConfigDsl.() -> Unit = {}): BuildImageConfig {
    val builder = BuildImageConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::CodeBuild::Project` resource configures how AWS CodeBuild builds your source code.
   *
   * For example, it tells CodeBuild where to get the source code and which build environment to
   * use.
   *
   *
   * To unset or remove a project value via CFN, explicitly provide the attribute with value as
   * empty input.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
   * .artifacts(ArtifactsProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .artifactIdentifier("artifactIdentifier")
   * .encryptionDisabled(false)
   * .location("location")
   * .name("name")
   * .namespaceType("namespaceType")
   * .overrideArtifactName(false)
   * .packaging("packaging")
   * .path("path")
   * .build())
   * .environment(EnvironmentProperty.builder()
   * .computeType("computeType")
   * .image("image")
   * .type("type")
   * // the properties below are optional
   * .certificate("certificate")
   * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
   * .name("name")
   * .value("value")
   * // the properties below are optional
   * .type("type")
   * .build()))
   * .imagePullCredentialsType("imagePullCredentialsType")
   * .privilegedMode(false)
   * .registryCredential(RegistryCredentialProperty.builder()
   * .credential("credential")
   * .credentialProvider("credentialProvider")
   * .build())
   * .build())
   * .serviceRole("serviceRole")
   * .source(SourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .auth(SourceAuthProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .resource("resource")
   * .build())
   * .buildSpec("buildSpec")
   * .buildStatusConfig(BuildStatusConfigProperty.builder()
   * .context("context")
   * .targetUrl("targetUrl")
   * .build())
   * .gitCloneDepth(123)
   * .gitSubmodulesConfig(GitSubmodulesConfigProperty.builder()
   * .fetchSubmodules(false)
   * .build())
   * .insecureSsl(false)
   * .location("location")
   * .reportBuildStatus(false)
   * .sourceIdentifier("sourceIdentifier")
   * .build())
   * // the properties below are optional
   * .badgeEnabled(false)
   * .buildBatchConfig(ProjectBuildBatchConfigProperty.builder()
   * .batchReportMode("batchReportMode")
   * .combineArtifacts(false)
   * .restrictions(BatchRestrictionsProperty.builder()
   * .computeTypesAllowed(List.of("computeTypesAllowed"))
   * .maximumBuildsAllowed(123)
   * .build())
   * .serviceRole("serviceRole")
   * .timeoutInMins(123)
   * .build())
   * .cache(ProjectCacheProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .location("location")
   * .modes(List.of("modes"))
   * .build())
   * .concurrentBuildLimit(123)
   * .description("description")
   * .encryptionKey("encryptionKey")
   * .fileSystemLocations(List.of(ProjectFileSystemLocationProperty.builder()
   * .identifier("identifier")
   * .location("location")
   * .mountPoint("mountPoint")
   * .type("type")
   * // the properties below are optional
   * .mountOptions("mountOptions")
   * .build()))
   * .logsConfig(LogsConfigProperty.builder()
   * .cloudWatchLogs(CloudWatchLogsConfigProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .groupName("groupName")
   * .streamName("streamName")
   * .build())
   * .s3Logs(S3LogsConfigProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .encryptionDisabled(false)
   * .location("location")
   * .build())
   * .build())
   * .name("name")
   * .queuedTimeoutInMinutes(123)
   * .resourceAccessRole("resourceAccessRole")
   * .secondaryArtifacts(List.of(ArtifactsProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .artifactIdentifier("artifactIdentifier")
   * .encryptionDisabled(false)
   * .location("location")
   * .name("name")
   * .namespaceType("namespaceType")
   * .overrideArtifactName(false)
   * .packaging("packaging")
   * .path("path")
   * .build()))
   * .secondarySources(List.of(SourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .auth(SourceAuthProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .resource("resource")
   * .build())
   * .buildSpec("buildSpec")
   * .buildStatusConfig(BuildStatusConfigProperty.builder()
   * .context("context")
   * .targetUrl("targetUrl")
   * .build())
   * .gitCloneDepth(123)
   * .gitSubmodulesConfig(GitSubmodulesConfigProperty.builder()
   * .fetchSubmodules(false)
   * .build())
   * .insecureSsl(false)
   * .location("location")
   * .reportBuildStatus(false)
   * .sourceIdentifier("sourceIdentifier")
   * .build()))
   * .secondarySourceVersions(List.of(ProjectSourceVersionProperty.builder()
   * .sourceIdentifier("sourceIdentifier")
   * // the properties below are optional
   * .sourceVersion("sourceVersion")
   * .build()))
   * .sourceVersion("sourceVersion")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .timeoutInMinutes(123)
   * .triggers(ProjectTriggersProperty.builder()
   * .buildType("buildType")
   * .filterGroups(List.of(List.of(WebhookFilterProperty.builder()
   * .pattern("pattern")
   * .type("type")
   * // the properties below are optional
   * .excludeMatchedPattern(false)
   * .build())))
   * .webhook(false)
   * .build())
   * .visibility("visibility")
   * .vpcConfig(VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .vpcId("vpcId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   */
  public inline fun cfnProject(
    scope: Construct,
    id: String,
    block: CfnProjectDsl.() -> Unit = {},
  ): CfnProject {
    val builder = CfnProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * `Artifacts` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ArtifactsProperty artifactsProperty = ArtifactsProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .artifactIdentifier("artifactIdentifier")
   * .encryptionDisabled(false)
   * .location("location")
   * .name("name")
   * .namespaceType("namespaceType")
   * .overrideArtifactName(false)
   * .packaging("packaging")
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html)
   */
  public inline fun cfnProjectArtifactsProperty(block: CfnProjectArtifactsPropertyDsl.() -> Unit =
      {}): CfnProject.ArtifactsProperty {
    val builder = CfnProjectArtifactsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies restrictions for the batch build.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * BatchRestrictionsProperty batchRestrictionsProperty = BatchRestrictionsProperty.builder()
   * .computeTypesAllowed(List.of("computeTypesAllowed"))
   * .maximumBuildsAllowed(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-batchrestrictions.html)
   */
  public inline
      fun cfnProjectBatchRestrictionsProperty(block: CfnProjectBatchRestrictionsPropertyDsl.() -> Unit
      = {}): CfnProject.BatchRestrictionsProperty {
    val builder = CfnProjectBatchRestrictionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information that defines how the AWS CodeBuild build project reports the build status
   * to the source provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * BuildStatusConfigProperty buildStatusConfigProperty = BuildStatusConfigProperty.builder()
   * .context("context")
   * .targetUrl("targetUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-buildstatusconfig.html)
   */
  public inline
      fun cfnProjectBuildStatusConfigProperty(block: CfnProjectBuildStatusConfigPropertyDsl.() -> Unit
      = {}): CfnProject.BuildStatusConfigProperty {
    val builder = CfnProjectBuildStatusConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `CloudWatchLogs` is a property of the [AWS CodeBuild Project
   * LogsConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html)
   * property type that specifies settings for CloudWatch logs generated by an AWS CodeBuild build.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * CloudWatchLogsConfigProperty cloudWatchLogsConfigProperty =
   * CloudWatchLogsConfigProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .groupName("groupName")
   * .streamName("streamName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html)
   */
  public inline
      fun cfnProjectCloudWatchLogsConfigProperty(block: CfnProjectCloudWatchLogsConfigPropertyDsl.() -> Unit
      = {}): CfnProject.CloudWatchLogsConfigProperty {
    val builder = CfnProjectCloudWatchLogsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `Environment` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies the environment for an AWS CodeBuild project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
   * .computeType("computeType")
   * .image("image")
   * .type("type")
   * // the properties below are optional
   * .certificate("certificate")
   * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
   * .name("name")
   * .value("value")
   * // the properties below are optional
   * .type("type")
   * .build()))
   * .imagePullCredentialsType("imagePullCredentialsType")
   * .privilegedMode(false)
   * .registryCredential(RegistryCredentialProperty.builder()
   * .credential("credential")
   * .credentialProvider("credentialProvider")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html)
   */
  public inline fun cfnProjectEnvironmentProperty(block: CfnProjectEnvironmentPropertyDsl.() -> Unit
      = {}): CfnProject.EnvironmentProperty {
    val builder = CfnProjectEnvironmentPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `EnvironmentVariable` is a property of the [AWS CodeBuild Project
   * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html)
   * property type that specifies the name and value of an environment variable for an AWS CodeBuild
   * project environment. When you use the environment to run a build, these variables are available
   * for your builds to use. `EnvironmentVariable` contains a list of `EnvironmentVariable` property
   * types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
   * .name("name")
   * .value("value")
   * // the properties below are optional
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html)
   */
  public inline
      fun cfnProjectEnvironmentVariableProperty(block: CfnProjectEnvironmentVariablePropertyDsl.() -> Unit
      = {}): CfnProject.EnvironmentVariableProperty {
    val builder = CfnProjectEnvironmentVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `GitSubmodulesConfig` is a property of the [AWS CodeBuild Project
   * Source](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html)
   * property type that specifies information about the Git submodules configuration for the build
   * project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * GitSubmodulesConfigProperty gitSubmodulesConfigProperty = GitSubmodulesConfigProperty.builder()
   * .fetchSubmodules(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html)
   */
  public inline
      fun cfnProjectGitSubmodulesConfigProperty(block: CfnProjectGitSubmodulesConfigPropertyDsl.() -> Unit
      = {}): CfnProject.GitSubmodulesConfigProperty {
    val builder = CfnProjectGitSubmodulesConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `LogsConfig` is a property of the [AWS CodeBuild
   * Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies information about logs for a build project. These can be logs in Amazon
   * CloudWatch Logs, built in a specified S3 bucket, or both.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * LogsConfigProperty logsConfigProperty = LogsConfigProperty.builder()
   * .cloudWatchLogs(CloudWatchLogsConfigProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .groupName("groupName")
   * .streamName("streamName")
   * .build())
   * .s3Logs(S3LogsConfigProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .encryptionDisabled(false)
   * .location("location")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html)
   */
  public inline fun cfnProjectLogsConfigProperty(block: CfnProjectLogsConfigPropertyDsl.() -> Unit =
      {}): CfnProject.LogsConfigProperty {
    val builder = CfnProjectLogsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains configuration information about a batch build project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ProjectBuildBatchConfigProperty projectBuildBatchConfigProperty =
   * ProjectBuildBatchConfigProperty.builder()
   * .batchReportMode("batchReportMode")
   * .combineArtifacts(false)
   * .restrictions(BatchRestrictionsProperty.builder()
   * .computeTypesAllowed(List.of("computeTypesAllowed"))
   * .maximumBuildsAllowed(123)
   * .build())
   * .serviceRole("serviceRole")
   * .timeoutInMins(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html)
   */
  public inline
      fun cfnProjectProjectBuildBatchConfigProperty(block: CfnProjectProjectBuildBatchConfigPropertyDsl.() -> Unit
      = {}): CfnProject.ProjectBuildBatchConfigProperty {
    val builder = CfnProjectProjectBuildBatchConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `ProjectCache` is a property of the [AWS CodeBuild
   * Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies information about the cache for the build project. If `ProjectCache` is
   * not specified, then both of its properties default to `NO_CACHE` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ProjectCacheProperty projectCacheProperty = ProjectCacheProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .location("location")
   * .modes(List.of("modes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html)
   */
  public inline
      fun cfnProjectProjectCacheProperty(block: CfnProjectProjectCachePropertyDsl.() -> Unit = {}):
      CfnProject.ProjectCacheProperty {
    val builder = CfnProjectProjectCachePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about a file system created by Amazon Elastic File System (EFS).
   *
   * For more information, see [What Is Amazon Elastic File
   * System?](https://docs.aws.amazon.com/efs/latest/ug/whatisefs.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ProjectFileSystemLocationProperty projectFileSystemLocationProperty =
   * ProjectFileSystemLocationProperty.builder()
   * .identifier("identifier")
   * .location("location")
   * .mountPoint("mountPoint")
   * .type("type")
   * // the properties below are optional
   * .mountOptions("mountOptions")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html)
   */
  public inline
      fun cfnProjectProjectFileSystemLocationProperty(block: CfnProjectProjectFileSystemLocationPropertyDsl.() -> Unit
      = {}): CfnProject.ProjectFileSystemLocationProperty {
    val builder = CfnProjectProjectFileSystemLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A source identifier and its corresponding version.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ProjectSourceVersionProperty projectSourceVersionProperty =
   * ProjectSourceVersionProperty.builder()
   * .sourceIdentifier("sourceIdentifier")
   * // the properties below are optional
   * .sourceVersion("sourceVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html)
   */
  public inline
      fun cfnProjectProjectSourceVersionProperty(block: CfnProjectProjectSourceVersionPropertyDsl.() -> Unit
      = {}): CfnProject.ProjectSourceVersionProperty {
    val builder = CfnProjectProjectSourceVersionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `ProjectTriggers` is a property of the [AWS CodeBuild
   * Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies webhooks that trigger an AWS CodeBuild build.
   *
   *
   * The Webhook feature isn't available in AWS CloudFormation for GitHub Enterprise projects. Use
   * the AWS CLI or AWS CodeBuild console to create the webhook.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ProjectTriggersProperty projectTriggersProperty = ProjectTriggersProperty.builder()
   * .buildType("buildType")
   * .filterGroups(List.of(List.of(WebhookFilterProperty.builder()
   * .pattern("pattern")
   * .type("type")
   * // the properties below are optional
   * .excludeMatchedPattern(false)
   * .build())))
   * .webhook(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html)
   */
  public inline
      fun cfnProjectProjectTriggersProperty(block: CfnProjectProjectTriggersPropertyDsl.() -> Unit =
      {}): CfnProject.ProjectTriggersProperty {
    val builder = CfnProjectProjectTriggersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnProject`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
   * .artifacts(ArtifactsProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .artifactIdentifier("artifactIdentifier")
   * .encryptionDisabled(false)
   * .location("location")
   * .name("name")
   * .namespaceType("namespaceType")
   * .overrideArtifactName(false)
   * .packaging("packaging")
   * .path("path")
   * .build())
   * .environment(EnvironmentProperty.builder()
   * .computeType("computeType")
   * .image("image")
   * .type("type")
   * // the properties below are optional
   * .certificate("certificate")
   * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
   * .name("name")
   * .value("value")
   * // the properties below are optional
   * .type("type")
   * .build()))
   * .imagePullCredentialsType("imagePullCredentialsType")
   * .privilegedMode(false)
   * .registryCredential(RegistryCredentialProperty.builder()
   * .credential("credential")
   * .credentialProvider("credentialProvider")
   * .build())
   * .build())
   * .serviceRole("serviceRole")
   * .source(SourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .auth(SourceAuthProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .resource("resource")
   * .build())
   * .buildSpec("buildSpec")
   * .buildStatusConfig(BuildStatusConfigProperty.builder()
   * .context("context")
   * .targetUrl("targetUrl")
   * .build())
   * .gitCloneDepth(123)
   * .gitSubmodulesConfig(GitSubmodulesConfigProperty.builder()
   * .fetchSubmodules(false)
   * .build())
   * .insecureSsl(false)
   * .location("location")
   * .reportBuildStatus(false)
   * .sourceIdentifier("sourceIdentifier")
   * .build())
   * // the properties below are optional
   * .badgeEnabled(false)
   * .buildBatchConfig(ProjectBuildBatchConfigProperty.builder()
   * .batchReportMode("batchReportMode")
   * .combineArtifacts(false)
   * .restrictions(BatchRestrictionsProperty.builder()
   * .computeTypesAllowed(List.of("computeTypesAllowed"))
   * .maximumBuildsAllowed(123)
   * .build())
   * .serviceRole("serviceRole")
   * .timeoutInMins(123)
   * .build())
   * .cache(ProjectCacheProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .location("location")
   * .modes(List.of("modes"))
   * .build())
   * .concurrentBuildLimit(123)
   * .description("description")
   * .encryptionKey("encryptionKey")
   * .fileSystemLocations(List.of(ProjectFileSystemLocationProperty.builder()
   * .identifier("identifier")
   * .location("location")
   * .mountPoint("mountPoint")
   * .type("type")
   * // the properties below are optional
   * .mountOptions("mountOptions")
   * .build()))
   * .logsConfig(LogsConfigProperty.builder()
   * .cloudWatchLogs(CloudWatchLogsConfigProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .groupName("groupName")
   * .streamName("streamName")
   * .build())
   * .s3Logs(S3LogsConfigProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .encryptionDisabled(false)
   * .location("location")
   * .build())
   * .build())
   * .name("name")
   * .queuedTimeoutInMinutes(123)
   * .resourceAccessRole("resourceAccessRole")
   * .secondaryArtifacts(List.of(ArtifactsProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .artifactIdentifier("artifactIdentifier")
   * .encryptionDisabled(false)
   * .location("location")
   * .name("name")
   * .namespaceType("namespaceType")
   * .overrideArtifactName(false)
   * .packaging("packaging")
   * .path("path")
   * .build()))
   * .secondarySources(List.of(SourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .auth(SourceAuthProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .resource("resource")
   * .build())
   * .buildSpec("buildSpec")
   * .buildStatusConfig(BuildStatusConfigProperty.builder()
   * .context("context")
   * .targetUrl("targetUrl")
   * .build())
   * .gitCloneDepth(123)
   * .gitSubmodulesConfig(GitSubmodulesConfigProperty.builder()
   * .fetchSubmodules(false)
   * .build())
   * .insecureSsl(false)
   * .location("location")
   * .reportBuildStatus(false)
   * .sourceIdentifier("sourceIdentifier")
   * .build()))
   * .secondarySourceVersions(List.of(ProjectSourceVersionProperty.builder()
   * .sourceIdentifier("sourceIdentifier")
   * // the properties below are optional
   * .sourceVersion("sourceVersion")
   * .build()))
   * .sourceVersion("sourceVersion")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .timeoutInMinutes(123)
   * .triggers(ProjectTriggersProperty.builder()
   * .buildType("buildType")
   * .filterGroups(List.of(List.of(WebhookFilterProperty.builder()
   * .pattern("pattern")
   * .type("type")
   * // the properties below are optional
   * .excludeMatchedPattern(false)
   * .build())))
   * .webhook(false)
   * .build())
   * .visibility("visibility")
   * .vpcConfig(VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .vpcId("vpcId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   */
  public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
    val builder = CfnProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `RegistryCredential` is a property of the [AWS CodeBuild Project
   * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html)
   * property type that specifies information about credentials that provide access to a private Docker
   * registry. When this is set:.
   *
   * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
   * * images cannot be curated or an Amazon ECR image.
   *
   * For more information, see [Private Registry with AWS Secrets Manager Sample for AWS
   * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-private-registry.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * RegistryCredentialProperty registryCredentialProperty = RegistryCredentialProperty.builder()
   * .credential("credential")
   * .credentialProvider("credentialProvider")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html)
   */
  public inline
      fun cfnProjectRegistryCredentialProperty(block: CfnProjectRegistryCredentialPropertyDsl.() -> Unit
      = {}): CfnProject.RegistryCredentialProperty {
    val builder = CfnProjectRegistryCredentialPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `S3Logs` is a property of the [AWS CodeBuild Project
   * LogsConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html)
   * property type that specifies settings for logs generated by an AWS CodeBuild build in an S3
   * bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * S3LogsConfigProperty s3LogsConfigProperty = S3LogsConfigProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .encryptionDisabled(false)
   * .location("location")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html)
   */
  public inline
      fun cfnProjectS3LogsConfigProperty(block: CfnProjectS3LogsConfigPropertyDsl.() -> Unit = {}):
      CfnProject.S3LogsConfigProperty {
    val builder = CfnProjectS3LogsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `SourceAuth` is a property of the [AWS CodeBuild Project
   * Source](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html)
   * property type that specifies authorization settings for AWS CodeBuild to access the source code to
   * be built.
   *
   * `SourceAuth` is for use by the CodeBuild console only. Do not get or set it directly.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * SourceAuthProperty sourceAuthProperty = SourceAuthProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .resource("resource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html)
   */
  public inline fun cfnProjectSourceAuthProperty(block: CfnProjectSourceAuthPropertyDsl.() -> Unit =
      {}): CfnProject.SourceAuthProperty {
    val builder = CfnProjectSourceAuthPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `Source` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies the source code settings for the project, such as the source code's
   * repository type and location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * SourceProperty sourceProperty = SourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .auth(SourceAuthProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .resource("resource")
   * .build())
   * .buildSpec("buildSpec")
   * .buildStatusConfig(BuildStatusConfigProperty.builder()
   * .context("context")
   * .targetUrl("targetUrl")
   * .build())
   * .gitCloneDepth(123)
   * .gitSubmodulesConfig(GitSubmodulesConfigProperty.builder()
   * .fetchSubmodules(false)
   * .build())
   * .insecureSsl(false)
   * .location("location")
   * .reportBuildStatus(false)
   * .sourceIdentifier("sourceIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html)
   */
  public inline fun cfnProjectSourceProperty(block: CfnProjectSourcePropertyDsl.() -> Unit = {}):
      CfnProject.SourceProperty {
    val builder = CfnProjectSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `VpcConfig` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that enable AWS CodeBuild to access resources in an Amazon VPC. For more information, see
   * [Use AWS CodeBuild with Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
   * CodeBuild User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html)
   */
  public inline fun cfnProjectVpcConfigProperty(block: CfnProjectVpcConfigPropertyDsl.() -> Unit =
      {}): CfnProject.VpcConfigProperty {
    val builder = CfnProjectVpcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `WebhookFilter` is a structure of the `FilterGroups` property on the [AWS CodeBuild Project
   * ProjectTriggers](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html)
   * property type that specifies which webhooks trigger an AWS CodeBuild build.
   *
   *
   * The Webhook feature isn't available in AWS CloudFormation for GitHub Enterprise projects. Use
   * the AWS CLI or AWS CodeBuild console to create the webhook.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * WebhookFilterProperty webhookFilterProperty = WebhookFilterProperty.builder()
   * .pattern("pattern")
   * .type("type")
   * // the properties below are optional
   * .excludeMatchedPattern(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-webhookfilter.html)
   */
  public inline
      fun cfnProjectWebhookFilterProperty(block: CfnProjectWebhookFilterPropertyDsl.() -> Unit =
      {}): CfnProject.WebhookFilterProperty {
    val builder = CfnProjectWebhookFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Represents a report group.
   *
   * A report group contains a collection of reports.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * CfnReportGroup cfnReportGroup = CfnReportGroup.Builder.create(this, "MyCfnReportGroup")
   * .exportConfig(ReportExportConfigProperty.builder()
   * .exportConfigType("exportConfigType")
   * // the properties below are optional
   * .s3Destination(S3ReportExportConfigProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .encryptionDisabled(false)
   * .encryptionKey("encryptionKey")
   * .packaging("packaging")
   * .path("path")
   * .build())
   * .build())
   * .type("type")
   * // the properties below are optional
   * .deleteReports(false)
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html)
   */
  public inline fun cfnReportGroup(
    scope: Construct,
    id: String,
    block: CfnReportGroupDsl.() -> Unit = {},
  ): CfnReportGroup {
    val builder = CfnReportGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnReportGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * CfnReportGroupProps cfnReportGroupProps = CfnReportGroupProps.builder()
   * .exportConfig(ReportExportConfigProperty.builder()
   * .exportConfigType("exportConfigType")
   * // the properties below are optional
   * .s3Destination(S3ReportExportConfigProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .encryptionDisabled(false)
   * .encryptionKey("encryptionKey")
   * .packaging("packaging")
   * .path("path")
   * .build())
   * .build())
   * .type("type")
   * // the properties below are optional
   * .deleteReports(false)
   * .name("name")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-reportgroup.html)
   */
  public inline fun cfnReportGroupProps(block: CfnReportGroupPropsDsl.() -> Unit = {}):
      CfnReportGroupProps {
    val builder = CfnReportGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the location where the run of a report is exported.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * ReportExportConfigProperty reportExportConfigProperty = ReportExportConfigProperty.builder()
   * .exportConfigType("exportConfigType")
   * // the properties below are optional
   * .s3Destination(S3ReportExportConfigProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .encryptionDisabled(false)
   * .encryptionKey("encryptionKey")
   * .packaging("packaging")
   * .path("path")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html)
   */
  public inline
      fun cfnReportGroupReportExportConfigProperty(block: CfnReportGroupReportExportConfigPropertyDsl.() -> Unit
      = {}): CfnReportGroup.ReportExportConfigProperty {
    val builder = CfnReportGroupReportExportConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the S3 bucket where the raw data of a report are exported.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * S3ReportExportConfigProperty s3ReportExportConfigProperty =
   * S3ReportExportConfigProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .encryptionDisabled(false)
   * .encryptionKey("encryptionKey")
   * .packaging("packaging")
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html)
   */
  public inline
      fun cfnReportGroupS3ReportExportConfigProperty(block: CfnReportGroupS3ReportExportConfigPropertyDsl.() -> Unit
      = {}): CfnReportGroup.S3ReportExportConfigProperty {
    val builder = CfnReportGroupS3ReportExportConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the credentials for a GitHub, GitHub Enterprise, or Bitbucket repository.
   *
   * We strongly recommend that you use AWS Secrets Manager to store your credentials. If you use
   * Secrets Manager , you must have secrets in your secrets manager. For more information, see [Using
   * Dynamic References to Specify Template
   * Values](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
   * .
   *
   *
   * For security purposes, do not use plain text in your AWS CloudFormation template to store your
   * credentials.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * CfnSourceCredential cfnSourceCredential = CfnSourceCredential.Builder.create(this,
   * "MyCfnSourceCredential")
   * .authType("authType")
   * .serverType("serverType")
   * .token("token")
   * // the properties below are optional
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html)
   */
  public inline fun cfnSourceCredential(
    scope: Construct,
    id: String,
    block: CfnSourceCredentialDsl.() -> Unit = {},
  ): CfnSourceCredential {
    val builder = CfnSourceCredentialDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSourceCredential`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * CfnSourceCredentialProps cfnSourceCredentialProps = CfnSourceCredentialProps.builder()
   * .authType("authType")
   * .serverType("serverType")
   * .token("token")
   * // the properties below are optional
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-sourcecredential.html)
   */
  public inline fun cfnSourceCredentialProps(block: CfnSourceCredentialPropsDsl.() -> Unit = {}):
      CfnSourceCredentialProps {
    val builder = CfnSourceCredentialPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about logs built to a CloudWatch Log Group for a build project.
   *
   * Example:
   *
   * ```
   * Project.Builder.create(this, "Project")
   * .logging(LoggingOptions.builder()
   * .cloudWatch(CloudWatchLoggingOptions.builder()
   * .logGroup(new LogGroup(this, "MyLogGroup"))
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun cloudWatchLoggingOptions(block: CloudWatchLoggingOptionsDsl.() -> Unit = {}):
      CloudWatchLoggingOptions {
    val builder = CloudWatchLoggingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `CodeCommitSource`.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.codecommit.*;
   * Repository repo;
   * Bucket bucket;
   * Project project = Project.Builder.create(this, "MyProject")
   * .secondarySources(List.of(Source.codeCommit(CodeCommitSourceProps.builder()
   * .identifier("source2")
   * .repository(repo)
   * .build())))
   * .secondaryArtifacts(List.of(Artifacts.s3(S3ArtifactsProps.builder()
   * .identifier("artifact2")
   * .bucket(bucket)
   * .path("some/path")
   * .name("file.zip")
   * .build())))
   * .build();
   * ```
   */
  public inline fun codeCommitSourceProps(block: CodeCommitSourcePropsDsl.() -> Unit = {}):
      CodeCommitSourceProps {
    val builder = CodeCommitSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.codebuild.*;
   * import software.amazon.awscdk.services.ec2.*;
   * import software.amazon.awscdk.services.iam.*;
   * import software.amazon.awscdk.services.kms.*;
   * import software.amazon.awscdk.services.logs.*;
   * import software.amazon.awscdk.services.s3.*;
   * Bucket bucket;
   * IBuildImage buildImage;
   * BuildSpec buildSpec;
   * Cache cache;
   * IFileSystemLocation fileSystemLocation;
   * Key key;
   * LogGroup logGroup;
   * Role role;
   * SecurityGroup securityGroup;
   * Subnet subnet;
   * SubnetFilter subnetFilter;
   * Object value;
   * Vpc vpc;
   * CommonProjectProps commonProjectProps = CommonProjectProps.builder()
   * .allowAllOutbound(false)
   * .badge(false)
   * .buildSpec(buildSpec)
   * .cache(cache)
   * .checkSecretsInPlainTextEnvVariables(false)
   * .concurrentBuildLimit(123)
   * .description("description")
   * .encryptionKey(key)
   * .environment(BuildEnvironment.builder()
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
   * .environmentVariables(Map.of(
   * "environmentVariablesKey", BuildEnvironmentVariable.builder()
   * .value(value)
   * // the properties below are optional
   * .type(BuildEnvironmentVariableType.PLAINTEXT)
   * .build()))
   * .fileSystemLocations(List.of(fileSystemLocation))
   * .grantReportGroupPermissions(false)
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
   * .projectName("projectName")
   * .queuedTimeout(Duration.minutes(30))
   * .role(role)
   * .securityGroups(List.of(securityGroup))
   * .ssmSessionPermissions(false)
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
   * .build();
   * ```
   */
  public inline fun commonProjectProps(block: CommonProjectPropsDsl.() -> Unit = {}):
      CommonProjectProps {
    val builder = CommonProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The options when creating a CodeBuild Docker build image using
   * `LinuxBuildImage.fromDockerRegistry` or `WindowsBuildImage.fromDockerRegistry`.
   *
   * Example:
   *
   * ```
   * .environment(BuildEnvironment.builder()
   * .buildImage(LinuxBuildImage.fromDockerRegistry("my-registry/my-repo",
   * DockerImageOptions.builder()
   * .secretsManagerCredentials(secrets)
   * .build()))
   * .build())
   * .build();
   * ```
   */
  public inline fun dockerImageOptions(block: DockerImageOptionsDsl.() -> Unit = {}):
      DockerImageOptions {
    val builder = DockerImageOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `EfsFileSystemLocation`.
   *
   * Example:
   *
   * ```
   * Project.Builder.create(this, "MyProject")
   * .buildSpec(BuildSpec.fromObject(Map.of(
   * "version", "0.2")))
   * .fileSystemLocations(List.of(FileSystemLocation.efs(EfsFileSystemLocationProps.builder()
   * .identifier("myidentifier2")
   * .location("myclodation.mydnsroot.com:/loc")
   * .mountPoint("/media")
   * .mountOptions("opts")
   * .build())))
   * .build();
   * ```
   */
  public inline fun efsFileSystemLocationProps(block: EfsFileSystemLocationPropsDsl.() -> Unit =
      {}): EfsFileSystemLocationProps {
    val builder = EfsFileSystemLocationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The type returned from `IFileSystemLocation#bind`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * FileSystemConfig fileSystemConfig = FileSystemConfig.builder()
   * .location(ProjectFileSystemLocationProperty.builder()
   * .identifier("identifier")
   * .location("location")
   * .mountPoint("mountPoint")
   * .type("type")
   * // the properties below are optional
   * .mountOptions("mountOptions")
   * .build())
   * .build();
   * ```
   */
  public inline fun fileSystemConfig(block: FileSystemConfigDsl.() -> Unit = {}): FileSystemConfig {
    val builder = FileSystemConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The source credentials used when contacting the GitHub Enterprise API.
   *
   * **Note**: CodeBuild only allows a single credential for GitHub Enterprise
   * to be saved in a given AWS account in a given region -
   * any attempt to add more than one will result in an error.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.codebuild.*;
   * SecretValue secretValue;
   * GitHubEnterpriseSourceCredentials gitHubEnterpriseSourceCredentials =
   * GitHubEnterpriseSourceCredentials.Builder.create(this, "MyGitHubEnterpriseSourceCredentials")
   * .accessToken(secretValue)
   * .build();
   * ```
   */
  public inline fun gitHubEnterpriseSourceCredentials(
    scope: Construct,
    id: String,
    block: GitHubEnterpriseSourceCredentialsDsl.() -> Unit = {},
  ): GitHubEnterpriseSourceCredentials {
    val builder = GitHubEnterpriseSourceCredentialsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creation properties for `GitHubEnterpriseSourceCredentials`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.*;
   * import software.amazon.awscdk.services.codebuild.*;
   * SecretValue secretValue;
   * GitHubEnterpriseSourceCredentialsProps gitHubEnterpriseSourceCredentialsProps =
   * GitHubEnterpriseSourceCredentialsProps.builder()
   * .accessToken(secretValue)
   * .build();
   * ```
   */
  public inline
      fun gitHubEnterpriseSourceCredentialsProps(block: GitHubEnterpriseSourceCredentialsPropsDsl.() -> Unit
      = {}): GitHubEnterpriseSourceCredentialsProps {
    val builder = GitHubEnterpriseSourceCredentialsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `GitHubEnterpriseSource`.
   *
   * Example:
   *
   * ```
   * Project.Builder.create(this, "Project")
   * .source(Source.gitHubEnterprise(GitHubEnterpriseSourceProps.builder()
   * .httpsCloneUrl("https://my-github-enterprise.com/owner/repo")
   * .build()))
   * // Enable Docker AND custom caching
   * .cache(Cache.local(LocalCacheMode.DOCKER_LAYER, LocalCacheMode.CUSTOM))
   * // BuildSpec with a 'cache' section necessary for 'CUSTOM' caching. This can
   * // also come from 'buildspec.yml' in your source.
   * .buildSpec(BuildSpec.fromObject(Map.of(
   * "version", "0.2",
   * "phases", Map.of(
   * "build", Map.of(
   * "commands", List.of("..."))),
   * "cache", Map.of(
   * "paths", List.of("/root/cachedir/ **&#47;*")))))
   * .build();
   * ```
   */
  public inline fun gitHubEnterpriseSourceProps(block: GitHubEnterpriseSourcePropsDsl.() -> Unit =
      {}): GitHubEnterpriseSourceProps {
    val builder = GitHubEnterpriseSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The source credentials used when contacting the GitHub API.
   *
   * **Note**: CodeBuild only allows a single credential for GitHub
   * to be saved in a given AWS account in a given region -
   * any attempt to add more than one will result in an error.
   *
   * Example:
   *
   * ```
   * GitHubSourceCredentials.Builder.create(this, "CodeBuildGitHubCreds")
   * .accessToken(SecretValue.secretsManager("my-token"))
   * .build();
   * ```
   */
  public inline fun gitHubSourceCredentials(
    scope: Construct,
    id: String,
    block: GitHubSourceCredentialsDsl.() -> Unit = {},
  ): GitHubSourceCredentials {
    val builder = GitHubSourceCredentialsDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creation properties for `GitHubSourceCredentials`.
   *
   * Example:
   *
   * ```
   * GitHubSourceCredentials.Builder.create(this, "CodeBuildGitHubCreds")
   * .accessToken(SecretValue.secretsManager("my-token"))
   * .build();
   * ```
   */
  public inline fun gitHubSourceCredentialsProps(block: GitHubSourceCredentialsPropsDsl.() -> Unit =
      {}): GitHubSourceCredentialsProps {
    val builder = GitHubSourceCredentialsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `GitHubSource` and `GitHubEnterpriseSource`.
   *
   * Example:
   *
   * ```
   * Project project = Project.Builder.create(this, "MyProject")
   * .buildSpec(BuildSpec.fromSourceFilename("my-buildspec.yml"))
   * .source(Source.gitHub(GitHubSourceProps.builder()
   * .owner("awslabs")
   * .repo("aws-cdk")
   * .build()))
   * .build();
   * ```
   */
  public inline fun gitHubSourceProps(block: GitHubSourcePropsDsl.() -> Unit = {}):
      GitHubSourceProps {
    val builder = GitHubSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about logs for the build project.
   *
   * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
   *
   * Example:
   *
   * ```
   * Project.Builder.create(this, "Project")
   * .logging(LoggingOptions.builder()
   * .cloudWatch(CloudWatchLoggingOptions.builder()
   * .logGroup(new LogGroup(this, "MyLogGroup"))
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun loggingOptions(block: LoggingOptionsDsl.() -> Unit = {}): LoggingOptions {
    val builder = LoggingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A convenience class for CodeBuild Projects that are used in CodePipeline.
   *
   * Example:
   *
   * ```
   * // Create a Cloudfront Web Distribution
   * import software.amazon.awscdk.services.cloudfront.*;
   * Distribution distribution;
   * // Create the build project that will invalidate the cache
   * PipelineProject invalidateBuildProject = PipelineProject.Builder.create(this,
   * "InvalidateProject")
   * .buildSpec(BuildSpec.fromObject(Map.of(
   * "version", "0.2",
   * "phases", Map.of(
   * "build", Map.of(
   * "commands", List.of("aws cloudfront create-invalidation --distribution-id
   * ${CLOUDFRONT_ID} --paths \"/ *\""))))))
   * .environmentVariables(Map.of(
   * "CLOUDFRONT_ID",
   * BuildEnvironmentVariable.builder().value(distribution.getDistributionId()).build()))
   * .build();
   * // Add Cloudfront invalidation permissions to the project
   * String distributionArn = String.format("arn:aws:cloudfront::%s:distribution/%s", this.account,
   * distribution.getDistributionId());
   * invalidateBuildProject.addToRolePolicy(PolicyStatement.Builder.create()
   * .resources(List.of(distributionArn))
   * .actions(List.of("cloudfront:CreateInvalidation"))
   * .build());
   * // Create the pipeline (here only the S3 deploy and Invalidate cache build)
   * Bucket deployBucket = new Bucket(this, "DeployBucket");
   * Artifact deployInput = new Artifact();
   * Pipeline.Builder.create(this, "Pipeline")
   * .stages(List.of(StageProps.builder()
   * .stageName("Deploy")
   * .actions(List.of(
   * S3DeployAction.Builder.create()
   * .actionName("S3Deploy")
   * .bucket(deployBucket)
   * .input(deployInput)
   * .runOrder(1)
   * .build(),
   * CodeBuildAction.Builder.create()
   * .actionName("InvalidateCache")
   * .project(invalidateBuildProject)
   * .input(deployInput)
   * .runOrder(2)
   * .build()))
   * .build()))
   * .build();
   * ```
   */
  public inline fun pipelineProject(
    scope: Construct,
    id: String,
    block: PipelineProjectDsl.() -> Unit = {},
  ): PipelineProject {
    val builder = PipelineProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // Create a Cloudfront Web Distribution
   * import software.amazon.awscdk.services.cloudfront.*;
   * Distribution distribution;
   * // Create the build project that will invalidate the cache
   * PipelineProject invalidateBuildProject = PipelineProject.Builder.create(this,
   * "InvalidateProject")
   * .buildSpec(BuildSpec.fromObject(Map.of(
   * "version", "0.2",
   * "phases", Map.of(
   * "build", Map.of(
   * "commands", List.of("aws cloudfront create-invalidation --distribution-id
   * ${CLOUDFRONT_ID} --paths \"/ *\""))))))
   * .environmentVariables(Map.of(
   * "CLOUDFRONT_ID",
   * BuildEnvironmentVariable.builder().value(distribution.getDistributionId()).build()))
   * .build();
   * // Add Cloudfront invalidation permissions to the project
   * String distributionArn = String.format("arn:aws:cloudfront::%s:distribution/%s", this.account,
   * distribution.getDistributionId());
   * invalidateBuildProject.addToRolePolicy(PolicyStatement.Builder.create()
   * .resources(List.of(distributionArn))
   * .actions(List.of("cloudfront:CreateInvalidation"))
   * .build());
   * // Create the pipeline (here only the S3 deploy and Invalidate cache build)
   * Bucket deployBucket = new Bucket(this, "DeployBucket");
   * Artifact deployInput = new Artifact();
   * Pipeline.Builder.create(this, "Pipeline")
   * .stages(List.of(StageProps.builder()
   * .stageName("Deploy")
   * .actions(List.of(
   * S3DeployAction.Builder.create()
   * .actionName("S3Deploy")
   * .bucket(deployBucket)
   * .input(deployInput)
   * .runOrder(1)
   * .build(),
   * CodeBuildAction.Builder.create()
   * .actionName("InvalidateCache")
   * .project(invalidateBuildProject)
   * .input(deployInput)
   * .runOrder(2)
   * .build()))
   * .build()))
   * .build();
   * ```
   */
  public inline fun pipelineProjectProps(block: PipelineProjectPropsDsl.() -> Unit = {}):
      PipelineProjectProps {
    val builder = PipelineProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A representation of a CodeBuild Project.
   *
   * Example:
   *
   * ```
   * Repository ecrRepository;
   * Project.Builder.create(this, "Project")
   * .environment(BuildEnvironment.builder()
   * .buildImage(WindowsBuildImage.fromEcrRepository(ecrRepository, "v1.0",
   * WindowsImageType.SERVER_2019))
   * // optional certificate to include in the build image
   * .certificate(BuildEnvironmentCertificate.builder()
   * .bucket(Bucket.fromBucketName(this, "Bucket", "my-bucket"))
   * .objectKey("path/to/cert.pem")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun project(
    scope: Construct,
    id: String,
    block: ProjectDsl.() -> Unit = {},
  ): Project {
    val builder = ProjectDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Additional options to pass to the notification rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * import software.amazon.awscdk.services.codestarnotifications.*;
   * ProjectNotifyOnOptions projectNotifyOnOptions = ProjectNotifyOnOptions.builder()
   * .events(List.of(ProjectNotificationEvents.BUILD_FAILED))
   * // the properties below are optional
   * .detailType(DetailType.BASIC)
   * .enabled(false)
   * .notificationRuleName("notificationRuleName")
   * .build();
   * ```
   */
  public inline fun projectNotifyOnOptions(block: ProjectNotifyOnOptionsDsl.() -> Unit = {}):
      ProjectNotifyOnOptions {
    val builder = ProjectNotifyOnOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * Repository ecrRepository;
   * Project.Builder.create(this, "Project")
   * .environment(BuildEnvironment.builder()
   * .buildImage(WindowsBuildImage.fromEcrRepository(ecrRepository, "v1.0",
   * WindowsImageType.SERVER_2019))
   * // optional certificate to include in the build image
   * .certificate(BuildEnvironmentCertificate.builder()
   * .bucket(Bucket.fromBucketName(this, "Bucket", "my-bucket"))
   * .objectKey("path/to/cert.pem")
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun projectProps(block: ProjectPropsDsl.() -> Unit = {}): ProjectProps {
    val builder = ProjectPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The ReportGroup resource class.
   *
   * Example:
   *
   * ```
   * Source source;
   * // create a new ReportGroup
   * ReportGroup reportGroup = new ReportGroup(this, "ReportGroup");
   * Project project = Project.Builder.create(this, "Project")
   * .source(source)
   * .buildSpec(BuildSpec.fromObject(Map.of(
   * // ...
   * "reports", Map.of(
   * reportGroup.getReportGroupArn(), Map.of(
   * "files", "**&#47;*",
   * "base-directory", "build/test-results")))))
   * .build();
   * ```
   */
  public inline fun reportGroup(
    scope: Construct,
    id: String,
    block: ReportGroupDsl.() -> Unit = {},
  ): ReportGroup {
    val builder = ReportGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `ReportGroup`.
   *
   * Example:
   *
   * ```
   * Source source;
   * // create a new ReportGroup
   * ReportGroup reportGroup = ReportGroup.Builder.create(this, "ReportGroup")
   * .type(ReportGroupType.CODE_COVERAGE)
   * .build();
   * Project project = Project.Builder.create(this, "Project")
   * .source(source)
   * .buildSpec(BuildSpec.fromObject(Map.of(
   * // ...
   * "reports", Map.of(
   * reportGroup.getReportGroupArn(), Map.of(
   * "files", "**&#47;*",
   * "base-directory", "build/coverage-report.xml",
   * "file-format", "JACOCOXML")))))
   * .build();
   * ```
   */
  public inline fun reportGroupProps(block: ReportGroupPropsDsl.() -> Unit = {}): ReportGroupProps {
    val builder = ReportGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `S3Artifacts`.
   *
   * Example:
   *
   * ```
   * Bucket bucket;
   * Project project = Project.Builder.create(this, "MyProject")
   * .buildSpec(BuildSpec.fromObject(Map.of(
   * "version", "0.2")))
   * .artifacts(Artifacts.s3(S3ArtifactsProps.builder()
   * .bucket(bucket)
   * .includeBuildId(false)
   * .packageZip(true)
   * .path("another/path")
   * .identifier("AddArtifact1")
   * .build()))
   * .build();
   * ```
   */
  public inline fun s3ArtifactsProps(block: S3ArtifactsPropsDsl.() -> Unit = {}): S3ArtifactsProps {
    val builder = S3ArtifactsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about logs built to an S3 bucket for a build project.
   *
   * Example:
   *
   * ```
   * Project.Builder.create(this, "Project")
   * .logging(LoggingOptions.builder()
   * .s3(S3LoggingOptions.builder()
   * .bucket(new Bucket(this, "LogBucket"))
   * .build())
   * .build())
   * .build();
   * ```
   */
  public inline fun s3LoggingOptions(block: S3LoggingOptionsDsl.() -> Unit = {}): S3LoggingOptions {
    val builder = S3LoggingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for `S3Source`.
   *
   * Example:
   *
   * ```
   * Bucket bucket = new Bucket(this, "MyBucket");
   * Project.Builder.create(this, "MyProject")
   * .source(Source.s3(S3SourceProps.builder()
   * .bucket(bucket)
   * .path("path/to/file.zip")
   * .build()))
   * .build();
   * ```
   */
  public inline fun s3SourceProps(block: S3SourcePropsDsl.() -> Unit = {}): S3SourceProps {
    val builder = S3SourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The type returned from `ISource#bind`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * SourceConfig sourceConfig = SourceConfig.builder()
   * .sourceProperty(SourceProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .auth(SourceAuthProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .resource("resource")
   * .build())
   * .buildSpec("buildSpec")
   * .buildStatusConfig(BuildStatusConfigProperty.builder()
   * .context("context")
   * .targetUrl("targetUrl")
   * .build())
   * .gitCloneDepth(123)
   * .gitSubmodulesConfig(GitSubmodulesConfigProperty.builder()
   * .fetchSubmodules(false)
   * .build())
   * .insecureSsl(false)
   * .location("location")
   * .reportBuildStatus(false)
   * .sourceIdentifier("sourceIdentifier")
   * .build())
   * // the properties below are optional
   * .buildTriggers(ProjectTriggersProperty.builder()
   * .buildType("buildType")
   * .filterGroups(List.of(List.of(WebhookFilterProperty.builder()
   * .pattern("pattern")
   * .type("type")
   * // the properties below are optional
   * .excludeMatchedPattern(false)
   * .build())))
   * .webhook(false)
   * .build())
   * .sourceVersion("sourceVersion")
   * .build();
   * ```
   */
  public inline fun sourceConfig(block: SourceConfigDsl.() -> Unit = {}): SourceConfig {
    val builder = SourceConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties common to all Source classes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * SourceProps sourceProps = SourceProps.builder()
   * .identifier("identifier")
   * .build();
   * ```
   */
  public inline fun sourceProps(block: SourcePropsDsl.() -> Unit = {}): SourceProps {
    val builder = SourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Permissions Boundary for a CodeBuild Project running untrusted code.
   *
   * This class is a Policy, intended to be used as a Permissions Boundary
   * for a CodeBuild project. It allows most of the actions necessary to run
   * the CodeBuild project, but disallows reading from Parameter Store
   * and Secrets Manager.
   *
   * Use this when your CodeBuild project is running untrusted code (for
   * example, if you are using one to automatically build Pull Requests
   * that anyone can submit), and you want to prevent your future self
   * from accidentally exposing Secrets to this build.
   *
   * (The reason you might want to do this is because otherwise anyone
   * who can submit a Pull Request to your project can write a script
   * to email those secrets to themselves).
   *
   * Example:
   *
   * ```
   * Project project;
   * PermissionsBoundary.of(project).apply(new UntrustedCodeBoundaryPolicy(this, "Boundary"));
   * ```
   */
  public inline fun untrustedCodeBoundaryPolicy(
    scope: Construct,
    id: String,
    block: UntrustedCodeBoundaryPolicyDsl.() -> Unit = {},
  ): UntrustedCodeBoundaryPolicy {
    val builder = UntrustedCodeBoundaryPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Construction properties for UntrustedCodeBoundaryPolicy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.codebuild.*;
   * import software.amazon.awscdk.services.iam.*;
   * PolicyStatement policyStatement;
   * UntrustedCodeBoundaryPolicyProps untrustedCodeBoundaryPolicyProps =
   * UntrustedCodeBoundaryPolicyProps.builder()
   * .additionalStatements(List.of(policyStatement))
   * .managedPolicyName("managedPolicyName")
   * .build();
   * ```
   */
  public inline
      fun untrustedCodeBoundaryPolicyProps(block: UntrustedCodeBoundaryPolicyPropsDsl.() -> Unit =
      {}): UntrustedCodeBoundaryPolicyProps {
    val builder = UntrustedCodeBoundaryPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
