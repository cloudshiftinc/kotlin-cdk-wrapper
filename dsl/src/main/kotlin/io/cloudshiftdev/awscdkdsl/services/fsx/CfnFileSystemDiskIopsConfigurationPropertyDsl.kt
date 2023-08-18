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

package io.cloudshiftdev.awscdkdsl.services.fsx

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnFileSystem

/**
 * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp
 * ONTAP, Amazon FSx for Windows File Server, or FSx for OpenZFS file system.
 *
 * By default, Amazon FSx automatically provisions 3 IOPS per GB of storage capacity. You can
 * provision additional IOPS per GB of storage. The configuration consists of the total number of
 * provisioned SSD IOPS and how it is was provisioned, or the mode (by the customer or by Amazon
 * FSx).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fsx.*;
 * DiskIopsConfigurationProperty diskIopsConfigurationProperty =
 * DiskIopsConfigurationProperty.builder()
 * .iops(123)
 * .mode("mode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fsx-filesystem-diskiopsconfiguration.html)
 */
@CdkDslMarker
public class CfnFileSystemDiskIopsConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.DiskIopsConfigurationProperty.Builder =
        CfnFileSystem.DiskIopsConfigurationProperty.builder()

    /** @param iops The total number of SSD IOPS provisioned for the file system. */
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    /**
     * @param mode Specifies whether the file system is using the `AUTOMATIC` setting of SSD IOPS of
     *   3 IOPS per GB of storage capacity, , or if it using a `USER_PROVISIONED` value.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnFileSystem.DiskIopsConfigurationProperty = cdkBuilder.build()
}
