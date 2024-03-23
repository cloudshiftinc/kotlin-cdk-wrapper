@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironment
import io.cloudshiftdev.awscdk.services.codebuild.BuildSpec
import io.cloudshiftdev.awscdk.services.codebuild.Cache
import io.cloudshiftdev.awscdk.services.codebuild.IFileSystemLocation
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import io.cloudshiftdev.awscdk.services.codebuild.LoggingOptions
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Run a script as a CodeBuild Project.
 *
 * The BuildSpec must be available inline--it cannot reference a file
 * on disk. If your current build instructions are in a file like
 * `buildspec.yml` in your repository, extract them to a script
 * (say, `build.sh`) and invoke that script as part of the build:
 *
 * ```
 * CodeBuildStep.Builder.create("Synth")
 * .commands(List.of("./build.sh"))
 * .build();
 * ```
 *
 * Example:
 *
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
public open class CodeBuildStep(
  cdkObject: software.amazon.awscdk.pipelines.CodeBuildStep,
) : ShellStep(cdkObject) {
  public constructor(id: String, props: CodeBuildStepProps) :
      this(software.amazon.awscdk.pipelines.CodeBuildStep(id, props.let(CodeBuildStepProps::unwrap))
  )

  public constructor(id: String, props: CodeBuildStepProps.Builder.() -> Unit) : this(id,
      CodeBuildStepProps(props)
  )

  /**
   * Custom execution role to be used for the Code Build Action.
   *
   * Default: - A role is automatically created
   */
  public open fun actionRole(): IRole? = unwrap(this).getActionRole()?.let(IRole::wrap)

  /**
   * Build environment.
   *
   * Default: - No value specified at construction time, use defaults
   */
  public open fun buildEnvironment(): BuildEnvironment? =
      unwrap(this).getBuildEnvironment()?.let(BuildEnvironment::wrap)

  /**
   * Caching strategy to use.
   *
   * Default: - No cache
   */
  public open fun cache(): Cache? = unwrap(this).getCache()?.let(Cache::wrap)

  /**
   * Reference a CodePipeline variable defined by the CodeBuildStep.
   *
   * The variable must be set in the shell of the CodeBuild step when
   * it finishes its `post_build` phase.
   *
   * Example:
   *
   * ```
   * // Access the output of one CodeBuildStep in another CodeBuildStep
   * CodePipeline pipeline;
   * CodeBuildStep step1 = CodeBuildStep.Builder.create("Step1")
   * .commands(List.of("export MY_VAR=hello"))
   * .build();
   * CodeBuildStep step2 = CodeBuildStep.Builder.create("Step2")
   * .env(Map.of(
   * "IMPORTED_VAR", step1.exportedVariable("MY_VAR")))
   * .commands(List.of("echo $IMPORTED_VAR"))
   * .build();
   * ```
   *
   * @param variableName the name of the variable for reference. 
   */
  public open fun exportedVariable(variableName: String): String =
      unwrap(this).exportedVariable(variableName)

  /**
   * ProjectFileSystemLocation objects for CodeBuild build projects.
   *
   * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
   * mountPoint,
   * and type of a file system created using Amazon Elastic File System.
   *
   * Default: - no file system locations
   */
  public open fun fileSystemLocations(): List<IFileSystemLocation> =
      unwrap(this).getFileSystemLocations()?.map(IFileSystemLocation::wrap) ?: emptyList()

  /**
   * The CodeBuild Project's principal.
   */
  public open fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Information about logs for CodeBuild projects.
   *
   * A CodeBuilde project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
   *
   * Default: - no log configuration is set
   */
  public open fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  /**
   * Additional configuration that can only be configured via BuildSpec.
   *
   * Contains exported variables
   *
   * Default: - Contains the exported variables
   */
  public open fun partialBuildSpec(): BuildSpec? =
      unwrap(this).getPartialBuildSpec()?.let(BuildSpec::wrap)

  /**
   * CodeBuild Project generated for the pipeline.
   *
   * Will only be available after the pipeline has been built.
   */
  public open fun project(): IProject = unwrap(this).getProject().let(IProject::wrap)

  /**
   * Name for the generated CodeBuild project.
   *
   * Default: - No value specified at construction time, use defaults
   */
  public open fun projectName(): String? = unwrap(this).getProjectName()

  /**
   * Custom execution role to be used for the CodeBuild project.
   *
   * Default: - No value specified at construction time, use defaults
   */
  public open fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Policy statements to add to role used during the synth.
   *
   * Default: - No value specified at construction time, use defaults
   */
  public open fun rolePolicyStatements(): List<PolicyStatement> =
      unwrap(this).getRolePolicyStatements()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * Which security group to associate with the script's project network interfaces.
   *
   * Default: - No value specified at construction time, use defaults
   */
  public open fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * Which subnets to use.
   *
   * Default: - No value specified at construction time, use defaults
   */
  public open fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  /**
   * The number of minutes after which AWS CodeBuild stops the build if it's not complete.
   *
   * For valid values, see the timeoutInMinutes field in the AWS
   * CodeBuild User Guide.
   *
   * Default: Duration.hours(1)
   */
  public open fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * The VPC where to execute the SimpleSynth.
   *
   * Default: - No value specified at construction time, use defaults
   */
  public open fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.pipelines.CodeBuildStep].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Custom execution role to be used for the Code Build Action.
     *
     * Default: - A role is automatically created
     *
     * @param actionRole Custom execution role to be used for the Code Build Action. 
     */
    public fun actionRole(actionRole: IRole)

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
     *
     * @param additionalInputs Additional FileSets to put in other directories. 
     */
    public fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>)

    /**
     * Changes to environment.
     *
     * This environment will be combined with the pipeline's default
     * environment.
     *
     * Default: - Use the pipeline's default build environment
     *
     * @param buildEnvironment Changes to environment. 
     */
    public fun buildEnvironment(buildEnvironment: BuildEnvironment)

    /**
     * Changes to environment.
     *
     * This environment will be combined with the pipeline's default
     * environment.
     *
     * Default: - Use the pipeline's default build environment
     *
     * @param buildEnvironment Changes to environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c0d67460631db6a1464a7c950694a77c581cc60122a8dc6698190fbec405f7d")
    public fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit)

    /**
     * Caching strategy to use.
     *
     * Default: - No cache
     *
     * @param cache Caching strategy to use. 
     */
    public fun cache(cache: Cache)

    /**
     * Commands to run.
     *
     * @param commands Commands to run. 
     */
    public fun commands(commands: List<String>)

    /**
     * Commands to run.
     *
     * @param commands Commands to run. 
     */
    public fun commands(vararg commands: String)

    /**
     * Environment variables to set.
     *
     * Default: - No environment variables
     *
     * @param env Environment variables to set. 
     */
    public fun env(env: Map<String, String>)

    /**
     * Set environment variables based on Stack Outputs.
     *
     * `ShellStep`s following stack or stage deployments may
     * access the `CfnOutput`s of those stacks to get access to
     * --for example--automatically generated resource names or
     * endpoint URLs.
     *
     * Default: - No environment variables created from stack outputs
     *
     * @param envFromCfnOutputs Set environment variables based on Stack Outputs. 
     */
    public fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>)

    /**
     * ProjectFileSystemLocation objects for CodeBuild build projects.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects. 
     */
    public fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>)

    /**
     * ProjectFileSystemLocation objects for CodeBuild build projects.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects. 
     */
    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation)

    /**
     * FileSet to run these scripts on.
     *
     * The files in the FileSet will be placed in the working directory when
     * the script is executed. Use `additionalInputs` to download file sets
     * to other directories as well.
     *
     * Default: - No input specified
     *
     * @param input FileSet to run these scripts on. 
     */
    public fun input(input: IFileSetProducer)

    /**
     * Installation commands to run before the regular commands.
     *
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     *
     * Default: - No installation commands
     *
     * @param installCommands Installation commands to run before the regular commands. 
     */
    public fun installCommands(installCommands: List<String>)

    /**
     * Installation commands to run before the regular commands.
     *
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     *
     * Default: - No installation commands
     *
     * @param installCommands Installation commands to run before the regular commands. 
     */
    public fun installCommands(vararg installCommands: String)

    /**
     * Information about logs for CodeBuild projects.
     *
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for CodeBuild projects. 
     */
    public fun logging(logging: LoggingOptions)

    /**
     * Information about logs for CodeBuild projects.
     *
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for CodeBuild projects. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55a8e91d26460c44da1b5d5d0e5128a4868ac5ee7351cfe875fe325980a418ae")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

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
     *
     * @param partialBuildSpec Additional configuration that can only be configured via BuildSpec. 
     */
    public fun partialBuildSpec(partialBuildSpec: BuildSpec)

    /**
     * The directory that will contain the primary output fileset.
     *
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     *
     * Default: - No primary output
     *
     * @param primaryOutputDirectory The directory that will contain the primary output fileset. 
     */
    public fun primaryOutputDirectory(primaryOutputDirectory: String)

    /**
     * Name for the generated CodeBuild project.
     *
     * Default: - Automatically generated
     *
     * @param projectName Name for the generated CodeBuild project. 
     */
    public fun projectName(projectName: String)

    /**
     * Custom execution role to be used for the CodeBuild project.
     *
     * Default: - A role is automatically created
     *
     * @param role Custom execution role to be used for the CodeBuild project. 
     */
    public fun role(role: IRole)

    /**
     * Policy statements to add to role used during the synth.
     *
     * Can be used to add acces to a CodeArtifact repository etc.
     *
     * Default: - No policy statements added to CodeBuild Project Role
     *
     * @param rolePolicyStatements Policy statements to add to role used during the synth. 
     */
    public fun rolePolicyStatements(rolePolicyStatements: List<PolicyStatement>)

    /**
     * Policy statements to add to role used during the synth.
     *
     * Can be used to add acces to a CodeArtifact repository etc.
     *
     * Default: - No policy statements added to CodeBuild Project Role
     *
     * @param rolePolicyStatements Policy statements to add to role used during the synth. 
     */
    public fun rolePolicyStatements(vararg rolePolicyStatements: PolicyStatement)

    /**
     * Which security group to associate with the script's project network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     *
     * @param securityGroups Which security group to associate with the script's project network
     * interfaces. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * Which security group to associate with the script's project network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     *
     * @param securityGroups Which security group to associate with the script's project network
     * interfaces. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Which subnets to use.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - All private subnets.
     *
     * @param subnetSelection Which subnets to use. 
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * Which subnets to use.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - All private subnets.
     *
     * @param subnetSelection Which subnets to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3506bdd5b6d2e846b2e33c681a8e1834c3b5cf5de2a960683ed2d370be406b50")
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
     * The VPC where to execute the SimpleSynth.
     *
     * Default: - No VPC
     *
     * @param vpc The VPC where to execute the SimpleSynth. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.CodeBuildStep.Builder =
        software.amazon.awscdk.pipelines.CodeBuildStep.Builder.create(id)

    /**
     * Custom execution role to be used for the Code Build Action.
     *
     * Default: - A role is automatically created
     *
     * @param actionRole Custom execution role to be used for the Code Build Action. 
     */
    override fun actionRole(actionRole: IRole) {
      cdkBuilder.actionRole(actionRole.let(IRole::unwrap))
    }

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
     *
     * @param additionalInputs Additional FileSets to put in other directories. 
     */
    override fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>) {
      cdkBuilder.additionalInputs(additionalInputs.mapValues{IFileSetProducer.unwrap(it.value)})
    }

    /**
     * Changes to environment.
     *
     * This environment will be combined with the pipeline's default
     * environment.
     *
     * Default: - Use the pipeline's default build environment
     *
     * @param buildEnvironment Changes to environment. 
     */
    override fun buildEnvironment(buildEnvironment: BuildEnvironment) {
      cdkBuilder.buildEnvironment(buildEnvironment.let(BuildEnvironment::unwrap))
    }

    /**
     * Changes to environment.
     *
     * This environment will be combined with the pipeline's default
     * environment.
     *
     * Default: - Use the pipeline's default build environment
     *
     * @param buildEnvironment Changes to environment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c0d67460631db6a1464a7c950694a77c581cc60122a8dc6698190fbec405f7d")
    override fun buildEnvironment(buildEnvironment: BuildEnvironment.Builder.() -> Unit): Unit =
        buildEnvironment(BuildEnvironment(buildEnvironment))

    /**
     * Caching strategy to use.
     *
     * Default: - No cache
     *
     * @param cache Caching strategy to use. 
     */
    override fun cache(cache: Cache) {
      cdkBuilder.cache(cache.let(Cache::unwrap))
    }

    /**
     * Commands to run.
     *
     * @param commands Commands to run. 
     */
    override fun commands(commands: List<String>) {
      cdkBuilder.commands(commands)
    }

    /**
     * Commands to run.
     *
     * @param commands Commands to run. 
     */
    override fun commands(vararg commands: String): Unit = commands(commands.toList())

    /**
     * Environment variables to set.
     *
     * Default: - No environment variables
     *
     * @param env Environment variables to set. 
     */
    override fun env(env: Map<String, String>) {
      cdkBuilder.env(env)
    }

    /**
     * Set environment variables based on Stack Outputs.
     *
     * `ShellStep`s following stack or stage deployments may
     * access the `CfnOutput`s of those stacks to get access to
     * --for example--automatically generated resource names or
     * endpoint URLs.
     *
     * Default: - No environment variables created from stack outputs
     *
     * @param envFromCfnOutputs Set environment variables based on Stack Outputs. 
     */
    override fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>) {
      cdkBuilder.envFromCfnOutputs(envFromCfnOutputs.mapValues{CfnOutput.unwrap(it.value)})
    }

    /**
     * ProjectFileSystemLocation objects for CodeBuild build projects.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects. 
     */
    override fun fileSystemLocations(fileSystemLocations: List<IFileSystemLocation>) {
      cdkBuilder.fileSystemLocations(fileSystemLocations.map(IFileSystemLocation::unwrap))
    }

    /**
     * ProjectFileSystemLocation objects for CodeBuild build projects.
     *
     * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     * mountPoint,
     * and type of a file system created using Amazon Elastic File System.
     *
     * Default: - no file system locations
     *
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects. 
     */
    override fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation): Unit =
        fileSystemLocations(fileSystemLocations.toList())

    /**
     * FileSet to run these scripts on.
     *
     * The files in the FileSet will be placed in the working directory when
     * the script is executed. Use `additionalInputs` to download file sets
     * to other directories as well.
     *
     * Default: - No input specified
     *
     * @param input FileSet to run these scripts on. 
     */
    override fun input(input: IFileSetProducer) {
      cdkBuilder.input(input.let(IFileSetProducer::unwrap))
    }

    /**
     * Installation commands to run before the regular commands.
     *
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     *
     * Default: - No installation commands
     *
     * @param installCommands Installation commands to run before the regular commands. 
     */
    override fun installCommands(installCommands: List<String>) {
      cdkBuilder.installCommands(installCommands)
    }

    /**
     * Installation commands to run before the regular commands.
     *
     * For deployment engines that support it, install commands will be classified
     * differently in the job history from the regular `commands`.
     *
     * Default: - No installation commands
     *
     * @param installCommands Installation commands to run before the regular commands. 
     */
    override fun installCommands(vararg installCommands: String): Unit =
        installCommands(installCommands.toList())

    /**
     * Information about logs for CodeBuild projects.
     *
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for CodeBuild projects. 
     */
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    /**
     * Information about logs for CodeBuild projects.
     *
     * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     *
     * Default: - no log configuration is set
     *
     * @param logging Information about logs for CodeBuild projects. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55a8e91d26460c44da1b5d5d0e5128a4868ac5ee7351cfe875fe325980a418ae")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

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
     *
     * @param partialBuildSpec Additional configuration that can only be configured via BuildSpec. 
     */
    override fun partialBuildSpec(partialBuildSpec: BuildSpec) {
      cdkBuilder.partialBuildSpec(partialBuildSpec.let(BuildSpec::unwrap))
    }

    /**
     * The directory that will contain the primary output fileset.
     *
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     *
     * Default: - No primary output
     *
     * @param primaryOutputDirectory The directory that will contain the primary output fileset. 
     */
    override fun primaryOutputDirectory(primaryOutputDirectory: String) {
      cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
    }

    /**
     * Name for the generated CodeBuild project.
     *
     * Default: - Automatically generated
     *
     * @param projectName Name for the generated CodeBuild project. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * Custom execution role to be used for the CodeBuild project.
     *
     * Default: - A role is automatically created
     *
     * @param role Custom execution role to be used for the CodeBuild project. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * Policy statements to add to role used during the synth.
     *
     * Can be used to add acces to a CodeArtifact repository etc.
     *
     * Default: - No policy statements added to CodeBuild Project Role
     *
     * @param rolePolicyStatements Policy statements to add to role used during the synth. 
     */
    override fun rolePolicyStatements(rolePolicyStatements: List<PolicyStatement>) {
      cdkBuilder.rolePolicyStatements(rolePolicyStatements.map(PolicyStatement::unwrap))
    }

    /**
     * Policy statements to add to role used during the synth.
     *
     * Can be used to add acces to a CodeArtifact repository etc.
     *
     * Default: - No policy statements added to CodeBuild Project Role
     *
     * @param rolePolicyStatements Policy statements to add to role used during the synth. 
     */
    override fun rolePolicyStatements(vararg rolePolicyStatements: PolicyStatement): Unit =
        rolePolicyStatements(rolePolicyStatements.toList())

    /**
     * Which security group to associate with the script's project network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     *
     * @param securityGroups Which security group to associate with the script's project network
     * interfaces. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * Which security group to associate with the script's project network interfaces.
     *
     * If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - Security group will be automatically created.
     *
     * @param securityGroups Which security group to associate with the script's project network
     * interfaces. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Which subnets to use.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - All private subnets.
     *
     * @param subnetSelection Which subnets to use. 
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * Which subnets to use.
     *
     * Only used if 'vpc' is supplied.
     *
     * Default: - All private subnets.
     *
     * @param subnetSelection Which subnets to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3506bdd5b6d2e846b2e33c681a8e1834c3b5cf5de2a960683ed2d370be406b50")
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
     * The VPC where to execute the SimpleSynth.
     *
     * Default: - No VPC
     *
     * @param vpc The VPC where to execute the SimpleSynth. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.CodeBuildStep = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}): CodeBuildStep {
      val builderImpl = BuilderImpl(id)
      return CodeBuildStep(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.CodeBuildStep): CodeBuildStep =
        CodeBuildStep(cdkObject)

    internal fun unwrap(wrapped: CodeBuildStep): software.amazon.awscdk.pipelines.CodeBuildStep =
        wrapped.cdkObject as software.amazon.awscdk.pipelines.CodeBuildStep
  }
}
