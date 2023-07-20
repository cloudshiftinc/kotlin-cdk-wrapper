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
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint
import kotlin.String

@CdkDslMarker
public class CfnOriginEndpointEncryptionContractConfigurationPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.EncryptionContractConfigurationProperty.Builder =
        CfnOriginEndpoint.EncryptionContractConfigurationProperty.builder()

    public fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
    }

    public fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
    }

    public fun build(): CfnOriginEndpoint.EncryptionContractConfigurationProperty = cdkBuilder.build()
}
