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
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import kotlin.String

@CdkDslMarker
public class CfnPackagingConfigurationEncryptionContractConfigurationPropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.EncryptionContractConfigurationProperty.Builder =
        CfnPackagingConfiguration.EncryptionContractConfigurationProperty.builder()

    public fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
    }

    public fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
    }

    public fun build(): CfnPackagingConfiguration.EncryptionContractConfigurationProperty =
        cdkBuilder.build()
}
