@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationNFS

@CdkDslMarker
public class CfnLocationNFSMountOptionsPropertyDsl {
  private val cdkBuilder: CfnLocationNFS.MountOptionsProperty.Builder =
      CfnLocationNFS.MountOptionsProperty.builder()

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnLocationNFS.MountOptionsProperty = cdkBuilder.build()
}
