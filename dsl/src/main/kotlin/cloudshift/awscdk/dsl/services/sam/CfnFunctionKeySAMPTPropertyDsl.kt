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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionKeySAMPTPropertyDsl {
    private val cdkBuilder: CfnFunction.KeySAMPTProperty.Builder =
        CfnFunction.KeySAMPTProperty.builder()

    public fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
    }

    public fun build(): CfnFunction.KeySAMPTProperty = cdkBuilder.build()
}
