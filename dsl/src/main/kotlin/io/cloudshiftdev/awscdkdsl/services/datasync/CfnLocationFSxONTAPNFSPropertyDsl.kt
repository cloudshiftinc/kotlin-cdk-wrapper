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

package io.cloudshiftdev.awscdkdsl.services.datasync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

/**
 * Specifies the Network File System (NFS) protocol configuration that AWS DataSync uses to access a
 * storage virtual machine (SVM) on your Amazon FSx for NetApp ONTAP file system.
 *
 * For more information, see
 * [Accessing FSx for ONTAP file systems](https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-access)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * NFSProperty nFSProperty = NFSProperty.builder()
 * .mountOptions(NfsMountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-nfs.html)
 */
@CdkDslMarker
public class CfnLocationFSxONTAPNFSPropertyDsl {
    private val cdkBuilder: CfnLocationFSxONTAP.NFSProperty.Builder =
        CfnLocationFSxONTAP.NFSProperty.builder()

    /** @param mountOptions Specifies how DataSync can access a location using the NFS protocol. */
    public fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions)
    }

    /** @param mountOptions Specifies how DataSync can access a location using the NFS protocol. */
    public fun mountOptions(mountOptions: CfnLocationFSxONTAP.NfsMountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions)
    }

    public fun build(): CfnLocationFSxONTAP.NFSProperty = cdkBuilder.build()
}
