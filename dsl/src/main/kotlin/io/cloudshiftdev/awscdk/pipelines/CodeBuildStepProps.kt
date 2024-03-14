package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironment
import io.cloudshiftdev.awscdk.services.codebuild.BuildSpec
import io.cloudshiftdev.awscdk.services.codebuild.Cache
import io.cloudshiftdev.awscdk.services.codebuild.IFileSystemLocation
import io.cloudshiftdev.awscdk.services.codebuild.LoggingOptions
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CodeBuildStepProps : ShellStepProps {
  /**
   * Custom execution role to be used for the Code Build Action.
   *
   * Default: - A role is automatically created
   */
  public fun actionRole(): IRole? = unwrap(this).getActionRole()?.let(IRole::wrap)

  /**
   * Changes to environment.
   *
   * This environment will be combined with the pipeline's default
   * environment.
   *
   * Default: - Use the pipeline's default build environment
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
   * Additional configuration that can only be configured via BuildSpec.
   *
   * You should not use this to specify output artifacts; those
   * should be supplied via the other properties of this class, otherwise
   * CDK Pipelines won't be able to inspect the artifacts.
   *
   * Set the `commands` to an empty array if you want to fully specify
   * the BuildSpec using this field.
   *
   * The BuildSpec must be available inline--it cannot reference a file
   * on disk.
   *
   * Default: - BuildSpec completely derived from other properties
   */
  public fun partialBuildSpec(): BuildSpec? =
      unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

  /**
   * Name for the generated CodeBuild project.
   *
   * Default: - Automatically generated
   */
  public fun projectName(): String? = unwrap(this).getProjectName()

  /**
   * Custom execution role to be used for the CodeBuild project.
   *
   * Default: - A role is automatically created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Policy statements to add to role used during the synth.
   *
   * Can be used to add acces to a CodeArtifact repository etc.
   *
   * Default: - No policy statements added to CodeBuild Project Role
   */
  public fun rolePolicyStatements(): List<PolicyStatement> =
      unwrap(this).getRolePolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * Which security group to associate with the script's project network interfaces.
   *
   * If no security group is identified, one will be created automatically.
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
   * The VPC where to execute the SimpleSynth.
   *
   * Default: - No VPC
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [CodeBuildStepProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionRole Custom execution role to be used for the Code Build Action.
     */
    public fun actionRole(actionRole: IRole)

    /**
     * @param additionalInputs Additional FileSets to put in other directories.
     * Specifies a mapping from directory name to FileSets. During the
     * script execution, the FileSets will be available in the directories
     * indicated.
     *
     * The directory names may be relative. For example, you can put
     * the main input and an additional input side-by-side with the
     * following configuration:
     *
     * ```
     * ShellStep script = ShellStep.Builder.create("MainScript")
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .input(CodePipelineSource.gitHub("org/source1", "main"))
     * .additionalInputs(Map.of(
     * "../siblingdir", CodePipelineSource.gitHub("org/source2", "main")))
     * .build();
     * ```
     */
    public fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>)

    /**
     * @param buildEnvironment Changes to environment.
     * This environment will be combined with the pipeline's default
     * environment.
     */
    public fun buildEnvironment(buildEnvironment: BuildEnvironment)

    /**
     * @param buildEnvironment Changes to environment.
     * This environment will be combined with the pipeline's default
     * environment.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ab0bc8946f8962db6ca93a3377a2473cff40c858669e5401c298f80d6854708")
    public fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit)

    /**
     * @param cache Caching strategy to use.
     */
    public fun cache(cache: Cache)

    /**
     * @param commands Commands to run. 
     */
    public fun commands(commands: List<String>)

    /**
     * @param commands Commands to run. 
     */
    public fun commands(vararg commands: String)

    /**
     * @param env Environment variables to set.
     */
    public fun env(env: Map<String, String>)

    /**
     * @param envFromCfnOutputs Set environment variables based on Stack Outputs.
     * `ShellStep`s following stack or stage deployments may
     * access the `CfnOutput`s of those stacks to get access to
     * --for example--automatically generated resource names or
     * endpoint URLs.
     */
    public fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>)

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     */
    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     */
    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    /**
     * @param input FileSet to run these scripts on.
     * The files in the FileSet will be placed in the working directory when
     * the script is executed. Use `additionalInputs` to download file sets
     * to other directories as well.
     */
    public fun input(input: IFileSetProducer)

    /**
     * @param installCommands Installation commands to run before the regular commands.
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     */
    public fun installCommands(installCommands: List<String>)

    /**
     * @param installCommands Installation commands to run before the regular commands.
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     */
    public fun installCommands(vararg installCommands: String)

    /**
     * @param logging Information about logs for CodeBuild projects.
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logging(logging: LoggingOptions)

    /**
     * @param logging Information about logs for CodeBuild projects.
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41954556a8cd82c8a417434af88b924a19b2ed8ebaf0034f76971265b80f0921")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    /**
     * @param partialBuildSpec Additional configuration that can only be configured via BuildSpec.
     * You should not use this to specify output artifacts; those
     * should be supplied via the other properties of this class, otherwise
     * CDK Pipelines won't be able to inspect the artifacts.
     *
     * Set the `commands` to an empty array if you want to fully specify
     * the BuildSpec using this field.
     *
     * The BuildSpec must be available inline--it cannot reference a file
     * on disk.
     */
    public fun partialBuildSpec(partialBuildSpec: BuildSpec)

    /**
     * @param primaryOutputDirectory The directory that will contain the primary output fileset.
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     */
    public fun primaryOutputDirectory(primaryOutputDirectory: String)

    /**
     * @param projectName Name for the generated CodeBuild project.
     */
    public fun projectName(projectName: String)

    /**
     * @param role Custom execution role to be used for the CodeBuild project.
     */
    public fun role(role: IRole)

    /**
     * @param rolePolicyStatements Policy statements to add to role used during the synth.
     * Can be used to add acces to a CodeArtifact repository etc.
     */
    public fun rolePolicyStatements(rolePolicyStatements: List<PolicyStatement>)

    /**
     * @param rolePolicyStatements Policy statements to add to role used during the synth.
     * Can be used to add acces to a CodeArtifact repository etc.
     */
    public fun rolePolicyStatements(vararg rolePolicyStatements: PolicyStatement)

    /**
     * @param securityGroups Which security group to associate with the script's project network
     * interfaces.
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Which security group to associate with the script's project network
     * interfaces.
     * If no security group is identified, one will be created automatically.
     *
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62a5f5cf2942613e54caa1dfc89729f0a1b72d13a4be194b60599868108386f4")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
     * complete.
     * For valid values, see the timeoutInMinutes field in the AWS
     * CodeBuild User Guide.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param vpc The VPC where to execute the SimpleSynth.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodeBuildStepProps.Builder =
        software.amazon.awscdk.pipelines.CodeBuildStepProps.builder()

    /**
     * @param actionRole Custom execution role to be used for the Code Build Action.
     */
    override fun actionRole(actionRole: IRole) {
      cdkBuilder.actionRole(actionRole.let(IRole::unwrap))
    }

    /**
     * @param additionalInputs Additional FileSets to put in other directories.
     * Specifies a mapping from directory name to FileSets. During the
     * script execution, the FileSets will be available in the directories
     * indicated.
     *
     * The directory names may be relative. For example, you can put
     * the main input and an additional input side-by-side with the
     * following configuration:
     *
     * ```
     * ShellStep script = ShellStep.Builder.create("MainScript")
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .input(CodePipelineSource.gitHub("org/source1", "main"))
     * .additionalInputs(Map.of(
     * "../siblingdir", CodePipelineSource.gitHub("org/source2", "main")))
     * .build();
     * ```
     */
    override fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>) {
      cdkBuilder.additionalInputs(additionalInputs.mapValues{IFileSetProducer.unwrap(it.value)})
    }

    /**
     * @param buildEnvironment Changes to environment.
     * This environment will be combined with the pipeline's default
     * environment.
     */
    override fun buildEnvironment(buildEnvironment: BuildEnvironment) {
      cdkBuilder.buildEnvironment(buildEnvironment.let(BuildEnvironment::unwrap))
    }

    /**
     * @param buildEnvironment Changes to environment.
     * This environment will be combined with the pipeline's default
     * environment.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ab0bc8946f8962db6ca93a3377a2473cff40c858669e5401c298f80d6854708")
    override fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit): Unit =
        buildEnvironment(BuildEnvironment(buildEnvironment))

    /**
     * @param cache Caching strategy to use.
     */
    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
    }

    /**
     * @param commands Commands to run. 
     */
    override fun commands(commands: List<String>) {
      cdkBuilder.commands(commands)
    }

    /**
     * @param commands Commands to run. 
     */
    override fun commands(vararg commands: String): Unit = commands(commands.toList())

    /**
     * @param env Environment variables to set.
     */
    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

    /**
     * @param envFromCfnOutputs Set environment variables based on Stack Outputs.
     * `ShellStep`s following stack or stage deployments may
     * access the `CfnOutput`s of those stacks to get access to
     * --for example--automatically generated resource names or
     * endpoint URLs.
     */
    override fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>) {
      cdkBuilder.envFromCfnOutputs(envFromCfnOutputs.mapValues{CfnOutput.unwrap(it.value)})
    }

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     */
    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
    }

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     */
    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * @param input FileSet to run these scripts on.
     * The files in the FileSet will be placed in the working directory when
     * the script is executed. Use `additionalInputs` to download file sets
     * to other directories as well.
     */
    override fun input(input: IFileSetProducer) {
      cdkBuilder.input(input.let(IFileSetProducer::unwrap))
    }

    /**
     * @param installCommands Installation commands to run before the regular commands.
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     */
    override fun installCommands(installCommands: List<String>) {
      cdkBuilder.installCommands(installCommands)
    }

    /**
     * @param installCommands Installation commands to run before the regular commands.
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     */
    override fun installCommands(vararg installCommands: String): Unit =
        installCommands(installCommands.toList())

    /**
     * @param logging Information about logs for CodeBuild projects.
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    /**
     * @param logging Information about logs for CodeBuild projects.
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41954556a8cd82c8a417434af88b924a19b2ed8ebaf0034f76971265b80f0921")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    /**
     * @param partialBuildSpec Additional configuration that can only be configured via BuildSpec.
     * You should not use this to specify output artifacts; those
     * should be supplied via the other properties of this class, otherwise
     * CDK Pipelines won't be able to inspect the artifacts.
     *
     * Set the `commands` to an empty array if you want to fully specify
     * the BuildSpec using this field.
     *
     * The BuildSpec must be available inline--it cannot reference a file
     * on disk.
     */
    override fun partialBuildSpec(partialBuildSpec: BuildSpec) {
      cdkBuilder.partialBuildSpec(partialBuildSpec.let(BuildSpec::unwrap))
    }

    /**
     * @param primaryOutputDirectory The directory that will contain the primary output fileset.
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     */
    override fun primaryOutputDirectory(primaryOutputDirectory: String) {
      cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
    }

    /**
     * @param projectName Name for the generated CodeBuild project.
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * @param role Custom execution role to be used for the CodeBuild project.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param rolePolicyStatements Policy statements to add to role used during the synth.
     * Can be used to add acces to a CodeArtifact repository etc.
     */
    override fun rolePolicyStatements(rolePolicyStatements: List<PolicyStatement>) {
      cdkBuilder.rolePolicyStatements(rolePolicyStatements.map(PolicyStatement::unwrap))
    }

    /**
     * @param rolePolicyStatements Policy statements to add to role used during the synth.
     * Can be used to add acces to a CodeArtifact repository etc.
     */
    override fun rolePolicyStatements(vararg rolePolicyStatements: PolicyStatement): Unit =
        rolePolicyStatements(rolePolicyStatements.toList())

    /**
     * @param securityGroups Which security group to associate with the script's project network
     * interfaces.
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups Which security group to associate with the script's project network
     * interfaces.
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnetSelection Which subnets to use.
     * Only used if 'vpc' is supplied.
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnetSelection Which subnets to use.
     * Only used if 'vpc' is supplied.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62a5f5cf2942613e54caa1dfc89729f0a1b72d13a4be194b60599868108386f4")
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
     * @param vpc The VPC where to execute the SimpleSynth.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.CodeBuildStepProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.CodeBuildStepProps,
  ) : CdkObject(cdkObject), CodeBuildStepProps {
    /**
     * Custom execution role to be used for the Code Build Action.
     *
     * Default: - A role is automatically created
     */
    override fun actionRole(): IRole? = unwrap(this).getActionRole()?.let(IRole::wrap)

    /**
     * Additional FileSets to put in other directories.
     *
     * Specifies a mapping from directory name to FileSets. During the
     * script execution, the FileSets will be available in the directories
     * indicated.
     *
     * The directory names may be relative. For example, you can put
     * the main input and an additional input side-by-side with the
     * following configuration:
     *
     * ```
     * ShellStep script = ShellStep.Builder.create("MainScript")
     * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
     * .input(CodePipelineSource.gitHub("org/source1", "main"))
     * .additionalInputs(Map.of(
     * "../siblingdir", CodePipelineSource.gitHub("org/source2", "main")))
     * .build();
     * ```
     *
     * Default: - No additional inputs
     */
    override fun additionalInputs(): Map<String, IFileSetProducer> =
        unwrap(this).getAdditionalInputs()?.mapValues{IFileSetProducer.wrap(it.value)} ?: emptyMap()

    /**
     * Changes to environment.
     *
     * This environment will be combined with the pipeline's default
     * environment.
     *
     * Default: - Use the pipeline's default build environment
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
     * Commands to run.
     */
    override fun commands(): List<String> = unwrap(this).getCommands()

    /**
     * Environment variables to set.
     *
     * Default: - No environment variables
     */
    override fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

    /**
     * Set environment variables based on Stack Outputs.
     *
     * `ShellStep`s following stack or stage deployments may
     * access the `CfnOutput`s of those stacks to get access to
     * --for example--automatically generated resource names or
     * endpoint URLs.
     *
     * Default: - No environment variables created from stack outputs
     */
    override fun envFromCfnOutputs(): Map<String, CfnOutput> =
        unwrap(this).getEnvFromCfnOutputs()?.mapValues{CfnOutput.wrap(it.value)} ?: emptyMap()

    /**
     * ProjectFileSystemLocation objects for CodeBuild build projects.
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
     * FileSet to run these scripts on.
     *
     * The files in the FileSet will be placed in the working directory when
     * the script is executed. Use `additionalInputs` to download file sets
     * to other directories as well.
     *
     * Default: - No input specified
     */
    override fun input(): IFileSetProducer? = unwrap(this).getInput()?.let(IFileSetProducer::wrap)

    /**
     * Installation commands to run before the regular commands.
     *
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     *
     * Default: - No installation commands
     */
    override fun installCommands(): List<String> = unwrap(this).getInstallCommands() ?: emptyList()

    /**
     * Information about logs for CodeBuild projects.
     *
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     */
    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    /**
     * Additional configuration that can only be configured via BuildSpec.
     *
     * You should not use this to specify output artifacts; those
     * should be supplied via the other properties of this class, otherwise
     * CDK Pipelines won't be able to inspect the artifacts.
     *
     * Set the `commands` to an empty array if you want to fully specify
     * the BuildSpec using this field.
     *
     * The BuildSpec must be available inline--it cannot reference a file
     * on disk.
     *
     * Default: - BuildSpec completely derived from other properties
     */
    override fun partialBuildSpec(): BuildSpec? =
        unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

    /**
     * The directory that will contain the primary output fileset.
     *
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     *
     * Default: - No primary output
     */
    override fun primaryOutputDirectory(): String? = unwrap(this).getPrimaryOutputDirectory()

    /**
     * Name for the generated CodeBuild project.
     *
     * Default: - Automatically generated
     */
    override fun projectName(): String? = unwrap(this).getProjectName()

    /**
     * Custom execution role to be used for the CodeBuild project.
     *
     * Default: - A role is automatically created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Policy statements to add to role used during the synth.
     *
     * Can be used to add acces to a CodeArtifact repository etc.
     *
     * Default: - No policy statements added to CodeBuild Project Role
     */
    override fun rolePolicyStatements(): List<PolicyStatement> =
        unwrap(this).getRolePolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * Which security group to associate with the script's project network interfaces.
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
     * The VPC where to execute the SimpleSynth.
     *
     * Default: - No VPC
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodeBuildStepProps):
        CodeBuildStepProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeBuildStepProps):
        software.amazon.awscdk.pipelines.CodeBuildStepProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.pipelines.CodeBuildStepProps
  }
}
