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
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

/**
 * Specifies the data transfer protocol that AWS DataSync uses to access your Amazon FSx file
 * system.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * ProtocolProperty protocolProperty = ProtocolProperty.builder()
 * .nfs(NFSProperty.builder()
 * .mountOptions(NfsMountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .build())
 * .smb(SMBProperty.builder()
 * .mountOptions(SmbMountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .password("password")
 * .user("user")
 * // the properties below are optional
 * .domain("domain")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-locationfsxontap-protocol.html)
 */
@CdkDslMarker
public class CfnLocationFSxONTAPProtocolPropertyDsl {
    private val cdkBuilder: CfnLocationFSxONTAP.ProtocolProperty.Builder =
        CfnLocationFSxONTAP.ProtocolProperty.builder()

    /**
     * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync uses
     *   to access your FSx for ONTAP file system's storage virtual machine (SVM).
     */
    public fun nfs(nfs: IResolvable) {
        cdkBuilder.nfs(nfs)
    }

    /**
     * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync uses
     *   to access your FSx for ONTAP file system's storage virtual machine (SVM).
     */
    public fun nfs(nfs: CfnLocationFSxONTAP.NFSProperty) {
        cdkBuilder.nfs(nfs)
    }

    /**
     * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync uses
     *   to access your FSx for ONTAP file system's SVM.
     */
    public fun smb(smb: IResolvable) {
        cdkBuilder.smb(smb)
    }

    /**
     * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync uses
     *   to access your FSx for ONTAP file system's SVM.
     */
    public fun smb(smb: CfnLocationFSxONTAP.SMBProperty) {
        cdkBuilder.smb(smb)
    }

    public fun build(): CfnLocationFSxONTAP.ProtocolProperty = cdkBuilder.build()
}
