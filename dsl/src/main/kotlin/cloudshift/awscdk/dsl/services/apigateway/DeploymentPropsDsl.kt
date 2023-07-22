@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.DeploymentProps
import software.amazon.awscdk.services.apigateway.IRestApi

@CdkDslMarker
public class DeploymentPropsDsl {
  private val cdkBuilder: DeploymentProps.Builder = DeploymentProps.builder()

  /**
   * @param api The Rest API to deploy. 
   */
  public fun api(api: IRestApi) {
    cdkBuilder.api(api)
  }

  /**
   * @param description A description of the purpose of the API Gateway deployment.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param retainDeployments When an API Gateway model is updated, a new deployment will
   * automatically be created.
   * If this is true, the old API Gateway Deployment resource will not be deleted.
   * This will allow manually reverting back to a previous deployment in case for example
   */
  public fun retainDeployments(retainDeployments: Boolean) {
    cdkBuilder.retainDeployments(retainDeployments)
  }

  public fun build(): DeploymentProps = cdkBuilder.build()
}
