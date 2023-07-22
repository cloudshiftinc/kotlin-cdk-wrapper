@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.RepositoryImageProps
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class RepositoryImagePropsDsl {
  private val cdkBuilder: RepositoryImageProps.Builder = RepositoryImageProps.builder()

  /**
   * @param credentials The secret to expose to the container that contains the credentials for the
   * image repository.
   * The supported value is the full ARN of an AWS Secrets Manager secret.
   */
  public fun credentials(credentials: ISecret) {
    cdkBuilder.credentials(credentials)
  }

  public fun build(): RepositoryImageProps = cdkBuilder.build()
}
