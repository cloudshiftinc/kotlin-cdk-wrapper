@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.CdkCommand
import kotlin.Boolean
import kotlin.String

/**
 * Represents a cdk command i.e. `synth`, `deploy`, &amp; `destroy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * CdkCommand cdkCommand = CdkCommand.builder()
 * .enabled(false)
 * .expectedMessage("expectedMessage")
 * .expectError(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class CdkCommandDsl {
    private val cdkBuilder: CdkCommand.Builder = CdkCommand.builder()

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

    public fun build(): CdkCommand = cdkBuilder.build()
}
