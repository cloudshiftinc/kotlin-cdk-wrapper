@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionRepositoryCredentialsPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.RepositoryCredentialsProperty.Builder =
      CfnTaskDefinition.RepositoryCredentialsProperty.builder()

  /**
   * @param credentialsParameter The Amazon Resource Name (ARN) of the secret containing the private
   * repository credentials.
   *
   * When you use the Amazon ECS API, AWS CLI , or AWS SDK, if the secret exists in the same Region
   * as the task that you're launching then you can use either the full ARN or the name of the secret.
   * When you use the AWS Management Console, you must specify the full ARN of the secret.
   */
  public fun credentialsParameter(credentialsParameter: String) {
    cdkBuilder.credentialsParameter(credentialsParameter)
  }

  public fun build(): CfnTaskDefinition.RepositoryCredentialsProperty = cdkBuilder.build()
}
