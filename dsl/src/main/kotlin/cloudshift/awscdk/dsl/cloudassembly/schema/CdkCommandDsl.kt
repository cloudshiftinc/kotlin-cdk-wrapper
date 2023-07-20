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
import software.amazon.awscdk.cloudassembly.schema.CdkCommand
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CdkCommandDsl {
    private val cdkBuilder: CdkCommand.Builder = CdkCommand.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun expectError(expectError: Boolean) {
        cdkBuilder.expectError(expectError)
    }

    public fun expectedMessage(expectedMessage: String) {
        cdkBuilder.expectedMessage(expectedMessage)
    }

    public fun build(): CdkCommand = cdkBuilder.build()
}
