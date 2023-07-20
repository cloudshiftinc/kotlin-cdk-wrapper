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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecr.CfnRepository
import kotlin.String

@CdkDslMarker
public class CfnRepositoryEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnRepository.EncryptionConfigurationProperty.Builder =
        CfnRepository.EncryptionConfigurationProperty.builder()

    public fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
    }

    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun build(): CfnRepository.EncryptionConfigurationProperty = cdkBuilder.build()
}
