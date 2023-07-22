@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.DockerVolume
import software.amazon.awscdk.DockerVolumeConsistency

@CdkDslMarker
public class DockerVolumeDsl {
  private val cdkBuilder: DockerVolume.Builder = DockerVolume.builder()

  /**
   * @param consistency Mount consistency.
   * Only applicable for macOS
   */
  public fun consistency(consistency: DockerVolumeConsistency) {
    cdkBuilder.consistency(consistency)
  }

  /**
   * @param containerPath The path where the file or directory is mounted in the container. 
   */
  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  /**
   * @param hostPath The path to the file or directory on the host machine. 
   */
  public fun hostPath(hostPath: String) {
    cdkBuilder.hostPath(hostPath)
  }

  public fun build(): DockerVolume = cdkBuilder.build()
}
