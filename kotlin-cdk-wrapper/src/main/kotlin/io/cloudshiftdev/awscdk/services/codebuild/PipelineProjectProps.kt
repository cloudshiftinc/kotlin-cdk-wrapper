@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * // Create a Cloudfront Web Distribution
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
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
public interface PipelineProjectProps : CommonProjectProps {
  /**
   * A builder for [PipelineProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAllOutbound Whether to allow the CodeBuild to send all network traffic.
     * If set to false, you must individually add traffic rules to allow the
     * CodeBuild project to connect to network targets.
     *
     * Only used if 'vpc' is supplied.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * @param badge Indicates whether AWS CodeBuild generates a publicly accessible URL for your
     * project's build badge.
     * For more information, see Build Badges Sample
     * in the AWS CodeBuild User Guide.
     */
    public fun badge(badge: Boolean)

    /**
     * @param buildSpec Filename or contents of buildspec in JSON format.
     */
    public fun buildSpec(buildSpec: BuildSpec)

    /**
     * @param cache Caching strategy to use.
     */
    public fun cache(cache: Cache)

    /**
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     * in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since
     * using a secret for the value of that kind of variable would result in it being displayed in
     * plain text in the AWS Console, the construct will throw an exception if it detects a secret was
     * passed there. Pass this property as false if you want to skip this validation, and keep using a
     * secret in a plain text environment variable.
     */
    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    /**
     * @param concurrentBuildLimit Maximum number of concurrent builds.
     * Minimum value is 1 and maximum is account build limit.
     */
    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

    /**
     * @param description A description of the project.
     * Use the description to identify the purpose
     * of the project.
     */
    public fun description(description: String)

    /**
     * @param encryptionKey Encryption key to use to read and write artifacts.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param environment Build environment to use for the build.
     */
    public fun environment(environment: BuildEnvironment)

    /**
     * @param environment Build environment to use for the build.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7238ab18d09bf56b8d047201afbb93d386201f7a3c173e2ba6d24a5903c6ed57")
    public fun environment(environment: BuildEnvironment.Builder.() -> Unit)

    /**
     * @param environmentVariables Additional environment variables to add to the build environment.
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    /**
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     */
    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    /**
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     */
    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    /**
     * @param grantReportGroupPermissions Add permissions to this project's role to create and use
     * test report groups with name starting with the name of this project.
     * That is the standard report group that gets created when a simple name
     * (in contrast to an ARN)
     * is used in the 'reports' section of the buildspec of this project.
     * This is usually harmless, but you can turn these off if you don't plan on using test
     * reports in this project.
     */
    public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean)

    /**
     * @param logging Information about logs for the build project.
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logging(logging: LoggingOptions)

    /**
     * @param logging Information about logs for the build project.
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d183449ac217fd8b8373d261813ba5cd6257f871f6e9e0161207f0020450084")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    /**
     * @param projectName The physical, human-readable name of the CodeBuild Project.
     */
    public fun projectName(projectName: String)

    /**
     * @param queuedTimeout The number of minutes after which AWS CodeBuild stops the build if it's
     * still in queue.
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     */
    public fun queuedTimeout(queuedTimeout: Duration)

    /**
     * @param role Service Role to assume while running the build.
     */
    public fun role(role: IRole)

    /**
     * @param securityGroups What security group to associate with the codebuild project's network
     * interfaces.
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups What security group to associate with the codebuild project's network
     * interfaces.
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param ssmSessionPermissions Add the permissions necessary for debugging builds with SSM
     * Session Manager.
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
     */
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    /**
     * @param subnetSelection Where to place the network interfaces within the VPC.
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection Where to place the network interfaces within the VPC.
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e51ff6349ce02549ab435eaf7391bdc6de4211f2ba7bcb515b62dc5dc13c71b")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
     * complete.
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param vpc VPC network to place codebuild network interfaces.
     * Specify this if the codebuild project needs to access resources in a VPC.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.PipelineProjectProps.Builder =
        software.amazon.awscdk.services.codebuild.PipelineProjectProps.builder()

    /**
     * @param allowAllOutbound Whether to allow the CodeBuild to send all network traffic.
     * If set to false, you must individually add traffic rules to allow the
     * CodeBuild project to connect to network targets.
     *
     * Only used if 'vpc' is supplied.
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param badge Indicates whether AWS CodeBuild generates a publicly accessible URL for your
     * project's build badge.
     * For more information, see Build Badges Sample
     * in the AWS CodeBuild User Guide.
     */
    override fun badge(badge: Boolean) {
      cdkBuilder.badge(badge)
    }

    /**
     * @param buildSpec Filename or contents of buildspec in JSON format.
     */
    override fun buildSpec(buildSpec: BuildSpec) {
      cdkBuilder.buildSpec(buildSpec.let(BuildSpec::unwrap))
    }

    /**
     * @param cache Caching strategy to use.
     */
    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
    }

    /**
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     * in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since
     * using a secret for the value of that kind of variable would result in it being displayed in
     * plain text in the AWS Console, the construct will throw an exception if it detects a secret was
     * passed there. Pass this property as false if you want to skip this validation, and keep using a
     * secret in a plain text environment variable.
     */
    override fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
      cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    /**
     * @param concurrentBuildLimit Maximum number of concurrent builds.
     * Minimum value is 1 and maximum is account build limit.
     */
    override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
      cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    /**
     * @param description A description of the project.
     * Use the description to identify the purpose
     * of the project.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param encryptionKey Encryption key to use to read and write artifacts.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * @param environment Build environment to use for the build.
     */
    override fun environment(environment: BuildEnvironment) {
      cdkBuilder.environment(environment.let(BuildEnvironment::unwrap))
    }

    /**
     * @param environment Build environment to use for the build.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7238ab18d09bf56b8d047201afbb93d386201f7a3c173e2ba6d24a5903c6ed57")
    override fun environment(environment: BuildEnvironment.Builder.() -> Unit): Unit =
        environment(BuildEnvironment(environment))

    /**
     * @param environmentVariables Additional environment variables to add to the build environment.
     */
    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
    }

    /**
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     */
    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
    }

    /**
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     */
    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * @param grantReportGroupPermissions Add permissions to this project's role to create and use
     * test report groups with name starting with the name of this project.
     * That is the standard report group that gets created when a simple name
     * (in contrast to an ARN)
     * is used in the 'reports' section of the buildspec of this project.
     * This is usually harmless, but you can turn these off if you don't plan on using test
     * reports in this project.
     */
    override fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
      cdkBuilder.grantReportGroupPermissions(grantReportGroupPermissions)
    }

    /**
     * @param logging Information about logs for the build project.
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    /**
     * @param logging Information about logs for the build project.
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d183449ac217fd8b8373d261813ba5cd6257f871f6e9e0161207f0020450084")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    /**
     * @param projectName The physical, human-readable name of the CodeBuild Project.
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * @param queuedTimeout The number of minutes after which AWS CodeBuild stops the build if it's
     * still in queue.
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     */
    override fun queuedTimeout(queuedTimeout: Duration) {
      cdkBuilder.queuedTimeout(queuedTimeout.let(Duration::unwrap))
    }

    /**
     * @param role Service Role to assume while running the build.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param securityGroups What security group to associate with the codebuild project's network
     * interfaces.
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups What security group to associate with the codebuild project's network
     * interfaces.
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param ssmSessionPermissions Add the permissions necessary for debugging builds with SSM
     * Session Manager.
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
     */
    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    /**
     * @param subnetSelection Where to place the network interfaces within the VPC.
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnetSelection Where to place the network interfaces within the VPC.
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e51ff6349ce02549ab435eaf7391bdc6de4211f2ba7bcb515b62dc5dc13c71b")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
     * complete.
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param vpc VPC network to place codebuild network interfaces.
     * Specify this if the codebuild project needs to access resources in a VPC.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.PipelineProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.PipelineProjectProps,
  ) : CdkObject(cdkObject), PipelineProjectProps {
    /**
     * Whether to allow the CodeBuild to send all network traffic.
     *
     * If set to false, you must individually add traffic rules to allow the
     * CodeBuild project to connect to network targets.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: true
     */
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see Build Badges Sample
     * in the AWS CodeBuild User Guide.
     *
     * Default: false
     */
    override fun badge(): Boolean? = unwrap(this).getBadge()

    /**
     * Filename or contents of buildspec in JSON format.
     *
     * Default: - Empty buildspec.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
     */
    override fun buildSpec(): BuildSpec? = unwrap(this).getBuildSpec()?.let(BuildSpec::wrap)

    /**
     * Caching strategy to use.
     *
     * Default: Cache.none
     */
    override fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

    /**
     * Whether to check for the presence of any secrets in the environment variables of the default
     * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
     * variable would result in it being displayed in plain text in the AWS Console, the construct will
     * throw an exception if it detects a secret was passed there. Pass this property as false if you
     * want to skip this validation, and keep using a secret in a plain text environment variable.
     *
     * Default: true
     */
    override fun checkSecretsInPlainTextEnvVariables(): Boolean? =
        unwrap(this).getCheckSecretsInPlainTextEnvVariables()

    /**
     * Maximum number of concurrent builds.
     *
     * Minimum value is 1 and maximum is account build limit.
     *
     * Default: - no explicit limit is set
     */
    override fun concurrentBuildLimit(): Number? = unwrap(this).getConcurrentBuildLimit()

    /**
     * A description of the project.
     *
     * Use the description to identify the purpose
     * of the project.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Encryption key to use to read and write artifacts.
     *
     * Default: - The AWS-managed CMK for Amazon Simple Storage Service (Amazon S3) is used.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     */
    override fun environment(): BuildEnvironment? =
        unwrap(this).getEnvironment()?.let(BuildEnvironment::wrap)

    /**
     * Additional environment variables to add to the build environment.
     *
     * Default: - No additional environment variables are specified.
     */
    override fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
        unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)}
        ?: emptyMap()

    /**
     * An  ProjectFileSystemLocation objects for a CodeBuild build project.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     */
    override fun fileSystemLocations(): List<IFileSystemLocation> =
        unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

    /**
     * Add permissions to this project's role to create and use test report groups with name
     * starting with the name of this project.
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
     */
    override fun grantReportGroupPermissions(): Boolean? =
        unwrap(this).getGrantReportGroupPermissions()

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     */
    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    /**
     * The physical, human-readable name of the CodeBuild Project.
     *
     * Default: - Name is automatically generated.
     */
    override fun projectName(): String? = unwrap(this).getProjectName()

    /**
     * The number of minutes after which AWS CodeBuild stops the build if it's still in queue.
     *
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     *
     * Default: - no queue timeout is set
     */
    override fun queuedTimeout(): Duration? = unwrap(this).getQueuedTimeout()?.let(Duration::wrap)

    /**
     * Service Role to assume while running the build.
     *
     * Default: - A role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * What security group to associate with the codebuild project's network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

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
     */
    override fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

    /**
     * Where to place the network interfaces within the VPC.
     *
     * To access AWS services, your CodeBuild project needs to be in one of the following types of
     * subnets:
     *
     *
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with [VPC
     * endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     * for the necessary services.
     *
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist,
     * then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your VPC doesn't have
     * PRIVATE_WITH_EGRESS subnets but you need
     * AWS service access, add VPC Endpoints to your private subnets.
     *
     * Default: - private subnets if available else public subnets
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html for
     * more details.)
     */
    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    /**
     * The number of minutes after which AWS CodeBuild stops the build if it's not complete.
     *
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     *
     * Default: Duration.hours(1)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * VPC network to place codebuild network interfaces.
     *
     * Specify this if the codebuild project needs to access resources in a VPC.
     *
     * Default: - No VPC is specified.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PipelineProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.PipelineProjectProps):
        PipelineProjectProps = CdkObjectWrappers.wrap(cdkObject) as PipelineProjectProps

    internal fun unwrap(wrapped: PipelineProjectProps):
        software.amazon.awscdk.services.codebuild.PipelineProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.PipelineProjectProps
  }
}
