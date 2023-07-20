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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.KeyContextResponse
import kotlin.String

@CdkDslMarker
public class KeyContextResponseDsl {
    private val cdkBuilder: KeyContextResponse.Builder = KeyContextResponse.builder()

    public fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
    }

    public fun build(): KeyContextResponse = cdkBuilder.build()
}
