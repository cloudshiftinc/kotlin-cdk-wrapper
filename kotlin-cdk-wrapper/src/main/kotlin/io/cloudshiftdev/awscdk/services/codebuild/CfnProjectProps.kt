@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
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

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
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
public interface CfnProjectProps {
  /**
   * `Artifacts` is a property of the
   * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
   * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
   */
  public fun artifacts(): Any

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
   */
  public fun badgeEnabled(): Any? = unwrap(this).getBadgeEnabled()

  /**
   * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
   */
  public fun buildBatchConfig(): Any? = unwrap(this).getBuildBatchConfig()

  /**
   * Settings that AWS CodeBuild uses to store and reuse build dependencies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
   */
  public fun cache(): Any? = unwrap(this).getCache()

  /**
   * The maximum number of concurrent builds that are allowed for this project.
   *
   * New builds are only started if the current number of builds is less than or equal to this
   * limit. If the current build count meets this limit, new builds are throttled and are not run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-concurrentbuildlimit)
   */
  public fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

  /**
   * A description that makes the build project easy to identify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The AWS Key Management Service customer master key (CMK) to be used for encrypting the build
   * output artifacts.
   *
   *
   * You can use a cross-account KMS key to encrypt the build output artifacts if your service role
   * has permission to that key.
   *
   *
   * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's
   * alias (using the format `alias/&lt;alias-name&gt;` ). If you don't specify a value, CodeBuild uses
   * the managed CMK for Amazon Simple Storage Service (Amazon S3).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey)
   */
  public fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  /**
   * The build environment settings for the project, such as the environment type or the environment
   * variables to use for the build environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
   */
  public fun environment(): Any

  /**
   * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
   *
   * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions` ,
   * `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
   */
  public fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

  /**
   * Information about logs for the build project.
   *
   * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
   */
  public fun logsConfig(): Any? = unwrap(this).getLogsConfig()

  /**
   * The name of the build project.
   *
   * The name must be unique across all of the projects in your AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The number of minutes a build is allowed to be queued before it times out.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes)
   */
  public fun queuedTimeoutInMinutes(): Number? = unwrap(this).getQueuedTimeoutInMinutes()

  /**
   * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3
   * artifacts for the project's builds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-resourceaccessrole)
   */
  public fun resourceAccessRole(): String? = unwrap(this).getResourceAccessRole()

  /**
   * A list of `Artifacts` objects.
   *
   * Each artifacts object specifies output settings that the project generates during a build.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
   */
  public fun secondaryArtifacts(): Any? = unwrap(this).getSecondaryArtifacts()

  /**
   * An array of `ProjectSourceVersion` objects.
   *
   * If `secondarySourceVersions` is specified at the build level, then they take over these
   * `secondarySourceVersions` (at the project level).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
   */
  public fun secondarySourceVersions(): Any? = unwrap(this).getSecondarySourceVersions()

  /**
   * An array of `ProjectSource` objects.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
   */
  public fun secondarySources(): Any? = unwrap(this).getSecondarySources()

  /**
   * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on
   * behalf of the AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole)
   */
  public fun serviceRole(): String

  /**
   * The source code settings for the project, such as the source code's repository type and
   * location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
   */
  public fun source(): Any

  /**
   * A version of the build input to be built for this project.
   *
   * If not specified, the latest version is used. If specified, it must be one of:
   *
   * * For CodeCommit: the commit ID, branch, or Git tag to use.
   * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the
   * version of the source code you want to build. If a pull request ID is specified, it must use the
   * format `pr/pull-request-ID` (for example `pr/25` ). If a branch name is specified, the branch's
   * HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.
   * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the
   * source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used.
   * If not specified, the default branch's HEAD commit ID is used.
   * * For Amazon S3: the version ID of the object that represents the build input ZIP file to use.
   *
   * If `sourceVersion` is specified at the build level, then that version takes precedence over
   * this `sourceVersion` (at the project level).
   *
   * For more information, see [Source Version Sample with
   * CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html) in
   * the *AWS CodeBuild User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-sourceversion)
   */
  public fun sourceVersion(): String? = unwrap(this).getSourceVersion()

  /**
   * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
   *
   * These tags are available for use by AWS services that support AWS CodeBuild build project tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any
   * related build that did not get marked as completed.
   *
   * The default is 60 minutes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes)
   */
  public fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  /**
   * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
   * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
   * code change is pushed to the repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
   */
  public fun triggers(): Any? = unwrap(this).getTriggers()

  /**
   * Specifies the visibility of the project's builds. Possible values are:.
   *
   * * **PUBLIC_READ** - The project builds are visible to the public.
   * * **PRIVATE** - The project builds are not visible to the public.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-visibility)
   */
  public fun visibility(): String? = unwrap(this).getVisibility()

  /**
   * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon VPC.
   *
   * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
   * CodeBuild User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    public fun artifacts(artifacts: IResolvable)

    /**
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    public fun artifacts(artifacts: CfnProject.ArtifactsProperty)

    /**
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85703c5a858300e67fa209c09cf6a9af69098429d94cbe4fc75683956b91eb73")
    public fun artifacts(artifacts: CfnProject.ArtifactsProperty.Builder.() -> Unit)

    /**
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     * your project's build badge.
     * For more information, see [Build Badges
     * Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html) in the
     * *AWS CodeBuild User Guide* .
     *
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     */
    public fun badgeEnabled(badgeEnabled: Boolean)

    /**
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     * your project's build badge.
     * For more information, see [Build Badges
     * Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html) in the
     * *AWS CodeBuild User Guide* .
     *
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     */
    public fun badgeEnabled(badgeEnabled: IResolvable)

    /**
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project.
     */
    public fun buildBatchConfig(buildBatchConfig: IResolvable)

    /**
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project.
     */
    public fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty)

    /**
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3da73b7c1d6f111b6fdbde193162aa946babb5ff702ad03cf5f018c871a6329")
    public
        fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty.Builder.() -> Unit)

    /**
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies.
     */
    public fun cache(cache: IResolvable)

    /**
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies.
     */
    public fun cache(cache: CfnProject.ProjectCacheProperty)

    /**
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d4d09eb6547b5c5accd5ad8ad4a4a7fe0db4974c7ad2d68a3d3946975706d66")
    public fun cache(cache: CfnProject.ProjectCacheProperty.Builder.() -> Unit)

    /**
     * @param concurrentBuildLimit The maximum number of concurrent builds that are allowed for this
     * project.
     * New builds are only started if the current number of builds is less than or equal to this
     * limit. If the current build count meets this limit, new builds are throttled and are not run.
     */
    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    /**
     * @param description A description that makes the build project easy to identify.
     */
    public fun description(description: String)

    /**
     * @param encryptionKey The AWS Key Management Service customer master key (CMK) to be used for
     * encrypting the build output artifacts.
     *
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service
     * role has permission to that key.
     *
     *
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's
     * alias (using the format `alias/&lt;alias-name&gt;` ). If you don't specify a value, CodeBuild
     * uses the managed CMK for Amazon Simple Storage Service (Amazon S3).
     */
    public fun encryptionKey(encryptionKey: String)

    /**
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    public fun environment(environment: IResolvable)

    /**
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    public fun environment(environment: CfnProject.EnvironmentProperty)

    /**
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9cdf398c035540468d5c71e86b9feb3487f52705d1e593aaa65d5469416ec28")
    public fun environment(environment: CfnProject.EnvironmentProperty.Builder.() -> Unit)

    /**
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project.
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     */
    public fun fileSystemLocations(fileSystemLocations: IResolvable)

    /**
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project.
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     */
    public fun fileSystemLocations(fileSystemLocations: List<Any>)

    /**
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project.
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     */
    public fun fileSystemLocations(vararg fileSystemLocations: Any)

    /**
     * @param logsConfig Information about logs for the build project.
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logsConfig(logsConfig: IResolvable)

    /**
     * @param logsConfig Information about logs for the build project.
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logsConfig(logsConfig: CfnProject.LogsConfigProperty)

    /**
     * @param logsConfig Information about logs for the build project.
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1358491d9a40ea508895c9c69d5000456da043c7be9a6ff51c658e62a10abe94")
    public fun logsConfig(logsConfig: CfnProject.LogsConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of the build project.
     * The name must be unique across all of the projects in your AWS account .
     */
    public fun name(name: String)

    /**
     * @param queuedTimeoutInMinutes The number of minutes a build is allowed to be queued before it
     * times out.
     */
    public fun queuedTimeoutInMinutes(queuedTimeoutInMinutes: Number)

    /**
     * @param resourceAccessRole The ARN of the IAM role that enables CodeBuild to access the
     * CloudWatch Logs and Amazon S3 artifacts for the project's builds.
     */
    public fun resourceAccessRole(resourceAccessRole: String)

    /**
     * @param secondaryArtifacts A list of `Artifacts` objects.
     * Each artifacts object specifies output settings that the project generates during a build.
     */
    public fun secondaryArtifacts(secondaryArtifacts: IResolvable)

    /**
     * @param secondaryArtifacts A list of `Artifacts` objects.
     * Each artifacts object specifies output settings that the project generates during a build.
     */
    public fun secondaryArtifacts(secondaryArtifacts: List<Any>)

    /**
     * @param secondaryArtifacts A list of `Artifacts` objects.
     * Each artifacts object specifies output settings that the project generates during a build.
     */
    public fun secondaryArtifacts(vararg secondaryArtifacts: Any)

    /**
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     */
    public fun secondarySourceVersions(secondarySourceVersions: IResolvable)

    /**
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     */
    public fun secondarySourceVersions(secondarySourceVersions: List<Any>)

    /**
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     */
    public fun secondarySourceVersions(vararg secondarySourceVersions: Any)

    /**
     * @param secondarySources An array of `ProjectSource` objects.
     */
    public fun secondarySources(secondarySources: IResolvable)

    /**
     * @param secondarySources An array of `ProjectSource` objects.
     */
    public fun secondarySources(secondarySources: List<Any>)

    /**
     * @param secondarySources An array of `ProjectSource` objects.
     */
    public fun secondarySources(vararg secondarySources: Any)

    /**
     * @param serviceRole The ARN of the IAM role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account. 
     */
    public fun serviceRole(serviceRole: String)

    /**
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    public fun source(source: IResolvable)

    /**
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    public fun source(source: CfnProject.SourceProperty)

    /**
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af1b4991468e05b21ec848e4a3d0b464f352235fe406e2a0bd807f7e9523a497")
    public fun source(source: CfnProject.SourceProperty.Builder.() -> Unit)

    /**
     * @param sourceVersion A version of the build input to be built for this project.
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
     */
    public fun sourceVersion(sourceVersion: String)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeoutInMinutes How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to
     * wait before timing out any related build that did not get marked as completed.
     * The default is 60 minutes.
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number)

    /**
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository.
     */
    public fun triggers(triggers: IResolvable)

    /**
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository.
     */
    public fun triggers(triggers: CfnProject.ProjectTriggersProperty)

    /**
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b1db824e687ec2a29c01ae49dd4541a953684017d73ebae18ee88e77548f89a")
    public fun triggers(triggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit)

    /**
     * @param visibility Specifies the visibility of the project's builds. Possible values are:.
     * * **PUBLIC_READ** - The project builds are visible to the public.
     * * **PRIVATE** - The project builds are not visible to the public.
     */
    public fun visibility(visibility: String)

    /**
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC.
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC.
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     */
    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty)

    /**
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC.
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66f8eb6c366745be13332c59b83ddfeae643d8f7a801656936456577814b4bdf")
    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.CfnProjectProps.Builder =
        software.amazon.awscdk.services.codebuild.CfnProjectProps.builder()

    /**
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    override fun artifacts(artifacts: IResolvable) {
      cdkBuilder.artifacts(artifacts.let(IResolvable::unwrap))
    }

    /**
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    override fun artifacts(artifacts: CfnProject.ArtifactsProperty) {
      cdkBuilder.artifacts(artifacts.let(CfnProject.ArtifactsProperty::unwrap))
    }

    /**
     * @param artifacts `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("85703c5a858300e67fa209c09cf6a9af69098429d94cbe4fc75683956b91eb73")
    override fun artifacts(artifacts: CfnProject.ArtifactsProperty.Builder.() -> Unit): Unit =
        artifacts(CfnProject.ArtifactsProperty(artifacts))

    /**
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     * your project's build badge.
     * For more information, see [Build Badges
     * Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html) in the
     * *AWS CodeBuild User Guide* .
     *
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     */
    override fun badgeEnabled(badgeEnabled: Boolean) {
      cdkBuilder.badgeEnabled(badgeEnabled)
    }

    /**
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     * your project's build badge.
     * For more information, see [Build Badges
     * Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html) in the
     * *AWS CodeBuild User Guide* .
     *
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     */
    override fun badgeEnabled(badgeEnabled: IResolvable) {
      cdkBuilder.badgeEnabled(badgeEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project.
     */
    override fun buildBatchConfig(buildBatchConfig: IResolvable) {
      cdkBuilder.buildBatchConfig(buildBatchConfig.let(IResolvable::unwrap))
    }

    /**
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project.
     */
    override fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty) {
      cdkBuilder.buildBatchConfig(buildBatchConfig.let(CfnProject.ProjectBuildBatchConfigProperty::unwrap))
    }

    /**
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     * options for the project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3da73b7c1d6f111b6fdbde193162aa946babb5ff702ad03cf5f018c871a6329")
    override
        fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty.Builder.() -> Unit):
        Unit = buildBatchConfig(CfnProject.ProjectBuildBatchConfigProperty(buildBatchConfig))

    /**
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies.
     */
    override fun cache(cache: IResolvable) {
      cdkBuilder.cache(cache.let(IResolvable::unwrap))
    }

    /**
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies.
     */
    override fun cache(cache: CfnProject.ProjectCacheProperty) {
      cdkBuilder.cache(cache.let(CfnProject.ProjectCacheProperty::unwrap))
    }

    /**
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d4d09eb6547b5c5accd5ad8ad4a4a7fe0db4974c7ad2d68a3d3946975706d66")
    override fun cache(cache: CfnProject.ProjectCacheProperty.Builder.() -> Unit): Unit =
        cache(CfnProject.ProjectCacheProperty(cache))

    /**
     * @param concurrentBuildLimit The maximum number of concurrent builds that are allowed for this
     * project.
     * New builds are only started if the current number of builds is less than or equal to this
     * limit. If the current build count meets this limit, new builds are throttled and are not run.
     */
    override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
      cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    /**
     * @param description A description that makes the build project easy to identify.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param encryptionKey The AWS Key Management Service customer master key (CMK) to be used for
     * encrypting the build output artifacts.
     *
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service
     * role has permission to that key.
     *
     *
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's
     * alias (using the format `alias/&lt;alias-name&gt;` ). If you don't specify a value, CodeBuild
     * uses the managed CMK for Amazon Simple Storage Service (Amazon S3).
     */
    override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    /**
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    override fun environment(environment: CfnProject.EnvironmentProperty) {
      cdkBuilder.environment(environment.let(CfnProject.EnvironmentProperty::unwrap))
    }

    /**
     * @param environment The build environment settings for the project, such as the environment
     * type or the environment variables to use for the build environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9cdf398c035540468d5c71e86b9feb3487f52705d1e593aaa65d5469416ec28")
    override fun environment(environment: CfnProject.EnvironmentProperty.Builder.() -> Unit): Unit =
        environment(CfnProject.EnvironmentProperty(environment))

    /**
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project.
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     */
    override fun fileSystemLocations(fileSystemLocations: IResolvable) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.let(IResolvable::unwrap))
    }

    /**
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project.
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     */
    override fun fileSystemLocations(fileSystemLocations: List<Any>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations)
    }

    /**
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     * build project.
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     */
    override fun fileSystemLocations(vararg fileSystemLocations: Any): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * @param logsConfig Information about logs for the build project.
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     */
    override fun logsConfig(logsConfig: IResolvable) {
      cdkBuilder.logsConfig(logsConfig.let(IResolvable::unwrap))
    }

    /**
     * @param logsConfig Information about logs for the build project.
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     */
    override fun logsConfig(logsConfig: CfnProject.LogsConfigProperty) {
      cdkBuilder.logsConfig(logsConfig.let(CfnProject.LogsConfigProperty::unwrap))
    }

    /**
     * @param logsConfig Information about logs for the build project.
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1358491d9a40ea508895c9c69d5000456da043c7be9a6ff51c658e62a10abe94")
    override fun logsConfig(logsConfig: CfnProject.LogsConfigProperty.Builder.() -> Unit): Unit =
        logsConfig(CfnProject.LogsConfigProperty(logsConfig))

    /**
     * @param name The name of the build project.
     * The name must be unique across all of the projects in your AWS account .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param queuedTimeoutInMinutes The number of minutes a build is allowed to be queued before it
     * times out.
     */
    override fun queuedTimeoutInMinutes(queuedTimeoutInMinutes: Number) {
      cdkBuilder.queuedTimeoutInMinutes(queuedTimeoutInMinutes)
    }

    /**
     * @param resourceAccessRole The ARN of the IAM role that enables CodeBuild to access the
     * CloudWatch Logs and Amazon S3 artifacts for the project's builds.
     */
    override fun resourceAccessRole(resourceAccessRole: String) {
      cdkBuilder.resourceAccessRole(resourceAccessRole)
    }

    /**
     * @param secondaryArtifacts A list of `Artifacts` objects.
     * Each artifacts object specifies output settings that the project generates during a build.
     */
    override fun secondaryArtifacts(secondaryArtifacts: IResolvable) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts.let(IResolvable::unwrap))
    }

    /**
     * @param secondaryArtifacts A list of `Artifacts` objects.
     * Each artifacts object specifies output settings that the project generates during a build.
     */
    override fun secondaryArtifacts(secondaryArtifacts: List<Any>) {
      cdkBuilder.secondaryArtifacts(secondaryArtifacts)
    }

    /**
     * @param secondaryArtifacts A list of `Artifacts` objects.
     * Each artifacts object specifies output settings that the project generates during a build.
     */
    override fun secondaryArtifacts(vararg secondaryArtifacts: Any): Unit =
        secondaryArtifacts(secondaryArtifacts.toList())

    /**
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     */
    override fun secondarySourceVersions(secondarySourceVersions: IResolvable) {
      cdkBuilder.secondarySourceVersions(secondarySourceVersions.let(IResolvable::unwrap))
    }

    /**
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     */
    override fun secondarySourceVersions(secondarySourceVersions: List<Any>) {
      cdkBuilder.secondarySourceVersions(secondarySourceVersions)
    }

    /**
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     */
    override fun secondarySourceVersions(vararg secondarySourceVersions: Any): Unit =
        secondarySourceVersions(secondarySourceVersions.toList())

    /**
     * @param secondarySources An array of `ProjectSource` objects.
     */
    override fun secondarySources(secondarySources: IResolvable) {
      cdkBuilder.secondarySources(secondarySources.let(IResolvable::unwrap))
    }

    /**
     * @param secondarySources An array of `ProjectSource` objects.
     */
    override fun secondarySources(secondarySources: List<Any>) {
      cdkBuilder.secondarySources(secondarySources)
    }

    /**
     * @param secondarySources An array of `ProjectSource` objects.
     */
    override fun secondarySources(vararg secondarySources: Any): Unit =
        secondarySources(secondarySources.toList())

    /**
     * @param serviceRole The ARN of the IAM role that enables AWS CodeBuild to interact with
     * dependent AWS services on behalf of the AWS account. 
     */
    override fun serviceRole(serviceRole: String) {
      cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    override fun source(source: CfnProject.SourceProperty) {
      cdkBuilder.source(source.let(CfnProject.SourceProperty::unwrap))
    }

    /**
     * @param source The source code settings for the project, such as the source code's repository
     * type and location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af1b4991468e05b21ec848e4a3d0b464f352235fe406e2a0bd807f7e9523a497")
    override fun source(source: CfnProject.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnProject.SourceProperty(source))

    /**
     * @param sourceVersion A version of the build input to be built for this project.
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
     */
    override fun sourceVersion(sourceVersion: String) {
      cdkBuilder.sourceVersion(sourceVersion)
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeoutInMinutes How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to
     * wait before timing out any related build that did not get marked as completed.
     * The default is 60 minutes.
     */
    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    /**
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository.
     */
    override fun triggers(triggers: IResolvable) {
      cdkBuilder.triggers(triggers.let(IResolvable::unwrap))
    }

    /**
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository.
     */
    override fun triggers(triggers: CfnProject.ProjectTriggersProperty) {
      cdkBuilder.triggers(triggers.let(CfnProject.ProjectTriggersProperty::unwrap))
    }

    /**
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     * in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code
     * every time a code change is pushed to the repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b1db824e687ec2a29c01ae49dd4541a953684017d73ebae18ee88e77548f89a")
    override fun triggers(triggers: CfnProject.ProjectTriggersProperty.Builder.() -> Unit): Unit =
        triggers(CfnProject.ProjectTriggersProperty(triggers))

    /**
     * @param visibility Specifies the visibility of the project's builds. Possible values are:.
     * * **PUBLIC_READ** - The project builds are visible to the public.
     * * **PRIVATE** - The project builds are not visible to the public.
     */
    override fun visibility(visibility: String) {
      cdkBuilder.visibility(visibility)
    }

    /**
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC.
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC.
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     */
    override fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnProject.VpcConfigProperty::unwrap))
    }

    /**
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     * in an Amazon VPC.
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66f8eb6c366745be13332c59b83ddfeae643d8f7a801656936456577814b4bdf")
    override fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnProject.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.codebuild.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     */
    override fun artifacts(): Any = unwrap(this).getArtifacts()

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
     */
    override fun badgeEnabled(): Any? = unwrap(this).getBadgeEnabled()

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     */
    override fun buildBatchConfig(): Any? = unwrap(this).getBuildBatchConfig()

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     */
    override fun cache(): Any? = unwrap(this).getCache()

    /**
     * The maximum number of concurrent builds that are allowed for this project.
     *
     * New builds are only started if the current number of builds is less than or equal to this
     * limit. If the current build count meets this limit, new builds are throttled and are not run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-concurrentbuildlimit)
     */
    override fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

    /**
     * A description that makes the build project easy to identify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     */
    override fun environment(): Any = unwrap(this).getEnvironment()

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     */
    override fun fileSystemLocations(): Any? = unwrap(this).getFileSystemLocations()

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     */
    override fun logsConfig(): Any? = unwrap(this).getLogsConfig()

    /**
     * The name of the build project.
     *
     * The name must be unique across all of the projects in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The number of minutes a build is allowed to be queued before it times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes)
     */
    override fun queuedTimeoutInMinutes(): Number? = unwrap(this).getQueuedTimeoutInMinutes()

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3
     * artifacts for the project's builds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-resourceaccessrole)
     */
    override fun resourceAccessRole(): String? = unwrap(this).getResourceAccessRole()

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     */
    override fun secondaryArtifacts(): Any? = unwrap(this).getSecondaryArtifacts()

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     */
    override fun secondarySourceVersions(): Any? = unwrap(this).getSecondarySourceVersions()

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     */
    override fun secondarySources(): Any? = unwrap(this).getSecondarySources()

    /**
     * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on
     * behalf of the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole)
     */
    override fun serviceRole(): String = unwrap(this).getServiceRole()

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     */
    override fun source(): Any = unwrap(this).getSource()

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
     */
    override fun sourceVersion(): String? = unwrap(this).getSourceVersion()

    /**
     * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out
     * any related build that did not get marked as completed.
     *
     * The default is 60 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes)
     */
    override fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a
     * code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     */
    override fun triggers(): Any? = unwrap(this).getTriggers()

    /**
     * Specifies the visibility of the project's builds. Possible values are:.
     *
     * * **PUBLIC_READ** - The project builds are visible to the public.
     * * **PRIVATE** - The project builds are not visible to the public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-visibility)
     */
    override fun visibility(): String? = unwrap(this).getVisibility()

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see [Use AWS CodeBuild with Amazon Virtual Private
     * Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html) in the *AWS
     * CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.CfnProjectProps):
        CfnProjectProps = CdkObjectWrappers.wrap(cdkObject) as CfnProjectProps

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.codebuild.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codebuild.CfnProjectProps
  }
}
