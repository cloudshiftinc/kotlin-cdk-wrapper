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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig

/**
 * `VolumeSpecification` is a subproperty of the `EbsBlockDeviceConfig` property type.
 *
 * `VolumeSecification` determines the volume type, IOPS, and size (GiB) for EBS volumes attached to
 * EC2 instances.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * VolumeSpecificationProperty volumeSpecificationProperty = VolumeSpecificationProperty.builder()
 * .sizeInGb(123)
 * .volumeType("volumeType")
 * // the properties below are optional
 * .iops(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancefleetconfig-volumespecification.html)
 */
@CdkDslMarker
public class CfnInstanceFleetConfigVolumeSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder =
        CfnInstanceFleetConfig.VolumeSpecificationProperty.builder()

    /** @param iops The number of I/O operations per second (IOPS) that the volume supports. */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * @param sizeInGb The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If
     *   the volume type is EBS-optimized, the minimum value is 10.
     */
    public fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
    }

    /**
     * @param volumeType The volume type. Volume types supported are gp3, gp2, io1, st1, sc1, and
     *   standard.
     */
    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnInstanceFleetConfig.VolumeSpecificationProperty = cdkBuilder.build()
}
