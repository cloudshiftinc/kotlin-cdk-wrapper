@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.apigateway.Deployment
import software.amazon.awscdk.services.apigateway.IRestApi
import software.constructs.Construct

@CdkDslMarker
public class DeploymentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Deployment.Builder = Deployment.Builder.create(scope, id)

  /**
   * The Rest API to deploy.
   *
   * @param api The Rest API to deploy. 
   */
  public fun api(api: IRestApi) {
    cdkBuilder.api(api)
  }

  /**
   * A description of the purpose of the API Gateway deployment.
   *
   * Default: - No description.
   *
   * @param description A description of the purpose of the API Gateway deployment. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * When an API Gateway model is updated, a new deployment will automatically be created.
   *
   * If this is true, the old API Gateway Deployment resource will not be deleted.
   * This will allow manually reverting back to a previous deployment in case for example
   *
   * Default: false
   *
   * @param retainDeployments When an API Gateway model is updated, a new deployment will
   * automatically be created. 
   */
  public fun retainDeployments(retainDeployments: Boolean) {
    cdkBuilder.retainDeployments(retainDeployments)
  }

  public fun build(): Deployment = cdkBuilder.build()
}
