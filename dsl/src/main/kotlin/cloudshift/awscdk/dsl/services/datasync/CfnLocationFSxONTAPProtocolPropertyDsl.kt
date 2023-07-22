@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

@CdkDslMarker
public class CfnLocationFSxONTAPProtocolPropertyDsl {
  private val cdkBuilder: CfnLocationFSxONTAP.ProtocolProperty.Builder =
      CfnLocationFSxONTAP.ProtocolProperty.builder()

  /**
   * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync uses to
   * access your FSx for ONTAP file system's storage virtual machine (SVM).
   */
  public fun nfs(nfs: IResolvable) {
    cdkBuilder.nfs(nfs)
  }

  /**
   * @param nfs Specifies the Network File System (NFS) protocol configuration that DataSync uses to
   * access your FSx for ONTAP file system's storage virtual machine (SVM).
   */
  public fun nfs(nfs: CfnLocationFSxONTAP.NFSProperty) {
    cdkBuilder.nfs(nfs)
  }

  /**
   * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync uses
   * to access your FSx for ONTAP file system's SVM.
   */
  public fun smb(smb: IResolvable) {
    cdkBuilder.smb(smb)
  }

  /**
   * @param smb Specifies the Server Message Block (SMB) protocol configuration that DataSync uses
   * to access your FSx for ONTAP file system's SVM.
   */
  public fun smb(smb: CfnLocationFSxONTAP.SMBProperty) {
    cdkBuilder.smb(smb)
  }

  public fun build(): CfnLocationFSxONTAP.ProtocolProperty = cdkBuilder.build()
}
