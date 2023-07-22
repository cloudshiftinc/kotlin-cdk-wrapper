@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanDynamicSsmParameterPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.DynamicSsmParameterProperty.Builder =
      CfnResponsePlan.DynamicSsmParameterProperty.builder()

  /**
   * @param key The key parameter to use when running the Systems Manager Automation runbook. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The dynamic parameter value. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value The dynamic parameter value. 
   */
  public fun `value`(`value`: CfnResponsePlan.DynamicSsmParameterValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnResponsePlan.DynamicSsmParameterProperty = cdkBuilder.build()
}
