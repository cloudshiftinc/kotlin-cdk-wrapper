@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP

@CdkDslMarker
public class CfnLocationFSxONTAPSmbMountOptionsPropertyDsl {
  private val cdkBuilder: CfnLocationFSxONTAP.SmbMountOptionsProperty.Builder =
      CfnLocationFSxONTAP.SmbMountOptionsProperty.builder()

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnLocationFSxONTAP.SmbMountOptionsProperty = cdkBuilder.build()
}
