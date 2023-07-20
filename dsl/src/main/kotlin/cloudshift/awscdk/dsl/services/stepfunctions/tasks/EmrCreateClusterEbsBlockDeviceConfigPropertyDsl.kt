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
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import kotlin.Number
import kotlin.Unit

@CdkDslMarker
public class EmrCreateClusterEbsBlockDeviceConfigPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.EbsBlockDeviceConfigProperty.Builder =
        EmrCreateCluster.EbsBlockDeviceConfigProperty.builder()

    public fun volumeSpecification(
        block: EmrCreateClusterVolumeSpecificationPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = EmrCreateClusterVolumeSpecificationPropertyDsl()
        builder.apply(block)
        cdkBuilder.volumeSpecification(builder.build())
    }

    public fun volumeSpecification(volumeSpecification: EmrCreateCluster.VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification)
    }

    public fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
    }

    public fun build(): EmrCreateCluster.EbsBlockDeviceConfigProperty = cdkBuilder.build()
}
