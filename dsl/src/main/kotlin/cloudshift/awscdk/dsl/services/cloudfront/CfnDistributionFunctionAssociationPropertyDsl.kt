@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionFunctionAssociationPropertyDsl {
  private val cdkBuilder: CfnDistribution.FunctionAssociationProperty.Builder =
      CfnDistribution.FunctionAssociationProperty.builder()

  public fun eventType(eventType: String) {
    cdkBuilder.eventType(eventType)
  }

  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  public fun build(): CfnDistribution.FunctionAssociationProperty = cdkBuilder.build()
}
