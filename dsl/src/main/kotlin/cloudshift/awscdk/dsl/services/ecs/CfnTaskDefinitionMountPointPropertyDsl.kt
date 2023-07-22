@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionMountPointPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.MountPointProperty.Builder =
      CfnTaskDefinition.MountPointProperty.builder()

  /**
   * @param containerPath The path on the container to mount the host volume at.
   */
  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  /**
   * @param readOnly If this value is `true` , the container has read-only access to the volume.
   * If this value is `false` , then the container can write to the volume. The default value is
   * `false` .
   */
  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param readOnly If this value is `true` , the container has read-only access to the volume.
   * If this value is `false` , then the container can write to the volume. The default value is
   * `false` .
   */
  public fun readOnly(readOnly: IResolvable) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param sourceVolume The name of the volume to mount.
   * Must be a volume name referenced in the `name` parameter of task definition `volume` .
   */
  public fun sourceVolume(sourceVolume: String) {
    cdkBuilder.sourceVolume(sourceVolume)
  }

  public fun build(): CfnTaskDefinition.MountPointProperty = cdkBuilder.build()
}
