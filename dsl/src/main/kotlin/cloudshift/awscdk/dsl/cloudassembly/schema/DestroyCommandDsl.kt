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
import software.amazon.awscdk.cloudassembly.schema.DestroyCommand
import software.amazon.awscdk.cloudassembly.schema.DestroyOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class DestroyCommandDsl {
    private val cdkBuilder: DestroyCommand.Builder = DestroyCommand.builder()

    public fun args(block: DestroyOptionsDsl.() -> Unit = {}) {
        val builder = DestroyOptionsDsl()
        builder.apply(block)
        cdkBuilder.args(builder.build())
    }

    public fun args(args: DestroyOptions) {
        cdkBuilder.args(args)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun expectError(expectError: Boolean) {
        cdkBuilder.expectError(expectError)
    }

    public fun expectedMessage(expectedMessage: String) {
        cdkBuilder.expectedMessage(expectedMessage)
    }

    public fun build(): DestroyCommand = cdkBuilder.build()
}
