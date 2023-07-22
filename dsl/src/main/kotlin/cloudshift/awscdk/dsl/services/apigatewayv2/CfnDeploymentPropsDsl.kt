@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps

@CdkDslMarker
public class CfnDeploymentPropsDsl {
  private val cdkBuilder: CfnDeploymentProps.Builder = CfnDeploymentProps.builder()

  /**
   * @param apiId The API identifier. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param description The description for the deployment resource.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param stageName The name of an existing stage to associate with the deployment.
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  public fun build(): CfnDeploymentProps = cdkBuilder.build()
}
