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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe

/**
 * Defines block device mappings for the instance used to configure your image.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * InstanceBlockDeviceMappingProperty instanceBlockDeviceMappingProperty =
 * InstanceBlockDeviceMappingProperty.builder()
 * .deviceName("deviceName")
 * .ebs(EbsInstanceBlockDeviceSpecificationProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .snapshotId("snapshotId")
 * .throughput(123)
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build())
 * .noDevice("noDevice")
 * .virtualName("virtualName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-instanceblockdevicemapping.html)
 */
@CdkDslMarker
public class CfnContainerRecipeInstanceBlockDeviceMappingPropertyDsl {
    private val cdkBuilder: CfnContainerRecipe.InstanceBlockDeviceMappingProperty.Builder =
        CfnContainerRecipe.InstanceBlockDeviceMappingProperty.builder()

    /** @param deviceName The device to which these mappings apply. */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /** @param ebs Use to manage Amazon EBS-specific configuration for this mapping. */
    public fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs)
    }

    /** @param ebs Use to manage Amazon EBS-specific configuration for this mapping. */
    public fun ebs(ebs: CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty) {
        cdkBuilder.ebs(ebs)
    }

    /** @param noDevice Use to remove a mapping from the base image. */
    public fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
    }

    /** @param virtualName Use to manage instance ephemeral devices. */
    public fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
    }

    public fun build(): CfnContainerRecipe.InstanceBlockDeviceMappingProperty = cdkBuilder.build()
}
