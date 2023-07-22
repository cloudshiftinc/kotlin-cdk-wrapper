@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionEksContainerVolumeMountPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EksContainerVolumeMountProperty.Builder =
      CfnJobDefinition.EksContainerVolumeMountProperty.builder()

  /**
   * @param mountPath The path on the container where the volume is mounted.
   */
  public fun mountPath(mountPath: String) {
    cdkBuilder.mountPath(mountPath)
  }

  /**
   * @param name The name the volume mount.
   * This must match the name of one of the volumes in the pod.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
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

  public fun build(): CfnJobDefinition.EksContainerVolumeMountProperty = cdkBuilder.build()
}
