@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.Host

@CdkDslMarker
public class HostDsl {
  private val cdkBuilder: Host.Builder = Host.builder()

  /**
   * @param sourcePath Specifies the path on the host container instance that is presented to the
   * container.
   * If the sourcePath value does not exist on the host container instance, the Docker daemon
   * creates it.
   * If the location does exist, the contents of the source path folder are exported.
   *
   * This property is not supported for tasks that use the Fargate launch type.
   */
  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): Host = cdkBuilder.build()
}
