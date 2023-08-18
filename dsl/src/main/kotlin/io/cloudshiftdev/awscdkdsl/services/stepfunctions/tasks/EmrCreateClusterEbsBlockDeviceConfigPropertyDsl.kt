@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * Configuration of requested EBS block device associated with the instance group with count of
 * volumes that will be associated to every instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * Size size;
 * EbsBlockDeviceConfigProperty ebsBlockDeviceConfigProperty =
 * EbsBlockDeviceConfigProperty.builder()
 * .volumeSpecification(VolumeSpecificationProperty.builder()
 * .volumeSize(size)
 * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
 * // the properties below are optional
 * .iops(123)
 * .build())
 * // the properties below are optional
 * .volumesPerInstance(123)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_EbsBlockDeviceConfig.html)
 */
@CdkDslMarker
public class EmrCreateClusterEbsBlockDeviceConfigPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.EbsBlockDeviceConfigProperty.Builder =
        EmrCreateCluster.EbsBlockDeviceConfigProperty.builder()

    /**
     * @param volumeSpecification EBS volume specifications such as volume type, IOPS, and size
     *   (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
     */
    public fun volumeSpecification(
        volumeSpecification: EmrCreateClusterVolumeSpecificationPropertyDsl.() -> Unit = {}
    ) {
        val builder = EmrCreateClusterVolumeSpecificationPropertyDsl()
        builder.apply(volumeSpecification)
        cdkBuilder.volumeSpecification(builder.build())
    }

    /**
     * @param volumeSpecification EBS volume specifications such as volume type, IOPS, and size
     *   (GiB) that will be requested for the EBS volume attached to an EC2 instance in the cluster.
     */
    public fun volumeSpecification(
        volumeSpecification: EmrCreateCluster.VolumeSpecificationProperty
    ) {
        cdkBuilder.volumeSpecification(volumeSpecification)
    }

    /**
     * @param volumesPerInstance Number of EBS volumes with a specific volume configuration that
     *   will be associated with every instance in the instance group.
     */
    public fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
    }

    public fun build(): EmrCreateCluster.EbsBlockDeviceConfigProperty = cdkBuilder.build()
}
