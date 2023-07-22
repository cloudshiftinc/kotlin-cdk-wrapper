@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionMountPointsPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.MountPointsProperty.Builder =
      CfnJobDefinition.MountPointsProperty.builder()

  /**
   * @param containerPath The path on the container where the host volume is mounted.
   */
  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  /**
   * @param readOnly If this value is `true` , the container has read-only access to the volume.
   * Otherwise, the container can write to the volume. The default value is `false` .
   */
  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param readOnly If this value is `true` , the container has read-only access to the volume.
   * Otherwise, the container can write to the volume. The default value is `false` .
   */
  public fun readOnly(readOnly: IResolvable) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param sourceVolume The name of the volume to mount.
   */
  public fun sourceVolume(sourceVolume: String) {
    cdkBuilder.sourceVolume(sourceVolume)
  }

  public fun build(): CfnJobDefinition.MountPointsProperty = cdkBuilder.build()
}
