package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PipelineProject internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.PipelineProject,
) : Project(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codebuild.PipelineProject].
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun allowAllOutbound(allowAllOutbound: Boolean)

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
    public fun badge(badge: Boolean)

    /**
     * Filename or contents of buildspec in JSON format.
     *
     * Default: - Empty buildspec.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
     * @param buildSpec Filename or contents of buildspec in JSON format. 
     */
    public fun buildSpec(buildSpec: BuildSpec)

    /**
     * Caching strategy to use.
     *
     * Default: Cache.none
     *
     * @param cache Caching strategy to use. 
     */
    public fun cache(cache: Cache)

    /**
     * Whether to check for the presence of any secrets in the environment variables of the default
     * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
     * variable would result in it being displayed in plain text in the AWS Console, the construct will
     * throw an exception if it detects a secret was passed there. Pass this property as false if you
     * want to skip this validation, and keep using a secret in a plain text environment variable.
     *
     * Default: true
     *
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     * in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since
     * using a secret for the value of that kind of variable would result in it being displayed in
     * plain text in the AWS Console, the construct will throw an exception if it detects a secret was
     * passed there. Pass this property as false if you want to skip this validation, and keep using a
     * secret in a plain text environment variable. 
     */
    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    /**
     * Maximum number of concurrent builds.
     *
     * Minimum value is 1 and maximum is account build limit.
     *
     * Default: - no explicit limit is set
     *
     * @param concurrentBuildLimit Maximum number of concurrent builds. 
     */
    public fun concurrentBuildLimit(concurrentBuildLimit: Number)

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
    public fun description(description: String)

    /**
     * Encryption key to use to read and write artifacts.
     *
     * Default: - The AWS-managed CMK for Amazon Simple Storage Service (Amazon S3) is used.
     *
     * @param encryptionKey Encryption key to use to read and write artifacts. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     *
     * @param environment Build environment to use for the build. 
     */
    public fun environment(environment: BuildEnvironment)

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     *
     * @param environment Build environment to use for the build. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7474f03d8d0e66e9d0888cdd304f6516d0f2e5c326e1fd2c816fad257beebff0")
    public fun environment(environment: BuildEnvironment.Builder.() -> Unit)

    /**
     * Additional environment variables to add to the build environment.
     *
     * Default: - No additional environment variables are specified.
     *
     * @param environmentVariables Additional environment variables to add to the build environment.
     * 
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    /**
     * An  ProjectFileSystemLocation objects for a CodeBuild build project.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project. 
     */
    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    /**
     * An  ProjectFileSystemLocation objects for a CodeBuild build project.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project. 
     */
    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

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
     * @param grantReportGroupPermissions Add permissions to this project's role to create and use
     * test report groups with name starting with the name of this project. 
     */
    public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean)

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for the build project. 
     */
    public fun logging(logging: LoggingOptions)

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for the build project. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23e8421fc4efe1461494eb20fca09d7f5e0508fd5b74d08bd89d47a55902e77")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    /**
     * The physical, human-readable name of the CodeBuild Project.
     *
     * Default: - Name is automatically generated.
     *
     * @param projectName The physical, human-readable name of the CodeBuild Project. 
     */
    public fun projectName(projectName: String)

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
    public fun queuedTimeout(queuedTimeout: Duration)

    /**
     * Service Role to assume while running the build.
     *
     * Default: - A role will be created.
     *
     * @param role Service Role to assume while running the build. 
     */
    public fun role(role: IRole)

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
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

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
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

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
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

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
     * @param subnetSelection Where to place the network interfaces within the VPC. 
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

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
     * @param subnetSelection Where to place the network interfaces within the VPC. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e466e93389d2f364b845979504e328ef45b4c63c4bae083538aaaa8fa23a4947")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

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
    public fun timeout(timeout: Duration)

    /**
     * VPC network to place codebuild network interfaces.
     *
     * Specify this if the codebuild project needs to access resources in a VPC.
     *
     * Default: - No VPC is specified.
     *
     * @param vpc VPC network to place codebuild network interfaces. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.PipelineProject.Builder =
        software.amazon.awscdk.services.codebuild.PipelineProject.Builder.create(scope, id)

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
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
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
    override fun badge(badge: Boolean) {
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
    override fun buildSpec(buildSpec: BuildSpec) {
      cdkBuilder.buildSpec(buildSpec.let(BuildSpec::unwrap))
    }

    /**
     * Caching strategy to use.
     *
     * Default: Cache.none
     *
     * @param cache Caching strategy to use. 
     */
    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
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
     * Maximum number of concurrent builds.
     *
     * Minimum value is 1 and maximum is account build limit.
     *
     * Default: - no explicit limit is set
     *
     * @param concurrentBuildLimit Maximum number of concurrent builds. 
     */
    override fun concurrentBuildLimit(concurrentBuildLimit: Number) {
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
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Encryption key to use to read and write artifacts.
     *
     * Default: - The AWS-managed CMK for Amazon Simple Storage Service (Amazon S3) is used.
     *
     * @param encryptionKey Encryption key to use to read and write artifacts. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     *
     * @param environment Build environment to use for the build. 
     */
    override fun environment(environment: BuildEnvironment) {
      cdkBuilder.environment(environment.let(BuildEnvironment::unwrap))
    }

    /**
     * Build environment to use for the build.
     *
     * Default: BuildEnvironment.LinuxBuildImage.STANDARD_1_0
     *
     * @param environment Build environment to use for the build. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7474f03d8d0e66e9d0888cdd304f6516d0f2e5c326e1fd2c816fad257beebff0")
    override fun environment(environment: BuildEnvironment.Builder.() -> Unit): Unit =
        environment(BuildEnvironment(environment))

    /**
     * Additional environment variables to add to the build environment.
     *
     * Default: - No additional environment variables are specified.
     *
     * @param environmentVariables Additional environment variables to add to the build environment.
     * 
     */
    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
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
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project. 
     */
    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
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
     * @param fileSystemLocations An  ProjectFileSystemLocation objects for a CodeBuild build
     * project. 
     */
    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

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
     * @param grantReportGroupPermissions Add permissions to this project's role to create and use
     * test report groups with name starting with the name of this project. 
     */
    override fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
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
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e23e8421fc4efe1461494eb20fca09d7f5e0508fd5b74d08bd89d47a55902e77")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    /**
     * The physical, human-readable name of the CodeBuild Project.
     *
     * Default: - Name is automatically generated.
     *
     * @param projectName The physical, human-readable name of the CodeBuild Project. 
     */
    override fun projectName(projectName: String) {
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
    override fun queuedTimeout(queuedTimeout: Duration) {
      cdkBuilder.queuedTimeout(queuedTimeout.let(Duration::unwrap))
    }

    /**
     * Service Role to assume while running the build.
     *
     * Default: - A role will be created.
     *
     * @param role Service Role to assume while running the build. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
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
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
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
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

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
    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

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
     * @param subnetSelection Where to place the network interfaces within the VPC. 
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

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
     * @param subnetSelection Where to place the network interfaces within the VPC. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e466e93389d2f364b845979504e328ef45b4c63c4bae083538aaaa8fa23a4947")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

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
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
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
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.PipelineProject =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PipelineProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PipelineProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.PipelineProject):
        PipelineProject = PipelineProject(cdkObject)

    internal fun unwrap(wrapped: PipelineProject):
        software.amazon.awscdk.services.codebuild.PipelineProject = wrapped.cdkObject
  }
}
