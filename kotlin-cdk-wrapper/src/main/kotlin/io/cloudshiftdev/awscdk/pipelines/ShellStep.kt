@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Run shell script commands in the pipeline.
 *
 * This is a generic step designed
 * to be deployment engine agnostic.
 *
 * Example:
 *
 * ```
 * // Modern API
 * CodePipeline modernPipeline = CodePipeline.Builder.create(this, "Pipeline")
 * .selfMutation(false)
 * .synth(ShellStep.Builder.create("Synth")
 * .input(CodePipelineSource.connection("my-org/my-app", "main", ConnectionSourceOptions.builder()
 * .connectionArn("arn:aws:codestar-connections:us-east-1:222222222222:connection/7d2469ff-514a-4e4f-9003-5ca4a43cdc41")
 * .build()))
 * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
 * .build())
 * .build();
 * // Original API
 * Artifact cloudAssemblyArtifact = new Artifact();
 * CdkPipeline originalPipeline = new CdkPipeline(this, "Pipeline", new CdkPipelineProps()
 * .selfMutating(false)
 * .cloudAssemblyArtifact(cloudAssemblyArtifact)
 * );
 * ```
 */
public open class ShellStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.ShellStep,
) : Step(cdkObject) {
  public constructor(id: String, props: ShellStepProps) :
      this(software.amazon.awscdk.pipelines.ShellStep(id, props.let(ShellStepProps::unwrap))
  )

  public constructor(id: String, props: ShellStepProps.Builder.() -> Unit) : this(id,
      ShellStepProps(props)
  )

  /**
   * Add an additional output FileSet based on a directory.
   *
   * After running the script, the contents of the given directory
   * will be exported as a `FileSet`. Use the `FileSet` as the
   * input to another step.
   *
   * Multiple calls with the exact same directory name string (not normalized)
   * will return the same FileSet.
   *
   * @param directory 
   */
  public open fun addOutputDirectory(directory: String): FileSet =
      unwrap(this).addOutputDirectory(directory).let(FileSet::wrap)

  /**
   * Commands to run.
   */
  public open fun commands(): List<String> = unwrap(this).getCommands()

  /**
   * StackOutputReferences this step consumes.
   */
  public override fun consumedStackOutputs(): List<StackOutputReference> =
      unwrap(this).getConsumedStackOutputs().map(StackOutputReference::wrap)

  /**
   * Environment variables to set.
   *
   * Default: - No environment variables
   */
  public open fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

  /**
   * Set environment variables based on Stack Outputs.
   *
   * Default: - No environment variables created from stack outputs
   */
  public open fun envFromCfnOutputs(): Map<String, StackOutputReference> =
      unwrap(this).getEnvFromCfnOutputs().mapValues{StackOutputReference.wrap(it.value)}

  /**
   * Input FileSets.
   *
   * A list of `(FileSet, directory)` pairs, which are a copy of the
   * input properties. This list should not be modified directly.
   */
  public open fun inputs(): List<FileSetLocation> =
      unwrap(this).getInputs().map(FileSetLocation::wrap)

  /**
   * Installation commands to run before the regular commands.
   *
   * For deployment engines that support it, install commands will be classified
   * differently in the job history from the regular `commands`.
   *
   * Default: - No installation commands
   */
  public open fun installCommands(): List<String> = unwrap(this).getInstallCommands()

  /**
   * Output FileSets.
   *
   * A list of `(FileSet, directory)` pairs, which are a copy of the
   * input properties. This list should not be modified directly.
   */
  public open fun outputs(): List<FileSetLocation> =
      unwrap(this).getOutputs().map(FileSetLocation::wrap)

  /**
   * Configure the given output directory as primary output.
   *
   * If no primary output has been configured yet, this directory
   * will become the primary output of this ShellStep, otherwise this
   * method will throw if the given directory is different than the
   * currently configured primary output directory.
   *
   * @param directory 
   */
  public open fun primaryOutputDirectory(directory: String): FileSet =
      unwrap(this).primaryOutputDirectory(directory).let(FileSet::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.pipelines.ShellStep].
   */
  @CdkDslMarker
  public interface Builder {
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
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ShellStep.Builder =
        software.amazon.awscdk.pipelines.ShellStep.Builder.create(id)

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

    public fun build(): software.amazon.awscdk.pipelines.ShellStep = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}): ShellStep {
      val builderImpl = BuilderImpl(id)
      return ShellStep(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ShellStep): ShellStep =
        ShellStep(cdkObject)

    internal fun unwrap(wrapped: ShellStep): software.amazon.awscdk.pipelines.ShellStep =
        wrapped.cdkObject
  }
}
