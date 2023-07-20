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

  public fun api(api: IRestApi) {
    cdkBuilder.api(api)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun retainDeployments(retainDeployments: Boolean) {
    cdkBuilder.retainDeployments(retainDeployments)
  }

  public fun build(): DeploymentProps = cdkBuilder.build()
}
