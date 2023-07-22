@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionSecretPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.SecretProperty.Builder =
      CfnJobDefinition.SecretProperty.builder()

  /**
   * @param name The name of the secret. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param valueFrom The secret to expose to the container. 
   * The supported values are either the full Amazon Resource Name (ARN) of the AWS Secrets Manager
   * secret or the full ARN of the parameter in the AWS Systems Manager Parameter Store.
   *
   *
   * If the AWS Systems Manager Parameter Store parameter exists in the same Region as the job
   * you're launching, then you can use either the full Amazon Resource Name (ARN) or name of the
   * parameter. If the parameter exists in a different Region, then the full ARN must be specified.
   */
  public fun valueFrom(valueFrom: String) {
    cdkBuilder.valueFrom(valueFrom)
  }

  public fun build(): CfnJobDefinition.SecretProperty = cdkBuilder.build()
}
