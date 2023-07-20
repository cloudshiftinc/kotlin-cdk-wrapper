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
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import kotlin.String

@CdkDslMarker
public class CfnFlowEncryptionPropertyDsl {
    private val cdkBuilder: CfnFlow.EncryptionProperty.Builder = CfnFlow.EncryptionProperty.builder()

    public fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
    }

    public fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
    }

    public fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
    }

    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnFlow.EncryptionProperty = cdkBuilder.build()
}
