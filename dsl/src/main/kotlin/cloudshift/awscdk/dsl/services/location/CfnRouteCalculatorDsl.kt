@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnRouteCalculator
import software.constructs.Construct

@CdkDslMarker
public class CfnRouteCalculatorDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRouteCalculator.Builder = CfnRouteCalculator.Builder.create(scope, id)

  public fun calculatorName(calculatorName: String) {
    cdkBuilder.calculatorName(calculatorName)
  }

  public fun dataSource(dataSource: String) {
    cdkBuilder.dataSource(dataSource)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun pricingPlan(pricingPlan: String) {
    cdkBuilder.pricingPlan(pricingPlan)
  }

  public fun build(): CfnRouteCalculator = cdkBuilder.build()
}
