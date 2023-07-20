@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionLambdaFunctionAssociationPropertyDsl {
  private val cdkBuilder: CfnDistribution.LambdaFunctionAssociationProperty.Builder =
      CfnDistribution.LambdaFunctionAssociationProperty.builder()

  public fun eventType(eventType: String) {
    cdkBuilder.eventType(eventType)
  }

  public fun includeBody(includeBody: Boolean) {
    cdkBuilder.includeBody(includeBody)
  }

  public fun includeBody(includeBody: IResolvable) {
    cdkBuilder.includeBody(includeBody)
  }

  public fun lambdaFunctionArn(lambdaFunctionArn: String) {
    cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
  }

  public fun build(): CfnDistribution.LambdaFunctionAssociationProperty = cdkBuilder.build()
}
