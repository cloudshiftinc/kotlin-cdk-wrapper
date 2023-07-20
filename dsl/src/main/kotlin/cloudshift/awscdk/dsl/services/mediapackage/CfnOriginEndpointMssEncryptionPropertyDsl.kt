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

@CdkDslMarker
public class CfnOriginEndpointMssEncryptionPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.MssEncryptionProperty.Builder =
        CfnOriginEndpoint.MssEncryptionProperty.builder()

    public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    public fun spekeKeyProvider(spekeKeyProvider: CfnOriginEndpoint.SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    public fun build(): CfnOriginEndpoint.MssEncryptionProperty = cdkBuilder.build()
}
