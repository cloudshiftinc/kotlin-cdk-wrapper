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

package cloudshift.awscdk.dsl.services.wisdom

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wisdom.CfnAssistant
import kotlin.String

@CdkDslMarker
public class CfnAssistantServerSideEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnAssistant.ServerSideEncryptionConfigurationProperty.Builder =
        CfnAssistant.ServerSideEncryptionConfigurationProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnAssistant.ServerSideEncryptionConfigurationProperty = cdkBuilder.build()
}
