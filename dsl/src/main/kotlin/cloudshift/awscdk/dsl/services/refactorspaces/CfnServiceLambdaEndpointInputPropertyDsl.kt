@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.refactorspaces.CfnService

@CdkDslMarker
public class CfnServiceLambdaEndpointInputPropertyDsl {
  private val cdkBuilder: CfnService.LambdaEndpointInputProperty.Builder =
      CfnService.LambdaEndpointInputProperty.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the Lambda function or alias. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun build(): CfnService.LambdaEndpointInputProperty = cdkBuilder.build()
}
