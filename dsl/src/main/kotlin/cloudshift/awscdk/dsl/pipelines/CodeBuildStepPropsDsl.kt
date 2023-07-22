@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.codebuild.BuildEnvironmentDsl
import cloudshift.awscdk.dsl.services.codebuild.LoggingOptionsDsl
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.Duration
import software.amazon.awscdk.pipelines.CodeBuildStepProps
import software.amazon.awscdk.pipelines.IFileSetProducer
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildSpec
import software.amazon.awscdk.services.codebuild.Cache
import software.amazon.awscdk.services.codebuild.IFileSystemLocation
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.PolicyStatement

/**
 * Construction props for a CodeBuildStep.
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
@CdkDslMarker
public class CodeBuildStepPropsDsl {
  private val cdkBuilder: CodeBuildStepProps.Builder = CodeBuildStepProps.builder()

  private val _commands: MutableList<String> = mutableListOf()

  private val _fileSystemLocations: MutableList<IFileSystemLocation> = mutableListOf()

  private val _installCommands: MutableList<String> = mutableListOf()

  private val _rolePolicyStatements: MutableList<PolicyStatement> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param actionRole Custom execution role to be used for the Code Build Action.
   */
  public fun actionRole(actionRole: IRole) {
    cdkBuilder.actionRole(actionRole)
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
  public fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>) {
    cdkBuilder.additionalInputs(additionalInputs)
  }

  /**
   * @param buildEnvironment Changes to environment.
   * This environment will be combined with the pipeline's default
   * environment.
   */
  public fun buildEnvironment(buildEnvironment: BuildEnvironmentDsl.() -> Unit = {}) {
    val builder = BuildEnvironmentDsl()
    builder.apply(buildEnvironment)
    cdkBuilder.buildEnvironment(builder.build())
  }

  /**
   * @param buildEnvironment Changes to environment.
   * This environment will be combined with the pipeline's default
   * environment.
   */
  public fun buildEnvironment(buildEnvironment: BuildEnvironment) {
    cdkBuilder.buildEnvironment(buildEnvironment)
  }

  /**
   * @param cache Caching strategy to use.
   */
  public fun cache(cache: Cache) {
    cdkBuilder.cache(cache)
  }

  /**
   * @param commands Commands to run. 
   */
  public fun commands(vararg commands: String) {
    _commands.addAll(listOf(*commands))
  }

  /**
   * @param commands Commands to run. 
   */
  public fun commands(commands: Collection<String>) {
    _commands.addAll(commands)
  }

  /**
   * @param env Environment variables to set.
   */
  public fun env(env: Map<String, String>) {
    cdkBuilder.env(env)
  }

  /**
   * @param envFromCfnOutputs Set environment variables based on Stack Outputs.
   * `ShellStep`s following stack or stage deployments may
   * access the `CfnOutput`s of those stacks to get access to
   * --for example--automatically generated resource names or
   * endpoint URLs.
   */
  public fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>) {
    cdkBuilder.envFromCfnOutputs(envFromCfnOutputs)
  }

  /**
   * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
   * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
   * mountPoint,
   * and type of a file system created using Amazon Elastic File System.
   */
  public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation) {
    _fileSystemLocations.addAll(listOf(*fileSystemLocations))
  }

  /**
   * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects.
   * A ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
   * mountPoint,
   * and type of a file system created using Amazon Elastic File System.
   */
  public fun fileSystemLocations(fileSystemLocations: Collection<IFileSystemLocation>) {
    _fileSystemLocations.addAll(fileSystemLocations)
  }

  /**
   * @param input FileSet to run these scripts on.
   * The files in the FileSet will be placed in the working directory when
   * the script is executed. Use `additionalInputs` to download file sets
   * to other directories as well.
   */
  public fun input(input: IFileSetProducer) {
    cdkBuilder.input(input)
  }

  /**
   * @param installCommands Installation commands to run before the regular commands.
   * For deployment engines that support it, install commands will be classified
   * differently in the job history from the regular `commands`.
   */
  public fun installCommands(vararg installCommands: String) {
    _installCommands.addAll(listOf(*installCommands))
  }

  /**
   * @param installCommands Installation commands to run before the regular commands.
   * For deployment engines that support it, install commands will be classified
   * differently in the job history from the regular `commands`.
   */
  public fun installCommands(installCommands: Collection<String>) {
    _installCommands.addAll(installCommands)
  }

  /**
   * @param logging Information about logs for CodeBuild projects.
   * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
   */
  public fun logging(logging: LoggingOptionsDsl.() -> Unit = {}) {
    val builder = LoggingOptionsDsl()
    builder.apply(logging)
    cdkBuilder.logging(builder.build())
  }

  /**
   * @param logging Information about logs for CodeBuild projects.
   * A CodeBuild project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both.
   */
  public fun logging(logging: LoggingOptions) {
    cdkBuilder.logging(logging)
  }

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
  public fun partialBuildSpec(partialBuildSpec: BuildSpec) {
    cdkBuilder.partialBuildSpec(partialBuildSpec)
  }

  /**
   * @param primaryOutputDirectory The directory that will contain the primary output fileset.
   * After running the script, the contents of the given directory
   * will be treated as the primary output of this Step.
   */
  public fun primaryOutputDirectory(primaryOutputDirectory: String) {
    cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
  }

  /**
   * @param projectName Name for the generated CodeBuild project.
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  /**
   * @param role Custom execution role to be used for the CodeBuild project.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param rolePolicyStatements Policy statements to add to role used during the synth.
   * Can be used to add acces to a CodeArtifact repository etc.
   */
  public fun rolePolicyStatements(rolePolicyStatements: PolicyStatementDsl.() -> Unit) {
    _rolePolicyStatements.add(PolicyStatementDsl().apply(rolePolicyStatements).build())
  }

  /**
   * @param rolePolicyStatements Policy statements to add to role used during the synth.
   * Can be used to add acces to a CodeArtifact repository etc.
   */
  public fun rolePolicyStatements(rolePolicyStatements: Collection<PolicyStatement>) {
    _rolePolicyStatements.addAll(rolePolicyStatements)
  }

  /**
   * @param securityGroups Which security group to associate with the script's project network
   * interfaces.
   * If no security group is identified, one will be created automatically.
   *
   * Only used if 'vpc' is supplied.
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups Which security group to associate with the script's project network
   * interfaces.
   * If no security group is identified, one will be created automatically.
   *
   * Only used if 'vpc' is supplied.
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param subnetSelection Which subnets to use.
   * Only used if 'vpc' is supplied.
   */
  public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnetSelection)
    cdkBuilder.subnetSelection(builder.build())
  }

  /**
   * @param subnetSelection Which subnets to use.
   * Only used if 'vpc' is supplied.
   */
  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  /**
   * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
   * complete.
   * For valid values, see the timeoutInMinutes field in the AWS
   * CodeBuild User Guide.
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param vpc The VPC where to execute the SimpleSynth.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): CodeBuildStepProps {
    if(_commands.isNotEmpty()) cdkBuilder.commands(_commands)
    if(_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
    if(_installCommands.isNotEmpty()) cdkBuilder.installCommands(_installCommands)
    if(_rolePolicyStatements.isNotEmpty()) cdkBuilder.rolePolicyStatements(_rolePolicyStatements)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
