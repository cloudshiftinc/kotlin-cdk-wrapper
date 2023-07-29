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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.CdkCommands
import software.amazon.awscdk.cloudassembly.schema.DeployCommand
import software.amazon.awscdk.cloudassembly.schema.DestroyCommand

/**
 * Options for specific cdk commands that are run as part of the integration test workflow.
 *
 * Example:
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
public class CdkCommandsDsl {
    private val cdkBuilder: CdkCommands.Builder = CdkCommands.builder()

    /** @param deploy Options to for the cdk deploy command. */
    public fun deploy(deploy: DeployCommandDsl.() -> Unit = {}) {
        val builder = DeployCommandDsl()
        builder.apply(deploy)
        cdkBuilder.deploy(builder.build())
    }

    /** @param deploy Options to for the cdk deploy command. */
    public fun deploy(deploy: DeployCommand) {
        cdkBuilder.deploy(deploy)
    }

    /** @param destroy Options to for the cdk destroy command. */
    public fun destroy(destroy: DestroyCommandDsl.() -> Unit = {}) {
        val builder = DestroyCommandDsl()
        builder.apply(destroy)
        cdkBuilder.destroy(builder.build())
    }

    /** @param destroy Options to for the cdk destroy command. */
    public fun destroy(destroy: DestroyCommand) {
        cdkBuilder.destroy(destroy)
    }

    public fun build(): CdkCommands = cdkBuilder.build()
}
