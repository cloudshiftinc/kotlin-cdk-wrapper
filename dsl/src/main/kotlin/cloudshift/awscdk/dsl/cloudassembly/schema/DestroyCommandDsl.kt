@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.DestroyCommand
import software.amazon.awscdk.cloudassembly.schema.DestroyOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Represents a cdk destroy command.
 *
 * Example:
 *
 * ```
 * App app = new App();
 * Stack stackUnderTest = new Stack(app, "StackUnderTest");
 * Stack stack = new Stack(app, "stack");
 * IntegTest testCase = IntegTest.Builder.create(app, "CustomizedDeploymentWorkflow")
 * .testCases(List.of(stackUnderTest))
 * .diffAssets(true)
 * .stackUpdateWorkflow(true)
 * .cdkCommandOptions(CdkCommands.builder()
 * .deploy(DeployCommand.builder()
 * .args(DeployOptions.builder()
 * .requireApproval(RequireApproval.NEVER)
 * .json(true)
 * .build())
 * .build())
 * .destroy(DestroyCommand.builder()
 * .args(DestroyOptions.builder()
 * .force(true)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DestroyCommandDsl {
    private val cdkBuilder: DestroyCommand.Builder = DestroyCommand.builder()

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    public fun args(args: DestroyOptionsDsl.() -> Unit = {}) {
        val builder = DestroyOptionsDsl()
        builder.apply(args)
        cdkBuilder.args(builder.build())
    }

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    public fun args(args: DestroyOptions) {
        cdkBuilder.args(args)
    }

    /**
     * @param enabled Whether or not to run this command as part of the workflow This can be used if
     * you only want to test some of the workflow for example enable `synth` and disable `deploy` &amp;
     * `destroy` in order to limit the test to synthesis.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param expectError If the runner should expect this command to fail.
     */
    public fun expectError(expectError: Boolean) {
        cdkBuilder.expectError(expectError)
    }

    /**
     * @param expectedMessage This can be used in combination with `expectedError` to validate that a
     * specific message is returned.
     */
    public fun expectedMessage(expectedMessage: String) {
        cdkBuilder.expectedMessage(expectedMessage)
    }

    public fun build(): DestroyCommand = cdkBuilder.build()
}
