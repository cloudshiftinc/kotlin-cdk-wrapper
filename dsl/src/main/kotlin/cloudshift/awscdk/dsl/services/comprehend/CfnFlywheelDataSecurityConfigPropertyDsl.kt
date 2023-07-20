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

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import kotlin.String

@CdkDslMarker
public class CfnFlywheelDataSecurityConfigPropertyDsl {
    private val cdkBuilder: CfnFlywheel.DataSecurityConfigProperty.Builder =
        CfnFlywheel.DataSecurityConfigProperty.builder()

    public fun dataLakeKmsKeyId(dataLakeKmsKeyId: String) {
        cdkBuilder.dataLakeKmsKeyId(dataLakeKmsKeyId)
    }

    public fun modelKmsKeyId(modelKmsKeyId: String) {
        cdkBuilder.modelKmsKeyId(modelKmsKeyId)
    }

    public fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun vpcConfig(vpcConfig: CfnFlywheel.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnFlywheel.DataSecurityConfigProperty = cdkBuilder.build()
}
