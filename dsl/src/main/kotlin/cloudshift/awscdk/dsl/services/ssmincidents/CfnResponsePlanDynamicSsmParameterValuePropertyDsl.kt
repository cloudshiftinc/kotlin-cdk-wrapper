@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanDynamicSsmParameterValuePropertyDsl {
  private val cdkBuilder: CfnResponsePlan.DynamicSsmParameterValueProperty.Builder =
      CfnResponsePlan.DynamicSsmParameterValueProperty.builder()

  public fun variable(variable: String) {
    cdkBuilder.variable(variable)
  }

  public fun build(): CfnResponsePlan.DynamicSsmParameterValueProperty = cdkBuilder.build()
}
