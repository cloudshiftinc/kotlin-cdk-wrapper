@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.VolumeFrom

@CdkDslMarker
public class VolumeFromDsl {
  private val cdkBuilder: VolumeFrom.Builder = VolumeFrom.builder()

  /**
   * @param readOnly Specifies whether the container has read-only access to the volume. 
   * If this value is true, the container has read-only access to the volume.
   * If this value is false, then the container can write to the volume.
   */
  public fun readOnly(readOnly: Boolean) {
    cdkBuilder.readOnly(readOnly)
  }

  /**
   * @param sourceContainer The name of another container within the same task definition from which
   * to mount volumes. 
   */
  public fun sourceContainer(sourceContainer: String) {
    cdkBuilder.sourceContainer(sourceContainer)
  }

  public fun build(): VolumeFrom = cdkBuilder.build()
}
