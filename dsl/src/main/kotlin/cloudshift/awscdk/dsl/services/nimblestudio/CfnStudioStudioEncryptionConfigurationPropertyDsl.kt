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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.nimblestudio.CfnStudio
import kotlin.String

@CdkDslMarker
public class CfnStudioStudioEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnStudio.StudioEncryptionConfigurationProperty.Builder =
        CfnStudio.StudioEncryptionConfigurationProperty.builder()

    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    public fun build(): CfnStudio.StudioEncryptionConfigurationProperty = cdkBuilder.build()
}
