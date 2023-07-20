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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.TransformResources
import kotlin.Number

@CdkDslMarker
public class TransformResourcesDsl {
    private val cdkBuilder: TransformResources.Builder = TransformResources.builder()

    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun volumeEncryptionKey(volumeEncryptionKey: IKey) {
        cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
    }

    public fun build(): TransformResources = cdkBuilder.build()
}
