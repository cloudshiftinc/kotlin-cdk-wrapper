@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CodeBuild::Project` resource configures how AWS CodeBuild builds your source code.
 *
 * For example, it tells CodeBuild where to get the source code and which build environment to use.
 *
 *
 * To unset or remove a project value via CFN, explicitly provide the attribute with value as empty
 * input.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
 * .fleet(ProjectFleetProperty.builder()
 * .fleetArn("fleetArn")
 * .build())
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
public open class CfnProject(
  cdkObject: software.amazon.awscdk.services.codebuild.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps,
  ) :
      this(software.amazon.awscdk.services.codebuild.CfnProject(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnProjectProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProjectProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProjectProps(props)
  )

  /**
   * `Artifacts` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
   */
  public open fun artifacts(): Any = unwrap(this).getArtifacts()

  /**
   * `Artifacts` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
   */
  public open fun artifacts(`value`: IResolvable) {
    unwrap(this).setArtifacts(`value`.let(IResolvable::unwrap))
  }

  /**
   * `Artifacts` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
   */
  public open fun artifacts(`value`: ArtifactsProperty) {
    unwrap(this).setArtifacts(`value`.let(ArtifactsProperty::unwrap))
  }

  /**
   * `Artifacts` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("71f3dbc989f533890d9328c639ebdf9d629fb1fb0713fd5cedeae05658d048cf")
  public open fun artifacts(`value`: ArtifactsProperty.Builder.() -> Unit): Unit =
      artifacts(ArtifactsProperty(`value`))

  /**
   * The ARN of the AWS CodeBuild project, such as
   * `arn:aws:codebuild:us-west-2:123456789012:project/myProjectName` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
   * badge.
   */
  public open fun badgeEnabled(): Any? = unwrap(this).getBadgeEnabled()

  /**
   * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
   * badge.
   */
  public open fun badgeEnabled(`value`: Boolean) {
    unwrap(this).setBadgeEnabled(`value`)
  }

  /**
   * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
   * badge.
   */
  public open fun badgeEnabled(`value`: IResolvable) {
    unwrap(this).setBadgeEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
   */
  public open fun buildBatchConfig(): Any? = unwrap(this).getBuildBatchConfig()

  /**
   * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
   */
  public open fun buildBatchConfig(`value`: IResolvable) {
    unwrap(this).setBuildBatchConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
   */
  public open fun buildBatchConfig(`value`: ProjectBuildBatchConfigProperty) {
    unwrap(this).setBuildBatchConfig(`value`.let(ProjectBuildBatchConfigProperty::unwrap))
  }

  /**
   * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("484f75feba2cbc64318c2acb155a207ecb46c2b14edd0d60f3ffe37d9ada0f0a")
  public open fun buildBatchConfig(`value`: ProjectBuildBatchConfigProperty.Builder.() -> Unit):
      Unit = buildBatchConfig(ProjectBuildBatchConfigProperty(`value`))

  /**
   * Settings that AWS CodeBuild uses to store and reuse build dependencies.
   */
  public open fun cache(): Any? = unwrap(this).getCache()

  /**
   * Settings that AWS CodeBuild uses to store and reuse build dependencies.
   */
  public open fun cache(`value`: IResolvable) {
    unwrap(this).setCache(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings that AWS CodeBuild uses to store and reuse build dependencies.
   */
  public open fun cache(`value`: ProjectCacheProperty) {
    unwrap(this).setCache(`value`.let(ProjectCacheProperty::unwrap))
  }

  /**
   * Settings that AWS CodeBuild uses to store and reuse build dependencies.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a25e4b68b4cbdad7a87c238aafd1fba1069f634fa898b23a0780c7c42339d009")
  public open fun cache(`value`: ProjectCacheProperty.Builder.() -> Unit): Unit =
      cache(ProjectCacheProperty(`value`))

  /**
   * The maximum number of concurrent builds that are allowed for this project.
   */
  public open fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

  /**
   * The maximum number of concurrent builds that are allowed for this project.
   */
  public open fun concurrentBuildLimit(`value`: Number) {
    unwrap(this).setConcurrentBuildLimit(`value`)
  }

  /**
   * A description that makes the build project easy to identify.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description that makes the build project easy to identify.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The AWS Key Management Service customer master key (CMK) to be used for encrypting the build
   * output artifacts.
   */
  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The AWS Key Management Service customer master key (CMK) to be used for encrypting the build
   * output artifacts.
   */
  public open fun encryptionKey(`value`: String) {
    unwrap(this).setEncryptionKey(`value`)
  }

  /**
   * The build environment settings for the project, such as the environment type or the environment
   * variables to use for the build environment.
   */
  public open fun environment(): Any = unwrap(this).getEnvironment()

  /**
   * The build environment settings for the project, such as the environment type or the environment
   * variables to use for the build environment.
   */
  public open fun environment(`value`: IResolvable) {
    unwrap(this).setEnvironment(`value`.let(IResolvable::unwrap))
  }

  /**
   * The build environment settings for the project, such as the environment type or the environment
   * variables to use for the build environment.
   */
  public open fun environment(`value`: EnvironmentProperty) {
    unwrap(this).setEnvironment(`value`.let(EnvironmentProperty::unwrap))
  }

  /**
   * The build environment settings for the project, such as the environment type or the environment
   * variables to use for the build environment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("339139e6c33d66fce22ac58657966e5402f26c47d0d1f37450bfdd537854ff75")
  public open fun environment(`value`: EnvironmentProperty.Builder.() -> Unit): Unit =
      environment(EnvironmentProperty(`value`))

  /**
   * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
   */
  public open fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

  /**
   * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
   */
  public open fun fileSystemLocations(`value`: IResolvable) {
    unwrap(this).setFileSystemLocations(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
   */
  public open fun fileSystemLocations(`value`: List<Any>) {
    unwrap(this).setFileSystemLocations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
   */
  public open fun fileSystemLocations(vararg `value`: Any): Unit =
      fileSystemLocations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Information about logs for the build project.
   */
  public open fun logsConfig(): Any? = unwrap(this).getLogsConfig()

  /**
   * Information about logs for the build project.
   */
  public open fun logsConfig(`value`: IResolvable) {
    unwrap(this).setLogsConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about logs for the build project.
   */
  public open fun logsConfig(`value`: LogsConfigProperty) {
    unwrap(this).setLogsConfig(`value`.let(LogsConfigProperty::unwrap))
  }

  /**
   * Information about logs for the build project.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3533f3baf314fa98525c8d3c2ac4173dfb49df27f0a7f282e45472c10587e10")
  public open fun logsConfig(`value`: LogsConfigProperty.Builder.() -> Unit): Unit =
      logsConfig(LogsConfigProperty(`value`))

  /**
   * The name of the build project.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the build project.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The number of minutes a build is allowed to be queued before it times out.
   */
  public open fun queuedTimeoutInMinutes(): Number? = unwrap(this).getQueuedTimeoutInMinutes()

  /**
   * The number of minutes a build is allowed to be queued before it times out.
   */
  public open fun queuedTimeoutInMinutes(`value`: Number) {
    unwrap(this).setQueuedTimeoutInMinutes(`value`)
  }

  /**
   * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3
   * artifacts for the project's builds.
   */
  public open fun resourceAccessRole(): String? = unwrap(this).getResourceAccessRole()

  /**
   * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3
   * artifacts for the project's builds.
   */
  public open fun resourceAccessRole(`value`: String) {
    unwrap(this).setResourceAccessRole(`value`)
  }

  /**
   * A list of `Artifacts` objects.
   */
  public open fun secondaryArtifacts(): Any? = unwrap(this).getSecondaryArtifacts()

  /**
   * A list of `Artifacts` objects.
   */
  public open fun secondaryArtifacts(`value`: IResolvable) {
    unwrap(this).setSecondaryArtifacts(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `Artifacts` objects.
   */
  public open fun secondaryArtifacts(`value`: List<Any>) {
    unwrap(this).setSecondaryArtifacts(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of `Artifacts` objects.
   */
  public open fun secondaryArtifacts(vararg `value`: Any): Unit =
      secondaryArtifacts(`value`.toList())

  /**
   * An array of `ProjectSourceVersion` objects.
   */
  public open fun secondarySourceVersions(): Any? = unwrap(this).getSecondarySourceVersions()

  /**
   * An array of `ProjectSourceVersion` objects.
   */
  public open fun secondarySourceVersions(`value`: IResolvable) {
    unwrap(this).setSecondarySourceVersions(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `ProjectSourceVersion` objects.
   */
  public open fun secondarySourceVersions(`value`: List<Any>) {
    unwrap(this).setSecondarySourceVersions(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of `ProjectSourceVersion` objects.
   */
  public open fun secondarySourceVersions(vararg `value`: Any): Unit =
      secondarySourceVersions(`value`.toList())

  /**
   * An array of `ProjectSource` objects.
   */
  public open fun secondarySources(): Any? = unwrap(this).getSecondarySources()

  /**
   * An array of `ProjectSource` objects.
   */
  public open fun secondarySources(`value`: IResolvable) {
    unwrap(this).setSecondarySources(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of `ProjectSource` objects.
   */
  public open fun secondarySources(`value`: List<Any>) {
    unwrap(this).setSecondarySources(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of `ProjectSource` objects.
   */
  public open fun secondarySources(vararg `value`: Any): Unit = secondarySources(`value`.toList())

  /**
   * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on
   * behalf of the AWS account.
   */
  public open fun serviceRole(): String = unwrap(this).getServiceRole()

  /**
   * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on
   * behalf of the AWS account.
   */
  public open fun serviceRole(`value`: String) {
    unwrap(this).setServiceRole(`value`)
  }

  /**
   * The source code settings for the project, such as the source code's repository type and
   * location.
   */
  public open fun source(): Any = unwrap(this).getSource()

  /**
   * The source code settings for the project, such as the source code's repository type and
   * location.
   */
  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The source code settings for the project, such as the source code's repository type and
   * location.
   */
  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
  }

  /**
   * The source code settings for the project, such as the source code's repository type and
   * location.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28b8bfc3cef42f27acf96c159ffd29a62d746a7024d5a36166d72768dd036bbe")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  /**
   * A version of the build input to be built for this project.
   */
  public open fun sourceVersion(): String? = unwrap(this).getSourceVersion()

  /**
   * A version of the build input to be built for this project.
   */
  public open fun sourceVersion(`value`: String) {
    unwrap(this).setSourceVersion(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
   * related build that did not get marked as completed.
   */
  public open fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  /**
   * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
   * related build that did not get marked as completed.
   */
  public open fun timeoutInMinutes(`value`: Number) {
    unwrap(this).setTimeoutInMinutes(`value`)
  }

  /**
   * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
   * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
   * code change is pushed to the repository.
   */
  public open fun triggers(): Any? = unwrap(this).getTriggers()

  /**
   * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
   * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
   * code change is pushed to the repository.
   */
  public open fun triggers(`value`: IResolvable) {
    unwrap(this).setTriggers(`value`.let(IResolvable::unwrap))
  }

  /**
   * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
   * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
   * code change is pushed to the repository.
   */
  public open fun triggers(`value`: ProjectTriggersProperty) {
    unwrap(this).setTriggers(`value`.let(ProjectTriggersProperty::unwrap))
  }

  /**
   * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
   * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
   * code change is pushed to the repository.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("62ce3f06737317e4a4a80cd4bc4039899696dd05ca537a31b764543a1d3c1817")
  public open fun triggers(`value`: ProjectTriggersProperty.Builder.() -> Unit): Unit =
      triggers(ProjectTriggersProperty(`value`))

  /**
   * Specifies the visibility of the project's builds.
   *
   * Possible values are:.
   */
  public open fun visibility(): String? = unwrap(this).getVisibility()

  /**
   * Specifies the visibility of the project's builds.
   *
   * Possible values are:.
   */
  public open fun visibility(`value`: String) {
    unwrap(this).setVisibility(`value`)
  }

  /**
   * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon VPC.
   */
  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon VPC.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon VPC.
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  /**
   * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon VPC.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da399bcc50712221cb5eff394014b7165bcf6832355e8ca81992ca62492cf15d")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.CfnProject].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    public fun artifacts(artifacts: IResolvable)

    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    public fun artifacts(artifacts: ArtifactsProperty)

    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("459b334499b8df6cc300cd5cb1d97e853af8edaa43b90f827dae7dd63c489098")
    public fun artifacts(artifacts: ArtifactsProperty.Builder.() -> Unit)

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see [Build Badges
     * Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html) in the
     * *AWS CodeBuild User Guide* .
     *
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     * your project's build badge. 
     */
    public fun badgeEnabled(badgeEnabled: Boolean)

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see [Build Badges
     * Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html) in the
     * *AWS CodeBuild User Guide* .
     *
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     * your project's build badge. 
     */
    public fun badgeEnabled(badgeEnabled: IResolvable)

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project. 
     */
    public fun buildBatchConfig(buildBatchConfig: IResolvable)

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project. 
     */
    public fun buildBatchConfig(buildBatchConfig: ProjectBuildBatchConfigProperty)

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a99374d660e9ee6cf2fb9800fd16273ab4eefa9fe56510b3ca8938e81cc823c2")
    public
        fun buildBatchConfig(buildBatchConfig: ProjectBuildBatchConfigProperty.Builder.() -> Unit)

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies. 
     */
    public fun cache(cache: IResolvable)

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies. 
     */
    public fun cache(cache: ProjectCacheProperty)

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87e43351c2449e4d419f7c2b3068ef4e251d4838bbed64849d05a69198f5ec75")
    public fun cache(cache: ProjectCacheProperty.Builder.() -> Unit)

    /**
     * The maximum number of concurrent builds that are allowed for this project.
     *
     * New builds are only started if the current number of builds is less than or equal to this
     * limit. If the current build count meets this limit, new builds are throttled and are not run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-concurrentbuildlimit)
     * @param concurrentBuildLimit The maximum number of concurrent builds that are allowed for this
     * project. 
     */
    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    /**
     * A description that makes the build project easy to identify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description)
     * @param description A description that makes the build project easy to identify. 
     */
    public fun description(description: String)

    /**
     * The AWS Key Management Service customer master key (CMK) to be used for encrypting the build
     * output artifacts.
     *
     *
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service
     * role has permission to that key.
     *
     *
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's
     * alias (using the format `alias/&lt;alias-name&gt;` ). If you don't specify a value, CodeBuild
     * uses the managed CMK for Amazon Simple Storage Service (Amazon S3).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey)
     * @param encryptionKey The AWS Key Management Service customer master key (CMK) to be used for
     * encrypting the build output artifacts. 
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    public fun environment(environment: IResolvable)

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    public fun environment(environment: EnvironmentProperty)

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17fa6e8915386f41fd25a1f78bacf242ffcc47f74961a5f760c62f79a6046b31")
    public fun environment(environment: EnvironmentProperty.Builder.() -> Unit)

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project. 
     */
    public fun fileSystemLocations(fileSystemLocations: IResolvable)

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project. 
     */
    public fun fileSystemLocations(fileSystemLocations: List<Any>)

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project. 
     */
    public fun fileSystemLocations(vararg fileSystemLocations: Any)

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     * @param logsConfig Information about logs for the build project. 
     */
    public fun logsConfig(logsConfig: IResolvable)

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     * @param logsConfig Information about logs for the build project. 
     */
    public fun logsConfig(logsConfig: LogsConfigProperty)

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     * @param logsConfig Information about logs for the build project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3caea299a6117c080eaf244e0c9266864386388512f206a3e2be71df3fe17565")
    public fun logsConfig(logsConfig: LogsConfigProperty.Builder.() -> Unit)

    /**
     * The name of the build project.
     *
     * The name must be unique across all of the projects in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name)
     * @param name The name of the build project. 
     */
    public fun name(name: String)

    /**
     * The number of minutes a build is allowed to be queued before it times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes)
     * @param queuedTimeoutInMinutes The number of minutes a build is allowed to be queued before it
     * times out. 
     */
    public fun queuedTimeoutInMinutes(queuedTimeoutInMinutes: Number)

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3
     * artifacts for the project's builds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-resourceaccessrole)
     * @param resourceAccessRole The ARN of the IAM role that enables CodeBuild to access the
     * CloudWatch Logs and Amazon S3 artifacts for the project's builds. 
     */
    public fun resourceAccessRole(resourceAccessRole: String)

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     * @param secondaryArtifacts A list of `Artifacts` objects. 
     */
    public fun secondaryArtifacts(secondaryArtifacts: IResolvable)

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     * @param secondaryArtifacts A list of `Artifacts` objects. 
     */
    public fun secondaryArtifacts(secondaryArtifacts: List<Any>)

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     * @param secondaryArtifacts A list of `Artifacts` objects. 
     */
    public fun secondaryArtifacts(vararg secondaryArtifacts: Any)

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects. 
     */
    public fun secondarySourceVersions(secondarySourceVersions: IResolvable)

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects. 
     */
    public fun secondarySourceVersions(secondarySourceVersions: List<Any>)

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects. 
     */
    public fun secondarySourceVersions(vararg secondarySourceVersions: Any)

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     * @param secondarySources An array of `ProjectSource` objects. 
     */
    public fun secondarySources(secondarySources: IResolvable)

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     * @param secondarySources An array of `ProjectSource` objects. 
     */
    public fun secondarySources(secondarySources: List<Any>)

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     * @param secondarySources An array of `ProjectSource` objects. 
     */
    public fun secondarySources(vararg secondarySources: Any)

    /**
     * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on
     * behalf of the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole)
     * @param serviceRole The ARN of the IAM role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account. 
     */
    public fun serviceRole(serviceRole: String)

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    public fun source(source: IResolvable)

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    public fun source(source: SourceProperty)

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("418cfd1c63a6c94fc6abd6b21ba2eea2769b2997ac24a51f4464397a24e0e412")
    public fun source(source: SourceProperty.Builder.() -> Unit)

    /**
     * A version of the build input to be built for this project.
     *
     * If not specified, the latest version is used. If specified, it must be one of:
     *
     * * For CodeCommit: the commit ID, branch, or Git tag to use.
     * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to
     * the version of the source code you want to build. If a pull request ID is specified, it must use
     * the format `pr/pull-request-ID` (for example `pr/25` ). If a branch name is specified, the
     * branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of
     * the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is
     * used. If not specified, the default branch's HEAD commit ID is used.
     * * For Amazon S3: the version ID of the object that represents the build input ZIP file to
     * use.
     *
     * If `sourceVersion` is specified at the build level, then that version takes precedence over
     * this `sourceVersion` (at the project level).
     *
     * For more information, see [Source Version Sample with
     * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html) in
     * the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-sourceversion)
     * @param sourceVersion A version of the build input to be built for this project. 
     */
    public fun sourceVersion(sourceVersion: String)

    /**
     * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out
     * any related build that did not get marked as completed.
     *
     * The default is 60 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes)
     * @param timeoutInMinutes How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to
     * wait before timing out any related build that did not get marked as completed. 
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number)

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
     * code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository. 
     */
    public fun triggers(triggers: IResolvable)

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
     * code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository. 
     */
    public fun triggers(triggers: ProjectTriggersProperty)

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
     * code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6989486a850294b2ed92ef6b257e8ed01cff283d6163bdc1ccd27ee4c4b7a753")
    public fun triggers(triggers: ProjectTriggersProperty.Builder.() -> Unit)

    /**
     * Specifies the visibility of the project's builds. Possible values are:.
     *
     * * **PUBLIC_READ** - The project builds are visible to the public.
     * * **PRIVATE** - The project builds are not visible to the public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-visibility)
     * @param visibility Specifies the visibility of the project's builds. Possible values are:. 
     */
    public fun visibility(visibility: String)

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78a3ddc4357c4f9c956f386a567a0303a2f89eff23a28547bc3546f98d3d0a49")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnProject.Builder =
        software.amazon.awscdk.services.codebuild.CfnProject.Builder.create(scope, id)

    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    override fun artifacts(artifacts: IResolvable) {
      cdkBuilder.artifacts(artifacts.let(IResolvable::unwrap))
    }

    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    override fun artifacts(artifacts: ArtifactsProperty) {
      cdkBuilder.artifacts(artifacts.let(ArtifactsProperty::unwrap))
    }

    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("459b334499b8df6cc300cd5cb1d97e853af8edaa43b90f827dae7dd63c489098")
    override fun artifacts(artifacts: ArtifactsProperty.Builder.() -> Unit): Unit =
        artifacts(ArtifactsProperty(artifacts))

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see [Build Badges
     * Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html) in the
     * *AWS CodeBuild User Guide* .
     *
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     * your project's build badge. 
     */
    override fun badgeEnabled(badgeEnabled: Boolean) {
      cdkBuilder.badgeEnabled(badgeEnabled)
    }

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see [Build Badges
     * Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html) in the
     * *AWS CodeBuild User Guide* .
     *
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     * your project's build badge. 
     */
    override fun badgeEnabled(badgeEnabled: IResolvable) {
      cdkBuilder.badgeEnabled(badgeEnabled.let(IResolvable::unwrap))
    }

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project. 
     */
    override fun buildBatchConfig(buildBatchConfig: IResolvable) {
      cdkBuilder.buildBatchConfig(buildBatchConfig.let(IResolvable::unwrap))
    }

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project. 
     */
    override fun buildBatchConfig(buildBatchConfig: ProjectBuildBatchConfigProperty) {
      cdkBuilder.buildBatchConfig(buildBatchConfig.let(ProjectBuildBatchConfigProperty::unwrap))
    }

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a99374d660e9ee6cf2fb9800fd16273ab4eefa9fe56510b3ca8938e81cc823c2")
    override
        fun buildBatchConfig(buildBatchConfig: ProjectBuildBatchConfigProperty.Builder.() -> Unit):
        Unit = buildBatchConfig(ProjectBuildBatchConfigProperty(buildBatchConfig))

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies. 
     */
    override fun cache(cache: IResolvable) {
      cdkBuilder.cache(cache.let(IResolvable::unwrap))
    }

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies. 
     */
    override fun cache(cache: ProjectCacheProperty) {
      cdkBuilder.cache(cache.let(ProjectCacheProperty::unwrap))
    }

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("87e43351c2449e4d419f7c2b3068ef4e251d4838bbed64849d05a69198f5ec75")
    override fun cache(cache: ProjectCacheProperty.Builder.() -> Unit): Unit =
        cache(ProjectCacheProperty(cache))

    /**
     * The maximum number of concurrent builds that are allowed for this project.
     *
     * New builds are only started if the current number of builds is less than or equal to this
     * limit. If the current build count meets this limit, new builds are throttled and are not run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-concurrentbuildlimit)
     * @param concurrentBuildLimit The maximum number of concurrent builds that are allowed for this
     * project. 
     */
    override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
      cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    /**
     * A description that makes the build project easy to identify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description)
     * @param description A description that makes the build project easy to identify. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The AWS Key Management Service customer master key (CMK) to be used for encrypting the build
     * output artifacts.
     *
     *
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service
     * role has permission to that key.
     *
     *
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's
     * alias (using the format `alias/&lt;alias-name&gt;` ). If you don't specify a value, CodeBuild
     * uses the managed CMK for Amazon Simple Storage Service (Amazon S3).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey)
     * @param encryptionKey The AWS Key Management Service customer master key (CMK) to be used for
     * encrypting the build output artifacts. 
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    override fun environment(environment: EnvironmentProperty) {
      cdkBuilder.environment(environment.let(EnvironmentProperty::unwrap))
    }

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17fa6e8915386f41fd25a1f78bacf242ffcc47f74961a5f760c62f79a6046b31")
    override fun environment(environment: EnvironmentProperty.Builder.() -> Unit): Unit =
        environment(EnvironmentProperty(environment))

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project. 
     */
    override fun fileSystemLocations(fileSystemLocations: IResolvable) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.let(IResolvable::unwrap))
    }

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project. 
     */
    override fun fileSystemLocations(fileSystemLocations: List<Any>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project. 
     */
    override fun fileSystemLocations(vararg fileSystemLocations: Any): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     * @param logsConfig Information about logs for the build project. 
     */
    override fun logsConfig(logsConfig: IResolvable) {
      cdkBuilder.logsConfig(logsConfig.let(IResolvable::unwrap))
    }

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     * @param logsConfig Information about logs for the build project. 
     */
    override fun logsConfig(logsConfig: LogsConfigProperty) {
      cdkBuilder.logsConfig(logsConfig.let(LogsConfigProperty::unwrap))
    }

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     * @param logsConfig Information about logs for the build project. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3caea299a6117c080eaf244e0c9266864386388512f206a3e2be71df3fe17565")
    override fun logsConfig(logsConfig: LogsConfigProperty.Builder.() -> Unit): Unit =
        logsConfig(LogsConfigProperty(logsConfig))

    /**
     * The name of the build project.
     *
     * The name must be unique across all of the projects in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name)
     * @param name The name of the build project. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The number of minutes a build is allowed to be queued before it times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes)
     * @param queuedTimeoutInMinutes The number of minutes a build is allowed to be queued before it
     * times out. 
     */
    override fun queuedTimeoutInMinutes(queuedTimeoutInMinutes: Number) {
      cdkBuilder.queuedTimeoutInMinutes(queuedTimeoutInMinutes)
    }

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3
     * artifacts for the project's builds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-resourceaccessrole)
     * @param resourceAccessRole The ARN of the IAM role that enables CodeBuild to access the
     * CloudWatch Logs and Amazon S3 artifacts for the project's builds. 
     */
    override fun resourceAccessRole(resourceAccessRole: String) {
      cdkBuilder.resourceAccessRole(resourceAccessRole)
    }

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     * @param secondaryArtifacts A list of `Artifacts` objects. 
     */
    override fun secondaryArtifacts(secondaryArtifacts: IResolvable) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts.let(IResolvable::unwrap))
    }

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     * @param secondaryArtifacts A list of `Artifacts` objects. 
     */
    override fun secondaryArtifacts(secondaryArtifacts: List<Any>) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     * @param secondaryArtifacts A list of `Artifacts` objects. 
     */
    override fun secondaryArtifacts(vararg secondaryArtifacts: Any): Unit =
        secondaryArtifacts(secondaryArtifacts.toList())

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects. 
     */
    override fun secondarySourceVersions(secondarySourceVersions: IResolvable) {
      cdkBuilder.secondarySourceVersions(secondarySourceVersions.let(IResolvable::unwrap))
    }

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects. 
     */
    override fun secondarySourceVersions(secondarySourceVersions: List<Any>) {
      cdkBuilder.secondarySourceVersions(secondarySourceVersions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects. 
     */
    override fun secondarySourceVersions(vararg secondarySourceVersions: Any): Unit =
        secondarySourceVersions(secondarySourceVersions.toList())

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     * @param secondarySources An array of `ProjectSource` objects. 
     */
    override fun secondarySources(secondarySources: IResolvable) {
      cdkBuilder.secondarySources(secondarySources.let(IResolvable::unwrap))
    }

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     * @param secondarySources An array of `ProjectSource` objects. 
     */
    override fun secondarySources(secondarySources: List<Any>) {
      cdkBuilder.secondarySources(secondarySources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     * @param secondarySources An array of `ProjectSource` objects. 
     */
    override fun secondarySources(vararg secondarySources: Any): Unit =
        secondarySources(secondarySources.toList())

    /**
     * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on
     * behalf of the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole)
     * @param serviceRole The ARN of the IAM role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account. 
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
    }

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("418cfd1c63a6c94fc6abd6b21ba2eea2769b2997ac24a51f4464397a24e0e412")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    /**
     * A version of the build input to be built for this project.
     *
     * If not specified, the latest version is used. If specified, it must be one of:
     *
     * * For CodeCommit: the commit ID, branch, or Git tag to use.
     * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to
     * the version of the source code you want to build. If a pull request ID is specified, it must use
     * the format `pr/pull-request-ID` (for example `pr/25` ). If a branch name is specified, the
     * branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of
     * the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is
     * used. If not specified, the default branch's HEAD commit ID is used.
     * * For Amazon S3: the version ID of the object that represents the build input ZIP file to
     * use.
     *
     * If `sourceVersion` is specified at the build level, then that version takes precedence over
     * this `sourceVersion` (at the project level).
     *
     * For more information, see [Source Version Sample with
     * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html) in
     * the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-sourceversion)
     * @param sourceVersion A version of the build input to be built for this project. 
     */
    override fun sourceVersion(sourceVersion: String) {
      cdkBuilder.sourceVersion(sourceVersion)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out
     * any related build that did not get marked as completed.
     *
     * The default is 60 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes)
     * @param timeoutInMinutes How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to
     * wait before timing out any related build that did not get marked as completed. 
     */
    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
     * code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository. 
     */
    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
     * code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository. 
     */
    override fun triggers(triggers: ProjectTriggersProperty) {
      cdkBuilder.triggers(triggers.let(ProjectTriggersProperty::unwrap))
    }

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
     * code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6989486a850294b2ed92ef6b257e8ed01cff283d6163bdc1ccd27ee4c4b7a753")
    override fun triggers(triggers: ProjectTriggersProperty.Builder.() -> Unit): Unit =
        triggers(ProjectTriggersProperty(triggers))

    /**
     * Specifies the visibility of the project's builds. Possible values are:.
     *
     * * **PUBLIC_READ** - The project builds are visible to the public.
     * * **PRIVATE** - The project builds are not visible to the public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-visibility)
     * @param visibility Specifies the visibility of the project's builds. Possible values are:. 
     */
    override fun visibility(visibility: String) {
      cdkBuilder.visibility(visibility)
    }

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78a3ddc4357c4f9c956f386a567a0303a2f89eff23a28547bc3546f98d3d0a49")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.codebuild.CfnProject = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codebuild.CfnProject.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.codebuild.CfnProject =
        wrapped.cdkObject as software.amazon.awscdk.services.codebuild.CfnProject
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface ArtifactsProperty {
    /**
     * An identifier for this artifact definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier)
     */
    public fun artifactIdentifier(): String? = unwrap(this).getArtifactIdentifier()

    /**
     * Set to true if you do not want your output artifacts encrypted.
     *
     * This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon
     * S3). If this is set with another artifacts type, an `invalidInputException` is thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled)
     */
    public fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

    /**
     * Information about the build output artifact location:.
     *
     * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified. This
     * is because CodePipeline manages its build output locations instead of CodeBuild .
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , this is the name of the output bucket.
     *
     * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
     * property. For all of the other types, you must specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

    /**
     * Along with `path` and `namespaceType` , the pattern that AWS CodeBuild uses to name and store
     * the output artifact:.
     *
     * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified. This
     * is because CodePipeline manages its build output names instead of AWS CodeBuild .
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , this is the name of the output artifact object. If you set the
     * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
     *
     * For example:
     *
     * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is
     * set to `MyArtifact.zip` , then the output artifact is stored in `MyArtifacts/ *build-ID*
     * /MyArtifact.zip` .
     * * If `path` is empty, `namespaceType` is set to `NONE` , and `name` is set to " `/` ", the
     * output artifact is stored in the root of the output bucket.
     * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is
     * set to " `/` ", the output artifact is stored in `MyArtifacts/ *build-ID*` .
     *
     * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
     * property. For all of the other types, you must specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Along with `path` and `name` , the pattern that AWS CodeBuild uses to determine the name and
     * location to store the output artifact:  - If `type` is set to `CODEPIPELINE` , CodePipeline
     * ignores this value if specified.
     *
     * This is because CodePipeline manages its build output names instead of AWS CodeBuild .
     *
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , valid values include:
     * * `BUILD_ID` : Include the build ID in the location of the build output artifact.
     * * `NONE` : Do not include the build ID. This is the default if `namespaceType` is not
     * specified.
     *
     * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and
     * `name` is set to `MyArtifact.zip` , the output artifact is stored in
     * `MyArtifacts/&lt;build-ID&gt;/MyArtifact.zip` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype)
     */
    public fun namespaceType(): String? = unwrap(this).getNamespaceType()

    /**
     * If set to true a name specified in the buildspec file overrides the artifact name.
     *
     * The name specified in a buildspec file is calculated at build time and uses the Shell command
     * language. For example, you can append a date and time to your artifact name so that it is always
     * unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname)
     */
    public fun overrideArtifactName(): Any? = unwrap(this).getOverrideArtifactName()

    /**
     * The type of build output artifact to create:.
     *
     * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This is
     * because CodePipeline manages its build output artifacts instead of AWS CodeBuild .
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , valid values include:
     * * `NONE` : AWS CodeBuild creates in the output bucket a folder that contains the build
     * output. This is the default if `packaging` is not specified.
     * * `ZIP` : AWS CodeBuild creates in the output bucket a ZIP file that contains the build
     * output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging)
     */
    public fun packaging(): String? = unwrap(this).getPackaging()

    /**
     * Along with `namespaceType` and `name` , the pattern that AWS CodeBuild uses to name and store
     * the output artifact:.
     *
     * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This is
     * because CodePipeline manages its build output names instead of AWS CodeBuild .
     * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
     * output is produced.
     * * If `type` is set to `S3` , this is the path to the output artifact. If `path` is not
     * specified, `path` is not used.
     *
     * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `NONE` , and
     * `name` is set to `MyArtifact.zip` , the output artifact is stored in the output bucket at
     * `MyArtifacts/MyArtifact.zip` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The type of build output artifact. Valid values include:.
     *
     * * `CODEPIPELINE` : The build project has build output generated through CodePipeline.
     *
     *
     * The `CODEPIPELINE` type is not supported for `secondaryArtifacts` .
     *
     *
     * * `NO_ARTIFACTS` : The build project does not produce any build output.
     * * `S3` : The build project stores build output in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type)
     */
    public fun type(): String

    /**
     * A builder for [ArtifactsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param artifactIdentifier An identifier for this artifact definition.
       */
      public fun artifactIdentifier(artifactIdentifier: String)

      /**
       * @param encryptionDisabled Set to true if you do not want your output artifacts encrypted.
       * This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon
       * S3). If this is set with another artifacts type, an `invalidInputException` is thrown.
       */
      public fun encryptionDisabled(encryptionDisabled: Boolean)

      /**
       * @param encryptionDisabled Set to true if you do not want your output artifacts encrypted.
       * This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon
       * S3). If this is set with another artifacts type, an `invalidInputException` is thrown.
       */
      public fun encryptionDisabled(encryptionDisabled: IResolvable)

      /**
       * @param location Information about the build output artifact location:.
       * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified.
       * This is because CodePipeline manages its build output locations instead of CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the name of the output bucket.
       *
       * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
       * property. For all of the other types, you must specify this property.
       */
      public fun location(location: String)

      /**
       * @param name Along with `path` and `namespaceType` , the pattern that AWS CodeBuild uses to
       * name and store the output artifact:.
       * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified.
       * This is because CodePipeline manages its build output names instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the name of the output artifact object. If you set the
       * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
       *
       * For example:
       *
       * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is
       * set to `MyArtifact.zip` , then the output artifact is stored in `MyArtifacts/ *build-ID*
       * /MyArtifact.zip` .
       * * If `path` is empty, `namespaceType` is set to `NONE` , and `name` is set to " `/` ", the
       * output artifact is stored in the root of the output bucket.
       * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is
       * set to " `/` ", the output artifact is stored in `MyArtifacts/ *build-ID*` .
       *
       * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
       * property. For all of the other types, you must specify this property.
       */
      public fun name(name: String)

      /**
       * @param namespaceType Along with `path` and `name` , the pattern that AWS CodeBuild uses to
       * determine the name and location to store the output artifact:  - If `type` is set to
       * `CODEPIPELINE` , CodePipeline ignores this value if specified.
       * This is because CodePipeline manages its build output names instead of AWS CodeBuild .
       *
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , valid values include:
       * * `BUILD_ID` : Include the build ID in the location of the build output artifact.
       * * `NONE` : Do not include the build ID. This is the default if `namespaceType` is not
       * specified.
       *
       * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and
       * `name` is set to `MyArtifact.zip` , the output artifact is stored in
       * `MyArtifacts/&lt;build-ID&gt;/MyArtifact.zip` .
       */
      public fun namespaceType(namespaceType: String)

      /**
       * @param overrideArtifactName If set to true a name specified in the buildspec file overrides
       * the artifact name.
       * The name specified in a buildspec file is calculated at build time and uses the Shell
       * command language. For example, you can append a date and time to your artifact name so that it
       * is always unique.
       */
      public fun overrideArtifactName(overrideArtifactName: Boolean)

      /**
       * @param overrideArtifactName If set to true a name specified in the buildspec file overrides
       * the artifact name.
       * The name specified in a buildspec file is calculated at build time and uses the Shell
       * command language. For example, you can append a date and time to your artifact name so that it
       * is always unique.
       */
      public fun overrideArtifactName(overrideArtifactName: IResolvable)

      /**
       * @param packaging The type of build output artifact to create:.
       * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This
       * is because CodePipeline manages its build output artifacts instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , valid values include:
       * * `NONE` : AWS CodeBuild creates in the output bucket a folder that contains the build
       * output. This is the default if `packaging` is not specified.
       * * `ZIP` : AWS CodeBuild creates in the output bucket a ZIP file that contains the build
       * output.
       */
      public fun packaging(packaging: String)

      /**
       * @param path Along with `namespaceType` and `name` , the pattern that AWS CodeBuild uses to
       * name and store the output artifact:.
       * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This
       * is because CodePipeline manages its build output names instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the path to the output artifact. If `path` is not
       * specified, `path` is not used.
       *
       * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `NONE` , and
       * `name` is set to `MyArtifact.zip` , the output artifact is stored in the output bucket at
       * `MyArtifacts/MyArtifact.zip` .
       */
      public fun path(path: String)

      /**
       * @param type The type of build output artifact. Valid values include:. 
       * * `CODEPIPELINE` : The build project has build output generated through CodePipeline.
       *
       *
       * The `CODEPIPELINE` type is not supported for `secondaryArtifacts` .
       *
       *
       * * `NO_ARTIFACTS` : The build project does not produce any build output.
       * * `S3` : The build project stores build output in Amazon S3.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty.builder()

      /**
       * @param artifactIdentifier An identifier for this artifact definition.
       */
      override fun artifactIdentifier(artifactIdentifier: String) {
        cdkBuilder.artifactIdentifier(artifactIdentifier)
      }

      /**
       * @param encryptionDisabled Set to true if you do not want your output artifacts encrypted.
       * This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon
       * S3). If this is set with another artifacts type, an `invalidInputException` is thrown.
       */
      override fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
      }

      /**
       * @param encryptionDisabled Set to true if you do not want your output artifacts encrypted.
       * This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon
       * S3). If this is set with another artifacts type, an `invalidInputException` is thrown.
       */
      override fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled.let(IResolvable::unwrap))
      }

      /**
       * @param location Information about the build output artifact location:.
       * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified.
       * This is because CodePipeline manages its build output locations instead of CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the name of the output bucket.
       *
       * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
       * property. For all of the other types, you must specify this property.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param name Along with `path` and `namespaceType` , the pattern that AWS CodeBuild uses to
       * name and store the output artifact:.
       * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified.
       * This is because CodePipeline manages its build output names instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the name of the output artifact object. If you set the
       * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
       *
       * For example:
       *
       * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is
       * set to `MyArtifact.zip` , then the output artifact is stored in `MyArtifacts/ *build-ID*
       * /MyArtifact.zip` .
       * * If `path` is empty, `namespaceType` is set to `NONE` , and `name` is set to " `/` ", the
       * output artifact is stored in the root of the output bucket.
       * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is
       * set to " `/` ", the output artifact is stored in `MyArtifacts/ *build-ID*` .
       *
       * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
       * property. For all of the other types, you must specify this property.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param namespaceType Along with `path` and `name` , the pattern that AWS CodeBuild uses to
       * determine the name and location to store the output artifact:  - If `type` is set to
       * `CODEPIPELINE` , CodePipeline ignores this value if specified.
       * This is because CodePipeline manages its build output names instead of AWS CodeBuild .
       *
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , valid values include:
       * * `BUILD_ID` : Include the build ID in the location of the build output artifact.
       * * `NONE` : Do not include the build ID. This is the default if `namespaceType` is not
       * specified.
       *
       * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and
       * `name` is set to `MyArtifact.zip` , the output artifact is stored in
       * `MyArtifacts/&lt;build-ID&gt;/MyArtifact.zip` .
       */
      override fun namespaceType(namespaceType: String) {
        cdkBuilder.namespaceType(namespaceType)
      }

      /**
       * @param overrideArtifactName If set to true a name specified in the buildspec file overrides
       * the artifact name.
       * The name specified in a buildspec file is calculated at build time and uses the Shell
       * command language. For example, you can append a date and time to your artifact name so that it
       * is always unique.
       */
      override fun overrideArtifactName(overrideArtifactName: Boolean) {
        cdkBuilder.overrideArtifactName(overrideArtifactName)
      }

      /**
       * @param overrideArtifactName If set to true a name specified in the buildspec file overrides
       * the artifact name.
       * The name specified in a buildspec file is calculated at build time and uses the Shell
       * command language. For example, you can append a date and time to your artifact name so that it
       * is always unique.
       */
      override fun overrideArtifactName(overrideArtifactName: IResolvable) {
        cdkBuilder.overrideArtifactName(overrideArtifactName.let(IResolvable::unwrap))
      }

      /**
       * @param packaging The type of build output artifact to create:.
       * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This
       * is because CodePipeline manages its build output artifacts instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , valid values include:
       * * `NONE` : AWS CodeBuild creates in the output bucket a folder that contains the build
       * output. This is the default if `packaging` is not specified.
       * * `ZIP` : AWS CodeBuild creates in the output bucket a ZIP file that contains the build
       * output.
       */
      override fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
      }

      /**
       * @param path Along with `namespaceType` and `name` , the pattern that AWS CodeBuild uses to
       * name and store the output artifact:.
       * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This
       * is because CodePipeline manages its build output names instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the path to the output artifact. If `path` is not
       * specified, `path` is not used.
       *
       * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `NONE` , and
       * `name` is set to `MyArtifact.zip` , the output artifact is stored in the output bucket at
       * `MyArtifacts/MyArtifact.zip` .
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param type The type of build output artifact. Valid values include:. 
       * * `CODEPIPELINE` : The build project has build output generated through CodePipeline.
       *
       *
       * The `CODEPIPELINE` type is not supported for `secondaryArtifacts` .
       *
       *
       * * `NO_ARTIFACTS` : The build project does not produce any build output.
       * * `S3` : The build project stores build output in Amazon S3.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty,
    ) : CdkObject(cdkObject), ArtifactsProperty {
      /**
       * An identifier for this artifact definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-artifactidentifier)
       */
      override fun artifactIdentifier(): String? = unwrap(this).getArtifactIdentifier()

      /**
       * Set to true if you do not want your output artifacts encrypted.
       *
       * This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon
       * S3). If this is set with another artifacts type, an `invalidInputException` is thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-encryptiondisabled)
       */
      override fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

      /**
       * Information about the build output artifact location:.
       *
       * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified.
       * This is because CodePipeline manages its build output locations instead of CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the name of the output bucket.
       *
       * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
       * property. For all of the other types, you must specify this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

      /**
       * Along with `path` and `namespaceType` , the pattern that AWS CodeBuild uses to name and
       * store the output artifact:.
       *
       * * If `type` is set to `CODEPIPELINE` , AWS CodePipeline ignores this value if specified.
       * This is because CodePipeline manages its build output names instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the name of the output artifact object. If you set the
       * name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.
       *
       * For example:
       *
       * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is
       * set to `MyArtifact.zip` , then the output artifact is stored in `MyArtifacts/ *build-ID*
       * /MyArtifact.zip` .
       * * If `path` is empty, `namespaceType` is set to `NONE` , and `name` is set to " `/` ", the
       * output artifact is stored in the root of the output bucket.
       * * If `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and `name` is
       * set to " `/` ", the output artifact is stored in `MyArtifacts/ *build-ID*` .
       *
       * If you specify `CODEPIPELINE` or `NO_ARTIFACTS` for the `Type` property, don't specify this
       * property. For all of the other types, you must specify this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Along with `path` and `name` , the pattern that AWS CodeBuild uses to determine the name
       * and location to store the output artifact:  - If `type` is set to `CODEPIPELINE` ,
       * CodePipeline ignores this value if specified.
       *
       * This is because CodePipeline manages its build output names instead of AWS CodeBuild .
       *
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , valid values include:
       * * `BUILD_ID` : Include the build ID in the location of the build output artifact.
       * * `NONE` : Do not include the build ID. This is the default if `namespaceType` is not
       * specified.
       *
       * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `BUILD_ID` , and
       * `name` is set to `MyArtifact.zip` , the output artifact is stored in
       * `MyArtifacts/&lt;build-ID&gt;/MyArtifact.zip` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-namespacetype)
       */
      override fun namespaceType(): String? = unwrap(this).getNamespaceType()

      /**
       * If set to true a name specified in the buildspec file overrides the artifact name.
       *
       * The name specified in a buildspec file is calculated at build time and uses the Shell
       * command language. For example, you can append a date and time to your artifact name so that it
       * is always unique.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-overrideartifactname)
       */
      override fun overrideArtifactName(): Any? = unwrap(this).getOverrideArtifactName()

      /**
       * The type of build output artifact to create:.
       *
       * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This
       * is because CodePipeline manages its build output artifacts instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , valid values include:
       * * `NONE` : AWS CodeBuild creates in the output bucket a folder that contains the build
       * output. This is the default if `packaging` is not specified.
       * * `ZIP` : AWS CodeBuild creates in the output bucket a ZIP file that contains the build
       * output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-packaging)
       */
      override fun packaging(): String? = unwrap(this).getPackaging()

      /**
       * Along with `namespaceType` and `name` , the pattern that AWS CodeBuild uses to name and
       * store the output artifact:.
       *
       * * If `type` is set to `CODEPIPELINE` , CodePipeline ignores this value if specified. This
       * is because CodePipeline manages its build output names instead of AWS CodeBuild .
       * * If `type` is set to `NO_ARTIFACTS` , this value is ignored if specified, because no build
       * output is produced.
       * * If `type` is set to `S3` , this is the path to the output artifact. If `path` is not
       * specified, `path` is not used.
       *
       * For example, if `path` is set to `MyArtifacts` , `namespaceType` is set to `NONE` , and
       * `name` is set to `MyArtifact.zip` , the output artifact is stored in the output bucket at
       * `MyArtifacts/MyArtifact.zip` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * The type of build output artifact. Valid values include:.
       *
       * * `CODEPIPELINE` : The build project has build output generated through CodePipeline.
       *
       *
       * The `CODEPIPELINE` type is not supported for `secondaryArtifacts` .
       *
       *
       * * `NO_ARTIFACTS` : The build project does not produce any build output.
       * * `S3` : The build project stores build output in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-artifacts.html#cfn-codebuild-project-artifacts-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty):
          ArtifactsProperty = CdkObjectWrappers.wrap(cdkObject) as? ArtifactsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArtifactsProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ArtifactsProperty
    }
  }

  /**
   * Specifies restrictions for the batch build.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * BatchRestrictionsProperty batchRestrictionsProperty = BatchRestrictionsProperty.builder()
   * .computeTypesAllowed(List.of("computeTypesAllowed"))
   * .maximumBuildsAllowed(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-batchrestrictions.html)
   */
  public interface BatchRestrictionsProperty {
    /**
     * An array of strings that specify the compute types that are allowed for the batch build.
     *
     * See [Build environment compute
     * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild User Guide* for these values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-batchrestrictions.html#cfn-codebuild-project-batchrestrictions-computetypesallowed)
     */
    public fun computeTypesAllowed(): List<String> = unwrap(this).getComputeTypesAllowed() ?:
        emptyList()

    /**
     * Specifies the maximum number of builds allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-batchrestrictions.html#cfn-codebuild-project-batchrestrictions-maximumbuildsallowed)
     */
    public fun maximumBuildsAllowed(): Number? = unwrap(this).getMaximumBuildsAllowed()

    /**
     * A builder for [BatchRestrictionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computeTypesAllowed An array of strings that specify the compute types that are
       * allowed for the batch build.
       * See [Build environment compute
       * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild User Guide* for these values.
       */
      public fun computeTypesAllowed(computeTypesAllowed: List<String>)

      /**
       * @param computeTypesAllowed An array of strings that specify the compute types that are
       * allowed for the batch build.
       * See [Build environment compute
       * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild User Guide* for these values.
       */
      public fun computeTypesAllowed(vararg computeTypesAllowed: String)

      /**
       * @param maximumBuildsAllowed Specifies the maximum number of builds allowed.
       */
      public fun maximumBuildsAllowed(maximumBuildsAllowed: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty.builder()

      /**
       * @param computeTypesAllowed An array of strings that specify the compute types that are
       * allowed for the batch build.
       * See [Build environment compute
       * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild User Guide* for these values.
       */
      override fun computeTypesAllowed(computeTypesAllowed: List<String>) {
        cdkBuilder.computeTypesAllowed(computeTypesAllowed)
      }

      /**
       * @param computeTypesAllowed An array of strings that specify the compute types that are
       * allowed for the batch build.
       * See [Build environment compute
       * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild User Guide* for these values.
       */
      override fun computeTypesAllowed(vararg computeTypesAllowed: String): Unit =
          computeTypesAllowed(computeTypesAllowed.toList())

      /**
       * @param maximumBuildsAllowed Specifies the maximum number of builds allowed.
       */
      override fun maximumBuildsAllowed(maximumBuildsAllowed: Number) {
        cdkBuilder.maximumBuildsAllowed(maximumBuildsAllowed)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty,
    ) : CdkObject(cdkObject), BatchRestrictionsProperty {
      /**
       * An array of strings that specify the compute types that are allowed for the batch build.
       *
       * See [Build environment compute
       * types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild User Guide* for these values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-batchrestrictions.html#cfn-codebuild-project-batchrestrictions-computetypesallowed)
       */
      override fun computeTypesAllowed(): List<String> = unwrap(this).getComputeTypesAllowed() ?:
          emptyList()

      /**
       * Specifies the maximum number of builds allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-batchrestrictions.html#cfn-codebuild-project-batchrestrictions-maximumbuildsallowed)
       */
      override fun maximumBuildsAllowed(): Number? = unwrap(this).getMaximumBuildsAllowed()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchRestrictionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty):
          BatchRestrictionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BatchRestrictionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchRestrictionsProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * BuildStatusConfigProperty buildStatusConfigProperty = BuildStatusConfigProperty.builder()
   * .context("context")
   * .targetUrl("targetUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-buildstatusconfig.html)
   */
  public interface BuildStatusConfigProperty {
    /**
     * Specifies the context of the build status CodeBuild sends to the source provider.
     *
     * The usage of this parameter depends on the source provider.
     *
     * * **Bitbucket** - This parameter is used for the `name` parameter in the Bitbucket commit
     * status. For more information, see
     * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
     * in the Bitbucket API documentation.
     * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `context` parameter in
     * the GitHub commit status. For more information, see [Create a commit
     * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
     * in the GitHub developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-buildstatusconfig.html#cfn-codebuild-project-buildstatusconfig-context)
     */
    public fun context(): String? = unwrap(this).getContext()

    /**
     * Specifies the target url of the build status CodeBuild sends to the source provider.
     *
     * The usage of this parameter depends on the source provider.
     *
     * * **Bitbucket** - This parameter is used for the `url` parameter in the Bitbucket commit
     * status. For more information, see
     * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
     * in the Bitbucket API documentation.
     * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `target_url` parameter
     * in the GitHub commit status. For more information, see [Create a commit
     * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
     * in the GitHub developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-buildstatusconfig.html#cfn-codebuild-project-buildstatusconfig-targeturl)
     */
    public fun targetUrl(): String? = unwrap(this).getTargetUrl()

    /**
     * A builder for [BuildStatusConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param context Specifies the context of the build status CodeBuild sends to the source
       * provider.
       * The usage of this parameter depends on the source provider.
       *
       * * **Bitbucket** - This parameter is used for the `name` parameter in the Bitbucket commit
       * status. For more information, see
       * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
       * in the Bitbucket API documentation.
       * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `context` parameter
       * in the GitHub commit status. For more information, see [Create a commit
       * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
       * in the GitHub developer guide.
       */
      public fun context(context: String)

      /**
       * @param targetUrl Specifies the target url of the build status CodeBuild sends to the source
       * provider.
       * The usage of this parameter depends on the source provider.
       *
       * * **Bitbucket** - This parameter is used for the `url` parameter in the Bitbucket commit
       * status. For more information, see
       * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
       * in the Bitbucket API documentation.
       * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `target_url`
       * parameter in the GitHub commit status. For more information, see [Create a commit
       * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
       * in the GitHub developer guide.
       */
      public fun targetUrl(targetUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty.builder()

      /**
       * @param context Specifies the context of the build status CodeBuild sends to the source
       * provider.
       * The usage of this parameter depends on the source provider.
       *
       * * **Bitbucket** - This parameter is used for the `name` parameter in the Bitbucket commit
       * status. For more information, see
       * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
       * in the Bitbucket API documentation.
       * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `context` parameter
       * in the GitHub commit status. For more information, see [Create a commit
       * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
       * in the GitHub developer guide.
       */
      override fun context(context: String) {
        cdkBuilder.context(context)
      }

      /**
       * @param targetUrl Specifies the target url of the build status CodeBuild sends to the source
       * provider.
       * The usage of this parameter depends on the source provider.
       *
       * * **Bitbucket** - This parameter is used for the `url` parameter in the Bitbucket commit
       * status. For more information, see
       * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
       * in the Bitbucket API documentation.
       * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `target_url`
       * parameter in the GitHub commit status. For more information, see [Create a commit
       * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
       * in the GitHub developer guide.
       */
      override fun targetUrl(targetUrl: String) {
        cdkBuilder.targetUrl(targetUrl)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty,
    ) : CdkObject(cdkObject), BuildStatusConfigProperty {
      /**
       * Specifies the context of the build status CodeBuild sends to the source provider.
       *
       * The usage of this parameter depends on the source provider.
       *
       * * **Bitbucket** - This parameter is used for the `name` parameter in the Bitbucket commit
       * status. For more information, see
       * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
       * in the Bitbucket API documentation.
       * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `context` parameter
       * in the GitHub commit status. For more information, see [Create a commit
       * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
       * in the GitHub developer guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-buildstatusconfig.html#cfn-codebuild-project-buildstatusconfig-context)
       */
      override fun context(): String? = unwrap(this).getContext()

      /**
       * Specifies the target url of the build status CodeBuild sends to the source provider.
       *
       * The usage of this parameter depends on the source provider.
       *
       * * **Bitbucket** - This parameter is used for the `url` parameter in the Bitbucket commit
       * status. For more information, see
       * [build](https://docs.aws.amazon.com/https://developer.atlassian.com/bitbucket/api/2/reference/resource/repositories/%7Bworkspace%7D/%7Brepo_slug%7D/commit/%7Bnode%7D/statuses/build)
       * in the Bitbucket API documentation.
       * * **GitHub/GitHub Enterprise Server** - This parameter is used for the `target_url`
       * parameter in the GitHub commit status. For more information, see [Create a commit
       * status](https://docs.aws.amazon.com/https://developer.github.com/v3/repos/statuses/#create-a-commit-status)
       * in the GitHub developer guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-buildstatusconfig.html#cfn-codebuild-project-buildstatusconfig-targeturl)
       */
      override fun targetUrl(): String? = unwrap(this).getTargetUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BuildStatusConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty):
          BuildStatusConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BuildStatusConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BuildStatusConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface CloudWatchLogsConfigProperty {
    /**
     * The group name of the logs in CloudWatch Logs.
     *
     * For more information, see [Working with Log Groups and Log
     * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname)
     */
    public fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The current status of the logs in CloudWatch Logs for a build project. Valid values are:.
     *
     * * `ENABLED` : CloudWatch Logs are enabled for this build project.
     * * `DISABLED` : CloudWatch Logs are not enabled for this build project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status)
     */
    public fun status(): String

    /**
     * The prefix of the stream name of the CloudWatch Logs.
     *
     * For more information, see [Working with Log Groups and Log
     * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname)
     */
    public fun streamName(): String? = unwrap(this).getStreamName()

    /**
     * A builder for [CloudWatchLogsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupName The group name of the logs in CloudWatch Logs.
       * For more information, see [Working with Log Groups and Log
       * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
       * .
       */
      public fun groupName(groupName: String)

      /**
       * @param status The current status of the logs in CloudWatch Logs for a build project. Valid
       * values are:. 
       * * `ENABLED` : CloudWatch Logs are enabled for this build project.
       * * `DISABLED` : CloudWatch Logs are not enabled for this build project.
       */
      public fun status(status: String)

      /**
       * @param streamName The prefix of the stream name of the CloudWatch Logs.
       * For more information, see [Working with Log Groups and Log
       * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
       * .
       */
      public fun streamName(streamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty.builder()

      /**
       * @param groupName The group name of the logs in CloudWatch Logs.
       * For more information, see [Working with Log Groups and Log
       * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
       * .
       */
      override fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
      }

      /**
       * @param status The current status of the logs in CloudWatch Logs for a build project. Valid
       * values are:. 
       * * `ENABLED` : CloudWatch Logs are enabled for this build project.
       * * `DISABLED` : CloudWatch Logs are not enabled for this build project.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param streamName The prefix of the stream name of the CloudWatch Logs.
       * For more information, see [Working with Log Groups and Log
       * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
       * .
       */
      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsConfigProperty {
      /**
       * The group name of the logs in CloudWatch Logs.
       *
       * For more information, see [Working with Log Groups and Log
       * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname)
       */
      override fun groupName(): String? = unwrap(this).getGroupName()

      /**
       * The current status of the logs in CloudWatch Logs for a build project. Valid values are:.
       *
       * * `ENABLED` : CloudWatch Logs are enabled for this build project.
       * * `DISABLED` : CloudWatch Logs are not enabled for this build project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status)
       */
      override fun status(): String = unwrap(this).getStatus()

      /**
       * The prefix of the stream name of the CloudWatch Logs.
       *
       * For more information, see [Working with Log Groups and Log
       * Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname)
       */
      override fun streamName(): String? = unwrap(this).getStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty):
          CloudWatchLogsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.CloudWatchLogsConfigProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
   * .fleet(ProjectFleetProperty.builder()
   * .fleetArn("fleetArn")
   * .build())
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
  public interface EnvironmentProperty {
    /**
     * The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded
     * certificate for the build project.
     *
     * For more information, see
     * [certificate](https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate)
     */
    public fun certificate(): String? = unwrap(this).getCertificate()

    /**
     * The type of compute environment.
     *
     * This determines the number of CPU cores and memory the build environment uses. Available
     * values include:
     *
     * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
     * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
     * * `BUILD_GENERAL1_LARGE` : Use up to 15 GB memory and 8 vCPUs for builds.
     *
     * For more information, see [Build Environment Compute
     * Types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild User Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype)
     */
    public fun computeType(): String

    /**
     * A set of environment variables to make available to builds for this build project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables)
     */
    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-fleet)
     */
    public fun fleet(): Any? = unwrap(this).getFleet()

    /**
     * The image tag or image digest that identifies the Docker image to use for this build project.
     *
     * Use the following formats:
     *
     * * For an image tag: `&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;` . For example, in the
     * Docker repository that CodeBuild uses to manage its Docker images, this would be
     * `aws/codebuild/standard:4.0` .
     * * For an image digest: `&lt;registry&gt;/&lt;repository&gt;&#64;&lt;digest&gt;` . For
     * example, to specify an image with the digest
     * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
     * `&lt;registry&gt;/&lt;repository&gt;&#64;sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf`
     * .
     *
     * For more information, see [Docker images provided by
     * CodeBuild](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-available.html)
     * in the *AWS CodeBuild user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image)
     */
    public fun image(): String

    /**
     * The type of credentials AWS CodeBuild uses to pull images in your build. There are two valid
     * values:.
     *
     * * `CODEBUILD` specifies that AWS CodeBuild uses its own credentials. This requires that you
     * modify your ECR repository policy to trust AWS CodeBuild service principal.
     * * `SERVICE_ROLE` specifies that AWS CodeBuild uses your build project's service role.
     *
     * When you use a cross-account or private registry image, you must use SERVICE_ROLE
     * credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-imagepullcredentialstype)
     */
    public fun imagePullCredentialsType(): String? = unwrap(this).getImagePullCredentialsType()

    /**
     * Enables running the Docker daemon inside a Docker container.
     *
     * Set to true only if the build project is used to build Docker images. Otherwise, a build that
     * attempts to interact with the Docker daemon fails. The default setting is `false` .
     *
     * You can initialize the Docker daemon during the install phase of your build by adding one of
     * the following sets of commands to the install phase of your buildspec file:
     *
     * If the operating system's base image is Ubuntu Linux:
     *
     * `- nohup
     * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
     *
     * `- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"`
     *
     * If the operating system's base image is Alpine Linux and the previous command does not work,
     * add the `-t` argument to `timeout` :
     *
     * `- nohup
     * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
     *
     * `- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode)
     */
    public fun privilegedMode(): Any? = unwrap(this).getPrivilegedMode()

    /**
     * `RegistryCredential` is a property of the [AWS::CodeBuild::Project
     * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     * property that specifies information about credentials that provide access to a private Docker
     * registry. When this is set:.
     *
     * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
     * * images cannot be curated or an Amazon ECR image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-registrycredential)
     */
    public fun registryCredential(): Any? = unwrap(this).getRegistryCredential()

    /**
     * The type of build environment to use for related builds.
     *
     * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia), US
     * East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo), Asia
     * Pacific (Sydney), and EU (Frankfurt).
     * * The environment type `LINUX_CONTAINER` is available only in regions US East (N. Virginia),
     * US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU (Frankfurt),
     * Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific (Sydney),
     * China (Beijing), and China (Ningxia).
     * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
     * Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU
     * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia Pacific
     * (Sydney) , China (Beijing), and China (Ningxia).
     * * The environment types `ARM_LAMBDA_CONTAINER` and `LINUX_LAMBDA_CONTAINER` are available
     * only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific (Mumbai),
     * Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), EU (Frankfurt), EU
     * (Ireland), and South America (São Paulo).
     * * The environment types `WINDOWS_CONTAINER` and `WINDOWS_SERVER_2019_CONTAINER` are available
     * only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), and EU (Ireland).
     *
     *
     * If you're using compute fleets during project creation, `type` will be ignored.
     *
     *
     * For more information, see [Build environment compute
     * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
     * in the *AWS CodeBuild user guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type)
     */
    public fun type(): String

    /**
     * A builder for [EnvironmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificate The ARN of the Amazon S3 bucket, path prefix, and object key that
       * contains the PEM-encoded certificate for the build project.
       * For more information, see
       * [certificate](https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate)
       * in the *AWS CodeBuild User Guide* .
       */
      public fun certificate(certificate: String)

      /**
       * @param computeType The type of compute environment. 
       * This determines the number of CPU cores and memory the build environment uses. Available
       * values include:
       *
       * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
       * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
       * * `BUILD_GENERAL1_LARGE` : Use up to 15 GB memory and 8 vCPUs for builds.
       *
       * For more information, see [Build Environment Compute
       * Types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild User Guide.*
       */
      public fun computeType(computeType: String)

      /**
       * @param environmentVariables A set of environment variables to make available to builds for
       * this build project.
       */
      public fun environmentVariables(environmentVariables: IResolvable)

      /**
       * @param environmentVariables A set of environment variables to make available to builds for
       * this build project.
       */
      public fun environmentVariables(environmentVariables: List<Any>)

      /**
       * @param environmentVariables A set of environment variables to make available to builds for
       * this build project.
       */
      public fun environmentVariables(vararg environmentVariables: Any)

      /**
       * @param fleet the value to be set.
       */
      public fun fleet(fleet: IResolvable)

      /**
       * @param fleet the value to be set.
       */
      public fun fleet(fleet: ProjectFleetProperty)

      /**
       * @param fleet the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e963a710db9474248bb2903fa7622db7928685abf8e7f265afbddcc84e65f8d1")
      public fun fleet(fleet: ProjectFleetProperty.Builder.() -> Unit)

      /**
       * @param image The image tag or image digest that identifies the Docker image to use for this
       * build project. 
       * Use the following formats:
       *
       * * For an image tag: `&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;` . For example, in the
       * Docker repository that CodeBuild uses to manage its Docker images, this would be
       * `aws/codebuild/standard:4.0` .
       * * For an image digest: `&lt;registry&gt;/&lt;repository&gt;&#64;&lt;digest&gt;` . For
       * example, to specify an image with the digest
       * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
       * `&lt;registry&gt;/&lt;repository&gt;&#64;sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf`
       * .
       *
       * For more information, see [Docker images provided by
       * CodeBuild](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-available.html)
       * in the *AWS CodeBuild user guide* .
       */
      public fun image(image: String)

      /**
       * @param imagePullCredentialsType The type of credentials AWS CodeBuild uses to pull images
       * in your build. There are two valid values:.
       * * `CODEBUILD` specifies that AWS CodeBuild uses its own credentials. This requires that you
       * modify your ECR repository policy to trust AWS CodeBuild service principal.
       * * `SERVICE_ROLE` specifies that AWS CodeBuild uses your build project's service role.
       *
       * When you use a cross-account or private registry image, you must use SERVICE_ROLE
       * credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
       */
      public fun imagePullCredentialsType(imagePullCredentialsType: String)

      /**
       * @param privilegedMode Enables running the Docker daemon inside a Docker container.
       * Set to true only if the build project is used to build Docker images. Otherwise, a build
       * that attempts to interact with the Docker daemon fails. The default setting is `false` .
       *
       * You can initialize the Docker daemon during the install phase of your build by adding one
       * of the following sets of commands to the install phase of your buildspec file:
       *
       * If the operating system's base image is Ubuntu Linux:
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"`
       *
       * If the operating system's base image is Alpine Linux and the previous command does not
       * work, add the `-t` argument to `timeout` :
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"`
       */
      public fun privilegedMode(privilegedMode: Boolean)

      /**
       * @param privilegedMode Enables running the Docker daemon inside a Docker container.
       * Set to true only if the build project is used to build Docker images. Otherwise, a build
       * that attempts to interact with the Docker daemon fails. The default setting is `false` .
       *
       * You can initialize the Docker daemon during the install phase of your build by adding one
       * of the following sets of commands to the install phase of your buildspec file:
       *
       * If the operating system's base image is Ubuntu Linux:
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"`
       *
       * If the operating system's base image is Alpine Linux and the previous command does not
       * work, add the `-t` argument to `timeout` :
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"`
       */
      public fun privilegedMode(privilegedMode: IResolvable)

      /**
       * @param registryCredential `RegistryCredential` is a property of the
       * [AWS::CodeBuild::Project
       * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
       * property that specifies information about credentials that provide access to a private Docker
       * registry. When this is set:.
       * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
       * * images cannot be curated or an Amazon ECR image.
       */
      public fun registryCredential(registryCredential: IResolvable)

      /**
       * @param registryCredential `RegistryCredential` is a property of the
       * [AWS::CodeBuild::Project
       * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
       * property that specifies information about credentials that provide access to a private Docker
       * registry. When this is set:.
       * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
       * * images cannot be curated or an Amazon ECR image.
       */
      public fun registryCredential(registryCredential: RegistryCredentialProperty)

      /**
       * @param registryCredential `RegistryCredential` is a property of the
       * [AWS::CodeBuild::Project
       * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
       * property that specifies information about credentials that provide access to a private Docker
       * registry. When this is set:.
       * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
       * * images cannot be curated or an Amazon ECR image.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("550b36dfb3bd161ec105f2283a291b87853a40432119e8c4f5a2eb853bcf69be")
      public
          fun registryCredential(registryCredential: RegistryCredentialProperty.Builder.() -> Unit)

      /**
       * @param type The type of build environment to use for related builds. 
       * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia),
       * US East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo),
       * Asia Pacific (Sydney), and EU (Frankfurt).
       * * The environment type `LINUX_CONTAINER` is available only in regions US East (N.
       * Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU
       * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia
       * Pacific (Sydney), China (Beijing), and China (Ningxia).
       * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
       * Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU
       * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia
       * Pacific (Sydney) , China (Beijing), and China (Ningxia).
       * * The environment types `ARM_LAMBDA_CONTAINER` and `LINUX_LAMBDA_CONTAINER` are available
       * only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific
       * (Mumbai), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), EU
       * (Frankfurt), EU (Ireland), and South America (São Paulo).
       * * The environment types `WINDOWS_CONTAINER` and `WINDOWS_SERVER_2019_CONTAINER` are
       * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), and EU
       * (Ireland).
       *
       *
       * If you're using compute fleets during project creation, `type` will be ignored.
       *
       *
       * For more information, see [Build environment compute
       * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild user guide* .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty.builder()

      /**
       * @param certificate The ARN of the Amazon S3 bucket, path prefix, and object key that
       * contains the PEM-encoded certificate for the build project.
       * For more information, see
       * [certificate](https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate)
       * in the *AWS CodeBuild User Guide* .
       */
      override fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
      }

      /**
       * @param computeType The type of compute environment. 
       * This determines the number of CPU cores and memory the build environment uses. Available
       * values include:
       *
       * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
       * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
       * * `BUILD_GENERAL1_LARGE` : Use up to 15 GB memory and 8 vCPUs for builds.
       *
       * For more information, see [Build Environment Compute
       * Types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild User Guide.*
       */
      override fun computeType(computeType: String) {
        cdkBuilder.computeType(computeType)
      }

      /**
       * @param environmentVariables A set of environment variables to make available to builds for
       * this build project.
       */
      override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
      }

      /**
       * @param environmentVariables A set of environment variables to make available to builds for
       * this build project.
       */
      override fun environmentVariables(environmentVariables: List<Any>) {
        cdkBuilder.environmentVariables(environmentVariables.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param environmentVariables A set of environment variables to make available to builds for
       * this build project.
       */
      override fun environmentVariables(vararg environmentVariables: Any): Unit =
          environmentVariables(environmentVariables.toList())

      /**
       * @param fleet the value to be set.
       */
      override fun fleet(fleet: IResolvable) {
        cdkBuilder.fleet(fleet.let(IResolvable::unwrap))
      }

      /**
       * @param fleet the value to be set.
       */
      override fun fleet(fleet: ProjectFleetProperty) {
        cdkBuilder.fleet(fleet.let(ProjectFleetProperty::unwrap))
      }

      /**
       * @param fleet the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e963a710db9474248bb2903fa7622db7928685abf8e7f265afbddcc84e65f8d1")
      override fun fleet(fleet: ProjectFleetProperty.Builder.() -> Unit): Unit =
          fleet(ProjectFleetProperty(fleet))

      /**
       * @param image The image tag or image digest that identifies the Docker image to use for this
       * build project. 
       * Use the following formats:
       *
       * * For an image tag: `&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;` . For example, in the
       * Docker repository that CodeBuild uses to manage its Docker images, this would be
       * `aws/codebuild/standard:4.0` .
       * * For an image digest: `&lt;registry&gt;/&lt;repository&gt;&#64;&lt;digest&gt;` . For
       * example, to specify an image with the digest
       * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
       * `&lt;registry&gt;/&lt;repository&gt;&#64;sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf`
       * .
       *
       * For more information, see [Docker images provided by
       * CodeBuild](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-available.html)
       * in the *AWS CodeBuild user guide* .
       */
      override fun image(image: String) {
        cdkBuilder.image(image)
      }

      /**
       * @param imagePullCredentialsType The type of credentials AWS CodeBuild uses to pull images
       * in your build. There are two valid values:.
       * * `CODEBUILD` specifies that AWS CodeBuild uses its own credentials. This requires that you
       * modify your ECR repository policy to trust AWS CodeBuild service principal.
       * * `SERVICE_ROLE` specifies that AWS CodeBuild uses your build project's service role.
       *
       * When you use a cross-account or private registry image, you must use SERVICE_ROLE
       * credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
       */
      override fun imagePullCredentialsType(imagePullCredentialsType: String) {
        cdkBuilder.imagePullCredentialsType(imagePullCredentialsType)
      }

      /**
       * @param privilegedMode Enables running the Docker daemon inside a Docker container.
       * Set to true only if the build project is used to build Docker images. Otherwise, a build
       * that attempts to interact with the Docker daemon fails. The default setting is `false` .
       *
       * You can initialize the Docker daemon during the install phase of your build by adding one
       * of the following sets of commands to the install phase of your buildspec file:
       *
       * If the operating system's base image is Ubuntu Linux:
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"`
       *
       * If the operating system's base image is Alpine Linux and the previous command does not
       * work, add the `-t` argument to `timeout` :
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"`
       */
      override fun privilegedMode(privilegedMode: Boolean) {
        cdkBuilder.privilegedMode(privilegedMode)
      }

      /**
       * @param privilegedMode Enables running the Docker daemon inside a Docker container.
       * Set to true only if the build project is used to build Docker images. Otherwise, a build
       * that attempts to interact with the Docker daemon fails. The default setting is `false` .
       *
       * You can initialize the Docker daemon during the install phase of your build by adding one
       * of the following sets of commands to the install phase of your buildspec file:
       *
       * If the operating system's base image is Ubuntu Linux:
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"`
       *
       * If the operating system's base image is Alpine Linux and the previous command does not
       * work, add the `-t` argument to `timeout` :
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"`
       */
      override fun privilegedMode(privilegedMode: IResolvable) {
        cdkBuilder.privilegedMode(privilegedMode.let(IResolvable::unwrap))
      }

      /**
       * @param registryCredential `RegistryCredential` is a property of the
       * [AWS::CodeBuild::Project
       * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
       * property that specifies information about credentials that provide access to a private Docker
       * registry. When this is set:.
       * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
       * * images cannot be curated or an Amazon ECR image.
       */
      override fun registryCredential(registryCredential: IResolvable) {
        cdkBuilder.registryCredential(registryCredential.let(IResolvable::unwrap))
      }

      /**
       * @param registryCredential `RegistryCredential` is a property of the
       * [AWS::CodeBuild::Project
       * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
       * property that specifies information about credentials that provide access to a private Docker
       * registry. When this is set:.
       * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
       * * images cannot be curated or an Amazon ECR image.
       */
      override fun registryCredential(registryCredential: RegistryCredentialProperty) {
        cdkBuilder.registryCredential(registryCredential.let(RegistryCredentialProperty::unwrap))
      }

      /**
       * @param registryCredential `RegistryCredential` is a property of the
       * [AWS::CodeBuild::Project
       * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
       * property that specifies information about credentials that provide access to a private Docker
       * registry. When this is set:.
       * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
       * * images cannot be curated or an Amazon ECR image.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("550b36dfb3bd161ec105f2283a291b87853a40432119e8c4f5a2eb853bcf69be")
      override
          fun registryCredential(registryCredential: RegistryCredentialProperty.Builder.() -> Unit):
          Unit = registryCredential(RegistryCredentialProperty(registryCredential))

      /**
       * @param type The type of build environment to use for related builds. 
       * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia),
       * US East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo),
       * Asia Pacific (Sydney), and EU (Frankfurt).
       * * The environment type `LINUX_CONTAINER` is available only in regions US East (N.
       * Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU
       * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia
       * Pacific (Sydney), China (Beijing), and China (Ningxia).
       * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
       * Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU
       * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia
       * Pacific (Sydney) , China (Beijing), and China (Ningxia).
       * * The environment types `ARM_LAMBDA_CONTAINER` and `LINUX_LAMBDA_CONTAINER` are available
       * only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific
       * (Mumbai), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), EU
       * (Frankfurt), EU (Ireland), and South America (São Paulo).
       * * The environment types `WINDOWS_CONTAINER` and `WINDOWS_SERVER_2019_CONTAINER` are
       * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), and EU
       * (Ireland).
       *
       *
       * If you're using compute fleets during project creation, `type` will be ignored.
       *
       *
       * For more information, see [Build environment compute
       * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild user guide* .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty,
    ) : CdkObject(cdkObject), EnvironmentProperty {
      /**
       * The ARN of the Amazon S3 bucket, path prefix, and object key that contains the PEM-encoded
       * certificate for the build project.
       *
       * For more information, see
       * [certificate](https://docs.aws.amazon.com/codebuild/latest/userguide/create-project-cli.html#cli.environment.certificate)
       * in the *AWS CodeBuild User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-certificate)
       */
      override fun certificate(): String? = unwrap(this).getCertificate()

      /**
       * The type of compute environment.
       *
       * This determines the number of CPU cores and memory the build environment uses. Available
       * values include:
       *
       * * `BUILD_GENERAL1_SMALL` : Use up to 3 GB memory and 2 vCPUs for builds.
       * * `BUILD_GENERAL1_MEDIUM` : Use up to 7 GB memory and 4 vCPUs for builds.
       * * `BUILD_GENERAL1_LARGE` : Use up to 15 GB memory and 8 vCPUs for builds.
       *
       * For more information, see [Build Environment Compute
       * Types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild User Guide.*
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-computetype)
       */
      override fun computeType(): String = unwrap(this).getComputeType()

      /**
       * A set of environment variables to make available to builds for this build project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-environmentvariables)
       */
      override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-fleet)
       */
      override fun fleet(): Any? = unwrap(this).getFleet()

      /**
       * The image tag or image digest that identifies the Docker image to use for this build
       * project.
       *
       * Use the following formats:
       *
       * * For an image tag: `&lt;registry&gt;/&lt;repository&gt;:&lt;tag&gt;` . For example, in the
       * Docker repository that CodeBuild uses to manage its Docker images, this would be
       * `aws/codebuild/standard:4.0` .
       * * For an image digest: `&lt;registry&gt;/&lt;repository&gt;&#64;&lt;digest&gt;` . For
       * example, to specify an image with the digest
       * "sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf," use
       * `&lt;registry&gt;/&lt;repository&gt;&#64;sha256:cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf`
       * .
       *
       * For more information, see [Docker images provided by
       * CodeBuild](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-available.html)
       * in the *AWS CodeBuild user guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-image)
       */
      override fun image(): String = unwrap(this).getImage()

      /**
       * The type of credentials AWS CodeBuild uses to pull images in your build. There are two
       * valid values:.
       *
       * * `CODEBUILD` specifies that AWS CodeBuild uses its own credentials. This requires that you
       * modify your ECR repository policy to trust AWS CodeBuild service principal.
       * * `SERVICE_ROLE` specifies that AWS CodeBuild uses your build project's service role.
       *
       * When you use a cross-account or private registry image, you must use SERVICE_ROLE
       * credentials. When you use an AWS CodeBuild curated image, you must use CODEBUILD credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-imagepullcredentialstype)
       */
      override fun imagePullCredentialsType(): String? = unwrap(this).getImagePullCredentialsType()

      /**
       * Enables running the Docker daemon inside a Docker container.
       *
       * Set to true only if the build project is used to build Docker images. Otherwise, a build
       * that attempts to interact with the Docker daemon fails. The default setting is `false` .
       *
       * You can initialize the Docker daemon during the install phase of your build by adding one
       * of the following sets of commands to the install phase of your buildspec file:
       *
       * If the operating system's base image is Ubuntu Linux:
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout 15 sh -c "until docker info; do echo .; sleep 1; done"`
       *
       * If the operating system's base image is Alpine Linux and the previous command does not
       * work, add the `-t` argument to `timeout` :
       *
       * `- nohup
       * /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp;`
       *
       * `- timeout -t 15 sh -c "until docker info; do echo .; sleep 1; done"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-privilegedmode)
       */
      override fun privilegedMode(): Any? = unwrap(this).getPrivilegedMode()

      /**
       * `RegistryCredential` is a property of the [AWS::CodeBuild::Project
       * Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
       * property that specifies information about credentials that provide access to a private Docker
       * registry. When this is set:.
       *
       * * `imagePullCredentialsType` must be set to `SERVICE_ROLE` .
       * * images cannot be curated or an Amazon ECR image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-registrycredential)
       */
      override fun registryCredential(): Any? = unwrap(this).getRegistryCredential()

      /**
       * The type of build environment to use for related builds.
       *
       * * The environment type `ARM_CONTAINER` is available only in regions US East (N. Virginia),
       * US East (Ohio), US West (Oregon), EU (Ireland), Asia Pacific (Mumbai), Asia Pacific (Tokyo),
       * Asia Pacific (Sydney), and EU (Frankfurt).
       * * The environment type `LINUX_CONTAINER` is available only in regions US East (N.
       * Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU
       * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia
       * Pacific (Sydney), China (Beijing), and China (Ningxia).
       * * The environment type `LINUX_GPU_CONTAINER` is available only in regions US East (N.
       * Virginia), US East (Ohio), US West (Oregon), Canada (Central), EU (Ireland), EU (London), EU
       * (Frankfurt), Asia Pacific (Tokyo), Asia Pacific (Seoul), Asia Pacific (Singapore), Asia
       * Pacific (Sydney) , China (Beijing), and China (Ningxia).
       * * The environment types `ARM_LAMBDA_CONTAINER` and `LINUX_LAMBDA_CONTAINER` are available
       * only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), Asia Pacific
       * (Mumbai), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), EU
       * (Frankfurt), EU (Ireland), and South America (São Paulo).
       * * The environment types `WINDOWS_CONTAINER` and `WINDOWS_SERVER_2019_CONTAINER` are
       * available only in regions US East (N. Virginia), US East (Ohio), US West (Oregon), and EU
       * (Ireland).
       *
       *
       * If you're using compute fleets during project creation, `type` will be ignored.
       *
       *
       * For more information, see [Build environment compute
       * types](https://docs.aws.amazon.com//codebuild/latest/userguide/build-env-ref-compute-types.html)
       * in the *AWS CodeBuild user guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html#cfn-codebuild-project-environment-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty):
          EnvironmentProperty = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface EnvironmentVariableProperty {
    /**
     * The name or key of the environment variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name)
     */
    public fun name(): String

    /**
     * The type of environment variable. Valid values include:.
     *
     * * `PARAMETER_STORE` : An environment variable stored in Systems Manager Parameter Store. For
     * environment variables of this type, specify the name of the parameter as the `value` of the
     * EnvironmentVariable. The parameter value will be substituted for the name at runtime. You can
     * also define Parameter Store environment variables in the buildspec. To learn how to do so, see
     * [env/parameter-store](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.parameter-store)
     * in the *AWS CodeBuild User Guide* .
     * * `PLAINTEXT` : An environment variable in plain text format. This is the default value.
     * * `SECRETS_MANAGER` : An environment variable stored in AWS Secrets Manager . For environment
     * variables of this type, specify the name of the secret as the `value` of the
     * EnvironmentVariable. The secret value will be substituted for the name at runtime. You can also
     * define AWS Secrets Manager environment variables in the buildspec. To learn how to do so, see
     * [env/secrets-manager](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The value of the environment variable.
     *
     *
     * We strongly discourage the use of `PLAINTEXT` environment variables to store sensitive
     * values, especially AWS secret key IDs. `PLAINTEXT` environment variables can be displayed in
     * plain text using the AWS CodeBuild console and the AWS CLI . For sensitive values, we recommend
     * you use an environment variable of type `PARAMETER_STORE` or `SECRETS_MANAGER` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value)
     */
    public fun `value`(): String

    /**
     * A builder for [EnvironmentVariableProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name or key of the environment variable. 
       */
      public fun name(name: String)

      /**
       * @param type The type of environment variable. Valid values include:.
       * * `PARAMETER_STORE` : An environment variable stored in Systems Manager Parameter Store.
       * For environment variables of this type, specify the name of the parameter as the `value` of
       * the EnvironmentVariable. The parameter value will be substituted for the name at runtime. You
       * can also define Parameter Store environment variables in the buildspec. To learn how to do so,
       * see
       * [env/parameter-store](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.parameter-store)
       * in the *AWS CodeBuild User Guide* .
       * * `PLAINTEXT` : An environment variable in plain text format. This is the default value.
       * * `SECRETS_MANAGER` : An environment variable stored in AWS Secrets Manager . For
       * environment variables of this type, specify the name of the secret as the `value` of the
       * EnvironmentVariable. The secret value will be substituted for the name at runtime. You can
       * also define AWS Secrets Manager environment variables in the buildspec. To learn how to do so,
       * see
       * [env/secrets-manager](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager)
       * in the *AWS CodeBuild User Guide* .
       */
      public fun type(type: String)

      /**
       * @param value The value of the environment variable. 
       *
       * We strongly discourage the use of `PLAINTEXT` environment variables to store sensitive
       * values, especially AWS secret key IDs. `PLAINTEXT` environment variables can be displayed in
       * plain text using the AWS CodeBuild console and the AWS CLI . For sensitive values, we
       * recommend you use an environment variable of type `PARAMETER_STORE` or `SECRETS_MANAGER` .
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty.builder()

      /**
       * @param name The name or key of the environment variable. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The type of environment variable. Valid values include:.
       * * `PARAMETER_STORE` : An environment variable stored in Systems Manager Parameter Store.
       * For environment variables of this type, specify the name of the parameter as the `value` of
       * the EnvironmentVariable. The parameter value will be substituted for the name at runtime. You
       * can also define Parameter Store environment variables in the buildspec. To learn how to do so,
       * see
       * [env/parameter-store](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.parameter-store)
       * in the *AWS CodeBuild User Guide* .
       * * `PLAINTEXT` : An environment variable in plain text format. This is the default value.
       * * `SECRETS_MANAGER` : An environment variable stored in AWS Secrets Manager . For
       * environment variables of this type, specify the name of the secret as the `value` of the
       * EnvironmentVariable. The secret value will be substituted for the name at runtime. You can
       * also define AWS Secrets Manager environment variables in the buildspec. To learn how to do so,
       * see
       * [env/secrets-manager](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager)
       * in the *AWS CodeBuild User Guide* .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value The value of the environment variable. 
       *
       * We strongly discourage the use of `PLAINTEXT` environment variables to store sensitive
       * values, especially AWS secret key IDs. `PLAINTEXT` environment variables can be displayed in
       * plain text using the AWS CodeBuild console and the AWS CLI . For sensitive values, we
       * recommend you use an environment variable of type `PARAMETER_STORE` or `SECRETS_MANAGER` .
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty,
    ) : CdkObject(cdkObject), EnvironmentVariableProperty {
      /**
       * The name or key of the environment variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of environment variable. Valid values include:.
       *
       * * `PARAMETER_STORE` : An environment variable stored in Systems Manager Parameter Store.
       * For environment variables of this type, specify the name of the parameter as the `value` of
       * the EnvironmentVariable. The parameter value will be substituted for the name at runtime. You
       * can also define Parameter Store environment variables in the buildspec. To learn how to do so,
       * see
       * [env/parameter-store](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.parameter-store)
       * in the *AWS CodeBuild User Guide* .
       * * `PLAINTEXT` : An environment variable in plain text format. This is the default value.
       * * `SECRETS_MANAGER` : An environment variable stored in AWS Secrets Manager . For
       * environment variables of this type, specify the name of the secret as the `value` of the
       * EnvironmentVariable. The secret value will be substituted for the name at runtime. You can
       * also define AWS Secrets Manager environment variables in the buildspec. To learn how to do so,
       * see
       * [env/secrets-manager](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager)
       * in the *AWS CodeBuild User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The value of the environment variable.
       *
       *
       * We strongly discourage the use of `PLAINTEXT` environment variables to store sensitive
       * values, especially AWS secret key IDs. `PLAINTEXT` environment variables can be displayed in
       * plain text using the AWS CodeBuild console and the AWS CLI . For sensitive values, we
       * recommend you use an environment variable of type `PARAMETER_STORE` or `SECRETS_MANAGER` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html#cfn-codebuild-project-environmentvariable-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentVariableProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty):
          EnvironmentVariableProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnvironmentVariableProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentVariableProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.EnvironmentVariableProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * GitSubmodulesConfigProperty gitSubmodulesConfigProperty = GitSubmodulesConfigProperty.builder()
   * .fetchSubmodules(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html)
   */
  public interface GitSubmodulesConfigProperty {
    /**
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules)
     */
    public fun fetchSubmodules(): Any

    /**
     * A builder for [GitSubmodulesConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fetchSubmodules Set to true to fetch Git submodules for your AWS CodeBuild build
       * project. 
       */
      public fun fetchSubmodules(fetchSubmodules: Boolean)

      /**
       * @param fetchSubmodules Set to true to fetch Git submodules for your AWS CodeBuild build
       * project. 
       */
      public fun fetchSubmodules(fetchSubmodules: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty.builder()

      /**
       * @param fetchSubmodules Set to true to fetch Git submodules for your AWS CodeBuild build
       * project. 
       */
      override fun fetchSubmodules(fetchSubmodules: Boolean) {
        cdkBuilder.fetchSubmodules(fetchSubmodules)
      }

      /**
       * @param fetchSubmodules Set to true to fetch Git submodules for your AWS CodeBuild build
       * project. 
       */
      override fun fetchSubmodules(fetchSubmodules: IResolvable) {
        cdkBuilder.fetchSubmodules(fetchSubmodules.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty,
    ) : CdkObject(cdkObject), GitSubmodulesConfigProperty {
      /**
       * Set to true to fetch Git submodules for your AWS CodeBuild build project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules)
       */
      override fun fetchSubmodules(): Any = unwrap(this).getFetchSubmodules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GitSubmodulesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty):
          GitSubmodulesConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GitSubmodulesConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GitSubmodulesConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.GitSubmodulesConfigProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface LogsConfigProperty {
    /**
     * Information about CloudWatch Logs for a build project.
     *
     * CloudWatch Logs are enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-cloudwatchlogs)
     */
    public fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

    /**
     * Information about logs built to an S3 bucket for a build project.
     *
     * S3 logs are not enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-s3logs)
     */
    public fun s3Logs(): Any? = unwrap(this).getS3Logs()

    /**
     * A builder for [LogsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogs Information about CloudWatch Logs for a build project.
       * CloudWatch Logs are enabled by default.
       */
      public fun cloudWatchLogs(cloudWatchLogs: IResolvable)

      /**
       * @param cloudWatchLogs Information about CloudWatch Logs for a build project.
       * CloudWatch Logs are enabled by default.
       */
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsConfigProperty)

      /**
       * @param cloudWatchLogs Information about CloudWatch Logs for a build project.
       * CloudWatch Logs are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eb07b1006eeaa9210d3b3ae015fc0b6a3453a558c71c5111539baed39c17e28")
      public fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsConfigProperty.Builder.() -> Unit)

      /**
       * @param s3Logs Information about logs built to an S3 bucket for a build project.
       * S3 logs are not enabled by default.
       */
      public fun s3Logs(s3Logs: IResolvable)

      /**
       * @param s3Logs Information about logs built to an S3 bucket for a build project.
       * S3 logs are not enabled by default.
       */
      public fun s3Logs(s3Logs: S3LogsConfigProperty)

      /**
       * @param s3Logs Information about logs built to an S3 bucket for a build project.
       * S3 logs are not enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("618f8f82e94a6b7f187397fb3469167fa5390128d214ea66723fcd602bc277f1")
      public fun s3Logs(s3Logs: S3LogsConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty.builder()

      /**
       * @param cloudWatchLogs Information about CloudWatch Logs for a build project.
       * CloudWatch Logs are enabled by default.
       */
      override fun cloudWatchLogs(cloudWatchLogs: IResolvable) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogs Information about CloudWatch Logs for a build project.
       * CloudWatch Logs are enabled by default.
       */
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsConfigProperty) {
        cdkBuilder.cloudWatchLogs(cloudWatchLogs.let(CloudWatchLogsConfigProperty::unwrap))
      }

      /**
       * @param cloudWatchLogs Information about CloudWatch Logs for a build project.
       * CloudWatch Logs are enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eb07b1006eeaa9210d3b3ae015fc0b6a3453a558c71c5111539baed39c17e28")
      override fun cloudWatchLogs(cloudWatchLogs: CloudWatchLogsConfigProperty.Builder.() -> Unit):
          Unit = cloudWatchLogs(CloudWatchLogsConfigProperty(cloudWatchLogs))

      /**
       * @param s3Logs Information about logs built to an S3 bucket for a build project.
       * S3 logs are not enabled by default.
       */
      override fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs.let(IResolvable::unwrap))
      }

      /**
       * @param s3Logs Information about logs built to an S3 bucket for a build project.
       * S3 logs are not enabled by default.
       */
      override fun s3Logs(s3Logs: S3LogsConfigProperty) {
        cdkBuilder.s3Logs(s3Logs.let(S3LogsConfigProperty::unwrap))
      }

      /**
       * @param s3Logs Information about logs built to an S3 bucket for a build project.
       * S3 logs are not enabled by default.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("618f8f82e94a6b7f187397fb3469167fa5390128d214ea66723fcd602bc277f1")
      override fun s3Logs(s3Logs: S3LogsConfigProperty.Builder.() -> Unit): Unit =
          s3Logs(S3LogsConfigProperty(s3Logs))

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty,
    ) : CdkObject(cdkObject), LogsConfigProperty {
      /**
       * Information about CloudWatch Logs for a build project.
       *
       * CloudWatch Logs are enabled by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-cloudwatchlogs)
       */
      override fun cloudWatchLogs(): Any? = unwrap(this).getCloudWatchLogs()

      /**
       * Information about logs built to an S3 bucket for a build project.
       *
       * S3 logs are not enabled by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html#cfn-codebuild-project-logsconfig-s3logs)
       */
      override fun s3Logs(): Any? = unwrap(this).getS3Logs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty):
          LogsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LogsConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogsConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.LogsConfigProperty
    }
  }

  /**
   * Contains configuration information about a batch build project.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface ProjectBuildBatchConfigProperty {
    /**
     * Specifies how build status reports are sent to the source provider for the batch build.
     *
     * This property is only used when the source provider for your project is Bitbucket, GitHub, or
     * GitHub Enterprise, and your project is configured to report build statuses to the source
     * provider.
     *
     * * **REPORT_AGGREGATED_BATCH** - (Default) Aggregate all of the build statuses into a single
     * status report.
     * * **REPORT_INDIVIDUAL_BUILDS** - Send a separate status report for each individual build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-batchreportmode)
     */
    public fun batchReportMode(): String? = unwrap(this).getBatchReportMode()

    /**
     * Specifies if the build artifacts for the batch build should be combined into a single
     * artifact location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-combineartifacts)
     */
    public fun combineArtifacts(): Any? = unwrap(this).getCombineArtifacts()

    /**
     * A `BatchRestrictions` object that specifies the restrictions for the batch build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-restrictions)
     */
    public fun restrictions(): Any? = unwrap(this).getRestrictions()

    /**
     * Specifies the service role ARN for the batch build project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-servicerole)
     */
    public fun serviceRole(): String? = unwrap(this).getServiceRole()

    /**
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-timeoutinmins)
     */
    public fun timeoutInMins(): Number? = unwrap(this).getTimeoutInMins()

    /**
     * A builder for [ProjectBuildBatchConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchReportMode Specifies how build status reports are sent to the source provider
       * for the batch build.
       * This property is only used when the source provider for your project is Bitbucket, GitHub,
       * or GitHub Enterprise, and your project is configured to report build statuses to the source
       * provider.
       *
       * * **REPORT_AGGREGATED_BATCH** - (Default) Aggregate all of the build statuses into a single
       * status report.
       * * **REPORT_INDIVIDUAL_BUILDS** - Send a separate status report for each individual build.
       */
      public fun batchReportMode(batchReportMode: String)

      /**
       * @param combineArtifacts Specifies if the build artifacts for the batch build should be
       * combined into a single artifact location.
       */
      public fun combineArtifacts(combineArtifacts: Boolean)

      /**
       * @param combineArtifacts Specifies if the build artifacts for the batch build should be
       * combined into a single artifact location.
       */
      public fun combineArtifacts(combineArtifacts: IResolvable)

      /**
       * @param restrictions A `BatchRestrictions` object that specifies the restrictions for the
       * batch build.
       */
      public fun restrictions(restrictions: IResolvable)

      /**
       * @param restrictions A `BatchRestrictions` object that specifies the restrictions for the
       * batch build.
       */
      public fun restrictions(restrictions: BatchRestrictionsProperty)

      /**
       * @param restrictions A `BatchRestrictions` object that specifies the restrictions for the
       * batch build.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01751331ef50dd769676487deeb1add0406ffad963fdd1b3b38d0f20bbbdcf0d")
      public fun restrictions(restrictions: BatchRestrictionsProperty.Builder.() -> Unit)

      /**
       * @param serviceRole Specifies the service role ARN for the batch build project.
       */
      public fun serviceRole(serviceRole: String)

      /**
       * @param timeoutInMins Specifies the maximum amount of time, in minutes, that the batch build
       * must be completed in.
       */
      public fun timeoutInMins(timeoutInMins: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty.builder()

      /**
       * @param batchReportMode Specifies how build status reports are sent to the source provider
       * for the batch build.
       * This property is only used when the source provider for your project is Bitbucket, GitHub,
       * or GitHub Enterprise, and your project is configured to report build statuses to the source
       * provider.
       *
       * * **REPORT_AGGREGATED_BATCH** - (Default) Aggregate all of the build statuses into a single
       * status report.
       * * **REPORT_INDIVIDUAL_BUILDS** - Send a separate status report for each individual build.
       */
      override fun batchReportMode(batchReportMode: String) {
        cdkBuilder.batchReportMode(batchReportMode)
      }

      /**
       * @param combineArtifacts Specifies if the build artifacts for the batch build should be
       * combined into a single artifact location.
       */
      override fun combineArtifacts(combineArtifacts: Boolean) {
        cdkBuilder.combineArtifacts(combineArtifacts)
      }

      /**
       * @param combineArtifacts Specifies if the build artifacts for the batch build should be
       * combined into a single artifact location.
       */
      override fun combineArtifacts(combineArtifacts: IResolvable) {
        cdkBuilder.combineArtifacts(combineArtifacts.let(IResolvable::unwrap))
      }

      /**
       * @param restrictions A `BatchRestrictions` object that specifies the restrictions for the
       * batch build.
       */
      override fun restrictions(restrictions: IResolvable) {
        cdkBuilder.restrictions(restrictions.let(IResolvable::unwrap))
      }

      /**
       * @param restrictions A `BatchRestrictions` object that specifies the restrictions for the
       * batch build.
       */
      override fun restrictions(restrictions: BatchRestrictionsProperty) {
        cdkBuilder.restrictions(restrictions.let(BatchRestrictionsProperty::unwrap))
      }

      /**
       * @param restrictions A `BatchRestrictions` object that specifies the restrictions for the
       * batch build.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01751331ef50dd769676487deeb1add0406ffad963fdd1b3b38d0f20bbbdcf0d")
      override fun restrictions(restrictions: BatchRestrictionsProperty.Builder.() -> Unit): Unit =
          restrictions(BatchRestrictionsProperty(restrictions))

      /**
       * @param serviceRole Specifies the service role ARN for the batch build project.
       */
      override fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
      }

      /**
       * @param timeoutInMins Specifies the maximum amount of time, in minutes, that the batch build
       * must be completed in.
       */
      override fun timeoutInMins(timeoutInMins: Number) {
        cdkBuilder.timeoutInMins(timeoutInMins)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty,
    ) : CdkObject(cdkObject), ProjectBuildBatchConfigProperty {
      /**
       * Specifies how build status reports are sent to the source provider for the batch build.
       *
       * This property is only used when the source provider for your project is Bitbucket, GitHub,
       * or GitHub Enterprise, and your project is configured to report build statuses to the source
       * provider.
       *
       * * **REPORT_AGGREGATED_BATCH** - (Default) Aggregate all of the build statuses into a single
       * status report.
       * * **REPORT_INDIVIDUAL_BUILDS** - Send a separate status report for each individual build.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-batchreportmode)
       */
      override fun batchReportMode(): String? = unwrap(this).getBatchReportMode()

      /**
       * Specifies if the build artifacts for the batch build should be combined into a single
       * artifact location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-combineartifacts)
       */
      override fun combineArtifacts(): Any? = unwrap(this).getCombineArtifacts()

      /**
       * A `BatchRestrictions` object that specifies the restrictions for the batch build.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-restrictions)
       */
      override fun restrictions(): Any? = unwrap(this).getRestrictions()

      /**
       * Specifies the service role ARN for the batch build project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-servicerole)
       */
      override fun serviceRole(): String? = unwrap(this).getServiceRole()

      /**
       * Specifies the maximum amount of time, in minutes, that the batch build must be completed
       * in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html#cfn-codebuild-project-projectbuildbatchconfig-timeoutinmins)
       */
      override fun timeoutInMins(): Number? = unwrap(this).getTimeoutInMins()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectBuildBatchConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty):
          ProjectBuildBatchConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProjectBuildBatchConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectBuildBatchConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectBuildBatchConfigProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface ProjectCacheProperty {
    /**
     * Information about the cache location:.
     *
     * * `NO_CACHE` or `LOCAL` : This value is ignored.
     * * `S3` : This is the S3 bucket name/prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

    /**
     * An array of strings that specify the local cache modes.
     *
     * You can use one or more local cache modes at the same time. This is only used for `LOCAL`
     * cache types.
     *
     * Possible values are:
     *
     * * **LOCAL_SOURCE_CACHE** - Caches Git metadata for primary and secondary sources. After the
     * cache is created, subsequent builds pull only the change between commits. This mode is a good
     * choice for projects with a clean working directory and a source that is a large Git repository.
     * If you choose this option and your project does not use a Git repository (GitHub, GitHub
     * Enterprise, or Bitbucket), the option is ignored.
     * * **LOCAL_DOCKER_LAYER_CACHE** - Caches existing Docker layers. This mode is a good choice
     * for projects that build or pull large Docker images. It can prevent the performance issues
     * caused by pulling large Docker images down from the network.
     *
     *
     * * You can use a Docker layer cache in the Linux environment only.
     * * The `privileged` flag must be set so that your project has the required Docker permissions.
     * * You should consider the security implications before you use a Docker layer cache.
     *
     *
     * * **LOCAL_CUSTOM_CACHE** - Caches directories you specify in the buildspec file. This mode is
     * a good choice if your build scenario is not suited to one of the other three local cache modes.
     * If you use a custom cache:
     * * Only directories can be specified for caching. You cannot specify individual files.
     * * Symlinks are used to reference cached directories.
     * * Cached directories are linked to your build before it downloads its project sources. Cached
     * items are overridden if a source item has the same name. Directories are specified using cache
     * paths in the buildspec file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-modes)
     */
    public fun modes(): List<String> = unwrap(this).getModes() ?: emptyList()

    /**
     * The type of cache used by the build project. Valid values include:.
     *
     * * `NO_CACHE` : The build project does not use any cache.
     * * `S3` : The build project reads and writes from and to S3.
     * * `LOCAL` : The build project stores a cache locally on a build host that is only available
     * to that build host.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-type)
     */
    public fun type(): String

    /**
     * A builder for [ProjectCacheProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param location Information about the cache location:.
       * * `NO_CACHE` or `LOCAL` : This value is ignored.
       * * `S3` : This is the S3 bucket name/prefix.
       */
      public fun location(location: String)

      /**
       * @param modes An array of strings that specify the local cache modes.
       * You can use one or more local cache modes at the same time. This is only used for `LOCAL`
       * cache types.
       *
       * Possible values are:
       *
       * * **LOCAL_SOURCE_CACHE** - Caches Git metadata for primary and secondary sources. After the
       * cache is created, subsequent builds pull only the change between commits. This mode is a good
       * choice for projects with a clean working directory and a source that is a large Git
       * repository. If you choose this option and your project does not use a Git repository (GitHub,
       * GitHub Enterprise, or Bitbucket), the option is ignored.
       * * **LOCAL_DOCKER_LAYER_CACHE** - Caches existing Docker layers. This mode is a good choice
       * for projects that build or pull large Docker images. It can prevent the performance issues
       * caused by pulling large Docker images down from the network.
       *
       *
       * * You can use a Docker layer cache in the Linux environment only.
       * * The `privileged` flag must be set so that your project has the required Docker
       * permissions.
       * * You should consider the security implications before you use a Docker layer cache.
       *
       *
       * * **LOCAL_CUSTOM_CACHE** - Caches directories you specify in the buildspec file. This mode
       * is a good choice if your build scenario is not suited to one of the other three local cache
       * modes. If you use a custom cache:
       * * Only directories can be specified for caching. You cannot specify individual files.
       * * Symlinks are used to reference cached directories.
       * * Cached directories are linked to your build before it downloads its project sources.
       * Cached items are overridden if a source item has the same name. Directories are specified
       * using cache paths in the buildspec file.
       */
      public fun modes(modes: List<String>)

      /**
       * @param modes An array of strings that specify the local cache modes.
       * You can use one or more local cache modes at the same time. This is only used for `LOCAL`
       * cache types.
       *
       * Possible values are:
       *
       * * **LOCAL_SOURCE_CACHE** - Caches Git metadata for primary and secondary sources. After the
       * cache is created, subsequent builds pull only the change between commits. This mode is a good
       * choice for projects with a clean working directory and a source that is a large Git
       * repository. If you choose this option and your project does not use a Git repository (GitHub,
       * GitHub Enterprise, or Bitbucket), the option is ignored.
       * * **LOCAL_DOCKER_LAYER_CACHE** - Caches existing Docker layers. This mode is a good choice
       * for projects that build or pull large Docker images. It can prevent the performance issues
       * caused by pulling large Docker images down from the network.
       *
       *
       * * You can use a Docker layer cache in the Linux environment only.
       * * The `privileged` flag must be set so that your project has the required Docker
       * permissions.
       * * You should consider the security implications before you use a Docker layer cache.
       *
       *
       * * **LOCAL_CUSTOM_CACHE** - Caches directories you specify in the buildspec file. This mode
       * is a good choice if your build scenario is not suited to one of the other three local cache
       * modes. If you use a custom cache:
       * * Only directories can be specified for caching. You cannot specify individual files.
       * * Symlinks are used to reference cached directories.
       * * Cached directories are linked to your build before it downloads its project sources.
       * Cached items are overridden if a source item has the same name. Directories are specified
       * using cache paths in the buildspec file.
       */
      public fun modes(vararg modes: String)

      /**
       * @param type The type of cache used by the build project. Valid values include:. 
       * * `NO_CACHE` : The build project does not use any cache.
       * * `S3` : The build project reads and writes from and to S3.
       * * `LOCAL` : The build project stores a cache locally on a build host that is only available
       * to that build host.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty.builder()

      /**
       * @param location Information about the cache location:.
       * * `NO_CACHE` or `LOCAL` : This value is ignored.
       * * `S3` : This is the S3 bucket name/prefix.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param modes An array of strings that specify the local cache modes.
       * You can use one or more local cache modes at the same time. This is only used for `LOCAL`
       * cache types.
       *
       * Possible values are:
       *
       * * **LOCAL_SOURCE_CACHE** - Caches Git metadata for primary and secondary sources. After the
       * cache is created, subsequent builds pull only the change between commits. This mode is a good
       * choice for projects with a clean working directory and a source that is a large Git
       * repository. If you choose this option and your project does not use a Git repository (GitHub,
       * GitHub Enterprise, or Bitbucket), the option is ignored.
       * * **LOCAL_DOCKER_LAYER_CACHE** - Caches existing Docker layers. This mode is a good choice
       * for projects that build or pull large Docker images. It can prevent the performance issues
       * caused by pulling large Docker images down from the network.
       *
       *
       * * You can use a Docker layer cache in the Linux environment only.
       * * The `privileged` flag must be set so that your project has the required Docker
       * permissions.
       * * You should consider the security implications before you use a Docker layer cache.
       *
       *
       * * **LOCAL_CUSTOM_CACHE** - Caches directories you specify in the buildspec file. This mode
       * is a good choice if your build scenario is not suited to one of the other three local cache
       * modes. If you use a custom cache:
       * * Only directories can be specified for caching. You cannot specify individual files.
       * * Symlinks are used to reference cached directories.
       * * Cached directories are linked to your build before it downloads its project sources.
       * Cached items are overridden if a source item has the same name. Directories are specified
       * using cache paths in the buildspec file.
       */
      override fun modes(modes: List<String>) {
        cdkBuilder.modes(modes)
      }

      /**
       * @param modes An array of strings that specify the local cache modes.
       * You can use one or more local cache modes at the same time. This is only used for `LOCAL`
       * cache types.
       *
       * Possible values are:
       *
       * * **LOCAL_SOURCE_CACHE** - Caches Git metadata for primary and secondary sources. After the
       * cache is created, subsequent builds pull only the change between commits. This mode is a good
       * choice for projects with a clean working directory and a source that is a large Git
       * repository. If you choose this option and your project does not use a Git repository (GitHub,
       * GitHub Enterprise, or Bitbucket), the option is ignored.
       * * **LOCAL_DOCKER_LAYER_CACHE** - Caches existing Docker layers. This mode is a good choice
       * for projects that build or pull large Docker images. It can prevent the performance issues
       * caused by pulling large Docker images down from the network.
       *
       *
       * * You can use a Docker layer cache in the Linux environment only.
       * * The `privileged` flag must be set so that your project has the required Docker
       * permissions.
       * * You should consider the security implications before you use a Docker layer cache.
       *
       *
       * * **LOCAL_CUSTOM_CACHE** - Caches directories you specify in the buildspec file. This mode
       * is a good choice if your build scenario is not suited to one of the other three local cache
       * modes. If you use a custom cache:
       * * Only directories can be specified for caching. You cannot specify individual files.
       * * Symlinks are used to reference cached directories.
       * * Cached directories are linked to your build before it downloads its project sources.
       * Cached items are overridden if a source item has the same name. Directories are specified
       * using cache paths in the buildspec file.
       */
      override fun modes(vararg modes: String): Unit = modes(modes.toList())

      /**
       * @param type The type of cache used by the build project. Valid values include:. 
       * * `NO_CACHE` : The build project does not use any cache.
       * * `S3` : The build project reads and writes from and to S3.
       * * `LOCAL` : The build project stores a cache locally on a build host that is only available
       * to that build host.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty,
    ) : CdkObject(cdkObject), ProjectCacheProperty {
      /**
       * Information about the cache location:.
       *
       * * `NO_CACHE` or `LOCAL` : This value is ignored.
       * * `S3` : This is the S3 bucket name/prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

      /**
       * An array of strings that specify the local cache modes.
       *
       * You can use one or more local cache modes at the same time. This is only used for `LOCAL`
       * cache types.
       *
       * Possible values are:
       *
       * * **LOCAL_SOURCE_CACHE** - Caches Git metadata for primary and secondary sources. After the
       * cache is created, subsequent builds pull only the change between commits. This mode is a good
       * choice for projects with a clean working directory and a source that is a large Git
       * repository. If you choose this option and your project does not use a Git repository (GitHub,
       * GitHub Enterprise, or Bitbucket), the option is ignored.
       * * **LOCAL_DOCKER_LAYER_CACHE** - Caches existing Docker layers. This mode is a good choice
       * for projects that build or pull large Docker images. It can prevent the performance issues
       * caused by pulling large Docker images down from the network.
       *
       *
       * * You can use a Docker layer cache in the Linux environment only.
       * * The `privileged` flag must be set so that your project has the required Docker
       * permissions.
       * * You should consider the security implications before you use a Docker layer cache.
       *
       *
       * * **LOCAL_CUSTOM_CACHE** - Caches directories you specify in the buildspec file. This mode
       * is a good choice if your build scenario is not suited to one of the other three local cache
       * modes. If you use a custom cache:
       * * Only directories can be specified for caching. You cannot specify individual files.
       * * Symlinks are used to reference cached directories.
       * * Cached directories are linked to your build before it downloads its project sources.
       * Cached items are overridden if a source item has the same name. Directories are specified
       * using cache paths in the buildspec file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-modes)
       */
      override fun modes(): List<String> = unwrap(this).getModes() ?: emptyList()

      /**
       * The type of cache used by the build project. Valid values include:.
       *
       * * `NO_CACHE` : The build project does not use any cache.
       * * `S3` : The build project reads and writes from and to S3.
       * * `LOCAL` : The build project stores a cache locally on a build host that is only available
       * to that build host.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectcache.html#cfn-codebuild-project-projectcache-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectCacheProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty):
          ProjectCacheProperty = CdkObjectWrappers.wrap(cdkObject) as? ProjectCacheProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectCacheProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectCacheProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface ProjectFileSystemLocationProperty {
    /**
     * The name used to access a file system created by Amazon EFS.
     *
     * CodeBuild creates an environment variable by appending the `identifier` in all capital
     * letters to `CODEBUILD_` . For example, if you specify `my_efs` for `identifier` , a new
     * environment variable is create named `CODEBUILD_MY_EFS` .
     *
     * The `identifier` is used to mount your file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-identifier)
     */
    public fun identifier(): String

    /**
     * A string that specifies the location of the file system created by Amazon EFS.
     *
     * Its format is `efs-dns-name:/directory-path` . You can find the DNS name of file system when
     * you view it in the Amazon EFS console. The directory path is a path to a directory in the file
     * system that CodeBuild mounts. For example, if the DNS name of a file system is
     * `fs-abcd1234.efs.us-west-2.amazonaws.com` , and its mount directory is `my-efs-mount-directory`
     * , then the `location` is `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory` .
     *
     * The directory path in the format `efs-dns-name:/directory-path` is optional. If you do not
     * specify a directory path, the location is only the DNS name and CodeBuild mounts the entire file
     * system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-location)
     */
    public fun location(): String

    /**
     * The mount options for a file system created by Amazon EFS.
     *
     * The default mount options used by CodeBuild are
     * `nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2` . For more information, see
     * [Recommended NFS Mount
     * Options](https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-mountoptions)
     */
    public fun mountOptions(): String? = unwrap(this).getMountOptions()

    /**
     * The location in the container where you mount the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-mountpoint)
     */
    public fun mountPoint(): String

    /**
     * The type of the file system.
     *
     * The one supported type is `EFS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-type)
     */
    public fun type(): String

    /**
     * A builder for [ProjectFileSystemLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param identifier The name used to access a file system created by Amazon EFS. 
       * CodeBuild creates an environment variable by appending the `identifier` in all capital
       * letters to `CODEBUILD_` . For example, if you specify `my_efs` for `identifier` , a new
       * environment variable is create named `CODEBUILD_MY_EFS` .
       *
       * The `identifier` is used to mount your file system.
       */
      public fun identifier(identifier: String)

      /**
       * @param location A string that specifies the location of the file system created by Amazon
       * EFS. 
       * Its format is `efs-dns-name:/directory-path` . You can find the DNS name of file system
       * when you view it in the Amazon EFS console. The directory path is a path to a directory in the
       * file system that CodeBuild mounts. For example, if the DNS name of a file system is
       * `fs-abcd1234.efs.us-west-2.amazonaws.com` , and its mount directory is
       * `my-efs-mount-directory` , then the `location` is
       * `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory` .
       *
       * The directory path in the format `efs-dns-name:/directory-path` is optional. If you do not
       * specify a directory path, the location is only the DNS name and CodeBuild mounts the entire
       * file system.
       */
      public fun location(location: String)

      /**
       * @param mountOptions The mount options for a file system created by Amazon EFS.
       * The default mount options used by CodeBuild are
       * `nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2` . For more information, see
       * [Recommended NFS Mount
       * Options](https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html) .
       */
      public fun mountOptions(mountOptions: String)

      /**
       * @param mountPoint The location in the container where you mount the file system. 
       */
      public fun mountPoint(mountPoint: String)

      /**
       * @param type The type of the file system. 
       * The one supported type is `EFS` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty.builder()

      /**
       * @param identifier The name used to access a file system created by Amazon EFS. 
       * CodeBuild creates an environment variable by appending the `identifier` in all capital
       * letters to `CODEBUILD_` . For example, if you specify `my_efs` for `identifier` , a new
       * environment variable is create named `CODEBUILD_MY_EFS` .
       *
       * The `identifier` is used to mount your file system.
       */
      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      /**
       * @param location A string that specifies the location of the file system created by Amazon
       * EFS. 
       * Its format is `efs-dns-name:/directory-path` . You can find the DNS name of file system
       * when you view it in the Amazon EFS console. The directory path is a path to a directory in the
       * file system that CodeBuild mounts. For example, if the DNS name of a file system is
       * `fs-abcd1234.efs.us-west-2.amazonaws.com` , and its mount directory is
       * `my-efs-mount-directory` , then the `location` is
       * `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory` .
       *
       * The directory path in the format `efs-dns-name:/directory-path` is optional. If you do not
       * specify a directory path, the location is only the DNS name and CodeBuild mounts the entire
       * file system.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param mountOptions The mount options for a file system created by Amazon EFS.
       * The default mount options used by CodeBuild are
       * `nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2` . For more information, see
       * [Recommended NFS Mount
       * Options](https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html) .
       */
      override fun mountOptions(mountOptions: String) {
        cdkBuilder.mountOptions(mountOptions)
      }

      /**
       * @param mountPoint The location in the container where you mount the file system. 
       */
      override fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
      }

      /**
       * @param type The type of the file system. 
       * The one supported type is `EFS` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty,
    ) : CdkObject(cdkObject), ProjectFileSystemLocationProperty {
      /**
       * The name used to access a file system created by Amazon EFS.
       *
       * CodeBuild creates an environment variable by appending the `identifier` in all capital
       * letters to `CODEBUILD_` . For example, if you specify `my_efs` for `identifier` , a new
       * environment variable is create named `CODEBUILD_MY_EFS` .
       *
       * The `identifier` is used to mount your file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-identifier)
       */
      override fun identifier(): String = unwrap(this).getIdentifier()

      /**
       * A string that specifies the location of the file system created by Amazon EFS.
       *
       * Its format is `efs-dns-name:/directory-path` . You can find the DNS name of file system
       * when you view it in the Amazon EFS console. The directory path is a path to a directory in the
       * file system that CodeBuild mounts. For example, if the DNS name of a file system is
       * `fs-abcd1234.efs.us-west-2.amazonaws.com` , and its mount directory is
       * `my-efs-mount-directory` , then the `location` is
       * `fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory` .
       *
       * The directory path in the format `efs-dns-name:/directory-path` is optional. If you do not
       * specify a directory path, the location is only the DNS name and CodeBuild mounts the entire
       * file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-location)
       */
      override fun location(): String = unwrap(this).getLocation()

      /**
       * The mount options for a file system created by Amazon EFS.
       *
       * The default mount options used by CodeBuild are
       * `nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2` . For more information, see
       * [Recommended NFS Mount
       * Options](https://docs.aws.amazon.com/efs/latest/ug/mounting-fs-nfs-mount-settings.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-mountoptions)
       */
      override fun mountOptions(): String? = unwrap(this).getMountOptions()

      /**
       * The location in the container where you mount the file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-mountpoint)
       */
      override fun mountPoint(): String = unwrap(this).getMountPoint()

      /**
       * The type of the file system.
       *
       * The one supported type is `EFS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfilesystemlocation.html#cfn-codebuild-project-projectfilesystemlocation-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProjectFileSystemLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty):
          ProjectFileSystemLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProjectFileSystemLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectFileSystemLocationProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFileSystemLocationProperty
    }
  }

  /**
   * Information about the compute fleet of the build project.
   *
   * For more information, see [Working with reserved capacity in AWS
   * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/fleets.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * ProjectFleetProperty projectFleetProperty = ProjectFleetProperty.builder()
   * .fleetArn("fleetArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfleet.html)
   */
  public interface ProjectFleetProperty {
    /**
     * Specifies the compute fleet ARN for the build project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfleet.html#cfn-codebuild-project-projectfleet-fleetarn)
     */
    public fun fleetArn(): String? = unwrap(this).getFleetArn()

    /**
     * A builder for [ProjectFleetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fleetArn Specifies the compute fleet ARN for the build project.
       */
      public fun fleetArn(fleetArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty.builder()

      /**
       * @param fleetArn Specifies the compute fleet ARN for the build project.
       */
      override fun fleetArn(fleetArn: String) {
        cdkBuilder.fleetArn(fleetArn)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty,
    ) : CdkObject(cdkObject), ProjectFleetProperty {
      /**
       * Specifies the compute fleet ARN for the build project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectfleet.html#cfn-codebuild-project-projectfleet-fleetarn)
       */
      override fun fleetArn(): String? = unwrap(this).getFleetArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectFleetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty):
          ProjectFleetProperty = CdkObjectWrappers.wrap(cdkObject) as? ProjectFleetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectFleetProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectFleetProperty
    }
  }

  /**
   * A source identifier and its corresponding version.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface ProjectSourceVersionProperty {
    /**
     * An identifier for a source in the build project.
     *
     * The identifier can only contain alphanumeric characters and underscores, and must be less
     * than 128 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceidentifier)
     */
    public fun sourceIdentifier(): String

    /**
     * The source version for the corresponding source identifier. If specified, must be one of:.
     *
     * * For CodeCommit: the commit ID, branch, or Git tag to use.
     * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to
     * the version of the source code you want to build. If a pull request ID is specified, it must use
     * the format `pr/pull-request-ID` (for example, `pr/25` ). If a branch name is specified, the
     * branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
     * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of
     * the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is
     * used. If not specified, the default branch's HEAD commit ID is used.
     * * For Amazon S3: the version ID of the object that represents the build input ZIP file to
     * use.
     *
     * For more information, see [Source Version Sample with
     * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html) in
     * the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceversion)
     */
    public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

    /**
     * A builder for [ProjectSourceVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceIdentifier An identifier for a source in the build project. 
       * The identifier can only contain alphanumeric characters and underscores, and must be less
       * than 128 characters in length.
       */
      public fun sourceIdentifier(sourceIdentifier: String)

      /**
       * @param sourceVersion The source version for the corresponding source identifier. If
       * specified, must be one of:.
       * * For CodeCommit: the commit ID, branch, or Git tag to use.
       * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to
       * the version of the source code you want to build. If a pull request ID is specified, it must
       * use the format `pr/pull-request-ID` (for example, `pr/25` ). If a branch name is specified,
       * the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is
       * used.
       * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of
       * the source code you want to build. If a branch name is specified, the branch's HEAD commit ID
       * is used. If not specified, the default branch's HEAD commit ID is used.
       * * For Amazon S3: the version ID of the object that represents the build input ZIP file to
       * use.
       *
       * For more information, see [Source Version Sample with
       * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html)
       * in the *AWS CodeBuild User Guide* .
       */
      public fun sourceVersion(sourceVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty.Builder
          =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty.builder()

      /**
       * @param sourceIdentifier An identifier for a source in the build project. 
       * The identifier can only contain alphanumeric characters and underscores, and must be less
       * than 128 characters in length.
       */
      override fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
      }

      /**
       * @param sourceVersion The source version for the corresponding source identifier. If
       * specified, must be one of:.
       * * For CodeCommit: the commit ID, branch, or Git tag to use.
       * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to
       * the version of the source code you want to build. If a pull request ID is specified, it must
       * use the format `pr/pull-request-ID` (for example, `pr/25` ). If a branch name is specified,
       * the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is
       * used.
       * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of
       * the source code you want to build. If a branch name is specified, the branch's HEAD commit ID
       * is used. If not specified, the default branch's HEAD commit ID is used.
       * * For Amazon S3: the version ID of the object that represents the build input ZIP file to
       * use.
       *
       * For more information, see [Source Version Sample with
       * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html)
       * in the *AWS CodeBuild User Guide* .
       */
      override fun sourceVersion(sourceVersion: String) {
        cdkBuilder.sourceVersion(sourceVersion)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty,
    ) : CdkObject(cdkObject), ProjectSourceVersionProperty {
      /**
       * An identifier for a source in the build project.
       *
       * The identifier can only contain alphanumeric characters and underscores, and must be less
       * than 128 characters in length.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceidentifier)
       */
      override fun sourceIdentifier(): String = unwrap(this).getSourceIdentifier()

      /**
       * The source version for the corresponding source identifier. If specified, must be one of:.
       *
       * * For CodeCommit: the commit ID, branch, or Git tag to use.
       * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to
       * the version of the source code you want to build. If a pull request ID is specified, it must
       * use the format `pr/pull-request-ID` (for example, `pr/25` ). If a branch name is specified,
       * the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is
       * used.
       * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of
       * the source code you want to build. If a branch name is specified, the branch's HEAD commit ID
       * is used. If not specified, the default branch's HEAD commit ID is used.
       * * For Amazon S3: the version ID of the object that represents the build input ZIP file to
       * use.
       *
       * For more information, see [Source Version Sample with
       * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html)
       * in the *AWS CodeBuild User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceversion)
       */
      override fun sourceVersion(): String? = unwrap(this).getSourceVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectSourceVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty):
          ProjectSourceVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProjectSourceVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectSourceVersionProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectSourceVersionProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface ProjectTriggersProperty {
    /**
     * Specifies the type of build this webhook will trigger. Allowed values are:.
     *
     * * **BUILD** - A single build
     * * **BUILD_BATCH** - A batch build
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-buildtype)
     */
    public fun buildType(): String? = unwrap(this).getBuildType()

    /**
     * A list of lists of `WebhookFilter` objects used to determine which webhook events are
     * triggered.
     *
     * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups)
     */
    public fun filterGroups(): Any? = unwrap(this).getFilterGroups()

    /**
     * Specifies whether or not to begin automatically rebuilding the source code every time a code
     * change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook)
     */
    public fun webhook(): Any? = unwrap(this).getWebhook()

    /**
     * A builder for [ProjectTriggersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param buildType Specifies the type of build this webhook will trigger. Allowed values
       * are:.
       * * **BUILD** - A single build
       * * **BUILD_BATCH** - A batch build
       */
      public fun buildType(buildType: String)

      /**
       * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which
       * webhook events are triggered.
       * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
       */
      public fun filterGroups(filterGroups: IResolvable)

      /**
       * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which
       * webhook events are triggered.
       * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
       */
      public fun filterGroups(filterGroups: List<Any>)

      /**
       * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which
       * webhook events are triggered.
       * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
       */
      public fun filterGroups(vararg filterGroups: Any)

      /**
       * @param webhook Specifies whether or not to begin automatically rebuilding the source code
       * every time a code change is pushed to the repository.
       */
      public fun webhook(webhook: Boolean)

      /**
       * @param webhook Specifies whether or not to begin automatically rebuilding the source code
       * every time a code change is pushed to the repository.
       */
      public fun webhook(webhook: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty.builder()

      /**
       * @param buildType Specifies the type of build this webhook will trigger. Allowed values
       * are:.
       * * **BUILD** - A single build
       * * **BUILD_BATCH** - A batch build
       */
      override fun buildType(buildType: String) {
        cdkBuilder.buildType(buildType)
      }

      /**
       * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which
       * webhook events are triggered.
       * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
       */
      override fun filterGroups(filterGroups: IResolvable) {
        cdkBuilder.filterGroups(filterGroups.let(IResolvable::unwrap))
      }

      /**
       * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which
       * webhook events are triggered.
       * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
       */
      override fun filterGroups(filterGroups: List<Any>) {
        cdkBuilder.filterGroups(filterGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filterGroups A list of lists of `WebhookFilter` objects used to determine which
       * webhook events are triggered.
       * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
       */
      override fun filterGroups(vararg filterGroups: Any): Unit =
          filterGroups(filterGroups.toList())

      /**
       * @param webhook Specifies whether or not to begin automatically rebuilding the source code
       * every time a code change is pushed to the repository.
       */
      override fun webhook(webhook: Boolean) {
        cdkBuilder.webhook(webhook)
      }

      /**
       * @param webhook Specifies whether or not to begin automatically rebuilding the source code
       * every time a code change is pushed to the repository.
       */
      override fun webhook(webhook: IResolvable) {
        cdkBuilder.webhook(webhook.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty,
    ) : CdkObject(cdkObject), ProjectTriggersProperty {
      /**
       * Specifies the type of build this webhook will trigger. Allowed values are:.
       *
       * * **BUILD** - A single build
       * * **BUILD_BATCH** - A batch build
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-buildtype)
       */
      override fun buildType(): String? = unwrap(this).getBuildType()

      /**
       * A list of lists of `WebhookFilter` objects used to determine which webhook events are
       * triggered.
       *
       * At least one `WebhookFilter` in the array must specify `EVENT` as its type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups)
       */
      override fun filterGroups(): Any? = unwrap(this).getFilterGroups()

      /**
       * Specifies whether or not to begin automatically rebuilding the source code every time a
       * code change is pushed to the repository.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook)
       */
      override fun webhook(): Any? = unwrap(this).getWebhook()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProjectTriggersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty):
          ProjectTriggersProperty = CdkObjectWrappers.wrap(cdkObject) as? ProjectTriggersProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProjectTriggersProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.ProjectTriggersProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * RegistryCredentialProperty registryCredentialProperty = RegistryCredentialProperty.builder()
   * .credential("credential")
   * .credentialProvider("credentialProvider")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html)
   */
  public interface RegistryCredentialProperty {
    /**
     * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager .
     *
     *
     * The `credential` can use the name of the credentials only if they exist in your current AWS
     * Region .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credential)
     */
    public fun credential(): String

    /**
     * The service that created the credentials to access a private Docker registry.
     *
     * The valid value, SECRETS_MANAGER, is for AWS Secrets Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credentialprovider)
     */
    public fun credentialProvider(): String

    /**
     * A builder for [RegistryCredentialProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param credential The Amazon Resource Name (ARN) or name of credentials created using AWS
       * Secrets Manager . 
       *
       * The `credential` can use the name of the credentials only if they exist in your current AWS
       * Region .
       */
      public fun credential(credential: String)

      /**
       * @param credentialProvider The service that created the credentials to access a private
       * Docker registry. 
       * The valid value, SECRETS_MANAGER, is for AWS Secrets Manager .
       */
      public fun credentialProvider(credentialProvider: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty.builder()

      /**
       * @param credential The Amazon Resource Name (ARN) or name of credentials created using AWS
       * Secrets Manager . 
       *
       * The `credential` can use the name of the credentials only if they exist in your current AWS
       * Region .
       */
      override fun credential(credential: String) {
        cdkBuilder.credential(credential)
      }

      /**
       * @param credentialProvider The service that created the credentials to access a private
       * Docker registry. 
       * The valid value, SECRETS_MANAGER, is for AWS Secrets Manager .
       */
      override fun credentialProvider(credentialProvider: String) {
        cdkBuilder.credentialProvider(credentialProvider)
      }

      public fun build():
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty,
    ) : CdkObject(cdkObject), RegistryCredentialProperty {
      /**
       * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager .
       *
       *
       * The `credential` can use the name of the credentials only if they exist in your current AWS
       * Region .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credential)
       */
      override fun credential(): String = unwrap(this).getCredential()

      /**
       * The service that created the credentials to access a private Docker registry.
       *
       * The valid value, SECRETS_MANAGER, is for AWS Secrets Manager .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-registrycredential.html#cfn-codebuild-project-registrycredential-credentialprovider)
       */
      override fun credentialProvider(): String = unwrap(this).getCredentialProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegistryCredentialProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty):
          RegistryCredentialProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RegistryCredentialProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegistryCredentialProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.RegistryCredentialProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface S3LogsConfigProperty {
    /**
     * Set to true if you do not want your S3 build log output encrypted.
     *
     * By default S3 build logs are encrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-encryptiondisabled)
     */
    public fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

    /**
     * The ARN of an S3 bucket and the path prefix for S3 logs.
     *
     * If your Amazon S3 bucket name is `my-bucket` , and your path prefix is `build-log` , then
     * acceptable formats are `my-bucket/build-log` or `arn:aws:s3:::my-bucket/build-log` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

    /**
     * The current status of the S3 build logs. Valid values are:.
     *
     * * `ENABLED` : S3 build logs are enabled for this build project.
     * * `DISABLED` : S3 build logs are not enabled for this build project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status)
     */
    public fun status(): String

    /**
     * A builder for [S3LogsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionDisabled Set to true if you do not want your S3 build log output
       * encrypted.
       * By default S3 build logs are encrypted.
       */
      public fun encryptionDisabled(encryptionDisabled: Boolean)

      /**
       * @param encryptionDisabled Set to true if you do not want your S3 build log output
       * encrypted.
       * By default S3 build logs are encrypted.
       */
      public fun encryptionDisabled(encryptionDisabled: IResolvable)

      /**
       * @param location The ARN of an S3 bucket and the path prefix for S3 logs.
       * If your Amazon S3 bucket name is `my-bucket` , and your path prefix is `build-log` , then
       * acceptable formats are `my-bucket/build-log` or `arn:aws:s3:::my-bucket/build-log` .
       */
      public fun location(location: String)

      /**
       * @param status The current status of the S3 build logs. Valid values are:. 
       * * `ENABLED` : S3 build logs are enabled for this build project.
       * * `DISABLED` : S3 build logs are not enabled for this build project.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty.builder()

      /**
       * @param encryptionDisabled Set to true if you do not want your S3 build log output
       * encrypted.
       * By default S3 build logs are encrypted.
       */
      override fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
      }

      /**
       * @param encryptionDisabled Set to true if you do not want your S3 build log output
       * encrypted.
       * By default S3 build logs are encrypted.
       */
      override fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled.let(IResolvable::unwrap))
      }

      /**
       * @param location The ARN of an S3 bucket and the path prefix for S3 logs.
       * If your Amazon S3 bucket name is `my-bucket` , and your path prefix is `build-log` , then
       * acceptable formats are `my-bucket/build-log` or `arn:aws:s3:::my-bucket/build-log` .
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param status The current status of the S3 build logs. Valid values are:. 
       * * `ENABLED` : S3 build logs are enabled for this build project.
       * * `DISABLED` : S3 build logs are not enabled for this build project.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty,
    ) : CdkObject(cdkObject), S3LogsConfigProperty {
      /**
       * Set to true if you do not want your S3 build log output encrypted.
       *
       * By default S3 build logs are encrypted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-encryptiondisabled)
       */
      override fun encryptionDisabled(): Any? = unwrap(this).getEncryptionDisabled()

      /**
       * The ARN of an S3 bucket and the path prefix for S3 logs.
       *
       * If your Amazon S3 bucket name is `my-bucket` , and your path prefix is `build-log` , then
       * acceptable formats are `my-bucket/build-log` or `arn:aws:s3:::my-bucket/build-log` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

      /**
       * The current status of the S3 build logs. Valid values are:.
       *
       * * `ENABLED` : S3 build logs are enabled for this build project.
       * * `DISABLED` : S3 build logs are not enabled for this build project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html#cfn-codebuild-project-s3logsconfig-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty):
          S3LogsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LogsConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LogsConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.S3LogsConfigProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * SourceAuthProperty sourceAuthProperty = SourceAuthProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .resource("resource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html)
   */
  public interface SourceAuthProperty {
    /**
     * The resource value that applies to the specified authorization type.
     *
     *
     * This data type is used by the AWS CodeBuild console only.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource)
     */
    public fun resource(): String? = unwrap(this).getResource()

    /**
     * The authorization type to use. The only valid value is `OAUTH` , which represents the OAuth
     * authorization type.
     *
     *
     * This data type is used by the AWS CodeBuild console only.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type)
     */
    public fun type(): String

    /**
     * A builder for [SourceAuthProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resource The resource value that applies to the specified authorization type.
       *
       * This data type is used by the AWS CodeBuild console only.
       */
      public fun resource(resource: String)

      /**
       * @param type The authorization type to use. The only valid value is `OAUTH` , which
       * represents the OAuth authorization type. 
       *
       * This data type is used by the AWS CodeBuild console only.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty.builder()

      /**
       * @param resource The resource value that applies to the specified authorization type.
       *
       * This data type is used by the AWS CodeBuild console only.
       */
      override fun resource(resource: String) {
        cdkBuilder.resource(resource)
      }

      /**
       * @param type The authorization type to use. The only valid value is `OAUTH` , which
       * represents the OAuth authorization type. 
       *
       * This data type is used by the AWS CodeBuild console only.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty,
    ) : CdkObject(cdkObject), SourceAuthProperty {
      /**
       * The resource value that applies to the specified authorization type.
       *
       *
       * This data type is used by the AWS CodeBuild console only.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-resource)
       */
      override fun resource(): String? = unwrap(this).getResource()

      /**
       * The authorization type to use. The only valid value is `OAUTH` , which represents the OAuth
       * authorization type.
       *
       *
       * This data type is used by the AWS CodeBuild console only.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html#cfn-codebuild-project-sourceauth-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceAuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty):
          SourceAuthProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceAuthProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAuthProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.SourceAuthProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface SourceProperty {
    /**
     * Information about the authorization settings for AWS CodeBuild to access the source code to
     * be built.
     *
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set
     * `Auth` directly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-auth)
     */
    public fun auth(): Any? = unwrap(this).getAuth()

    /**
     * The build specification for the project.
     *
     * If this value is not provided, then the source code must contain a buildspec file named
     * `buildspec.yml` at the root level. If this value is provided, it can be either a single string
     * containing the entire build specification, or the path to an alternate buildspec file relative
     * to the value of the built-in environment variable `CODEBUILD_SRC_DIR` . The alternate buildspec
     * file can have a name other than `buildspec.yml` , for example `myspec.yml` or
     * `build_spec_qa.yml` or similar. For more information, see the [Build Spec
     * Reference](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec)
     */
    public fun buildSpec(): String? = unwrap(this).getBuildSpec()

    /**
     * Contains information that defines how the build project reports the build status to the
     * source provider.
     *
     * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
     * `BITBUCKET` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildstatusconfig)
     */
    public fun buildStatusConfig(): Any? = unwrap(this).getBuildStatusConfig()

    /**
     * The depth of history to download.
     *
     * Minimum value is 0. If this value is 0, greater than 25, or not provided, then the full
     * history is downloaded with each build project. If your source type is Amazon S3, this value is
     * not supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth)
     */
    public fun gitCloneDepth(): Number? = unwrap(this).getGitCloneDepth()

    /**
     * Information about the Git submodules configuration for the build project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitsubmodulesconfig)
     */
    public fun gitSubmodulesConfig(): Any? = unwrap(this).getGitSubmodulesConfig()

    /**
     * This is used with GitHub Enterprise only.
     *
     * Set to true to ignore SSL warnings while connecting to your GitHub Enterprise project
     * repository. The default value is `false` . `InsecureSsl` should be used for testing purposes
     * only. It should not be used in a production environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl)
     */
    public fun insecureSsl(): Any? = unwrap(this).getInsecureSsl()

    /**
     * Information about the location of the source code to be built. Valid values include:.
     *
     * * For source code settings that are specified in the source action of a pipeline in
     * CodePipeline, `location` should not be specified. If it is specified, CodePipeline ignores it.
     * This is because CodePipeline uses the settings in a pipeline's source action instead of this
     * value.
     * * For source code in an CodeCommit repository, the HTTPS clone URL to the repository that
     * contains the source code and the buildspec file (for example,
     * `https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;` ).
     * * For source code in an Amazon S3 input bucket, one of the following.
     * * The path to the ZIP file that contains the source code (for example,
     * `&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip` ).
     * * The path to the folder that contains the source code (for example,
     * `&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/` ).
     * * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains
     * the source and the buildspec file. You must connect your AWS account to your GitHub account. Use
     * the AWS CodeBuild console to start creating a build project. When you use the console to connect
     * (or reconnect) with GitHub, on the GitHub *Authorize application* page, for *Organization
     * access* , choose *Request access* next to each repository you want to allow AWS CodeBuild to
     * have access to, and then choose *Authorize application* . (After you have connected to your
     * GitHub account, you do not need to finish creating the build project. You can leave the AWS
     * CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the `source` object,
     * set the `auth` object's `type` value to `OAUTH` .
     * * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that
     * contains the source and the buildspec file. You must connect your AWS account to your Bitbucket
     * account. Use the AWS CodeBuild console to start creating a build project. When you use the
     * console to connect (or reconnect) with Bitbucket, on the Bitbucket *Confirm access to your
     * account* page, choose *Grant access* . (After you have connected to your Bitbucket account, you
     * do not need to finish creating the build project. You can leave the AWS CodeBuild console.) To
     * instruct AWS CodeBuild to use this connection, in the `source` object, set the `auth` object's
     * `type` value to `OAUTH` .
     *
     * If you specify `CODEPIPELINE` for the `Type` property, don't specify this property. For all
     * of the other types, you must specify `Location` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

    /**
     * Set to true to report the status of a build's start and finish to your source provider.
     *
     * This option is valid only when your source provider is GitHub, GitHub Enterprise, or
     * Bitbucket. If this is set and you use a different source provider, an `invalidInputException` is
     * thrown.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus)
     */
    public fun reportBuildStatus(): Any? = unwrap(this).getReportBuildStatus()

    /**
     * An identifier for this project source.
     *
     * The identifier can only contain alphanumeric characters and underscores, and must be less
     * than 128 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier)
     */
    public fun sourceIdentifier(): String? = unwrap(this).getSourceIdentifier()

    /**
     * The type of repository that contains the source code to be built. Valid values include:.
     *
     * * `BITBUCKET` : The source code is in a Bitbucket repository.
     * * `CODECOMMIT` : The source code is in an CodeCommit repository.
     * * `CODEPIPELINE` : The source code settings are specified in the source action of a pipeline
     * in CodePipeline.
     * * `GITHUB` : The source code is in a GitHub or GitHub Enterprise Cloud repository.
     * * `GITHUB_ENTERPRISE` : The source code is in a GitHub Enterprise Server repository.
     * * `NO_SOURCE` : The project does not have input source code.
     * * `S3` : The source code is in an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type)
     */
    public fun type(): String

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param auth Information about the authorization settings for AWS CodeBuild to access the
       * source code to be built.
       * This information is for the AWS CodeBuild console's use only. Your code should not get or
       * set `Auth` directly.
       */
      public fun auth(auth: IResolvable)

      /**
       * @param auth Information about the authorization settings for AWS CodeBuild to access the
       * source code to be built.
       * This information is for the AWS CodeBuild console's use only. Your code should not get or
       * set `Auth` directly.
       */
      public fun auth(auth: SourceAuthProperty)

      /**
       * @param auth Information about the authorization settings for AWS CodeBuild to access the
       * source code to be built.
       * This information is for the AWS CodeBuild console's use only. Your code should not get or
       * set `Auth` directly.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01b1a50446487485d9436e692397d44744f4240c10d85d6e14283a7bc9a2de4")
      public fun auth(auth: SourceAuthProperty.Builder.() -> Unit)

      /**
       * @param buildSpec The build specification for the project.
       * If this value is not provided, then the source code must contain a buildspec file named
       * `buildspec.yml` at the root level. If this value is provided, it can be either a single string
       * containing the entire build specification, or the path to an alternate buildspec file relative
       * to the value of the built-in environment variable `CODEBUILD_SRC_DIR` . The alternate
       * buildspec file can have a name other than `buildspec.yml` , for example `myspec.yml` or
       * `build_spec_qa.yml` or similar. For more information, see the [Build Spec
       * Reference](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
       * in the *AWS CodeBuild User Guide* .
       */
      public fun buildSpec(buildSpec: String)

      /**
       * @param buildStatusConfig Contains information that defines how the build project reports
       * the build status to the source provider.
       * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
       * `BITBUCKET` .
       */
      public fun buildStatusConfig(buildStatusConfig: IResolvable)

      /**
       * @param buildStatusConfig Contains information that defines how the build project reports
       * the build status to the source provider.
       * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
       * `BITBUCKET` .
       */
      public fun buildStatusConfig(buildStatusConfig: BuildStatusConfigProperty)

      /**
       * @param buildStatusConfig Contains information that defines how the build project reports
       * the build status to the source provider.
       * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
       * `BITBUCKET` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ae6a4677b24efcacc3648f76cb5e8ef8aa5495620f6f2e32b0258d57d687a47")
      public fun buildStatusConfig(buildStatusConfig: BuildStatusConfigProperty.Builder.() -> Unit)

      /**
       * @param gitCloneDepth The depth of history to download.
       * Minimum value is 0. If this value is 0, greater than 25, or not provided, then the full
       * history is downloaded with each build project. If your source type is Amazon S3, this value is
       * not supported.
       */
      public fun gitCloneDepth(gitCloneDepth: Number)

      /**
       * @param gitSubmodulesConfig Information about the Git submodules configuration for the build
       * project.
       */
      public fun gitSubmodulesConfig(gitSubmodulesConfig: IResolvable)

      /**
       * @param gitSubmodulesConfig Information about the Git submodules configuration for the build
       * project.
       */
      public fun gitSubmodulesConfig(gitSubmodulesConfig: GitSubmodulesConfigProperty)

      /**
       * @param gitSubmodulesConfig Information about the Git submodules configuration for the build
       * project.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("648c0ad47d51754c0470a5118c7f95052d27f7158fd3e8aa306fdcd60e3ad2b2")
      public
          fun gitSubmodulesConfig(gitSubmodulesConfig: GitSubmodulesConfigProperty.Builder.() -> Unit)

      /**
       * @param insecureSsl This is used with GitHub Enterprise only.
       * Set to true to ignore SSL warnings while connecting to your GitHub Enterprise project
       * repository. The default value is `false` . `InsecureSsl` should be used for testing purposes
       * only. It should not be used in a production environment.
       */
      public fun insecureSsl(insecureSsl: Boolean)

      /**
       * @param insecureSsl This is used with GitHub Enterprise only.
       * Set to true to ignore SSL warnings while connecting to your GitHub Enterprise project
       * repository. The default value is `false` . `InsecureSsl` should be used for testing purposes
       * only. It should not be used in a production environment.
       */
      public fun insecureSsl(insecureSsl: IResolvable)

      /**
       * @param location Information about the location of the source code to be built. Valid values
       * include:.
       * * For source code settings that are specified in the source action of a pipeline in
       * CodePipeline, `location` should not be specified. If it is specified, CodePipeline ignores it.
       * This is because CodePipeline uses the settings in a pipeline's source action instead of this
       * value.
       * * For source code in an CodeCommit repository, the HTTPS clone URL to the repository that
       * contains the source code and the buildspec file (for example,
       * `https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;` ).
       * * For source code in an Amazon S3 input bucket, one of the following.
       * * The path to the ZIP file that contains the source code (for example,
       * `&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip` ).
       * * The path to the folder that contains the source code (for example,
       * `&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/` ).
       * * For source code in a GitHub repository, the HTTPS clone URL to the repository that
       * contains the source and the buildspec file. You must connect your AWS account to your GitHub
       * account. Use the AWS CodeBuild console to start creating a build project. When you use the
       * console to connect (or reconnect) with GitHub, on the GitHub *Authorize application* page, for
       * *Organization access* , choose *Request access* next to each repository you want to allow AWS
       * CodeBuild to have access to, and then choose *Authorize application* . (After you have
       * connected to your GitHub account, you do not need to finish creating the build project. You
       * can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the
       * `source` object, set the `auth` object's `type` value to `OAUTH` .
       * * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that
       * contains the source and the buildspec file. You must connect your AWS account to your
       * Bitbucket account. Use the AWS CodeBuild console to start creating a build project. When you
       * use the console to connect (or reconnect) with Bitbucket, on the Bitbucket *Confirm access to
       * your account* page, choose *Grant access* . (After you have connected to your Bitbucket
       * account, you do not need to finish creating the build project. You can leave the AWS CodeBuild
       * console.) To instruct AWS CodeBuild to use this connection, in the `source` object, set the
       * `auth` object's `type` value to `OAUTH` .
       *
       * If you specify `CODEPIPELINE` for the `Type` property, don't specify this property. For all
       * of the other types, you must specify `Location` .
       */
      public fun location(location: String)

      /**
       * @param reportBuildStatus Set to true to report the status of a build's start and finish to
       * your source provider.
       * This option is valid only when your source provider is GitHub, GitHub Enterprise, or
       * Bitbucket. If this is set and you use a different source provider, an `invalidInputException`
       * is thrown.
       */
      public fun reportBuildStatus(reportBuildStatus: Boolean)

      /**
       * @param reportBuildStatus Set to true to report the status of a build's start and finish to
       * your source provider.
       * This option is valid only when your source provider is GitHub, GitHub Enterprise, or
       * Bitbucket. If this is set and you use a different source provider, an `invalidInputException`
       * is thrown.
       */
      public fun reportBuildStatus(reportBuildStatus: IResolvable)

      /**
       * @param sourceIdentifier An identifier for this project source.
       * The identifier can only contain alphanumeric characters and underscores, and must be less
       * than 128 characters in length.
       */
      public fun sourceIdentifier(sourceIdentifier: String)

      /**
       * @param type The type of repository that contains the source code to be built. Valid values
       * include:. 
       * * `BITBUCKET` : The source code is in a Bitbucket repository.
       * * `CODECOMMIT` : The source code is in an CodeCommit repository.
       * * `CODEPIPELINE` : The source code settings are specified in the source action of a
       * pipeline in CodePipeline.
       * * `GITHUB` : The source code is in a GitHub or GitHub Enterprise Cloud repository.
       * * `GITHUB_ENTERPRISE` : The source code is in a GitHub Enterprise Server repository.
       * * `NO_SOURCE` : The project does not have input source code.
       * * `S3` : The source code is in an Amazon S3 bucket.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty.builder()

      /**
       * @param auth Information about the authorization settings for AWS CodeBuild to access the
       * source code to be built.
       * This information is for the AWS CodeBuild console's use only. Your code should not get or
       * set `Auth` directly.
       */
      override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      /**
       * @param auth Information about the authorization settings for AWS CodeBuild to access the
       * source code to be built.
       * This information is for the AWS CodeBuild console's use only. Your code should not get or
       * set `Auth` directly.
       */
      override fun auth(auth: SourceAuthProperty) {
        cdkBuilder.auth(auth.let(SourceAuthProperty::unwrap))
      }

      /**
       * @param auth Information about the authorization settings for AWS CodeBuild to access the
       * source code to be built.
       * This information is for the AWS CodeBuild console's use only. Your code should not get or
       * set `Auth` directly.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01b1a50446487485d9436e692397d44744f4240c10d85d6e14283a7bc9a2de4")
      override fun auth(auth: SourceAuthProperty.Builder.() -> Unit): Unit =
          auth(SourceAuthProperty(auth))

      /**
       * @param buildSpec The build specification for the project.
       * If this value is not provided, then the source code must contain a buildspec file named
       * `buildspec.yml` at the root level. If this value is provided, it can be either a single string
       * containing the entire build specification, or the path to an alternate buildspec file relative
       * to the value of the built-in environment variable `CODEBUILD_SRC_DIR` . The alternate
       * buildspec file can have a name other than `buildspec.yml` , for example `myspec.yml` or
       * `build_spec_qa.yml` or similar. For more information, see the [Build Spec
       * Reference](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
       * in the *AWS CodeBuild User Guide* .
       */
      override fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
      }

      /**
       * @param buildStatusConfig Contains information that defines how the build project reports
       * the build status to the source provider.
       * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
       * `BITBUCKET` .
       */
      override fun buildStatusConfig(buildStatusConfig: IResolvable) {
        cdkBuilder.buildStatusConfig(buildStatusConfig.let(IResolvable::unwrap))
      }

      /**
       * @param buildStatusConfig Contains information that defines how the build project reports
       * the build status to the source provider.
       * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
       * `BITBUCKET` .
       */
      override fun buildStatusConfig(buildStatusConfig: BuildStatusConfigProperty) {
        cdkBuilder.buildStatusConfig(buildStatusConfig.let(BuildStatusConfigProperty::unwrap))
      }

      /**
       * @param buildStatusConfig Contains information that defines how the build project reports
       * the build status to the source provider.
       * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
       * `BITBUCKET` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ae6a4677b24efcacc3648f76cb5e8ef8aa5495620f6f2e32b0258d57d687a47")
      override
          fun buildStatusConfig(buildStatusConfig: BuildStatusConfigProperty.Builder.() -> Unit):
          Unit = buildStatusConfig(BuildStatusConfigProperty(buildStatusConfig))

      /**
       * @param gitCloneDepth The depth of history to download.
       * Minimum value is 0. If this value is 0, greater than 25, or not provided, then the full
       * history is downloaded with each build project. If your source type is Amazon S3, this value is
       * not supported.
       */
      override fun gitCloneDepth(gitCloneDepth: Number) {
        cdkBuilder.gitCloneDepth(gitCloneDepth)
      }

      /**
       * @param gitSubmodulesConfig Information about the Git submodules configuration for the build
       * project.
       */
      override fun gitSubmodulesConfig(gitSubmodulesConfig: IResolvable) {
        cdkBuilder.gitSubmodulesConfig(gitSubmodulesConfig.let(IResolvable::unwrap))
      }

      /**
       * @param gitSubmodulesConfig Information about the Git submodules configuration for the build
       * project.
       */
      override fun gitSubmodulesConfig(gitSubmodulesConfig: GitSubmodulesConfigProperty) {
        cdkBuilder.gitSubmodulesConfig(gitSubmodulesConfig.let(GitSubmodulesConfigProperty::unwrap))
      }

      /**
       * @param gitSubmodulesConfig Information about the Git submodules configuration for the build
       * project.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("648c0ad47d51754c0470a5118c7f95052d27f7158fd3e8aa306fdcd60e3ad2b2")
      override
          fun gitSubmodulesConfig(gitSubmodulesConfig: GitSubmodulesConfigProperty.Builder.() -> Unit):
          Unit = gitSubmodulesConfig(GitSubmodulesConfigProperty(gitSubmodulesConfig))

      /**
       * @param insecureSsl This is used with GitHub Enterprise only.
       * Set to true to ignore SSL warnings while connecting to your GitHub Enterprise project
       * repository. The default value is `false` . `InsecureSsl` should be used for testing purposes
       * only. It should not be used in a production environment.
       */
      override fun insecureSsl(insecureSsl: Boolean) {
        cdkBuilder.insecureSsl(insecureSsl)
      }

      /**
       * @param insecureSsl This is used with GitHub Enterprise only.
       * Set to true to ignore SSL warnings while connecting to your GitHub Enterprise project
       * repository. The default value is `false` . `InsecureSsl` should be used for testing purposes
       * only. It should not be used in a production environment.
       */
      override fun insecureSsl(insecureSsl: IResolvable) {
        cdkBuilder.insecureSsl(insecureSsl.let(IResolvable::unwrap))
      }

      /**
       * @param location Information about the location of the source code to be built. Valid values
       * include:.
       * * For source code settings that are specified in the source action of a pipeline in
       * CodePipeline, `location` should not be specified. If it is specified, CodePipeline ignores it.
       * This is because CodePipeline uses the settings in a pipeline's source action instead of this
       * value.
       * * For source code in an CodeCommit repository, the HTTPS clone URL to the repository that
       * contains the source code and the buildspec file (for example,
       * `https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;` ).
       * * For source code in an Amazon S3 input bucket, one of the following.
       * * The path to the ZIP file that contains the source code (for example,
       * `&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip` ).
       * * The path to the folder that contains the source code (for example,
       * `&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/` ).
       * * For source code in a GitHub repository, the HTTPS clone URL to the repository that
       * contains the source and the buildspec file. You must connect your AWS account to your GitHub
       * account. Use the AWS CodeBuild console to start creating a build project. When you use the
       * console to connect (or reconnect) with GitHub, on the GitHub *Authorize application* page, for
       * *Organization access* , choose *Request access* next to each repository you want to allow AWS
       * CodeBuild to have access to, and then choose *Authorize application* . (After you have
       * connected to your GitHub account, you do not need to finish creating the build project. You
       * can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the
       * `source` object, set the `auth` object's `type` value to `OAUTH` .
       * * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that
       * contains the source and the buildspec file. You must connect your AWS account to your
       * Bitbucket account. Use the AWS CodeBuild console to start creating a build project. When you
       * use the console to connect (or reconnect) with Bitbucket, on the Bitbucket *Confirm access to
       * your account* page, choose *Grant access* . (After you have connected to your Bitbucket
       * account, you do not need to finish creating the build project. You can leave the AWS CodeBuild
       * console.) To instruct AWS CodeBuild to use this connection, in the `source` object, set the
       * `auth` object's `type` value to `OAUTH` .
       *
       * If you specify `CODEPIPELINE` for the `Type` property, don't specify this property. For all
       * of the other types, you must specify `Location` .
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param reportBuildStatus Set to true to report the status of a build's start and finish to
       * your source provider.
       * This option is valid only when your source provider is GitHub, GitHub Enterprise, or
       * Bitbucket. If this is set and you use a different source provider, an `invalidInputException`
       * is thrown.
       */
      override fun reportBuildStatus(reportBuildStatus: Boolean) {
        cdkBuilder.reportBuildStatus(reportBuildStatus)
      }

      /**
       * @param reportBuildStatus Set to true to report the status of a build's start and finish to
       * your source provider.
       * This option is valid only when your source provider is GitHub, GitHub Enterprise, or
       * Bitbucket. If this is set and you use a different source provider, an `invalidInputException`
       * is thrown.
       */
      override fun reportBuildStatus(reportBuildStatus: IResolvable) {
        cdkBuilder.reportBuildStatus(reportBuildStatus.let(IResolvable::unwrap))
      }

      /**
       * @param sourceIdentifier An identifier for this project source.
       * The identifier can only contain alphanumeric characters and underscores, and must be less
       * than 128 characters in length.
       */
      override fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
      }

      /**
       * @param type The type of repository that contains the source code to be built. Valid values
       * include:. 
       * * `BITBUCKET` : The source code is in a Bitbucket repository.
       * * `CODECOMMIT` : The source code is in an CodeCommit repository.
       * * `CODEPIPELINE` : The source code settings are specified in the source action of a
       * pipeline in CodePipeline.
       * * `GITHUB` : The source code is in a GitHub or GitHub Enterprise Cloud repository.
       * * `GITHUB_ENTERPRISE` : The source code is in a GitHub Enterprise Server repository.
       * * `NO_SOURCE` : The project does not have input source code.
       * * `S3` : The source code is in an Amazon S3 bucket.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      /**
       * Information about the authorization settings for AWS CodeBuild to access the source code to
       * be built.
       *
       * This information is for the AWS CodeBuild console's use only. Your code should not get or
       * set `Auth` directly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-auth)
       */
      override fun auth(): Any? = unwrap(this).getAuth()

      /**
       * The build specification for the project.
       *
       * If this value is not provided, then the source code must contain a buildspec file named
       * `buildspec.yml` at the root level. If this value is provided, it can be either a single string
       * containing the entire build specification, or the path to an alternate buildspec file relative
       * to the value of the built-in environment variable `CODEBUILD_SRC_DIR` . The alternate
       * buildspec file can have a name other than `buildspec.yml` , for example `myspec.yml` or
       * `build_spec_qa.yml` or similar. For more information, see the [Build Spec
       * Reference](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
       * in the *AWS CodeBuild User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec)
       */
      override fun buildSpec(): String? = unwrap(this).getBuildSpec()

      /**
       * Contains information that defines how the build project reports the build status to the
       * source provider.
       *
       * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
       * `BITBUCKET` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildstatusconfig)
       */
      override fun buildStatusConfig(): Any? = unwrap(this).getBuildStatusConfig()

      /**
       * The depth of history to download.
       *
       * Minimum value is 0. If this value is 0, greater than 25, or not provided, then the full
       * history is downloaded with each build project. If your source type is Amazon S3, this value is
       * not supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth)
       */
      override fun gitCloneDepth(): Number? = unwrap(this).getGitCloneDepth()

      /**
       * Information about the Git submodules configuration for the build project.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitsubmodulesconfig)
       */
      override fun gitSubmodulesConfig(): Any? = unwrap(this).getGitSubmodulesConfig()

      /**
       * This is used with GitHub Enterprise only.
       *
       * Set to true to ignore SSL warnings while connecting to your GitHub Enterprise project
       * repository. The default value is `false` . `InsecureSsl` should be used for testing purposes
       * only. It should not be used in a production environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl)
       */
      override fun insecureSsl(): Any? = unwrap(this).getInsecureSsl()

      /**
       * Information about the location of the source code to be built. Valid values include:.
       *
       * * For source code settings that are specified in the source action of a pipeline in
       * CodePipeline, `location` should not be specified. If it is specified, CodePipeline ignores it.
       * This is because CodePipeline uses the settings in a pipeline's source action instead of this
       * value.
       * * For source code in an CodeCommit repository, the HTTPS clone URL to the repository that
       * contains the source code and the buildspec file (for example,
       * `https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;` ).
       * * For source code in an Amazon S3 input bucket, one of the following.
       * * The path to the ZIP file that contains the source code (for example,
       * `&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip` ).
       * * The path to the folder that contains the source code (for example,
       * `&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/` ).
       * * For source code in a GitHub repository, the HTTPS clone URL to the repository that
       * contains the source and the buildspec file. You must connect your AWS account to your GitHub
       * account. Use the AWS CodeBuild console to start creating a build project. When you use the
       * console to connect (or reconnect) with GitHub, on the GitHub *Authorize application* page, for
       * *Organization access* , choose *Request access* next to each repository you want to allow AWS
       * CodeBuild to have access to, and then choose *Authorize application* . (After you have
       * connected to your GitHub account, you do not need to finish creating the build project. You
       * can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the
       * `source` object, set the `auth` object's `type` value to `OAUTH` .
       * * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that
       * contains the source and the buildspec file. You must connect your AWS account to your
       * Bitbucket account. Use the AWS CodeBuild console to start creating a build project. When you
       * use the console to connect (or reconnect) with Bitbucket, on the Bitbucket *Confirm access to
       * your account* page, choose *Grant access* . (After you have connected to your Bitbucket
       * account, you do not need to finish creating the build project. You can leave the AWS CodeBuild
       * console.) To instruct AWS CodeBuild to use this connection, in the `source` object, set the
       * `auth` object's `type` value to `OAUTH` .
       *
       * If you specify `CODEPIPELINE` for the `Type` property, don't specify this property. For all
       * of the other types, you must specify `Location` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

      /**
       * Set to true to report the status of a build's start and finish to your source provider.
       *
       * This option is valid only when your source provider is GitHub, GitHub Enterprise, or
       * Bitbucket. If this is set and you use a different source provider, an `invalidInputException`
       * is thrown.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus)
       */
      override fun reportBuildStatus(): Any? = unwrap(this).getReportBuildStatus()

      /**
       * An identifier for this project source.
       *
       * The identifier can only contain alphanumeric characters and underscores, and must be less
       * than 128 characters in length.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier)
       */
      override fun sourceIdentifier(): String? = unwrap(this).getSourceIdentifier()

      /**
       * The type of repository that contains the source code to be built. Valid values include:.
       *
       * * `BITBUCKET` : The source code is in a Bitbucket repository.
       * * `CODECOMMIT` : The source code is in an CodeCommit repository.
       * * `CODEPIPELINE` : The source code settings are specified in the source action of a
       * pipeline in CodePipeline.
       * * `GITHUB` : The source code is in a GitHub or GitHub Enterprise Cloud repository.
       * * `GITHUB_ENTERPRISE` : The source code is in a GitHub Enterprise Server repository.
       * * `NO_SOURCE` : The project does not have input source code.
       * * `S3` : The source code is in an Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty):
          SourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.SourceProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * A list of one or more security groups IDs in your Amazon VPC.
     *
     * The maximum count is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * A list of one or more subnet IDs in your Amazon VPC.
     *
     * The maximum count is 16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-subnets)
     */
    public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    /**
     * The ID of the Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
       * The maximum count is 5.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
       * The maximum count is 5.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets A list of one or more subnet IDs in your Amazon VPC.
       * The maximum count is 16.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets A list of one or more subnet IDs in your Amazon VPC.
       * The maximum count is 16.
       */
      public fun subnets(vararg subnets: String)

      /**
       * @param vpcId The ID of the Amazon VPC.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
       * The maximum count is 5.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of one or more security groups IDs in your Amazon VPC.
       * The maximum count is 5.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets A list of one or more subnet IDs in your Amazon VPC.
       * The maximum count is 16.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets A list of one or more subnet IDs in your Amazon VPC.
       * The maximum count is 16.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      /**
       * @param vpcId The ID of the Amazon VPC.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * A list of one or more security groups IDs in your Amazon VPC.
       *
       * The maximum count is 5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * A list of one or more subnet IDs in your Amazon VPC.
       *
       * The maximum count is 16.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

      /**
       * The ID of the Amazon VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-vpcconfig.html#cfn-codebuild-project-vpcconfig-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
  public interface WebhookFilterProperty {
    /**
     * Used to indicate that the `pattern` determines which webhook events do not trigger a build.
     *
     * If true, then a webhook event that does not match the `pattern` triggers a build. If false,
     * then a webhook event that matches the `pattern` triggers a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-webhookfilter.html#cfn-codebuild-project-webhookfilter-excludematchedpattern)
     */
    public fun excludeMatchedPattern(): Any? = unwrap(this).getExcludeMatchedPattern()

    /**
     * For a `WebHookFilter` that uses `EVENT` type, a comma-separated string that specifies one or
     * more events.
     *
     * For example, the webhook filter `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED` allows all
     * push, pull request created, and pull request updated events to trigger a build.
     *
     * For a `WebHookFilter` that uses any of the other filter types, a regular expression pattern.
     * For example, a `WebHookFilter` that uses `HEAD_REF` for its `type` and the pattern
     * `^refs/heads/` triggers a build when the head reference is a branch with a reference name
     * `refs/heads/branch-name` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-webhookfilter.html#cfn-codebuild-project-webhookfilter-pattern)
     */
    public fun pattern(): String

    /**
     * The type of webhook filter.
     *
     * There are six webhook filter types: `EVENT` , `ACTOR_ACCOUNT_ID` , `HEAD_REF` , `BASE_REF` ,
     * `FILE_PATH` , and `COMMIT_MESSAGE` .
     *
     * * EVENT
     * * A webhook event triggers a build when the provided `pattern` matches one of six event
     * types: `PUSH` , `PULL_REQUEST_CREATED` , `PULL_REQUEST_UPDATED` , `PULL_REQUEST_CLOSED` ,
     * `PULL_REQUEST_REOPENED` , and `PULL_REQUEST_MERGED` . The `EVENT` patterns are specified as a
     * comma-separated string. For example, `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED` filters
     * all push, pull request created, and pull request updated events.
     *
     *
     * The `PULL_REQUEST_REOPENED` works with GitHub and GitHub Enterprise only.
     *
     *
     * * ACTOR_ACCOUNT_ID
     * * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID
     * matches the regular expression `pattern` .
     * * HEAD_REF
     * * A webhook event triggers a build when the head reference matches the regular expression
     * `pattern` . For example, `refs/heads/branch-name` and `refs/tags/tag-name` .
     *
     * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request,
     * Bitbucket push, and Bitbucket pull request events.
     *
     * * BASE_REF
     * * A webhook event triggers a build when the base reference matches the regular expression
     * `pattern` . For example, `refs/heads/branch-name` .
     *
     *
     * Works with pull request events only.
     *
     *
     * * FILE_PATH
     * * A webhook triggers a build when the path of a changed file matches the regular expression
     * `pattern` .
     *
     *
     * Works with GitHub and Bitbucket events push and pull requests events. Also works with GitHub
     * Enterprise push events, but does not work with GitHub Enterprise pull request events.
     *
     *
     * * COMMIT_MESSAGE
     * * A webhook triggers a build when the head commit message matches the regular expression
     * `pattern` .
     *
     *
     * Works with GitHub and Bitbucket events push and pull requests events. Also works with GitHub
     * Enterprise push events, but does not work with GitHub Enterprise pull request events.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-webhookfilter.html#cfn-codebuild-project-webhookfilter-type)
     */
    public fun type(): String

    /**
     * A builder for [WebhookFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludeMatchedPattern Used to indicate that the `pattern` determines which webhook
       * events do not trigger a build.
       * If true, then a webhook event that does not match the `pattern` triggers a build. If false,
       * then a webhook event that matches the `pattern` triggers a build.
       */
      public fun excludeMatchedPattern(excludeMatchedPattern: Boolean)

      /**
       * @param excludeMatchedPattern Used to indicate that the `pattern` determines which webhook
       * events do not trigger a build.
       * If true, then a webhook event that does not match the `pattern` triggers a build. If false,
       * then a webhook event that matches the `pattern` triggers a build.
       */
      public fun excludeMatchedPattern(excludeMatchedPattern: IResolvable)

      /**
       * @param pattern For a `WebHookFilter` that uses `EVENT` type, a comma-separated string that
       * specifies one or more events. 
       * For example, the webhook filter `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED` allows
       * all push, pull request created, and pull request updated events to trigger a build.
       *
       * For a `WebHookFilter` that uses any of the other filter types, a regular expression
       * pattern. For example, a `WebHookFilter` that uses `HEAD_REF` for its `type` and the pattern
       * `^refs/heads/` triggers a build when the head reference is a branch with a reference name
       * `refs/heads/branch-name` .
       */
      public fun pattern(pattern: String)

      /**
       * @param type The type of webhook filter. 
       * There are six webhook filter types: `EVENT` , `ACTOR_ACCOUNT_ID` , `HEAD_REF` , `BASE_REF`
       * , `FILE_PATH` , and `COMMIT_MESSAGE` .
       *
       * * EVENT
       * * A webhook event triggers a build when the provided `pattern` matches one of six event
       * types: `PUSH` , `PULL_REQUEST_CREATED` , `PULL_REQUEST_UPDATED` , `PULL_REQUEST_CLOSED` ,
       * `PULL_REQUEST_REOPENED` , and `PULL_REQUEST_MERGED` . The `EVENT` patterns are specified as a
       * comma-separated string. For example, `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED`
       * filters all push, pull request created, and pull request updated events.
       *
       *
       * The `PULL_REQUEST_REOPENED` works with GitHub and GitHub Enterprise only.
       *
       *
       * * ACTOR_ACCOUNT_ID
       * * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account
       * ID matches the regular expression `pattern` .
       * * HEAD_REF
       * * A webhook event triggers a build when the head reference matches the regular expression
       * `pattern` . For example, `refs/heads/branch-name` and `refs/tags/tag-name` .
       *
       * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request,
       * Bitbucket push, and Bitbucket pull request events.
       *
       * * BASE_REF
       * * A webhook event triggers a build when the base reference matches the regular expression
       * `pattern` . For example, `refs/heads/branch-name` .
       *
       *
       * Works with pull request events only.
       *
       *
       * * FILE_PATH
       * * A webhook triggers a build when the path of a changed file matches the regular expression
       * `pattern` .
       *
       *
       * Works with GitHub and Bitbucket events push and pull requests events. Also works with
       * GitHub Enterprise push events, but does not work with GitHub Enterprise pull request events.
       *
       *
       * * COMMIT_MESSAGE
       * * A webhook triggers a build when the head commit message matches the regular expression
       * `pattern` .
       *
       *
       * Works with GitHub and Bitbucket events push and pull requests events. Also works with
       * GitHub Enterprise push events, but does not work with GitHub Enterprise pull request events.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.Builder =
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty.builder()

      /**
       * @param excludeMatchedPattern Used to indicate that the `pattern` determines which webhook
       * events do not trigger a build.
       * If true, then a webhook event that does not match the `pattern` triggers a build. If false,
       * then a webhook event that matches the `pattern` triggers a build.
       */
      override fun excludeMatchedPattern(excludeMatchedPattern: Boolean) {
        cdkBuilder.excludeMatchedPattern(excludeMatchedPattern)
      }

      /**
       * @param excludeMatchedPattern Used to indicate that the `pattern` determines which webhook
       * events do not trigger a build.
       * If true, then a webhook event that does not match the `pattern` triggers a build. If false,
       * then a webhook event that matches the `pattern` triggers a build.
       */
      override fun excludeMatchedPattern(excludeMatchedPattern: IResolvable) {
        cdkBuilder.excludeMatchedPattern(excludeMatchedPattern.let(IResolvable::unwrap))
      }

      /**
       * @param pattern For a `WebHookFilter` that uses `EVENT` type, a comma-separated string that
       * specifies one or more events. 
       * For example, the webhook filter `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED` allows
       * all push, pull request created, and pull request updated events to trigger a build.
       *
       * For a `WebHookFilter` that uses any of the other filter types, a regular expression
       * pattern. For example, a `WebHookFilter` that uses `HEAD_REF` for its `type` and the pattern
       * `^refs/heads/` triggers a build when the head reference is a branch with a reference name
       * `refs/heads/branch-name` .
       */
      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      /**
       * @param type The type of webhook filter. 
       * There are six webhook filter types: `EVENT` , `ACTOR_ACCOUNT_ID` , `HEAD_REF` , `BASE_REF`
       * , `FILE_PATH` , and `COMMIT_MESSAGE` .
       *
       * * EVENT
       * * A webhook event triggers a build when the provided `pattern` matches one of six event
       * types: `PUSH` , `PULL_REQUEST_CREATED` , `PULL_REQUEST_UPDATED` , `PULL_REQUEST_CLOSED` ,
       * `PULL_REQUEST_REOPENED` , and `PULL_REQUEST_MERGED` . The `EVENT` patterns are specified as a
       * comma-separated string. For example, `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED`
       * filters all push, pull request created, and pull request updated events.
       *
       *
       * The `PULL_REQUEST_REOPENED` works with GitHub and GitHub Enterprise only.
       *
       *
       * * ACTOR_ACCOUNT_ID
       * * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account
       * ID matches the regular expression `pattern` .
       * * HEAD_REF
       * * A webhook event triggers a build when the head reference matches the regular expression
       * `pattern` . For example, `refs/heads/branch-name` and `refs/tags/tag-name` .
       *
       * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request,
       * Bitbucket push, and Bitbucket pull request events.
       *
       * * BASE_REF
       * * A webhook event triggers a build when the base reference matches the regular expression
       * `pattern` . For example, `refs/heads/branch-name` .
       *
       *
       * Works with pull request events only.
       *
       *
       * * FILE_PATH
       * * A webhook triggers a build when the path of a changed file matches the regular expression
       * `pattern` .
       *
       *
       * Works with GitHub and Bitbucket events push and pull requests events. Also works with
       * GitHub Enterprise push events, but does not work with GitHub Enterprise pull request events.
       *
       *
       * * COMMIT_MESSAGE
       * * A webhook triggers a build when the head commit message matches the regular expression
       * `pattern` .
       *
       *
       * Works with GitHub and Bitbucket events push and pull requests events. Also works with
       * GitHub Enterprise push events, but does not work with GitHub Enterprise pull request events.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty,
    ) : CdkObject(cdkObject), WebhookFilterProperty {
      /**
       * Used to indicate that the `pattern` determines which webhook events do not trigger a build.
       *
       * If true, then a webhook event that does not match the `pattern` triggers a build. If false,
       * then a webhook event that matches the `pattern` triggers a build.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-webhookfilter.html#cfn-codebuild-project-webhookfilter-excludematchedpattern)
       */
      override fun excludeMatchedPattern(): Any? = unwrap(this).getExcludeMatchedPattern()

      /**
       * For a `WebHookFilter` that uses `EVENT` type, a comma-separated string that specifies one
       * or more events.
       *
       * For example, the webhook filter `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED` allows
       * all push, pull request created, and pull request updated events to trigger a build.
       *
       * For a `WebHookFilter` that uses any of the other filter types, a regular expression
       * pattern. For example, a `WebHookFilter` that uses `HEAD_REF` for its `type` and the pattern
       * `^refs/heads/` triggers a build when the head reference is a branch with a reference name
       * `refs/heads/branch-name` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-webhookfilter.html#cfn-codebuild-project-webhookfilter-pattern)
       */
      override fun pattern(): String = unwrap(this).getPattern()

      /**
       * The type of webhook filter.
       *
       * There are six webhook filter types: `EVENT` , `ACTOR_ACCOUNT_ID` , `HEAD_REF` , `BASE_REF`
       * , `FILE_PATH` , and `COMMIT_MESSAGE` .
       *
       * * EVENT
       * * A webhook event triggers a build when the provided `pattern` matches one of six event
       * types: `PUSH` , `PULL_REQUEST_CREATED` , `PULL_REQUEST_UPDATED` , `PULL_REQUEST_CLOSED` ,
       * `PULL_REQUEST_REOPENED` , and `PULL_REQUEST_MERGED` . The `EVENT` patterns are specified as a
       * comma-separated string. For example, `PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED`
       * filters all push, pull request created, and pull request updated events.
       *
       *
       * The `PULL_REQUEST_REOPENED` works with GitHub and GitHub Enterprise only.
       *
       *
       * * ACTOR_ACCOUNT_ID
       * * A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account
       * ID matches the regular expression `pattern` .
       * * HEAD_REF
       * * A webhook event triggers a build when the head reference matches the regular expression
       * `pattern` . For example, `refs/heads/branch-name` and `refs/tags/tag-name` .
       *
       * Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request,
       * Bitbucket push, and Bitbucket pull request events.
       *
       * * BASE_REF
       * * A webhook event triggers a build when the base reference matches the regular expression
       * `pattern` . For example, `refs/heads/branch-name` .
       *
       *
       * Works with pull request events only.
       *
       *
       * * FILE_PATH
       * * A webhook triggers a build when the path of a changed file matches the regular expression
       * `pattern` .
       *
       *
       * Works with GitHub and Bitbucket events push and pull requests events. Also works with
       * GitHub Enterprise push events, but does not work with GitHub Enterprise pull request events.
       *
       *
       * * COMMIT_MESSAGE
       * * A webhook triggers a build when the head commit message matches the regular expression
       * `pattern` .
       *
       *
       * Works with GitHub and Bitbucket events push and pull requests events. Also works with
       * GitHub Enterprise push events, but does not work with GitHub Enterprise pull request events.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-webhookfilter.html#cfn-codebuild-project-webhookfilter-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebhookFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty):
          WebhookFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? WebhookFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebhookFilterProperty):
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.codebuild.CfnProject.WebhookFilterProperty
    }
  }
}
