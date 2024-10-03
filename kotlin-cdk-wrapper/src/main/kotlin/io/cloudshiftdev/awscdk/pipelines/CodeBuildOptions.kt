@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironment
import io.cloudshiftdev.awscdk.services.codebuild.BuildSpec
import io.cloudshiftdev.awscdk.services.codebuild.Cache
import io.cloudshiftdev.awscdk.services.codebuild.IFileSystemLocation
import io.cloudshiftdev.awscdk.services.codebuild.LoggingOptions
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Options for customizing a single CodeBuild project.
 *
 * Example:
 *
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
public interface CodeBuildOptions {
  /**
   * Partial build environment, will be combined with other build environments that apply.
   *
   * Default: - Non-privileged build, SMALL instance, LinuxBuildImage.STANDARD_7_0
   */
  public fun buildEnvironment(): BuildEnvironment? =
      unwrap(this).getBuildEnvironment()?.let(BuildEnvironment::wrap)

  /**
   * Caching strategy to use.
   *
   * Default: - No cache
   */
  public fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

  /**
   * ProjectFileSystemLocation objects for CodeBuild build projects.
   *
   * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
   * mountPoint,
   * and type of a file system created using Amazon Elastic File System.
   * Requires a vpc to be set and privileged to be set to true.
   *
   * Default: - no file system locations
   */
  public fun fileSystemLocations(): List<IFileSystemLocation> =
      unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

  /**
   * Information about logs for CodeBuild projects.
   *
   * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
   *
   * Default: - no log configuration is set
   */
  public fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  /**
   * Partial buildspec, will be combined with other buildspecs that apply.
   *
   * The BuildSpec must be available inline--it cannot reference a file
   * on disk.
   *
   * Default: - No initial BuildSpec
   */
  public fun partialBuildSpec(): BuildSpec? =
      unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

  /**
   * Policy statements to add to role.
   *
   * Default: - No policy statements added to CodeBuild Project Role
   */
  public fun rolePolicy(): List<PolicyStatement> =
      unwrap(this).getRolePolicy()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * Which security group(s) to associate with the project network interfaces.
   *
   * Only used if 'vpc' is supplied.
   *
   * Default: - Security group will be automatically created.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Which subnets to use.
   *
   * Only used if 'vpc' is supplied.
   *
   * Default: - All private subnets.
   */
  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  /**
   * The number of minutes after which AWS CodeBuild stops the build if it's not complete.
   *
   * For valid values, see the timeoutInMinutes field in the AWS
   * CodeBuild User Guide.
   *
   * Default: Duration.hours(1)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * The VPC where to create the CodeBuild network interfaces in.
   *
   * Default: - No VPC
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [CodeBuildOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param buildEnvironment Partial build environment, will be combined with other build
     * environments that apply.
     */
    public fun buildEnvironment(buildEnvironment: BuildEnvironment)

    /**
     * @param buildEnvironment Partial build environment, will be combined with other build
     * environments that apply.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c3a687835e189ee4baf969e19076ab9c8a363a995aff69ee6b510acfa79550f")
    public fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit)

    /**
     * @param cache Caching strategy to use.
     */
    public fun cache(cache: Cache)

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     * Requires a vpc to be set and privileged to be set to true.
     */
    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     * Requires a vpc to be set and privileged to be set to true.
     */
    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    /**
     * @param logging Information about logs for CodeBuild projects.
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logging(logging: LoggingOptions)

    /**
     * @param logging Information about logs for CodeBuild projects.
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abf37ca978f283cd317c366abfcbaf5875e30b98b3c196f6850c5c027dad7835")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    /**
     * @param partialBuildSpec Partial buildspec, will be combined with other buildspecs that apply.
     * The BuildSpec must be available inline--it cannot reference a file
     * on disk.
     */
    public fun partialBuildSpec(partialBuildSpec: BuildSpec)

    /**
     * @param rolePolicy Policy statements to add to role.
     */
    public fun rolePolicy(rolePolicy: List<PolicyStatement>)

    /**
     * @param rolePolicy Policy statements to add to role.
     */
    public fun rolePolicy(vararg rolePolicy: PolicyStatement)

    /**
     * @param securityGroups Which security group(s) to associate with the project network
     * interfaces.
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Which security group(s) to associate with the project network
     * interfaces.
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param subnetSelection Which subnets to use.
     * Only used if 'vpc' is supplied.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection Which subnets to use.
     * Only used if 'vpc' is supplied.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50f1a4ecf72ee950cf9d0486b74ebba1ab84ef9bd51b98513c980a1559646d1e")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
     * complete.
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param vpc The VPC where to create the CodeBuild network interfaces in.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodeBuildOptions.Builder =
        software.amazon.awscdk.pipelines.CodeBuildOptions.builder()

    /**
     * @param buildEnvironment Partial build environment, will be combined with other build
     * environments that apply.
     */
    override fun buildEnvironment(buildEnvironment: BuildEnvironment) {
      cdkBuilder.buildEnvironment(buildEnvironment.let(BuildEnvironment.Companion::unwrap))
    }

    /**
     * @param buildEnvironment Partial build environment, will be combined with other build
     * environments that apply.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c3a687835e189ee4baf969e19076ab9c8a363a995aff69ee6b510acfa79550f")
    override fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit): Unit =
        buildEnvironment(BuildEnvironment(buildEnvironment))

    /**
     * @param cache Caching strategy to use.
     */
    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache.Companion::unwrap))
    }

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     * Requires a vpc to be set and privileged to be set to true.
     */
    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation.Companion::unwrap))
    }

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     * Requires a vpc to be set and privileged to be set to true.
     */
    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * @param logging Information about logs for CodeBuild projects.
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions.Companion::unwrap))
    }

    /**
     * @param logging Information about logs for CodeBuild projects.
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abf37ca978f283cd317c366abfcbaf5875e30b98b3c196f6850c5c027dad7835")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    /**
     * @param partialBuildSpec Partial buildspec, will be combined with other buildspecs that apply.
     * The BuildSpec must be available inline--it cannot reference a file
     * on disk.
     */
    override fun partialBuildSpec(partialBuildSpec: BuildSpec) {
      cdkBuilder.partialBuildSpec(partialBuildSpec.let(BuildSpec.Companion::unwrap))
    }

    /**
     * @param rolePolicy Policy statements to add to role.
     */
    override fun rolePolicy(rolePolicy: List<PolicyStatement>) {
      cdkBuilder.rolePolicy(rolePolicy.map(PolicyStatement.Companion::unwrap))
    }

    /**
     * @param rolePolicy Policy statements to add to role.
     */
    override fun rolePolicy(vararg rolePolicy: PolicyStatement): Unit =
        rolePolicy(rolePolicy.toList())

    /**
     * @param securityGroups Which security group(s) to associate with the project network
     * interfaces.
     * Only used if 'vpc' is supplied.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups Which security group(s) to associate with the project network
     * interfaces.
     * Only used if 'vpc' is supplied.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetSelection Which subnets to use.
     * Only used if 'vpc' is supplied.
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param subnetSelection Which subnets to use.
     * Only used if 'vpc' is supplied.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("50f1a4ecf72ee950cf9d0486b74ebba1ab84ef9bd51b98513c980a1559646d1e")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
     * complete.
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param vpc The VPC where to create the CodeBuild network interfaces in.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.CodeBuildOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.pipelines.CodeBuildOptions,
  ) : CdkObject(cdkObject),
      CodeBuildOptions {
    /**
     * Partial build environment, will be combined with other build environments that apply.
     *
     * Default: - Non-privileged build, SMALL instance, LinuxBuildImage.STANDARD_7_0
     */
    override fun buildEnvironment(): BuildEnvironment? =
        unwrap(this).getBuildEnvironment()?.let(BuildEnvironment::wrap)

    /**
     * Caching strategy to use.
     *
     * Default: - No cache
     */
    override fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

    /**
     * ProjectFileSystemLocation objects for CodeBuild build projects.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     * Requires a vpc to be set and privileged to be set to true.
     *
     * Default: - no file system locations
     */
    override fun fileSystemLocations(): List<IFileSystemLocation> =
        unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

    /**
     * Information about logs for CodeBuild projects.
     *
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     */
    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    /**
     * Partial buildspec, will be combined with other buildspecs that apply.
     *
     * The BuildSpec must be available inline--it cannot reference a file
     * on disk.
     *
     * Default: - No initial BuildSpec
     */
    override fun partialBuildSpec(): BuildSpec? =
        unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

    /**
     * Policy statements to add to role.
     *
     * Default: - No policy statements added to CodeBuild Project Role
     */
    override fun rolePolicy(): List<PolicyStatement> =
        unwrap(this).getRolePolicy()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * Which security group(s) to associate with the project network interfaces.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * Which subnets to use.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - All private subnets.
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
     * The VPC where to create the CodeBuild network interfaces in.
     *
     * Default: - No VPC
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodeBuildOptions):
        CodeBuildOptions = CdkObjectWrappers.wrap(cdkObject) as? CodeBuildOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeBuildOptions):
        software.amazon.awscdk.pipelines.CodeBuildOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.CodeBuildOptions
  }
}
