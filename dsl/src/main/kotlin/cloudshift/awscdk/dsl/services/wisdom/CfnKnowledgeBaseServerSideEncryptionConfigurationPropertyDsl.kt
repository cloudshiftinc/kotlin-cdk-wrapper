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
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase
import kotlin.String

@CdkDslMarker
public class CfnKnowledgeBaseServerSideEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder =
        CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.builder()

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun build(): CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty =
        cdkBuilder.build()
}
