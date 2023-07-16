@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFS

@CdkDslMarker
public class CfnLocationFSxOpenZFSMountOptionsPropertyDsl {
  private val cdkBuilder: CfnLocationFSxOpenZFS.MountOptionsProperty.Builder =
      CfnLocationFSxOpenZFS.MountOptionsProperty.builder()

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnLocationFSxOpenZFS.MountOptionsProperty = cdkBuilder.build()
}
