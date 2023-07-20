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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnMLTransform
import kotlin.String

@CdkDslMarker
public class CfnMLTransformMLUserDataEncryptionPropertyDsl {
    private val cdkBuilder: CfnMLTransform.MLUserDataEncryptionProperty.Builder =
        CfnMLTransform.MLUserDataEncryptionProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun mlUserDataEncryptionMode(mlUserDataEncryptionMode: String) {
        cdkBuilder.mlUserDataEncryptionMode(mlUserDataEncryptionMode)
    }

    public fun build(): CfnMLTransform.MLUserDataEncryptionProperty = cdkBuilder.build()
}
