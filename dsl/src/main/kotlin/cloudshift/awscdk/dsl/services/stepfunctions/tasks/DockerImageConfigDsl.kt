@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig

/**
 * Configuration for a using Docker image.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * DockerImageConfig dockerImageConfig = DockerImageConfig.builder()
 * .imageUri("imageUri")
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerImageConfigDsl {
  private val cdkBuilder: DockerImageConfig.Builder = DockerImageConfig.builder()

  /**
   * @param imageUri The fully qualified URI of the Docker image. 
   */
  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  public fun build(): DockerImageConfig = cdkBuilder.build()
}
