@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

@CdkDslMarker
public class CfnLocationFSxONTAPNFSPropertyDsl {
  private val cdkBuilder: CfnLocationFSxONTAP.NFSProperty.Builder =
      CfnLocationFSxONTAP.NFSProperty.builder()

  /**
   * @param mountOptions Specifies how DataSync can access a location using the NFS protocol. 
   */
  public fun mountOptions(mountOptions: IResolvable) {
    cdkBuilder.mountOptions(mountOptions)
  }

  /**
   * @param mountOptions Specifies how DataSync can access a location using the NFS protocol. 
   */
  public fun mountOptions(mountOptions: CfnLocationFSxONTAP.NfsMountOptionsProperty) {
    cdkBuilder.mountOptions(mountOptions)
  }

  public fun build(): CfnLocationFSxONTAP.NFSProperty = cdkBuilder.build()
}
