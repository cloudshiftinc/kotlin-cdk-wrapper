@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Determine whether your data volume persists on the host container instance and where it's stored.
 *
 * If this parameter is empty, then the Docker daemon assigns a host path for your data volume.
 * However, the data isn't guaranteed to persist after the containers that are associated with it stop
 * running.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * VolumesHostProperty volumesHostProperty = VolumesHostProperty.builder()
 * .sourcePath("sourcePath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-volumeshost.html)
 */
@CdkDslMarker
public class CfnJobDefinitionVolumesHostPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.VolumesHostProperty.Builder =
      CfnJobDefinition.VolumesHostProperty.builder()

  /**
   * @param sourcePath The path on the host container instance that's presented to the container.
   * If this parameter is empty, then the Docker daemon has assigned a host path for you. If this
   * parameter contains a file location, then the data volume persists at the specified location on the
   * host container instance until you delete it manually. If the source path location doesn't exist on
   * the host container instance, the Docker daemon creates it. If the location does exist, the
   * contents of the source path folder are exported.
   *
   *
   * This parameter isn't applicable to jobs that run on Fargate resources. Don't provide this for
   * these jobs.
   */
  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnJobDefinition.VolumesHostProperty = cdkBuilder.build()
}
