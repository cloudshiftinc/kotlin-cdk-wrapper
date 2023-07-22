@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ecs.DockerVolumeConfiguration
import software.amazon.awscdk.services.ecs.Scope

@CdkDslMarker
public class DockerVolumeConfigurationDsl {
  private val cdkBuilder: DockerVolumeConfiguration.Builder = DockerVolumeConfiguration.builder()

  /**
   * @param autoprovision Specifies whether the Docker volume should be created if it does not
   * already exist.
   * If true is specified, the Docker volume will be created for you.
   */
  public fun autoprovision(autoprovision: Boolean) {
    cdkBuilder.autoprovision(autoprovision)
  }

  /**
   * @param driver The Docker volume driver to use. 
   */
  public fun driver(driver: String) {
    cdkBuilder.driver(driver)
  }

  /**
   * @param driverOpts A map of Docker driver-specific options passed through.
   */
  public fun driverOpts(driverOpts: Map<String, String>) {
    cdkBuilder.driverOpts(driverOpts)
  }

  /**
   * @param labels Custom metadata to add to your Docker volume.
   */
  public fun labels(labels: Map<String, String>) {
    cdkBuilder.labels(labels)
  }

  /**
   * @param scope The scope for the Docker volume that determines its lifecycle. 
   */
  public fun scope(scope: Scope) {
    cdkBuilder.scope(scope)
  }

  public fun build(): DockerVolumeConfiguration = cdkBuilder.build()
}
