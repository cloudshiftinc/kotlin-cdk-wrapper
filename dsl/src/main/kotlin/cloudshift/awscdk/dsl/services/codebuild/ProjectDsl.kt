@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.BuildSpec
import software.amazon.awscdk.services.codebuild.Cache
import software.amazon.awscdk.services.codebuild.IArtifacts
import software.amazon.awscdk.services.codebuild.IFileSystemLocation
import software.amazon.awscdk.services.codebuild.ISource
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.codebuild.Project
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

@CdkDslMarker
public class ProjectDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Project.Builder = Project.Builder.create(scope, id)

  private val _fileSystemLocations: MutableList<IFileSystemLocation> = mutableListOf()

  private val _secondaryArtifacts: MutableList<IArtifacts> = mutableListOf()

  private val _secondarySources: MutableList<ISource> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * Whether to allow the CodeBuild to send all network traffic.
   *
   * If set to false, you must individually add traffic rules to allow the
   * CodeBuild project to connect to network targets.
   *
   * Only used if 'vpc' is supplied.
   *
   * Default: true
   *
   * @param allowAllOutbound Whether to allow the CodeBuild to send all network traffic. 
   */
  public fun allowAllOutbound(allowAllOutbound: Boolean) {
    cdkBuilder.allowAllOutbound(allowAllOutbound)
  }

  /**
   * Defines where build artifacts will be stored.
   *
   * Could be: PipelineBuildArtifacts, NoArtifacts and S3Artifacts.
   *
   * Default: NoArtifacts
   *
   * @param artifacts Defines where build artifacts will be stored. 
   */
  public fun artifacts(artifacts: IArtifacts) {
    cdkBuilder.artifacts(artifacts)
  }

  /**
   * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
   * badge.
   *
   * For more information, see Build Badges Sample
   * in the AWS CodeBuild User Guide.
   *
   * Default: false
   *
   * @param badge Indicates whether AWS CodeBuild generates a publicly accessible URL for your
   * project's build badge. 
   */
  public fun badge(badge: Boolean) {
    cdkBuilder.badge(badge)
  }

  /**
   * Filename or contents of buildspec in JSON format.
   *
   * Default: - Empty buildspec.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
   * @param buildSpec Filename or contents of buildspec in JSON format. 
   */
  public fun buildSpec(buildSpec: BuildSpec) {
    cdkBuilder.buildSpec(buildSpec)
  }

  /**
   * Caching strategy to use.
   *
   * Default: Cache.none
   *
   * @param cache Caching strategy to use. 
   */
  public fun cache(cache: Cache) {
    cdkBuilder.cache(cache)
  }

  /**
   * Whether to check for the presence of any secrets in the environment variables of the default
   * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
   * variable would result in it being displayed in plain text in the AWS Console, the construct will
   * throw an exception if it detects a secret was passed there. Pass this property as false if you
   * want to skip this validation, and keep using a secret in a plain text environment variable.
   *
   * Default: true
   *
   * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets in
   * the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since using
   * a secret for the value of that kind of variable would result in it being displayed in plain text
   * in the AWS Console, the construct will throw an exception if it detects a secret was passed there.
   * Pass this property as false if you want to skip this validation, and keep using a secret in a
   * plain text environment variable. 
   */
  public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
    cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
  }

  /**
   * Maximum number of concurrent builds.
   *
   * Minimum value is 1 and maximum is account build limit.
   *
   * Default: - no explicit limit is set
   *
   * @param concurrentBuildLimit Maximum number of concurrent builds. 
   */
  public fun concurrentBuildLimit(concurrentBuildLimit: Number) {
    cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
  }

  /**
   * A description of the project.
   *
   * Use the description to identify the purpose
   * of the project.
   *
   * Default: - No description.
   *
   * @param description A description of the project. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Encryption key to use to read and write artifacts.
   *
   * Default: - The AWS-managed CMK for Amazon Simple Storage Service (Amazon S3) is used.
   *
   * @param encryptionKey Encryption key to use to read and write artifacts. 
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * Build environment to use for the build.
   *
   * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
   *
   * @param environment Build environment to use for the build. 
   */
  public fun environment(environment: BuildEnvironmentDsl.() -> Unit = {}) {
    val builder = BuildEnvironmentDsl()
    builder.apply(environment)
    cdkBuilder.environment(builder.build())
  }

  /**
   * Build environment to use for the build.
   *
   * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
   *
   * @param environment Build environment to use for the build. 
   */
  public fun environment(environment: BuildEnvironment) {
    cdkBuilder.environment(environment)
  }

  /**
   * Additional environment variables to add to the build environment.
   *
   * Default: - No additional environment variables are specified.
   *
   * @param environmentVariables Additional environment variables to add to the build environment. 
   */
  public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
    cdkBuilder.environmentVariables(environmentVariables)
  }

  /**
   * An  ProjectFileSystemLocation objects for a CodeBuild build project.
   *
   * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
   * mountPoint,
   * and type of a file system created using Amazon Elastic File System.
   *
   * Default: - no file system locations
   *
   * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build project.
   * 
   */
  public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation) {
    _fileSystemLocations.addAll(listOf(*fileSystemLocations))
  }

  /**
   * An  ProjectFileSystemLocation objects for a CodeBuild build project.
   *
   * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
   * mountPoint,
   * and type of a file system created using Amazon Elastic File System.
   *
   * Default: - no file system locations
   *
   * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build project.
   * 
   */
  public fun fileSystemLocations(fileSystemLocations: Collection<IFileSystemLocation>) {
    _fileSystemLocations.addAll(fileSystemLocations)
  }

  /**
   * Add permissions to this project's role to create and use test report groups with name starting
   * with the name of this project.
   *
   * That is the standard report group that gets created when a simple name
   * (in contrast to an ARN)
   * is used in the 'reports' section of the buildspec of this project.
   * This is usually harmless, but you can turn these off if you don't plan on using test
   * reports in this project.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/test-report-group-naming.html)
   * @param grantReportGroupPermissions Add permissions to this project's role to create and use
   * test report groups with name starting with the name of this project. 
   */
  public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
    cdkBuilder.grantReportGroupPermissions(grantReportGroupPermissions)
  }

  /**
   * Information about logs for the build project.
   *
   * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
   *
   * Default: - no log configuration is set
   *
   * @param logging Information about logs for the build project. 
   */
  public fun logging(logging: LoggingOptionsDsl.() -> Unit = {}) {
    val builder = LoggingOptionsDsl()
    builder.apply(logging)
    cdkBuilder.logging(builder.build())
  }

  /**
   * Information about logs for the build project.
   *
   * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
   *
   * Default: - no log configuration is set
   *
   * @param logging Information about logs for the build project. 
   */
  public fun logging(logging: LoggingOptions) {
    cdkBuilder.logging(logging)
  }

  /**
   * The physical, human-readable name of the CodeBuild Project.
   *
   * Default: - Name is automatically generated.
   *
   * @param projectName The physical, human-readable name of the CodeBuild Project. 
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  /**
   * The number of minutes after which AWS CodeBuild stops the build if it's still in queue.
   *
   * For valid values, see the timeoutInMinutes field in the AWS
   * CodeBuild User Guide.
   *
   * Default: - no queue timeout is set
   *
   * @param queuedTimeout The number of minutes after which AWS CodeBuild stops the build if it's
   * still in queue. 
   */
  public fun queuedTimeout(queuedTimeout: Duration) {
    cdkBuilder.queuedTimeout(queuedTimeout)
  }

  /**
   * Service Role to assume while running the build.
   *
   * Default: - A role will be created.
   *
   * @param role Service Role to assume while running the build. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * The secondary artifacts for the Project.
   *
   * Can also be added after the Project has been created by using the
   * `Project#addSecondaryArtifact` method.
   *
   * Default: - No secondary artifacts.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
   * @param secondaryArtifacts The secondary artifacts for the Project. 
   */
  public fun secondaryArtifacts(vararg secondaryArtifacts: IArtifacts) {
    _secondaryArtifacts.addAll(listOf(*secondaryArtifacts))
  }

  /**
   * The secondary artifacts for the Project.
   *
   * Can also be added after the Project has been created by using the
   * `Project#addSecondaryArtifact` method.
   *
   * Default: - No secondary artifacts.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
   * @param secondaryArtifacts The secondary artifacts for the Project. 
   */
  public fun secondaryArtifacts(secondaryArtifacts: Collection<IArtifacts>) {
    _secondaryArtifacts.addAll(secondaryArtifacts)
  }

  /**
   * The secondary sources for the Project.
   *
   * Can be also added after the Project has been created by using the `Project#addSecondarySource`
   * method.
   *
   * Default: - No secondary sources.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
   * @param secondarySources The secondary sources for the Project. 
   */
  public fun secondarySources(vararg secondarySources: ISource) {
    _secondarySources.addAll(listOf(*secondarySources))
  }

  /**
   * The secondary sources for the Project.
   *
   * Can be also added after the Project has been created by using the `Project#addSecondarySource`
   * method.
   *
   * Default: - No secondary sources.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html)
   * @param secondarySources The secondary sources for the Project. 
   */
  public fun secondarySources(secondarySources: Collection<ISource>) {
    _secondarySources.addAll(secondarySources)
  }

  /**
   * What security group to associate with the codebuild project's network interfaces.
   *
   * If no security group is identified, one will be created automatically.
   *
   * Only used if 'vpc' is supplied.
   *
   * Default: - Security group will be automatically created.
   *
   * @param securityGroups What security group to associate with the codebuild project's network
   * interfaces. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * What security group to associate with the codebuild project's network interfaces.
   *
   * If no security group is identified, one will be created automatically.
   *
   * Only used if 'vpc' is supplied.
   *
   * Default: - Security group will be automatically created.
   *
   * @param securityGroups What security group to associate with the codebuild project's network
   * interfaces. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * The source of the build.
   *
   * *Note*: if `NoSource` is given as the source,
   * then you need to provide an explicit `buildSpec`.
   *
   * Default: - NoSource
   *
   * @param source The source of the build. 
   */
  public fun source(source: ISource) {
    cdkBuilder.source(source)
  }

  /**
   * Add the permissions necessary for debugging builds with SSM Session Manager.
   *
   * If the following prerequisites have been met:
   *
   * * The necessary permissions have been added by setting this flag to true.
   * * The build image has the SSM agent installed (true for default CodeBuild images).
   * * The build is started with
   * [debugSessionEnabled](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_StartBuild.html#CodeBuild-StartBuild-request-debugSessionEnabled)
   * set to true.
   *
   * Then the build container can be paused and inspected using Session Manager
   * by invoking the `codebuild-breakpoint` command somewhere during the build.
   *
   * `codebuild-breakpoint` commands will be ignored if the build is not started
   * with `debugSessionEnabled=true`.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/session-manager.html)
   * @param ssmSessionPermissions Add the permissions necessary for debugging builds with SSM
   * Session Manager. 
   */
  public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
    cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
  }

  /**
   * Where to place the network interfaces within the VPC.
   *
   * Only used if 'vpc' is supplied.
   *
   * Default: - All private subnets.
   *
   * @param subnetSelection Where to place the network interfaces within the VPC. 
   */
  public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnetSelection)
    cdkBuilder.subnetSelection(builder.build())
  }

  /**
   * Where to place the network interfaces within the VPC.
   *
   * Only used if 'vpc' is supplied.
   *
   * Default: - All private subnets.
   *
   * @param subnetSelection Where to place the network interfaces within the VPC. 
   */
  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  /**
   * The number of minutes after which AWS CodeBuild stops the build if it's not complete.
   *
   * For valid values, see the timeoutInMinutes field in the AWS
   * CodeBuild User Guide.
   *
   * Default: Duration.hours(1)
   *
   * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
   * complete. 
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * VPC network to place codebuild network interfaces.
   *
   * Specify this if the codebuild project needs to access resources in a VPC.
   *
   * Default: - No VPC is specified.
   *
   * @param vpc VPC network to place codebuild network interfaces. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): Project {
    if(_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
    if(_secondaryArtifacts.isNotEmpty()) cdkBuilder.secondaryArtifacts(_secondaryArtifacts)
    if(_secondarySources.isNotEmpty()) cdkBuilder.secondarySources(_secondarySources)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
