@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.amazon.awscdk.services.ecs.ContainerImageConfig

@CdkDslMarker
public class ContainerImageConfigDsl {
  private val cdkBuilder: ContainerImageConfig.Builder = ContainerImageConfig.builder()

  /**
   * @param imageName Specifies the name of the container image. 
   */
  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  /**
   * @param repositoryCredentials Specifies the credentials used to access the image repository.
   */
  public
      fun repositoryCredentials(repositoryCredentials: CfnTaskDefinitionRepositoryCredentialsPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnTaskDefinitionRepositoryCredentialsPropertyDsl()
    builder.apply(repositoryCredentials)
    cdkBuilder.repositoryCredentials(builder.build())
  }

  /**
   * @param repositoryCredentials Specifies the credentials used to access the image repository.
   */
  public
      fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty) {
    cdkBuilder.repositoryCredentials(repositoryCredentials)
  }

  public fun build(): ContainerImageConfig = cdkBuilder.build()
}
