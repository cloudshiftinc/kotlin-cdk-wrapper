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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * VolumeConfigurationProperty volumeConfigurationProperty = VolumeConfigurationProperty.builder()
 * .encrypted(false)
 * .iops(123)
 * .mountPoint("mountPoint")
 * .numberOfDisks(123)
 * .raidLevel(123)
 * .size(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-volumeconfiguration.html)
 */
@CdkDslMarker
public class CfnLayerVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnLayer.VolumeConfigurationProperty.Builder =
        CfnLayer.VolumeConfigurationProperty.builder()

    /**
     * @param encrypted Specifies whether an Amazon EBS volume is encrypted. For more information,
     *   see
     *   [Amazon EBS Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
     *   .
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted Specifies whether an Amazon EBS volume is encrypted. For more information,
     *   see
     *   [Amazon EBS Encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
     *   .
     */
    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param iops The number of I/O operations per second (IOPS) to provision for the volume. For
     *   PIOPS volumes, the IOPS per disk.
     *
     * If you specify `io1` for the volume type, you must specify this property.
     */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /** @param mountPoint The volume mount point. For example "/dev/sdh". */
    public fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
    }

    /** @param numberOfDisks The number of disks in the volume. */
    public fun numberOfDisks(numberOfDisks: Number) {
        cdkBuilder.numberOfDisks(numberOfDisks)
    }

    /**
     * @param raidLevel The volume
     *   [RAID level](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Standard_RAID_levels)
     *   .
     */
    public fun raidLevel(raidLevel: Number) {
        cdkBuilder.raidLevel(raidLevel)
    }

    /** @param size The volume size. */
    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    /**
     * @param volumeType The volume type. For more information, see
     *   [Amazon EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
     *   .
     * * `standard` - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum
     *   size of 1024 GiB.
     * * `io1` - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a
     *   maximum size of 16384 GiB.
     * * `gp2` - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB
     *   and a maximum size of 16384 GiB.
     * * `st1` - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must
     *   have a minimum size of 500 GiB and a maximum size of 16384 GiB.
     * * `sc1` - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size
     *   of 16384 GiB.
     */
    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnLayer.VolumeConfigurationProperty = cdkBuilder.build()
}
