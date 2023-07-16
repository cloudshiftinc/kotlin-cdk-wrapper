@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.MountPoint

@CdkDslMarker
public class MountPointDsl {
  private val cdkBuilder: MountPoint.Builder = MountPoint.builder()

  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  public fun sourceVolume(sourceVolume: String) {
    cdkBuilder.sourceVolume(sourceVolume)
  }

  public fun build(): MountPoint = cdkBuilder.build()
}
