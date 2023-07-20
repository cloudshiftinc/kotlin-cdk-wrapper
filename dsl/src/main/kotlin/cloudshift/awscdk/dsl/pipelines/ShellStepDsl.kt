@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnOutput
import software.amazon.awscdk.pipelines.IFileSetProducer
import software.amazon.awscdk.pipelines.ShellStep
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class ShellStepDsl(
    id: String,
) {
    private val cdkBuilder: ShellStep.Builder = ShellStep.Builder.create(id)

    private val _commands: MutableList<String> = mutableListOf()

    private val _installCommands: MutableList<String> = mutableListOf()

    public fun additionalInputs(additionalInputs: Map<String, IFileSetProducer>) {
        cdkBuilder.additionalInputs(additionalInputs)
    }

    public fun commands(vararg commands: String) {
        _commands.addAll(listOf(*commands))
    }

    public fun commands(commands: Collection<String>) {
        _commands.addAll(commands)
    }

    public fun env(env: Map<String, String>) {
        cdkBuilder.env(env)
    }

    public fun envFromCfnOutputs(envFromCfnOutputs: Map<String, CfnOutput>) {
        cdkBuilder.envFromCfnOutputs(envFromCfnOutputs)
    }

    public fun input(input: IFileSetProducer) {
        cdkBuilder.input(input)
    }

    public fun installCommands(vararg installCommands: String) {
        _installCommands.addAll(listOf(*installCommands))
    }

    public fun installCommands(installCommands: Collection<String>) {
        _installCommands.addAll(installCommands)
    }

    public fun primaryOutputDirectory(primaryOutputDirectory: String) {
        cdkBuilder.primaryOutputDirectory(primaryOutputDirectory)
    }

    public fun build(): ShellStep {
        if (_commands.isNotEmpty()) cdkBuilder.commands(_commands)
        if (_installCommands.isNotEmpty()) cdkBuilder.installCommands(_installCommands)
        return cdkBuilder.build()
    }
}
