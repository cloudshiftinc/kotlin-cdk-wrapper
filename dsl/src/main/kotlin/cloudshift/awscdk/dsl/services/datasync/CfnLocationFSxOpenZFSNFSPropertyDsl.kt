@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS

@CdkDslMarker
public class CfnLocationFSxOpenZFSNFSPropertyDsl {
  private val cdkBuilder: CfnLocationFSxOpenZFS.NFSProperty.Builder =
      CfnLocationFSxOpenZFS.NFSProperty.builder()

  /**
   * @param mountOptions Represents the mount options that are available for DataSync to access an
   * NFS location. 
   */
  public fun mountOptions(mountOptions: IResolvable) {
    cdkBuilder.mountOptions(mountOptions)
  }

  /**
   * @param mountOptions Represents the mount options that are available for DataSync to access an
   * NFS location. 
   */
  public fun mountOptions(mountOptions: CfnLocationFSxOpenZFS.MountOptionsProperty) {
    cdkBuilder.mountOptions(mountOptions)
  }

  public fun build(): CfnLocationFSxOpenZFS.NFSProperty = cdkBuilder.build()
}
