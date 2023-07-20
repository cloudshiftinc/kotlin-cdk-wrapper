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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.CdkCommands
import software.amazon.awscdk.cloudassembly.schema.DeployCommand
import software.amazon.awscdk.cloudassembly.schema.DestroyCommand
import kotlin.Unit

@CdkDslMarker
public class CdkCommandsDsl {
    private val cdkBuilder: CdkCommands.Builder = CdkCommands.builder()

    public fun deploy(block: DeployCommandDsl.() -> Unit = {}) {
        val builder = DeployCommandDsl()
        builder.apply(block)
        cdkBuilder.deploy(builder.build())
    }

    public fun deploy(deploy: DeployCommand) {
        cdkBuilder.deploy(deploy)
    }

    public fun destroy(block: DestroyCommandDsl.() -> Unit = {}) {
        val builder = DestroyCommandDsl()
        builder.apply(block)
        cdkBuilder.destroy(builder.build())
    }

    public fun destroy(destroy: DestroyCommand) {
        cdkBuilder.destroy(destroy)
    }

    public fun build(): CdkCommands = cdkBuilder.build()
}
