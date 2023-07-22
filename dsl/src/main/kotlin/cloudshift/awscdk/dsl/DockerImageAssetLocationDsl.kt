@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.DockerImageAssetLocation

@CdkDslMarker
public class DockerImageAssetLocationDsl {
  private val cdkBuilder: DockerImageAssetLocation.Builder = DockerImageAssetLocation.builder()

  /**
   * @param imageTag The tag of the image in Amazon ECR.
   */
  public fun imageTag(imageTag: String) {
    cdkBuilder.imageTag(imageTag)
  }

  /**
   * @param imageUri The URI of the image in Amazon ECR (including a tag). 
   */
  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  /**
   * @param repositoryName The name of the ECR repository. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): DockerImageAssetLocation = cdkBuilder.build()
}
