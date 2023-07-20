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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.CfnStorageLens
import kotlin.String

@CdkDslMarker
public class CfnStorageLensSSEKMSPropertyDsl {
    private val cdkBuilder: CfnStorageLens.SSEKMSProperty.Builder =
        CfnStorageLens.SSEKMSProperty.builder()

    public fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
    }

    public fun build(): CfnStorageLens.SSEKMSProperty = cdkBuilder.build()
}
