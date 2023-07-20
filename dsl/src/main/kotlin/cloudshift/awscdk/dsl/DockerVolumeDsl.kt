@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.DockerVolume
import software.amazon.awscdk.DockerVolumeConsistency

@CdkDslMarker
public class DockerVolumeDsl {
  private val cdkBuilder: DockerVolume.Builder = DockerVolume.builder()

  public fun consistency(consistency: DockerVolumeConsistency) {
    cdkBuilder.consistency(consistency)
  }

  public fun containerPath(containerPath: String) {
    cdkBuilder.containerPath(containerPath)
  }

  public fun hostPath(hostPath: String) {
    cdkBuilder.hostPath(hostPath)
  }

  public fun build(): DockerVolume = cdkBuilder.build()
}
