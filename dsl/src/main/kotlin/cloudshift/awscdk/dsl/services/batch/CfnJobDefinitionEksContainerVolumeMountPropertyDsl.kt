@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The volume mounts for a container for an Amazon EKS job.
 *
 * For more information about volumes and volume mounts in Kubernetes, see
 * [Volumes](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/) in the
 * *Kubernetes documentation* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EksContainerVolumeMountProperty eksContainerVolumeMountProperty =
 * EksContainerVolumeMountProperty.builder()
 * .mountPath("mountPath")
 * .name("name")
 * .readOnly(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekscontainervolumemount.html)
 */
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
