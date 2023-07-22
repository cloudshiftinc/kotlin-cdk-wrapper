@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionHostVolumePropertiesPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.HostVolumePropertiesProperty.Builder =
      CfnTaskDefinition.HostVolumePropertiesProperty.builder()

  /**
   * @param sourcePath When the `host` parameter is used, specify a `sourcePath` to declare the path
   * on the host container instance that's presented to the container.
   * If this parameter is empty, then the Docker daemon has assigned a host path for you. If the
   * `host` parameter contains a `sourcePath` file location, then the data volume persists at the
   * specified location on the host container instance until you delete it manually. If the
   * `sourcePath` value doesn't exist on the host container instance, the Docker daemon creates it. If
   * the location does exist, the contents of the source path folder are exported.
   *
   * If you're using the Fargate launch type, the `sourcePath` parameter is not supported.
   */
  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnTaskDefinition.HostVolumePropertiesProperty = cdkBuilder.build()
}
