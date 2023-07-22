@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.DockerImageDestination

@CdkDslMarker
public class DockerImageDestinationDsl {
  private val cdkBuilder: DockerImageDestination.Builder = DockerImageDestination.builder()

  /**
   * @param assumeRoleArn The role that needs to be assumed while publishing this asset.
   */
  public fun assumeRoleArn(assumeRoleArn: String) {
    cdkBuilder.assumeRoleArn(assumeRoleArn)
  }

  /**
   * @param assumeRoleExternalId The ExternalId that needs to be supplied while assuming this role.
   */
  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  /**
   * @param imageTag Tag of the image to publish. 
   */
  public fun imageTag(imageTag: String) {
    cdkBuilder.imageTag(imageTag)
  }

  /**
   * @param region The region where this asset will need to be published.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param repositoryName Name of the ECR repository to publish to. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): DockerImageDestination = cdkBuilder.build()
}
