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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnOriginEndpointCmafEncryptionPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.CmafEncryptionProperty.Builder =
        CfnOriginEndpoint.CmafEncryptionProperty.builder()

    public fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
    }

    public fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
    }

    public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
    }

    public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    public fun spekeKeyProvider(spekeKeyProvider: CfnOriginEndpoint.SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    public fun build(): CfnOriginEndpoint.CmafEncryptionProperty = cdkBuilder.build()
}
