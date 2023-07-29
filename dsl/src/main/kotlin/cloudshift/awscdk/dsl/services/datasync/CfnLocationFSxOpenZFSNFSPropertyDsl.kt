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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS

/**
 * Represents the Network File System (NFS) protocol that AWS DataSync uses to access your Amazon
 * FSx for OpenZFS file system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * NFSProperty nFSProperty = NFSProperty.builder()
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxopenzfs-nfs.html)
 */
@CdkDslMarker
public class CfnLocationFSxOpenZFSNFSPropertyDsl {
    private val cdkBuilder: CfnLocationFSxOpenZFS.NFSProperty.Builder =
        CfnLocationFSxOpenZFS.NFSProperty.builder()

    /**
     * @param mountOptions Represents the mount options that are available for DataSync to access an
     *   NFS location.
     */
    public fun mountOptions(mountOptions: IResolvable) {
        cdkBuilder.mountOptions(mountOptions)
    }

    /**
     * @param mountOptions Represents the mount options that are available for DataSync to access an
     *   NFS location.
     */
    public fun mountOptions(mountOptions: CfnLocationFSxOpenZFS.MountOptionsProperty) {
        cdkBuilder.mountOptions(mountOptions)
    }

    public fun build(): CfnLocationFSxOpenZFS.NFSProperty = cdkBuilder.build()
}
