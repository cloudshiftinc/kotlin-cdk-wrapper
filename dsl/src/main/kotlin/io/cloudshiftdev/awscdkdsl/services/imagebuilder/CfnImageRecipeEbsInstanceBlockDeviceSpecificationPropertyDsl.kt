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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

/**
 * The image recipe EBS instance block device specification includes the Amazon EBS-specific block
 * device mapping specifications for the image.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * EbsInstanceBlockDeviceSpecificationProperty ebsInstanceBlockDeviceSpecificationProperty =
 * EbsInstanceBlockDeviceSpecificationProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagerecipe-ebsinstanceblockdevicespecification.html)
 */
@CdkDslMarker
public class CfnImageRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl {
    private val cdkBuilder: CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty.Builder =
        CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty.builder()

    /** @param deleteOnTermination Configures delete on termination of the associated device. */
    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /** @param deleteOnTermination Configures delete on termination of the associated device. */
    public fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /** @param encrypted Use to configure device encryption. */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /** @param encrypted Use to configure device encryption. */
    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    /** @param iops Use to configure device IOPS. */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /** @param kmsKeyId Use to configure the KMS key to use when encrypting the device. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param snapshotId The snapshot that defines the device contents. */
    public fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
    }

    /**
     * @param throughput *For GP3 volumes only* – The throughput in MiB/s that the volume supports.
     */
    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    /** @param volumeSize Overrides the volume size of the device. */
    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    /** @param volumeType Overrides the volume type of the device. */
    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty =
        cdkBuilder.build()
}
