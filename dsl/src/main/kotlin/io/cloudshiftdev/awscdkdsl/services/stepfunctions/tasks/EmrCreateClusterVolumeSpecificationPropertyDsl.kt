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
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * EBS volume specifications such as volume type, IOPS, and size (GiB) that will be requested for
 * the EBS volume attached to an EC2 instance in the cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * Size size;
 * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
 * .volumeSize(size)
 * .volumeType(EmrCreateCluster.getEbsBlockDeviceVolumeType().GP2)
 * // the properties below are optional
 * .iops(123)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_VolumeSpecification.html)
 */
@CdkDslMarker
public class EmrCreateClusterVolumeSpecificationPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.VolumeSpecificationProperty.Builder =
        EmrCreateCluster.VolumeSpecificationProperty.builder()

    /** @param iops The number of I/O operations per second (IOPS) that the volume supports. */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * @param volumeSize The volume size. If the volume type is EBS-optimized, the minimum value is
     *   10GiB. Maximum size is 1TiB
     */
    public fun volumeSize(volumeSize: Size) {
        cdkBuilder.volumeSize(volumeSize)
    }

    /** @param volumeType The volume type. Volume types supported are gp2, io1, standard. */
    public fun volumeType(volumeType: EmrCreateCluster.EbsBlockDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EmrCreateCluster.VolumeSpecificationProperty = cdkBuilder.build()
}
