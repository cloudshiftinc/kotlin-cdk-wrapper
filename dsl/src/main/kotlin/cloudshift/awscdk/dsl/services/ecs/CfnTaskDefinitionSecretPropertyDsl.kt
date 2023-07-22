@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionSecretPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.SecretProperty.Builder =
      CfnTaskDefinition.SecretProperty.builder()

  /**
   * @param name The name of the secret. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param valueFrom The secret to expose to the container. 
   * The supported values are either the full ARN of the AWS Secrets Manager secret or the full ARN
   * of the parameter in the SSM Parameter Store.
   *
   * For information about the require AWS Identity and Access Management permissions, see [Required
   * IAM permissions for Amazon ECS
   * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
   * (for Secrets Manager) or [Required IAM permissions for Amazon ECS
   * secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
   * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer Guide* .
   *
   *
   * If the SSM Parameter Store parameter exists in the same Region as the task you're launching,
   * then you can use either the full ARN or name of the parameter. If the parameter exists in a
   * different Region, then the full ARN must be specified.
   */
  public fun valueFrom(valueFrom: String) {
    cdkBuilder.valueFrom(valueFrom)
  }

  public fun build(): CfnTaskDefinition.SecretProperty = cdkBuilder.build()
}
