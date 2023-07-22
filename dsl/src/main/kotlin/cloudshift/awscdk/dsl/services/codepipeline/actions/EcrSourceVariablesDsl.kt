@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.actions.EcrSourceVariables

@CdkDslMarker
public class EcrSourceVariablesDsl {
  private val cdkBuilder: EcrSourceVariables.Builder = EcrSourceVariables.builder()

  /**
   * @param imageDigest The digest of the current image, in the form '<digest type>:<digest value>'.
   * 
   */
  public fun imageDigest(imageDigest: String) {
    cdkBuilder.imageDigest(imageDigest)
  }

  /**
   * @param imageTag The Docker tag of the current image. 
   */
  public fun imageTag(imageTag: String) {
    cdkBuilder.imageTag(imageTag)
  }

  /**
   * @param imageUri The full ECR Docker URI of the current image. 
   */
  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  /**
   * @param registryId The identifier of the registry. 
   * In ECR, this is usually the ID of the AWS account owning it.
   */
  public fun registryId(registryId: String) {
    cdkBuilder.registryId(registryId)
  }

  /**
   * @param repositoryName The physical name of the repository that this action tracks. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): EcrSourceVariables = cdkBuilder.build()
}
