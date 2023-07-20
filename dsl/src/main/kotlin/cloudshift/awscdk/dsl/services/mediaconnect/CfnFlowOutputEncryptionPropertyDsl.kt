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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import kotlin.String

@CdkDslMarker
public class CfnFlowOutputEncryptionPropertyDsl {
    private val cdkBuilder: CfnFlowOutput.EncryptionProperty.Builder =
        CfnFlowOutput.EncryptionProperty.builder()

    public fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
    }

    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnFlowOutput.EncryptionProperty = cdkBuilder.build()
}
