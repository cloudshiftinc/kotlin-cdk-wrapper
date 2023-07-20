@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

@CdkDslMarker
public class CfnLocationFSxONTAPSMBPropertyDsl {
  private val cdkBuilder: CfnLocationFSxONTAP.SMBProperty.Builder =
      CfnLocationFSxONTAP.SMBProperty.builder()

  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun mountOptions(mountOptions: IResolvable) {
    cdkBuilder.mountOptions(mountOptions)
  }

  public fun mountOptions(mountOptions: CfnLocationFSxONTAP.SmbMountOptionsProperty) {
    cdkBuilder.mountOptions(mountOptions)
  }

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun user(user: String) {
    cdkBuilder.user(user)
  }

  public fun build(): CfnLocationFSxONTAP.SMBProperty = cdkBuilder.build()
}
