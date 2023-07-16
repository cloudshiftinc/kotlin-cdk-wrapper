@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.RepositoryImageProps
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class RepositoryImagePropsDsl {
  private val cdkBuilder: RepositoryImageProps.Builder = RepositoryImageProps.builder()

  public fun credentials(credentials: ISecret) {
    cdkBuilder.credentials(credentials)
  }

  public fun build(): RepositoryImageProps = cdkBuilder.build()
}
