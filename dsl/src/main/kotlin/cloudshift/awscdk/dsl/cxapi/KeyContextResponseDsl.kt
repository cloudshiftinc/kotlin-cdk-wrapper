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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.KeyContextResponse

/**
 * Properties of a discovered key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * KeyContextResponse keyContextResponse = KeyContextResponse.builder()
 * .keyId("keyId")
 * .build();
 * ```
 */
@CdkDslMarker
public class KeyContextResponseDsl {
    private val cdkBuilder: KeyContextResponse.Builder = KeyContextResponse.builder()

    /** @param keyId Id of the key. */
    public fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
    }

    public fun build(): KeyContextResponse = cdkBuilder.build()
}
