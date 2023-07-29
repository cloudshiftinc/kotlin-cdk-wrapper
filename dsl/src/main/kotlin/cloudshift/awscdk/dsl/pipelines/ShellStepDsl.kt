@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.pipelines.IFileSetProducer
import software.amazon.awscdk.pipelines.ShellStep

/**
 * Run shell script commands in the pipeline.
 *
 * This is a generic step designed to be deployment engine agnostic.
 *
 * Example:
 * ```
 * Pipeline codePipeline;
 * Artifact sourceArtifact = new Artifact("MySourceArtifact");
 * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
 * .codePipeline(codePipeline)
 * .synth(ShellStep.Builder.create("Synth")
 * .input(CodePipelineFileSet.fromArtifact(sourceArtifact))
 * .commands(List.of("npm ci", "npm run build", "npx cdk synth"))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ShellStepDsl(
    id: String,
) {
    private val cdkBuilder: ShellStep.Builder = ShellStep.Builder.create(id)

    private val _commands: MutableList<String> = mutableListOf()

    private val _installCommands: MutableList<String> = mutableListOf()

    /**
     * Additional FileSets to put in other directories.
     *
     * Specifies a mapping from directory name to FileSets. During the script execution, the
     * FileSets will be available in the directories indicated.
     *
     * The directory names may be relative. For example, you can put the main input and an
     * additional input side-by-side with the following configuration:
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
    public fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>) {
        cdkBuilder.additionalInputs(additionalInputs)
    }

    /**
     * Commands to run.
     *
     * @param commands Commands to run.
     */
    public fun commands(vararg commands: String) {
        _commands.addAll(listOf(*commands))
    }

    /**
     * Commands to run.
     *
     * @param commands Commands to run.
     */
    public fun commands(commands: Collection<String>) {
        _commands.addAll(commands)
    }

    /**
     * Environment variables to set.
     *
     * Default: - No environment variables
     *
     * @param env Environment variables to set.
     */
    public fun env(env: Map<String, String>) {
        cdkBuilder.env(env)
    }

    /**
     * Set environment variables based on Stack Outputs.
     *
     * `ShellStep`s following stack or stage deployments may access the `CfnOutput`s of those stacks
     * to get access to --for example--automatically generated resource names or endpoint URLs.
     *
     * Default: - No environment variables created from stack outputs
     *
     * @param envFromCfnOutputs Set environment variables based on Stack Outputs.
     */
    public fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>) {
        cdkBuilder.envFromCfnOutputs(envFromCfnOutputs)
    }

    /**
     * FileSet to run these scripts on.
     *
     * The files in the FileSet will be placed in the working directory when the script is executed.
     * Use `additionalInputs` to download file sets to other directories as well.
     *
     * Default: - No input specified
     *
     * @param input FileSet to run these scripts on.
     */
    public fun input(input: IFileSetProducer) {
        cdkBuilder.input(input)
    }

    /**
     * Installation commands to run before the regular commands.
     *
     * For deployment engines that support it, install commands will be classified differently in
     * the job history from the regular `commands`.
     *
     * Default: - No installation commands
     *
     * @param installCommands Installation commands to run before the regular commands.
     */
    public fun installCommands(vararg installCommands: String) {
        _installCommands.addAll(listOf(*installCommands))
    }

    /**
     * Installation commands to run before the regular commands.
     *
     * For deployment engines that support it, install commands will be classified differently in
     * the job history from the regular `commands`.
     *
     * Default: - No installation commands
     *
     * @param installCommands Installation commands to run before the regular commands.
     */
    public fun installCommands(installCommands: Collection<String>) {
        _installCommands.addAll(installCommands)
    }

    /**
     * The directory that will contain the primary output fileset.
     *
     * After running the script, the contents of the given directory will be treated as the primary
     * output of this Step.
     *
     * Default: - No primary output
     *
     * @param primaryOutputDirectory The directory that will contain the primary output fileset.
     */
    public fun primaryOutputDirectory(primaryOutputDirectory: String) {
        cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
    }

    public fun build(): ShellStep {
        if (_commands.isNotEmpty()) cdkBuilder.commands(_commands)
        if (_installCommands.isNotEmpty()) cdkBuilder.installCommands(_installCommands)
        return cdkBuilder.build()
    }
}
