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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apprunner.CfnService
import kotlin.String

@CdkDslMarker
public class CfnServiceEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.EncryptionConfigurationProperty.Builder =
        CfnService.EncryptionConfigurationProperty.builder()

    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun build(): CfnService.EncryptionConfigurationProperty = cdkBuilder.build()
}
