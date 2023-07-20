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

package cloudshift.awscdk.dsl.services.voiceid

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.voiceid.CfnDomain
import kotlin.String

@CdkDslMarker
public class CfnDomainServerSideEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnDomain.ServerSideEncryptionConfigurationProperty.Builder =
        CfnDomain.ServerSideEncryptionConfigurationProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnDomain.ServerSideEncryptionConfigurationProperty = cdkBuilder.build()
}
