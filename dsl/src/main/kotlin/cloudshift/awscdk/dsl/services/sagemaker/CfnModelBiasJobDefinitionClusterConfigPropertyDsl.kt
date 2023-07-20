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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnModelBiasJobDefinitionClusterConfigPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.ClusterConfigProperty.Builder =
        CfnModelBiasJobDefinition.ClusterConfigProperty.builder()

    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
    }

    public fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
    }

    public fun build(): CfnModelBiasJobDefinition.ClusterConfigProperty = cdkBuilder.build()
}
