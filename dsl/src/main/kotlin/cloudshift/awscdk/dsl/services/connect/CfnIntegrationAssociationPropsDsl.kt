@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps

@CdkDslMarker
public class CfnIntegrationAssociationPropsDsl {
  private val cdkBuilder: CfnIntegrationAssociationProps.Builder =
      CfnIntegrationAssociationProps.builder()

  /**
   * @param instanceId The Amazon Resource Name (ARN) of the instance. 
   * *Minimum* : `1`
   *
   * *Maximum* : `100`
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * @param integrationArn ARN of the integration being associated with the instance. 
   * *Minimum* : `1`
   *
   * *Maximum* : `140`
   */
  public fun integrationArn(integrationArn: String) {
    cdkBuilder.integrationArn(integrationArn)
  }

  /**
   * @param integrationType Specifies the integration type to be associated with the instance. 
   * *Allowed Values* : `LEX_BOT` | `LAMBDA_FUNCTION`
   */
  public fun integrationType(integrationType: String) {
    cdkBuilder.integrationType(integrationType)
  }

  public fun build(): CfnIntegrationAssociationProps = cdkBuilder.build()
}
