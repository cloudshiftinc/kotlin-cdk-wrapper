@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.pipelines.IFileSetProducer
import software.amazon.awscdk.pipelines.ShellStepProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

/**
 * Construction properties for a `ShellStep`.
 *
 * Example:
 *
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
public class ShellStepPropsDsl {
    private val cdkBuilder: ShellStepProps.Builder = ShellStepProps.builder()

    private val _commands: MutableList<String> = mutableListOf()

    private val _installCommands: MutableList<String> = mutableListOf()

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
     * @param primaryOutputDirectory The directory that will contain the primary output fileset.
     * After running the script, the contents of the given directory
     * will be treated as the primary output of this Step.
     */
    public fun primaryOutputDirectory(primaryOutputDirectory: String) {
        cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
    }

    public fun build(): ShellStepProps {
        if (_commands.isNotEmpty()) cdkBuilder.commands(_commands)
        if (_installCommands.isNotEmpty()) cdkBuilder.installCommands(_installCommands)
        return cdkBuilder.build()
    }
}
