@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.ScratchSpace

@CdkDslMarker
public class ScratchSpaceDsl {
  private val cdkBuilder: ScratchSpace.Builder = ScratchSpace.builder()

  /**
   * @param containerPath The path on the container to mount the scratch volume at. 
   */
  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  /**
   * @param name The name of the scratch volume to mount. 
   * Must be a volume name referenced in the name parameter of task definition volume.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param readOnly Specifies whether to give the container read-only access to the scratch volume.
   * 
   * If this value is true, the container has read-only access to the scratch volume.
   * If this value is false, then the container can write to the scratch volume.
   */
  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param sourcePath the value to be set. 
   */
  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): ScratchSpace = cdkBuilder.build()
}
