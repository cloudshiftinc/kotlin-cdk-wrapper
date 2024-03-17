@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CfnOutput
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Construction properties for a `ShellStep`.
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
public interface ShellStepProps {
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
  public fun additionalInputs(): Map<String, IFileSetProducer> =
      unwrap(this).getAdditionalInputs()?.mapValues{IFileSetProducer.wrap(it.value)} ?: emptyMap()

  /**
   * Commands to run.
   */
  public fun commands(): List<String>

  /**
   * Environment variables to set.
   *
   * Default: - No environment variables
   */
  public fun env(): Map<String, String> = unwrap(this).getEnv() ?: emptyMap()

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
  public fun envFromCfnOutputs(): Map<String, CfnOutput> =
      unwrap(this).getEnvFromCfnOutputs()?.mapValues{CfnOutput.wrap(it.value)} ?: emptyMap()

  /**
   * FileSet to run these scripts on.
   *
   * The files in the FileSet will be placed in the working directory when
   * the script is executed. Use `additionalInputs` to download file sets
   * to other directories as well.
   *
   * Default: - No input specified
   */
  public fun input(): IFileSetProducer? = unwrap(this).getInput()?.let(IFileSetProducer::wrap)

  /**
   * Installation commands to run before the regular commands.
   *
   * For deployment engines that support it, install commands will be classified
   * differently in the job history from the regular `commands`.
   *
   * Default: - No installation commands
   */
  public fun installCommands(): List<String> = unwrap(this).getInstallCommands() ?: emptyList()

  /**
   * The directory that will contain the primary output fileset.
   *
   * After running the script, the contents of the given directory
   * will be treated as the primary output of this Step.
   *
   * Default: - No primary output
   */
  public fun primaryOutputDirectory(): String? = unwrap(this).getPrimaryOutputDirectory()

  /**
   * A builder for [ShellStepProps]
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param primaryOutputDirectory The directory that will contain the primary output fileset.
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     */
    public fun primaryOutputDirectory(primaryOutputDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ShellStepProps.Builder =
        software.amazon.awscdk.pipelines.ShellStepProps.builder()

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
     * @param primaryOutputDirectory The directory that will contain the primary output fileset.
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     */
    override fun primaryOutputDirectory(primaryOutputDirectory: String) {
      cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
    }

    public fun build(): software.amazon.awscdk.pipelines.ShellStepProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ShellStepProps,
  ) : CdkObject(cdkObject), ShellStepProps {
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
     * The directory that will contain the primary output fileset.
     *
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     *
     * Default: - No primary output
     */
    override fun primaryOutputDirectory(): String? = unwrap(this).getPrimaryOutputDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ShellStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ShellStepProps): ShellStepProps =
        CdkObjectWrappers.wrap(cdkObject) as? ShellStepProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ShellStepProps): software.amazon.awscdk.pipelines.ShellStepProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.pipelines.ShellStepProps
  }
}
