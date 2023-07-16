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

  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  public
      fun repositoryCredentials(block: CfnTaskDefinitionRepositoryCredentialsPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnTaskDefinitionRepositoryCredentialsPropertyDsl()
    builder.apply(block)
    cdkBuilder.repositoryCredentials(builder.build())
  }

  public
      fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty) {
    cdkBuilder.repositoryCredentials(repositoryCredentials)
  }

  public fun build(): ContainerImageConfig = cdkBuilder.build()
}
